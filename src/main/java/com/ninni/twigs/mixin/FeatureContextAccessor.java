package com.ninni.twigs.mixin;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(FeaturePlaceContext.class)
public interface FeatureContextAccessor<FC extends FeatureConfiguration> {
    @Mutable
    @Accessor
    void setConfig(FC config);
}
