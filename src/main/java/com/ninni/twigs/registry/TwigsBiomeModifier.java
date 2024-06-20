package com.ninni.twigs.registry;

import com.google.common.collect.ImmutableList;
import com.ninni.twigs.Twigs;
import com.ninni.twigs.TwigsTags;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.Util;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.function.Predicate;

public class TwigsBiomeModifier {

    public static void init() {
        addOre("add_ore_bloodstone", TwigsPlacedFeatures.ORE_BLOODSTONE, BiomeSelectors.tag(TwigsTags.BLOODSTONE_GENERATES));
        addOre("add_ore_rhyolite", TwigsPlacedFeatures.ORE_RHYOLITE, BiomeSelectors.foundInOverworld());
        Util.make(ImmutableList.<ResourceKey<PlacedFeature>>builder(), list -> {
            list.add(TwigsPlacedFeatures.ORE_SCHIST_LOWER);
            list.add(TwigsPlacedFeatures.ORE_SCHIST_UPPER);
        }).build().forEach(resourceKey -> addOre("add_ore_schist", resourceKey, BiomeSelectors.tag(TwigsTags.SCHIST_GENERATES)));
        addOre("add_silt_strip", TwigsPlacedFeatures.SILT_STRIP, BiomeSelectors.foundInTheNether());

        addFeature("add_azalea_flowers", GenerationStep.Decoration.VEGETAL_DECORATION, TwigsPlacedFeatures.AZALEA_FLOWERS, TwigsTags.AZALEA_FLOWERS_GENERATE);
        addFeature("add_twigs", GenerationStep.Decoration.VEGETAL_DECORATION, TwigsPlacedFeatures.PATCH_TWIG, TwigsTags.SPAWNS_TWIG);
        addFeature("add_pebbles", GenerationStep.Decoration.VEGETAL_DECORATION, TwigsPlacedFeatures.PATCH_PEBBLE, TwigsTags.SPAWNS_PEBBLE);
        addFeature("add_land_sea_shells", GenerationStep.Decoration.VEGETAL_DECORATION, TwigsPlacedFeatures.PATCH_SEASHELL_LAND, TwigsTags.SPAWNS_SEA_SHELL);
        addFeature("add_water_sea_shells", GenerationStep.Decoration.VEGETAL_DECORATION, TwigsPlacedFeatures.PATCH_SEASHELL_WATER, TwigsTags.SPAWNS_SEA_SHELL);
    }

    public static void addFeature(String id, GenerationStep.Decoration decoration, ResourceKey<PlacedFeature> resourceKey, TagKey<Biome> biome) {
        BiomeModifications.create(ResourceLocation.fromNamespaceAndPath(Twigs.MOD_ID, id)).add(ModificationPhase.ADDITIONS, BiomeSelectors.tag(biome), biomeModificationContext -> biomeModificationContext.getGenerationSettings().addFeature(decoration, resourceKey));
    }

    private static void addOre(String id, ResourceKey<PlacedFeature> resourceKey, Predicate<BiomeSelectionContext> biome) {
        BiomeModifications.create(ResourceLocation.fromNamespaceAndPath(Twigs.MOD_ID, id)).add(ModificationPhase.ADDITIONS, biome, context -> context.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, resourceKey));
    }

}
