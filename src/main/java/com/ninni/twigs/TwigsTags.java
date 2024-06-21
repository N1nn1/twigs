package com.ninni.twigs;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

import static com.ninni.twigs.Twigs.MOD_ID;

@SuppressWarnings("unused")
public interface TwigsTags {

    //item tags
    TagKey<Item> SCHIST_ITEM = createTag(Registries.ITEM, "schist");
    TagKey<Item> RHYOLITE_ITEM = createTag(Registries.ITEM, "rhyolite");
    TagKey<Item> BLOODSTONE_ITEM = createTag(Registries.ITEM, "bloodstone");
    TagKey<Item> PACKED_SILT_ITEM = createTag(Registries.ITEM, "packed_silt");
    TagKey<Item> PACKED_SILT_FULL_BLOCKS = createTag(Registries.ITEM, "packed_silt_full_blocks");
    TagKey<Item> SILT_POTS_ITEM = createTag(Registries.ITEM, "silt_pots");
    TagKey<Item> SEASHELLS = createTag(Registries.ITEM, "seashells");
    TagKey<Item> TABLES_ITEM = createTag(Registries.ITEM, "tables");

    //block tags
    TagKey<Block> SCHIST_BLOCK = createTag(Registries.BLOCK, "schist");
    TagKey<Block> RHYOLITE_BLOCK = createTag(Registries.BLOCK, "rhyolite");
    TagKey<Block> BLOODSTONE_BLOCK = createTag(Registries.BLOCK, "bloodstone");
    TagKey<Block> PACKED_SILT_BLOCK = createTag(Registries.BLOCK, "packed_silt");
    TagKey<Block> SILT_POTS_BLOCK = createTag(Registries.BLOCK, "silt_pots");
    TagKey<Block> OFFSET_REMOVER = createTag(Registries.BLOCK, "offset_remover");
    TagKey<Block> TABLES_BLOCK = createTag(Registries.BLOCK, "tables");

    //biome tags
    TagKey<Biome> BLOODSTONE_GENERATES = createTag(Registries.BIOME, "bloodstone_generates");
    TagKey<Biome> SCHIST_GENERATES = createTag(Registries.BIOME, "schist_generates");
    TagKey<Biome> SILT_GENERATES = createTag(Registries.BIOME, "silt_generates");
    TagKey<Biome> AZALEA_FLOWERS_GENERATE = createTag(Registries.BIOME, "azalea_flowers_generate");
    TagKey<Biome> SPAWNS_TWIG = createTag(Registries.BIOME, "spawns_twig");
    TagKey<Biome> SPAWNS_PEBBLE = createTag(Registries.BIOME, "spawns_pebble");
    TagKey<Biome> SPAWNS_SEA_SHELL = createTag(Registries.BIOME, "spawns_sea_shell");

    TagKey<EntityType<?>> BAMBOO_LEAVES_SLOW_IMMUNE = createTag(Registries.ENTITY_TYPE, "bamboo_leaves_slow_immune");

    static <T> TagKey<T> createTag(ResourceKey<Registry<T>> resourceKey, String path) {
        return TagKey.create(resourceKey, ResourceLocation.fromNamespaceAndPath(MOD_ID, path));
    }
}
