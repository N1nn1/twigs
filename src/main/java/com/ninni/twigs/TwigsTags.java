package com.ninni.twigs;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
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
}
