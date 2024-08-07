package com.ninni.twigs.data.tags;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.TwigsTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class TwigsBiomeTagProvider extends BiomeTagsProvider {
    public TwigsBiomeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, @Nullable ExistingFileHelper fileHelper) {
        super(output, provider, Twigs.MOD_ID, fileHelper);
    }
    // (ender) forge ur cringe I just want you to know that
    public static final TagKey<Biome> F_IS_MOUNTAIN = BiomeTags.create(ResourceLocation.fromNamespaceAndPath("forge", "is_mountain"));

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        tag(TwigsTags.AZALEA_FLOWERS_GENERATE)
                .add(Biomes.LUSH_CAVES);

        tag(TwigsTags.BLOODSTONE_GENERATES)
                .add(Biomes.CRIMSON_FOREST)
                .add(Biomes.WARPED_FOREST)
                .add(Biomes.BASALT_DELTAS);

        tag(TwigsTags.SCHIST_GENERATES)
                .addTag(F_IS_MOUNTAIN);

        tag(TwigsTags.SILT_GENERATES)
                .add(Biomes.NETHER_WASTES)
                .add(Biomes.SOUL_SAND_VALLEY);

        tag(TwigsTags.SPAWNS_PEBBLE)
                .addTag(BiomeTags.IS_RIVER)
                .addTag(BiomeTags.IS_SAVANNA)
                .addTag(BiomeTags.IS_TAIGA)
                .addTag(BiomeTags.IS_BEACH)
                .add(Biomes.PLAINS)
                .add(Biomes.SUNFLOWER_PLAINS)
                .add(Biomes.MEADOW)
                .add(Biomes.MUSHROOM_FIELDS)
                .add(Biomes.WINDSWEPT_FOREST)
                .add(Biomes.WINDSWEPT_HILLS)
                .add(Biomes.WINDSWEPT_GRAVELLY_HILLS)
                .add(Biomes.STONY_SHORE)
                .add(Biomes.SWAMP);

        tag(TwigsTags.SPAWNS_SEA_SHELL)
                .addTag(BiomeTags.IS_DEEP_OCEAN)
                .addTag(BiomeTags.IS_OCEAN)
                .addTag(BiomeTags.IS_BEACH)
                .addTag(BiomeTags.IS_RIVER)
                .add(Biomes.STONY_SHORE);


        tag(TwigsTags.SPAWNS_TWIG)
                .addTag(BiomeTags.IS_FOREST)
                .addTag(BiomeTags.IS_TAIGA)
                .add(Biomes.SWAMP);

        tag(TwigsTags.HAS_STRUCTURE_BLOODSTONE_OBELISK)
                .add(Biomes.NETHER_WASTES)
                .add(Biomes.CRIMSON_FOREST);
    }
}
