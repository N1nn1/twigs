package com.ninni.twigs.block;

import com.mojang.serialization.MapCodec;
import com.ninni.twigs.mixin.FallingBlockEntityInvoker;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.jetbrains.annotations.Nullable;


@SuppressWarnings("deprecation")
public class FallingBlockWithEntity extends BaseEntityBlock implements Fallable {
    public static final MapCodec<FallingBlockWithEntity> CODEC = simpleCodec(FallingBlockWithEntity::new);

    public FallingBlockWithEntity(Properties settings) {
        super(settings);
    }

    @Override
    protected MapCodec<FallingBlockWithEntity> codec() {
        return CODEC;
    }

    @Override
    public void onPlace(BlockState blockState, Level level, BlockPos blockPos, BlockState blockState2, boolean bl) {
        level.scheduleTick(blockPos, this, this.getFallDelay());
    }

    @Override
    public BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState2, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos2) {
        levelAccessor.scheduleTick(blockPos, this, this.getFallDelay());
        return super.updateShape(blockState, direction, blockState2, levelAccessor, blockPos, blockPos2);
    }


    @Override
    public void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (!FallingBlock.isFree(world.getBlockState(pos.below())) || pos.getY() < world.getMinBuildHeight()) {
            return;
        }
        BlockEntity blockEntity = world.getBlockEntity(pos);
        FallingBlockEntity fallingBlockEntity = spawnFromBlock(world, pos, state);
        if (blockEntity != null) fallingBlockEntity.blockData = blockEntity.saveWithoutMetadata();
        this.configureFallingBlockEntity(fallingBlockEntity);
    }

    public static FallingBlockEntity spawnFromBlock(Level world, BlockPos pos, BlockState state) {
        FallingBlockEntity fallingBlockEntity = FallingBlockEntityInvoker.invokeInit(world, (double) pos.getX() + 0.5, pos.getY(), (double) pos.getZ() + 0.5, state.hasProperty(BlockStateProperties.WATERLOGGED) ?  state.setValue(BlockStateProperties.WATERLOGGED, false) : state);
        world.setBlock(pos, state.getFluidState().createLegacyBlock(), Block.UPDATE_ALL | Block.UPDATE_MOVE_BY_PISTON);
        world.addFreshEntity(fallingBlockEntity);
        return fallingBlockEntity;
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
    }

    protected int getFallDelay() {
        return 2;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return null;
    }
}