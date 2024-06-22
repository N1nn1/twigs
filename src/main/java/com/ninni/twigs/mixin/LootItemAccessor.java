package com.ninni.twigs.mixin;

import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(LootItem.class)
public interface LootItemAccessor {
    @Accessor
    Holder<Item> getItem();

    @Mutable
    @Accessor
    void setItem(Holder<Item> item);
}
