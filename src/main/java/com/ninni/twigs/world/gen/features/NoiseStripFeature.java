package com.ninni.twigs.world.gen.features;

import com.mojang.serialization.Codec;
import com.ninni.twigs.registry.TwigsBlocks;
import com.ninni.twigs.world.FastNoise;
import com.ninni.twigs.world.gen.features.config.NoiseStripConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.DripstoneUtils;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;

public class NoiseStripFeature extends Feature<NoiseStripConfig> {

    public NoiseStripFeature(Codec<NoiseStripConfig> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoiseStripConfig> featurePlaceContext) {
        WorldGenLevel world = featurePlaceContext.level();
        BlockPos blockPos = featurePlaceContext.origin();
        int seed = (int) world.getSeed();
        FastNoise fastNoise = new FastNoise(seed);
        fastNoise.SetFractalType(FastNoise.FractalType.RigidMulti);
        fastNoise.SetNoiseType(FastNoise.NoiseType.SimplexFractal);
        fastNoise.SetFractalOctaves(1);
        fastNoise.SetFrequency(0.004F);
        fastNoise.SetGradientPerturbAmp(0.3F);
        int range = 16;
        BlockPos.MutableBlockPos mutableBlockPos = new BlockPos.MutableBlockPos();
        for (int x = 0; x < range; x++) {
            for (int z = 0; z < range; z++) {
                for (int y = 0; y < range; y++) {
                    mutableBlockPos.set(blockPos.getX() + x, blockPos.getY() + y, blockPos.getZ() + z);
                    float noise = fastNoise.GetNoise(mutableBlockPos.getX(), mutableBlockPos.getY(), mutableBlockPos.getZ());
                    double threshold = 0.97655;
                    if (noise > threshold) {
                        BlockState blockState = world.getBlockState(mutableBlockPos);
                        if (!blockState.is(BlockTags.BASE_STONE_NETHER)) continue;
                        for (Direction direction : Direction.values()) {
                            if (!world.isStateAtPosition(mutableBlockPos.relative(direction), DripstoneUtils::isEmptyOrWaterOrLava)) {
                                continue;
                            }
                            world.setBlock(mutableBlockPos, TwigsBlocks.SILT.defaultBlockState(), 2);
                        }
                    }
                }
            }
        }
        return true;
    }

}
