package com.ninni.twigs.data.tags;

import com.ninni.twigs.TwigsTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;

import java.util.concurrent.CompletableFuture;

public class TwigsBiomeTagProvider extends FabricTagProvider<Biome> {

    public TwigsBiomeTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, Registries.BIOME,completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        getOrCreateTagBuilder(TwigsTags.AZALEA_FLOWERS_GENERATE)
                .add(Biomes.LUSH_CAVES);

        getOrCreateTagBuilder(TwigsTags.BLOODSTONE_GENERATES)
                .add(Biomes.CRIMSON_FOREST)
                .add(Biomes.WARPED_FOREST)
                .add(Biomes.BASALT_DELTAS);

        getOrCreateTagBuilder(TwigsTags.SCHIST_GENERATES)
                .forceAddTag(ConventionalBiomeTags.IS_MOUNTAIN);

        getOrCreateTagBuilder(TwigsTags.SILT_GENERATES)
                .add(Biomes.NETHER_WASTES)
                .add(Biomes.SOUL_SAND_VALLEY);

        getOrCreateTagBuilder(TwigsTags.SPAWNS_PEBBLE)
                .forceAddTag(BiomeTags.IS_RIVER)
                .forceAddTag(BiomeTags.IS_SAVANNA)
                .forceAddTag(BiomeTags.IS_TAIGA)
                .forceAddTag(BiomeTags.IS_BEACH)
                .add(Biomes.PLAINS)
                .add(Biomes.SUNFLOWER_PLAINS)
                .add(Biomes.MEADOW)
                .add(Biomes.MUSHROOM_FIELDS)
                .add(Biomes.WINDSWEPT_FOREST)
                .add(Biomes.WINDSWEPT_HILLS)
                .add(Biomes.WINDSWEPT_GRAVELLY_HILLS)
                .add(Biomes.STONY_SHORE)
                .add(Biomes.SWAMP);

        getOrCreateTagBuilder(TwigsTags.SPAWNS_SEA_SHELL)
                .forceAddTag(BiomeTags.IS_DEEP_OCEAN)
                .forceAddTag(BiomeTags.IS_OCEAN)
                .forceAddTag(BiomeTags.IS_BEACH)
                .forceAddTag(BiomeTags.IS_RIVER)
                .add(Biomes.STONY_SHORE);


        getOrCreateTagBuilder(TwigsTags.SPAWNS_TWIG)
                .forceAddTag(BiomeTags.IS_FOREST)
                .forceAddTag(BiomeTags.IS_TAIGA)
                .add(Biomes.SWAMP);

        getOrCreateTagBuilder(TwigsTags.HAS_STRUCTURE_BLOODSTONE_OBELISK)
                .add(Biomes.NETHER_WASTES)
                .add(Biomes.CRIMSON_FOREST);
    }
}
