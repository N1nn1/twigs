package com.ninni.twigs.block;

import com.ninni.twigs.TwigsProperties;
import com.ninni.twigs.block.entity.SiltPotBlockEntity;
import com.ninni.twigs.registry.TwigsBlockEntityType;
import com.ninni.twigs.registry.TwigsSoundEvents;
import com.ninni.twigs.stat.TwigsStats;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

@SuppressWarnings("deprecation")
public class SiltPotBlock extends FallingBlockWithEntity implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final BooleanProperty FILLED = TwigsProperties.FILLED;
    protected static final VoxelShape SHAPE =
            Stream.of(
                    Block.box(2, 1, 2, 14, 13, 14),
                    Block.box(3, 14, 3, 13, 16, 13),
                    Block.box(4, 0, 4, 12, 14, 12)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();


    public SiltPotBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, false).setValue(FILLED, false));
    }

    @Override
    public SoundType getSoundType(BlockState state) {
        return state.getValue(FILLED) ? TwigsSoundEvents.SILT_POT_FILLED : TwigsSoundEvents.SILT_POT;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        BlockEntity blockEntity = level.getBlockEntity(pos);
        ItemStack stack = player.getItemInHand(hand);
        if (hit.getDirection() == Direction.UP && stack.getItem() instanceof BlockItem blockItem && blockItem.getBlock() instanceof FlowerBlock && state.getValue(FILLED)) {
            blockItem.place(new BlockPlaceContext(player, hand, stack, hit));
            return InteractionResult.sidedSuccess(level.isClientSide);
        }
        if (state.getValue(FILLED) && stack.getItem() instanceof ShovelItem) {
            level.setBlock(pos, state.setValue(FILLED, false), Block.UPDATE_NONE);
            if (!player.getAbilities().instabuild) stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(player.getUsedItemHand()));
            if (level.isClientSide) {
                level.playSound(player, pos, SoundEvents.ROOTED_DIRT_BREAK, SoundSource.BLOCKS, 1, 1);
                return InteractionResult.SUCCESS;
            }
        } else if (!state.getValue(FILLED) && stack.is(Blocks.ROOTED_DIRT.asItem())) {
            level.setBlock(pos, state.setValue(FILLED, true), Block.UPDATE_NONE);
            if (level.isClientSide) {
                level.playSound(player, pos, SoundEvents.ROOTED_DIRT_PLACE, SoundSource.BLOCKS, 1, 1);
                return InteractionResult.SUCCESS;
            }
            if (!player.getAbilities().instabuild) stack.shrink(1);
        } else if (blockEntity instanceof SiltPotBlockEntity && !state.getValue(FILLED)) {
            if (level.isClientSide) return InteractionResult.SUCCESS;
            player.openMenu((SiltPotBlockEntity)blockEntity);
            player.awardStat(TwigsStats.OPEN_SILT_POT);
            PiglinAi.angerNearbyPiglins(player, true);
        }
        return InteractionResult.CONSUME;

    }

    @Override
    public void onBrokenAfterFall(Level level, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        SiltPotBlockEntity blockEntity = TwigsBlockEntityType.SILT_POT.create(pos, fallingBlockEntity.getBlockState());
        assert blockEntity != null;
        blockEntity.load(fallingBlockEntity.blockData);
        Containers.dropContents(level, pos, blockEntity);
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean moved) {
            if (state.is(newState.getBlock())) return;
            BlockEntity blockEntity = level.getBlockEntity(pos);

            if (!moved && blockEntity instanceof Container) {
                Containers.dropContents(level, pos, (Container)(blockEntity));
                level.updateNeighborsAt(pos, this);
            }

            super.onRemove(state, level, pos, newState, moved);
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState blockState, @Nullable LivingEntity livingEntity, ItemStack itemStack) {
            BlockEntity blockEntity;
            if (itemStack.hasCustomHoverName() && (blockEntity = level.getBlockEntity(pos)) instanceof SiltPotBlockEntity) {
                ((SiltPotBlockEntity)blockEntity).setCustomName(itemStack.getHoverName());
            }
    }

    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new SiltPotBlockEntity(blockPos, blockState);
    }

    @Override
    public RenderShape getRenderShape(BlockState blockState) {
        return RenderShape.MODEL;
    }

    @Override
    public boolean hasAnalogOutputSignal(BlockState blockState) {
        return true;
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        super.configureFallingBlockEntity(entity);
    }

    @Override
    public int getAnalogOutputSignal(BlockState blockState, Level level, BlockPos blockPos) {
        return AbstractContainerMenu.getRedstoneSignalFromBlockEntity(level.getBlockEntity(blockPos));
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor levelAccessor, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) levelAccessor.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(levelAccessor));
        return super.updateShape(state, direction, neighborState, levelAccessor, pos, neighborPos);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(WATERLOGGED, ctx.getLevel().getFluidState(ctx.getClickedPos()).getType() == Fluids.WATER);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return SHAPE;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, FILLED);
    }
}
