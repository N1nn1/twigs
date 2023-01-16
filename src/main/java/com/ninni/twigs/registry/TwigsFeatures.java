package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.world.gen.StoneStripFeature;
import com.ninni.twigs.world.gen.config.NoiseStripConfig;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public class TwigsFeatures {

    public static final Feature<NoiseStripConfig> NOISE_STRIP = register("noise_strip", new StoneStripFeature(NoiseStripConfig.CODEC));

    private static <C extends FeatureConfiguration, F extends Feature<C>> F register(String string, F feature) {
        return Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(Twigs.MOD_ID, string), feature);
    }

}
