package com.ninni.twigs.block;

import com.ninni.twigs.TwigsProperties;
import com.ninni.twigs.TwigsTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("deprecation")
public class BambooLeavesBlock extends BushBlock implements SimpleWaterloggedBlock {
    private static final IntegerProperty LAYERS = TwigsProperties.LAYERS_1_4;
    private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final VoxelShape SHAPE_ONE = box(0, 0, 0, 16, 1, 16);
    public static final VoxelShape SHAPE_TWO = box(0, 0, 0, 16, 2, 16);
    public static final VoxelShape SHAPE_THREE = box(0, 0, 0, 16, 3, 16);
    public static final VoxelShape SHAPE_FOUR = box(0, 0, 0, 16, 5, 16);

    public BambooLeavesBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(LAYERS, 1).setValue(WATERLOGGED, false));
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return switch (blockState.getValue(LAYERS)) {
            default -> SHAPE_ONE;
            case 2 -> SHAPE_TWO;
            case 3 -> SHAPE_THREE;
            case 4 -> SHAPE_FOUR;
        };
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        BlockPos pos = blockPlaceContext.getClickedPos();
        BlockState state = blockPlaceContext.getLevel().getBlockState(pos);
        if (state.is(this)) {
            return state.cycle(LAYERS);
        } else {
            FluidState fluidState = blockPlaceContext.getLevel().getFluidState(pos);
            return this.defaultBlockState().setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
        }
    }

    @Override
    public BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState2, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos2) {
        if (!blockState.canSurvive(levelAccessor, blockPos)) {
            return Blocks.AIR.defaultBlockState();
        } else {
            if (blockState.getValue(WATERLOGGED)) levelAccessor.scheduleTick(blockPos, Fluids.WATER, Fluids.WATER.getTickDelay(levelAccessor));
            return super.updateShape(blockState, direction, blockState2, levelAccessor, blockPos, blockPos2);
        }
    }

    @Override
    protected boolean mayPlaceOn(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return !blockState.getCollisionShape(blockGetter, blockPos).getFaceShape(Direction.UP).isEmpty() || blockState.isFaceSturdy(blockGetter, blockPos, Direction.UP);
    }

    @Override
    public boolean canBeReplaced(BlockState blockState, BlockPlaceContext blockPlaceContext) {
        return (!blockPlaceContext.isSecondaryUseActive() && blockPlaceContext.getItemInHand().is(this.asItem()) && blockState.getValue(LAYERS) < 4) || super.canBeReplaced(blockState, blockPlaceContext);
    }

    @Override
    public void entityInside(BlockState blockState, Level level, BlockPos blockPos, Entity entity) {
        if (entity instanceof LivingEntity && blockState.getValue(LAYERS) > 2) {
            EntityType<?> type = entity.getType();
            if (!type.is(TwigsTags.BAMBOO_LEAVES_SLOW_IMMUNE)) {
                entity.makeStuckInBlock(blockState, new Vec3(0.75D, 1.0D, 0.75D));
            }
        }
    }

    @Override
    public boolean skipRendering(BlockState blockState, BlockState blockState2, Direction direction) {
        return blockState2.is(this) && blockState2.getValue(LAYERS) >= blockState.getValue(LAYERS);
    }

    @Override
    public FluidState getFluidState(BlockState blockState) {
        return blockState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(blockState);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LAYERS, WATERLOGGED);
    }
}
