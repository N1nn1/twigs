package com.ninni.twigs.world.gen.features.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public record AzaleaFlowerPatchConfig(IntProvider xzRadius, int verticalRange) implements FeatureConfiguration {
    public static final Codec<AzaleaFlowerPatchConfig> CODEC = RecordCodecBuilder.create(instance -> instance.group(IntProvider.CODEC.fieldOf("xz_radius").forGetter(config -> config.xzRadius), Codec.intRange(0, 256).fieldOf("vertical_range").forGetter(config -> config.verticalRange)).apply(instance, AzaleaFlowerPatchConfig::new));
}
