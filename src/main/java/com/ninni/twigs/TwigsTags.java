package com.ninni.twigs;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static com.ninni.twigs.Twigs.MOD_ID;

@SuppressWarnings("unused")
public interface TwigsTags {

    //item tags
    TagKey<Item> SCHIST_ITEM = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(MOD_ID, "schist"));
    TagKey<Item> RHYOLITE_ITEM = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(MOD_ID, "rhyolite"));
    TagKey<Item> BLOODSTONE_ITEM = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(MOD_ID, "bloodstone"));

    //block tags
    TagKey<Block> SCHIST_BLOCK = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(MOD_ID, "schist"));
    TagKey<Block> RHYOLITE_BLOCK = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(MOD_ID, "rhyolite"));
    TagKey<Block> BLOODSTONE_BLOCK = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(MOD_ID, "bloodstone"));
}
