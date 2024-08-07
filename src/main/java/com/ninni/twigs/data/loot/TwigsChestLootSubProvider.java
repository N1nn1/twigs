package com.ninni.twigs.data.loot;

import com.ninni.twigs.registry.TwigsItems;
import com.ninni.twigs.registry.TwigsLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.EmptyLootItem;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.function.BiConsumer;


public record TwigsChestLootSubProvider(HolderLookup.Provider registries) implements LootTableSubProvider {
    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> builder) {
        builder.accept(
                TwigsLootTables.BLOODSTONE_OBELISK_CHEST,
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(UniformGenerator.between(0, 1))
                                .add(LootItem.lootTableItem(Items.CROSSBOW))
                        )
                        .withPool(LootPool.lootPool()
                                .setRolls(UniformGenerator.between(2, 3))
                                .add(EmptyLootItem.emptyItem())
                        )
                        .withPool(LootPool.lootPool()
                                .setRolls(UniformGenerator.between(1.0F, 3.0F))
                                .add(LootItem.lootTableItem(TwigsItems.BLOODSTONE.get())
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 3)))
                                )
                        )
                        .withPool(LootPool.lootPool()
                                .setRolls(UniformGenerator.between(2, 3))
                                .add(LootItem.lootTableItem(Items.EXPERIENCE_BOTTLE).setWeight(7)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 8)))
                                )
                                .add(LootItem.lootTableItem(Items.STRING).setWeight(4)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 6)))
                                )
                                .add(LootItem.lootTableItem(Items.ARROW).setWeight(4)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 7)))
                                )
                                .add(LootItem.lootTableItem(Items.SPECTRAL_ARROW).setWeight(5)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 6)))
                                )
                                .add(LootItem.lootTableItem(Items.GOLD_INGOT).setWeight(3)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2)))
                                )
                        )
        );
    }
}
