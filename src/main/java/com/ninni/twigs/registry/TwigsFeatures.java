package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.world.gen.features.AzaleaFlowerPatchFeature;
import com.ninni.twigs.world.gen.features.NoiseStripFeature;
import com.ninni.twigs.world.gen.features.WaterloggableSimpleBlockFeature;
import com.ninni.twigs.world.gen.features.config.AzaleaFlowerPatchConfig;
import com.ninni.twigs.world.gen.features.config.NoiseStripConfig;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Twigs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TwigsFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Twigs.MOD_ID);

    public static final RegistryObject<Feature<NoiseStripConfig>> NOISE_STRIP = FEATURES.register("noise_strip", () -> new NoiseStripFeature(NoiseStripConfig.CODEC));
    public static final RegistryObject<Feature<AzaleaFlowerPatchConfig>> AZALEA_FLOWER_PATCH = FEATURES.register("azalea_flower_patch", () -> new AzaleaFlowerPatchFeature(AzaleaFlowerPatchConfig.CODEC));
    public static final RegistryObject<Feature<SimpleBlockConfiguration>> WATERLOGGABLE_SIMPLE_BLOCK = FEATURES.register("waterloggable_simple_block", () -> new WaterloggableSimpleBlockFeature(SimpleBlockConfiguration.CODEC));

}
