package com.ninni.twigs.block;


import com.ninni.twigs.TwigsProperties;
import com.ninni.twigs.block.enums.TwigsColumnShape;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("deprecation")
public class ColumnBlock extends Block {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<TwigsColumnShape> SHAPE = TwigsProperties.SHAPE;
    public static final VoxelShape BASE_SHAPE = Block.box(2, 0, 2, 14, 16, 14);
    protected static final VoxelShape TIP_SHAPE = Shapes.join(Block.box(0, 8, 0, 16, 16, 16), Block.box(2, 0, 2, 14, 8, 14), BooleanOp.OR);

    public ColumnBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, false).setValue(SHAPE, TwigsColumnShape.TIP));
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState blockState2, LevelAccessor levelAccessor, BlockPos pos, BlockPos blockPos2) {
        if (state.getValue(WATERLOGGED)) {
            levelAccessor.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(levelAccessor));
        }

        return state.setValue(SHAPE, getColumnShape(levelAccessor, pos));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        BlockPos blockPos = ctx.getClickedPos();
        Level worldAccess = ctx.getLevel();
        TwigsColumnShape shape = getColumnShape(worldAccess, blockPos);
        if (shape == null) return null;
        return this.defaultBlockState().setValue(SHAPE, shape).setValue(WATERLOGGED, worldAccess.getFluidState(blockPos).getType() == Fluids.WATER);
    }

    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        if (state.getValue(SHAPE) == TwigsColumnShape.TIP) return TIP_SHAPE;

        return BASE_SHAPE;
    }

    @Override
    public boolean isPathfindable(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, PathComputationType pathComputationType) {
        return false;
    }

    private TwigsColumnShape getColumnShape(LevelAccessor world, BlockPos pos) {
        BlockState downState = world.getBlockState(pos.below());
        BlockState upState = world.getBlockState(pos.above());
        return (downState.getBlock() instanceof ColumnBlock && upState.getBlock() instanceof ColumnBlock) || upState.getBlock() instanceof ColumnBlock ? TwigsColumnShape.BASE : TwigsColumnShape.TIP;
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }


    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, SHAPE);
    }
}
