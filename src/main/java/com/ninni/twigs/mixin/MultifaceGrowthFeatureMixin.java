package com.ninni.twigs.mixin;

import com.google.common.base.Suppliers;
import com.ninni.twigs.registry.TwigsBlocks;
import net.minecraft.core.HolderSet;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.MultifaceGrowthFeature;
import net.minecraft.world.level.levelgen.feature.configurations.MultifaceGrowthConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.function.Supplier;

@Mixin(MultifaceGrowthFeature.class)
public class MultifaceGrowthFeatureMixin {
    @Unique
    private static final Supplier<MultifaceGrowthConfiguration> TWIGS_PETRIFIED_LICHEN_REPLACEMENT_CONFIG = Suppliers.memoize(() -> new MultifaceGrowthConfiguration((MultifaceBlock) TwigsBlocks.PETRIFIED_LICHEN, 20, true, true, true, 0.5F, HolderSet.direct(Block::builtInRegistryHolder, Blocks.STONE, Blocks.ANDESITE, Blocks.DIORITE, Blocks.GRANITE, Blocks.DRIPSTONE_BLOCK, Blocks.CALCITE, Blocks.TUFF, Blocks.DEEPSLATE)));

    @SuppressWarnings("unchecked")
    @ModifyVariable(method = "place", at = @At(value = "HEAD", ordinal = 0), argsOnly = true)
    private FeaturePlaceContext<MultifaceGrowthConfiguration> onGenerate(FeaturePlaceContext<MultifaceGrowthConfiguration> context) {
        if (context.origin().getY() < 0 && context.config().placeBlock == Blocks.GLOW_LICHEN) {
            FeatureContextAccessor<MultifaceGrowthConfiguration> accessor = (FeatureContextAccessor<MultifaceGrowthConfiguration>) context;
            accessor.setConfig(TWIGS_PETRIFIED_LICHEN_REPLACEMENT_CONFIG.get());
        }
        return context;
    }
}
