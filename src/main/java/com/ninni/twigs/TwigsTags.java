package com.ninni.twigs;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

import static com.ninni.twigs.Twigs.MOD_ID;

@SuppressWarnings("unused")
public interface TwigsTags {

    //item tags
    TagKey<Item> SCHIST_ITEM = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "schist"));
    TagKey<Item> RHYOLITE_ITEM = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "rhyolite"));
    TagKey<Item> BLOODSTONE_ITEM = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "bloodstone"));
    TagKey<Item> PACKED_SILT_ITEM = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "packed_silt"));
    TagKey<Item> PACKED_SILT_FULL_BLOCKS = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "packed_silt_full_blocks"));
    TagKey<Item> SILT_POTS_ITEM = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "silt_pots"));

    //block tags
    TagKey<Block> SCHIST_BLOCK = TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "schist"));
    TagKey<Block> RHYOLITE_BLOCK = TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "rhyolite"));
    TagKey<Block> BLOODSTONE_BLOCK = TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "bloodstone"));
    TagKey<Block> PACKED_SILT_BLOCK = TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "packed_silt"));
    TagKey<Block> SILT_POTS_BLOCK = TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "silt_pots"));
    TagKey<Block> OFFSET_REMOVER = TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "offset_remover"));
    TagKey<Block> SEA_SHELL_PLACEABLES = TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "sea_shell_placeables"));

    //biome tags
    TagKey<Biome> BLOODSTONE_GENERATES = TagKey.create(Registries.BIOME, new ResourceLocation(MOD_ID, "bloodstone_generates"));
    TagKey<Biome> SCHIST_GENERATES = TagKey.create(Registries.BIOME, new ResourceLocation(MOD_ID, "schist_generates"));
    TagKey<Biome> SILT_GENERATES = TagKey.create(Registries.BIOME, new ResourceLocation(MOD_ID, "silt_generates"));
    TagKey<Biome> AZALEA_FLOWERS_GENERATE = TagKey.create(Registries.BIOME, new ResourceLocation(MOD_ID, "azalea_flowers_generate"));
    TagKey<Biome> SPAWNS_TWIG = TagKey.create(Registries.BIOME, new ResourceLocation(MOD_ID, "spawns_twig"));
    TagKey<Biome> SPAWNS_PEBBLE = TagKey.create(Registries.BIOME, new ResourceLocation(MOD_ID, "spawns_pebble"));
    TagKey<Biome> SPAWNS_SEA_SHELL = TagKey.create(Registries.BIOME, new ResourceLocation(MOD_ID, "spawns_sea_shell"));
}
