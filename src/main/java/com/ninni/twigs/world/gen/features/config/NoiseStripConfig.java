package com.ninni.twigs.world.gen.features.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public record NoiseStripConfig(BlockStateProvider placeState) implements FeatureConfiguration {
    public static final Codec<NoiseStripConfig> CODEC = RecordCodecBuilder.create(instance -> instance.group(BlockStateProvider.CODEC.fieldOf("place_state").forGetter(config -> config.placeState)).apply(instance, NoiseStripConfig::new));
}
