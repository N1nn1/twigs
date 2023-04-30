package com.ninni.twigs.mixin;

import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(LootPool.Builder.class)
public interface BuilderAccessor {
    @Accessor
    List<LootPoolEntryContainer> getEntries();

    @Accessor
    List<LootItemCondition> getConditions();

    @Accessor
    List<LootItemFunction> getFunctions();
}
