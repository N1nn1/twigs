package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.TwigsTags;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwigsBiomeModifier {
    private static final ResourceKey<BiomeModifier> ADD_ORE_BLOODSTONE = createKey("add_ore_bloodstone");
    private static final ResourceKey<BiomeModifier> ORE_RHYOLITE = createKey("add_ore_rhyolite");
    private static final ResourceKey<BiomeModifier> ADD_ORE_SCHIST = createKey("add_ore_schist");
    private static final ResourceKey<BiomeModifier> ADD_SILT_STRIP = createKey("add_silt_strip");
    private static final ResourceKey<BiomeModifier> ADD_AZALEA_FLOWERS = createKey("add_azalea_flowers");
    private static final ResourceKey<BiomeModifier> ADD_TWIGS = createKey("add_twigs");
    private static final ResourceKey<BiomeModifier> ADD_PEBBLES = createKey("add_pebbles");
    private static final ResourceKey<BiomeModifier> ADD_LAND_SEA_SHELLS = createKey("add_land_sea_shells");
    private static final ResourceKey<BiomeModifier> ADD_WATER_SEA_SHELLS = createKey("add_water_sea_shells");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        context.register(ADD_ORE_BLOODSTONE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomeTag(context, TwigsTags.BLOODSTONE_GENERATES), getPlacedFeature(context, TwigsPlacedFeatures.ORE_BLOODSTONE), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ORE_RHYOLITE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomeTag(context, BiomeTags.IS_OVERWORLD), getPlacedFeature(context, TwigsPlacedFeatures.ORE_RHYOLITE), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_ORE_SCHIST, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomeTag(context, TwigsTags.SCHIST_GENERATES), getPlacedFeature(context, TwigsPlacedFeatures.ORE_SCHIST_LOWER, TwigsPlacedFeatures.ORE_SCHIST_UPPER), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_SILT_STRIP, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomeTag(context, BiomeTags.IS_NETHER), getPlacedFeature(context, TwigsPlacedFeatures.SILT_STRIP), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_AZALEA_FLOWERS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomeTag(context, TwigsTags.AZALEA_FLOWERS_GENERATE), getPlacedFeature(context, TwigsPlacedFeatures.AZALEA_FLOWERS), GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TWIGS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomeTag(context, TwigsTags.SPAWNS_TWIG), getPlacedFeature(context, TwigsPlacedFeatures.PATCH_TWIG), GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_PEBBLES, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomeTag(context, TwigsTags.SPAWNS_PEBBLE), getPlacedFeature(context, TwigsPlacedFeatures.PATCH_PEBBLE), GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_LAND_SEA_SHELLS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomeTag(context, TwigsTags.SPAWNS_SEA_SHELL), getPlacedFeature(context, TwigsPlacedFeatures.PATCH_SEASHELL_LAND), GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_WATER_SEA_SHELLS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomeTag(context, TwigsTags.SPAWNS_SEA_SHELL), getPlacedFeature(context, TwigsPlacedFeatures.PATCH_SEASHELL_WATER), GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    @SafeVarargs
    @NotNull
    private static HolderSet.Direct<PlacedFeature> getPlacedFeature(BootstapContext<BiomeModifier> context, ResourceKey<PlacedFeature>... placedFeature) {
        return HolderSet.direct(Stream.of(placedFeature).map(resourceKey -> context.lookup(Registries.PLACED_FEATURE).getOrThrow(resourceKey)).collect(Collectors.toList()));
    }

    @NotNull
    private static HolderSet.Direct<PlacedFeature> getPlacedFeature(BootstapContext<BiomeModifier> context, ResourceKey<PlacedFeature> placedFeature) {
        return HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(placedFeature));
    }

    @NotNull
    private static HolderSet.Named<Biome> biomeTag(BootstapContext<BiomeModifier> context, TagKey<Biome> tag) {
        return context.lookup(Registries.BIOME).getOrThrow(tag);
    }

    public static ResourceKey<BiomeModifier> createKey(String string) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Twigs.MOD_ID, string));
    }

}
