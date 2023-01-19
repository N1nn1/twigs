package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.world.gen.features.config.NoiseStripConfig;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.MultifaceGrowthConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class TwigsConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_RHYOLITE = createKey("ore_rhyolite");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_SCHIST = createKey("ore_schist");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_BLOODSTONE = createKey("ore_bloodstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILT_STRIP = createKey("silt_strip");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AZALEA_FLOWERS = createKey("azalea_flowers");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        TagMatchTest baseStoneOverworld = new TagMatchTest(BlockTags.BASE_STONE_OVERWORLD);
        TagMatchTest baseStoneNether = new TagMatchTest(BlockTags.BASE_STONE_NETHER);
        registerConfiguredFeature(context, ORE_RHYOLITE, Feature.ORE, new OreConfiguration(baseStoneOverworld, TwigsBlocks.RHYOLITE.defaultBlockState(), 45));
        registerConfiguredFeature(context, ORE_SCHIST, Feature.ORE, new OreConfiguration(baseStoneOverworld, TwigsBlocks.SCHIST.defaultBlockState(), 64));
        registerConfiguredFeature(context, ORE_BLOODSTONE, Feature.ORE, new OreConfiguration(baseStoneNether, TwigsBlocks.BLOODSTONE.defaultBlockState(), 64));
        registerConfiguredFeature(context, SILT_STRIP, TwigsFeatures.NOISE_STRIP, new NoiseStripConfig(BlockStateProvider.simple(TwigsBlocks.SILT)));
        registerConfiguredFeature(context, AZALEA_FLOWERS, Feature.MULTIFACE_GROWTH, new MultifaceGrowthConfiguration((MultifaceBlock)TwigsBlocks.AZALEA_FLOWERS, 20, false, true, true, 0.9f, HolderSet.direct(Block::builtInRegistryHolder, Blocks.STONE, Blocks.ANDESITE, Blocks.DIORITE, Blocks.GRANITE, Blocks.CALCITE, TwigsBlocks.RHYOLITE, TwigsBlocks.SCHIST, Blocks.CLAY, Blocks.TUFF, Blocks.MOSS_BLOCK, Blocks.DEEPSLATE)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void registerConfiguredFeature(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> resourceKey, F feature, FC featureConfiguration) {
        context.register(resourceKey, new ConfiguredFeature<>(feature, featureConfiguration));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String string) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Twigs.MOD_ID, string));
    }

}
