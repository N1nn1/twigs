package com.ninni.twigs.block;

import com.ninni.twigs.TwigsProperties;
import com.ninni.twigs.TwigsTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

/*
    Hi I heavily referenced this code from Another Furniture, spoke to CrispyTwig and Synthestra from Starfish, and they are fine with it so yea
    (https://github.com/starfish-studios/AnotherFurniture/blob/1.19.2/common/src/main/java/com/starfish_studios/another_furniture/block/TableBlock.java)
    go check it out it's a very awesome mod
*/

@SuppressWarnings("deprecation")
public class TableBlock extends Block implements SimpleWaterloggedBlock  {
    private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    private static final BooleanProperty LEG1 = TwigsProperties.TABLE_LEG1;
    private static final BooleanProperty LEG2 = TwigsProperties.TABLE_LEG2;
    private static final BooleanProperty LEG3 = TwigsProperties.TABLE_LEG3;
    private static final BooleanProperty LEG4 = TwigsProperties.TABLE_LEG4;
    public static final BooleanProperty UPDATE = BooleanProperty.create("update");


    protected static final VoxelShape TOP = Block.box(0, 12, 0, 16, 16, 16);
    protected static final VoxelShape LEG_1 = Block.box(12, 0, 12, 15, 12, 15);
    protected static final VoxelShape LEG_2 = Block.box(1, 0, 12, 4, 12, 15);
    protected static final VoxelShape LEG_3 = Block.box(12, 0, 1, 15, 12, 4);
    protected static final VoxelShape LEG_4 = Block.box(1, 0, 1, 4, 12, 4);

    protected static final VoxelShape[] SHAPES = new VoxelShape[]{
            TOP,
            Shapes.or(TOP, LEG_1),
            Shapes.or(TOP, LEG_2),
            Shapes.or(TOP, LEG_3),
            Shapes.or(TOP, LEG_4),
            Shapes.or(TOP, LEG_1, LEG_2),
            Shapes.or(TOP, LEG_1, LEG_3),
            Shapes.or(TOP, LEG_1, LEG_4),
            Shapes.or(TOP, LEG_2, LEG_3),
            Shapes.or(TOP, LEG_2, LEG_4),
            Shapes.or(TOP, LEG_3, LEG_4),
            Shapes.or(TOP, LEG_1, LEG_2, LEG_3),
            Shapes.or(TOP, LEG_1, LEG_2, LEG_4),
            Shapes.or(TOP, LEG_1, LEG_3, LEG_4),
            Shapes.or(TOP, LEG_2, LEG_3, LEG_4),
            Shapes.or(TOP, LEG_1, LEG_2, LEG_3, LEG_4)
    };

    public TableBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, false).setValue(LEG1, true).setValue(LEG2, true).setValue(LEG3, true).setValue(LEG4, true));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Boolean leg1 = state.getValue(LEG1);
        Boolean leg2 = state.getValue(LEG2);
        Boolean leg3 = state.getValue(LEG3);
        Boolean leg4 = state.getValue(LEG4);
        int shape = 0;

        if (leg2) shape = 1;
        if (leg3) shape = 2;
        if (leg1) shape = 3;
        if (leg4) shape = 4;

        if (leg2 && leg3) shape = 5;
        if (leg2 && leg1) shape = 6;
        if (leg2 && leg4) shape = 7;
        if (leg3 && leg1) shape = 8;
        if (leg3 && leg4) shape = 9;
        if (leg1 && leg4) shape = 10;

        if (leg2 && leg3 && leg1) shape = 11;
        if (leg2 && leg3 && leg4) shape = 12;
        if (leg2 && leg1 && leg4) shape = 13;
        if (leg3 && leg1 && leg4) shape = 14;

        if (leg2 && leg3 && leg1 && leg4) shape = 15;

        return SHAPES[shape];
    }


    public BlockState getConnections(BlockState state, LevelAccessor level, BlockPos pos) {
        boolean north = canConnect(level.getBlockState(pos.north()));
        boolean south = canConnect(level.getBlockState(pos.south()));
        boolean east = canConnect(level.getBlockState(pos.east()));
        boolean west = canConnect(level.getBlockState(pos.west()));
        boolean update = ((north ? 1 : 0) + (east ? 1 : 0) + (south ? 1 : 0) + (west ? 1 : 0)) % 2 == 0;

        return state
                .setValue(LEG1, (!north && !east) || (north && east && !(canConnect(level.getBlockState(pos.north().east())))))
                .setValue(LEG2, (!east && !south) || (east && south && !(canConnect(level.getBlockState(pos.south().east())))))
                .setValue(LEG3, (!west && !south) || (west && south && !(canConnect(level.getBlockState(pos.south().west())))))
                .setValue(LEG4, (!west && !north) || (west && north && !(canConnect(level.getBlockState(pos.north().west())))))
                .setValue(UPDATE, update);
    }

    public boolean canConnect(BlockState state) {
        return state.is(TwigsTags.TABLES_BLOCK);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return getConnections(this.defaultBlockState().setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER), context.getLevel(), context.getClickedPos());
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos currentPos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return getConnections(state, level, currentPos);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, UPDATE, LEG1, LEG2, LEG3, LEG4);
    }

    @Override
    public boolean isPathfindable(BlockState blockState, PathComputationType pathComputationType) {
        return false;
    }
}
