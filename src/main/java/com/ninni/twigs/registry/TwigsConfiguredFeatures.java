package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.world.gen.features.config.AzaleaFlowerPatchConfig;
import com.ninni.twigs.world.gen.features.config.NoiseStripConfig;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class TwigsConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_RHYOLITE = createKey("ore_rhyolite");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_SCHIST = createKey("ore_schist");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_BLOODSTONE = createKey("ore_bloodstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILT_STRIP = createKey("silt_strip");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AZALEA_FLOWERS = createKey("azalea_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_TWIG = createKey("patch_twig");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PEBBLE = createKey("patch_pebble");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SEASHELL = createKey("patch_seashell");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        TagMatchTest baseStoneOverworld = new TagMatchTest(BlockTags.BASE_STONE_OVERWORLD);
        TagMatchTest baseStoneNether = new TagMatchTest(BlockTags.BASE_STONE_NETHER);
        registerConfiguredFeature(context, ORE_RHYOLITE, Feature.ORE, new OreConfiguration(baseStoneOverworld, TwigsBlocks.RHYOLITE.get().defaultBlockState(), 45));
        registerConfiguredFeature(context, ORE_SCHIST, Feature.ORE, new OreConfiguration(baseStoneOverworld, TwigsBlocks.SCHIST.get().defaultBlockState(), 64));
        registerConfiguredFeature(context, ORE_BLOODSTONE, Feature.ORE, new OreConfiguration(baseStoneNether, TwigsBlocks.BLOODSTONE.get().defaultBlockState(), 64));
        registerConfiguredFeature(context, SILT_STRIP, TwigsFeatures.NOISE_STRIP.get(), new NoiseStripConfig(BlockStateProvider.simple(TwigsBlocks.SILT.get())));
        registerConfiguredFeature(context, AZALEA_FLOWERS, TwigsFeatures.AZALEA_FLOWER_PATCH.get(), new AzaleaFlowerPatchConfig(UniformInt.of(2, 4), 3));
        registerConfiguredFeature(context, PATCH_TWIG, Feature.RANDOM_PATCH, FeatureUtils.simpleRandomPatchConfiguration(3, PlacementUtils.onlyWhenEmpty(TwigsFeatures.WATERLOGGABLE_SIMPLE_BLOCK.get(), new SimpleBlockConfiguration(BlockStateProvider.simple(TwigsBlocks.TWIG.get())))));
        registerConfiguredFeature(context, PATCH_PEBBLE, Feature.RANDOM_PATCH, FeatureUtils.simpleRandomPatchConfiguration(2, PlacementUtils.onlyWhenEmpty(TwigsFeatures.WATERLOGGABLE_SIMPLE_BLOCK.get(), new SimpleBlockConfiguration(BlockStateProvider.simple(TwigsBlocks.PEBBLE.get())))));
        registerConfiguredFeature(context, PATCH_SEASHELL, Feature.RANDOM_PATCH, FeatureUtils.simpleRandomPatchConfiguration(2, PlacementUtils.filtered(TwigsFeatures.WATERLOGGABLE_SIMPLE_BLOCK.get(), new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(TwigsBlocks.OPALINE_SEASHELL.get().defaultBlockState(), 20).add(TwigsBlocks.TANGERINE_SEASHELL.get().defaultBlockState(), 20).add(TwigsBlocks.ROSEATE_SEASHELL.get().defaultBlockState(), 15).add(TwigsBlocks.BRONZED_SEASHELL.get().defaultBlockState(), 8))), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void registerConfiguredFeature(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> resourceKey, F feature, FC featureConfiguration) {
        context.register(resourceKey, new ConfiguredFeature<>(feature, featureConfiguration));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String string) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Twigs.MOD_ID, string));
    }

}
