package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.data.TwigsConfiguredFeatureProvider;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import java.util.List;

public class TwigsPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ORE_RHYOLITE = createKey("ore_rhyolite");
    public static final ResourceKey<PlacedFeature> ORE_BLOODSTONE = createKey("ore_bloodstone");
    public static final ResourceKey<PlacedFeature> ORE_SCHIST_UPPER = createKey("ore_schist_upper");
    public static final ResourceKey<PlacedFeature> ORE_SCHIST_LOWER = createKey("ore_schist_lower");
    public static final ResourceKey<PlacedFeature> SILT_STRIP = createKey("silt_strip");
    public static final ResourceKey<PlacedFeature> AZALEA_FLOWERS = createKey("azalea_flowers");
    public static final ResourceKey<PlacedFeature> PATCH_TWIG = createKey("patch_twig");
    public static final ResourceKey<PlacedFeature> PATCH_PEBBLE = createKey("patch_pebble");
    public static final ResourceKey<PlacedFeature> PATCH_SEASHELL = createKey("patch_seashell");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        register(context, ORE_RHYOLITE, TwigsConfiguredFeatures.ORE_RHYOLITE, commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(16))));
        register(context, ORE_BLOODSTONE, TwigsConfiguredFeatures.ORE_BLOODSTONE, commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(5), VerticalAnchor.top())));
        register(context, ORE_SCHIST_UPPER, TwigsConfiguredFeatures.ORE_SCHIST, rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));
        register(context, ORE_SCHIST_LOWER, TwigsConfiguredFeatures.ORE_SCHIST, commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(60))));
        register(context, SILT_STRIP, TwigsConfiguredFeatures.SILT_STRIP, CountPlacement.of(20), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
        register(context, AZALEA_FLOWERS, TwigsConfiguredFeatures.AZALEA_FLOWERS, CountPlacement.of(160), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
        register(context, PATCH_TWIG, TwigsConfiguredFeatures.PATCH_TWIG, VegetationPlacements.worldSurfaceSquaredWithCount(2));
        register(context, PATCH_PEBBLE, TwigsConfiguredFeatures.PATCH_PEBBLE, VegetationPlacements.worldSurfaceSquaredWithCount(2));
        register(context, PATCH_SEASHELL, TwigsConfiguredFeatures.PATCH_SEASHELL, VegetationPlacements.worldSurfaceSquaredWithCount(2));
    }

    public static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> resourceKey, ResourceKey<ConfiguredFeature<?, ?>> configuredFeature, PlacementModifier... placementModifiers) {
        register(context, resourceKey, configuredFeature, List.of(placementModifiers));
    }

    public static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> resourceKey, ResourceKey<ConfiguredFeature<?, ?>> configuredFeature, List<PlacementModifier> placementModifiers) {
        context.register(resourceKey, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(configuredFeature), List.copyOf(placementModifiers)));
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier placementModifier, PlacementModifier placementModifier2) {
        return List.of(placementModifier, InSquarePlacement.spread(), placementModifier2, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int i, PlacementModifier placementModifier) {
        return orePlacement(CountPlacement.of(i), placementModifier);
    }

    private static List<PlacementModifier> rareOrePlacement(int i, PlacementModifier placementModifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(i), placementModifier);
    }

    public static ResourceKey<PlacedFeature> createKey(String string) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Twigs.MOD_ID, string));
    }

}
