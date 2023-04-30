package com.ninni.twigs.world.gen.features;

import com.mojang.serialization.Codec;
import com.ninni.twigs.block.AzaleaFlowersBlock;
import com.ninni.twigs.registry.TwigsBlocks;
import com.ninni.twigs.world.gen.features.config.AzaleaFlowerPatchConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;

public class AzaleaFlowerPatchFeature extends Feature<AzaleaFlowerPatchConfig> {

    public AzaleaFlowerPatchFeature(Codec<AzaleaFlowerPatchConfig> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<AzaleaFlowerPatchConfig> featurePlaceContext) {
        WorldGenLevel world = featurePlaceContext.level();
        BlockPos blockPos = featurePlaceContext.origin();
        RandomSource random = featurePlaceContext.random();
        AzaleaFlowerPatchConfig config = featurePlaceContext.config();
        int radius = config.xzRadius().sample(random);
        int verticalRange = config.verticalRange();
        if (world.isEmptyBlock(blockPos) && (world.isStateAtPosition(blockPos.below(), this::matchesBlock) || world.isStateAtPosition(blockPos.above(), this::matchesBlock))) {
            for (int x = -radius; x <= radius; x++) {
                for (int z = -radius; z <= radius; z++) {
                    for (int y = -verticalRange; y <= verticalRange; y++) {
                        BlockPos pos = new BlockPos(blockPos.getX() + x, blockPos.getY() + y, blockPos.getZ() + z);
                        if ((x == -radius || x == radius) && (z == -radius || z == radius)) {
                            continue;
                        }
                        for (Direction direction : Direction.values()) {
                            BlockState blockState = world.getBlockState(pos.relative(direction));
                            BlockState state = TwigsBlocks.AZALEA_FLOWERS.get().defaultBlockState();
                            BlockState blockState1 = world.getBlockState(pos);
                            boolean flag = world.isEmptyBlock(pos) || blockState1.is(TwigsBlocks.AZALEA_FLOWERS.get());
                            if (flag && (blockState.is(BlockTags.BASE_STONE_OVERWORLD) || blockState.is(BlockTags.DIRT) || blockState.is(Blocks.CLAY))) {
                                if (random.nextFloat() > 0.5F) {
                                    continue;
                                }
                                if (blockState1.is(TwigsBlocks.AZALEA_FLOWERS.get())) {
                                    for (Direction direction1 : Direction.values()) {
                                        if (!MultifaceBlock.hasFace(blockState1, direction1)) {
                                            continue;
                                        }
                                        state = state.setValue(AzaleaFlowersBlock.getFaceProperty(direction1), true);
                                    }
                                }
                                world.setBlock(pos, state.setValue(AzaleaFlowersBlock.getFaceProperty(direction), true), 2);
                            }
                        }
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean matchesBlock(BlockState state) {
        return state.is(Blocks.MOSS_BLOCK) || state.is(Blocks.CLAY) || state.is(BlockTags.BASE_STONE_OVERWORLD);
    }

}
