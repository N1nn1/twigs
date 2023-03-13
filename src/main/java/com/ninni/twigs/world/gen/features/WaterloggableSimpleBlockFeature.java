package com.ninni.twigs.world.gen.features;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;

public class WaterloggableSimpleBlockFeature extends Feature<SimpleBlockConfiguration> {

    public WaterloggableSimpleBlockFeature(Codec<SimpleBlockConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<SimpleBlockConfiguration> featurePlaceContext) {
        WorldGenLevel worldGenLevel = featurePlaceContext.level();
        BlockPos blockPos = featurePlaceContext.origin();
        BlockState blockState = featurePlaceContext.config().toPlace().getState(featurePlaceContext.random(), blockPos);
        if (!blockState.canSurvive(worldGenLevel, blockPos)) return false;
        if (blockState.getBlock() instanceof DoublePlantBlock) {
            if (!worldGenLevel.isEmptyBlock(blockPos.above())) return false;
            DoublePlantBlock.placeAt(worldGenLevel, blockState, blockPos, 2);
            return true;
        } else {
            if (blockState.hasProperty(BlockStateProperties.WATERLOGGED)) {
                blockState = blockState.setValue(BlockStateProperties.WATERLOGGED, worldGenLevel.getBlockState(blockPos).is(Blocks.WATER));
            }
            worldGenLevel.setBlock(blockPos, blockState, 2);
        }
        return true;
    }

}
