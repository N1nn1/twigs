package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.world.gen.features.AzaleaFlowerPatchFeature;
import com.ninni.twigs.world.gen.features.NoiseStripFeature;
import com.ninni.twigs.world.gen.features.WaterloggableSimpleBlockFeature;
import com.ninni.twigs.world.gen.features.config.AzaleaFlowerPatchConfig;
import com.ninni.twigs.world.gen.features.config.NoiseStripConfig;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;

public class TwigsFeatures {

    public static final Feature<NoiseStripConfig> NOISE_STRIP = register("noise_strip", new NoiseStripFeature(NoiseStripConfig.CODEC));
    public static final Feature<AzaleaFlowerPatchConfig> AZALEA_FLOWER_PATCH = register("azalea_flower_patch", new AzaleaFlowerPatchFeature(AzaleaFlowerPatchConfig.CODEC));
    public static final Feature<SimpleBlockConfiguration> WATERLOGGABLE_SIMPLE_BLOCK = register("waterloggable_simple_block", new WaterloggableSimpleBlockFeature(SimpleBlockConfiguration.CODEC));

    private static <C extends FeatureConfiguration, F extends Feature<C>> F register(String string, F feature) {
        return Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(Twigs.MOD_ID, string), feature);
    }

}
