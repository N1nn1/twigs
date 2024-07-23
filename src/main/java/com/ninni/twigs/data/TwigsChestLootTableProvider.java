package com.ninni.twigs.data;

import com.ninni.twigs.registry.TwigsItems;
import com.ninni.twigs.registry.TwigsLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.EmptyLootItem;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class TwigsChestLootTableProvider extends SimpleFabricLootTableProvider {
    public TwigsChestLootTableProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, registryLookup, LootContextParamSets.CHEST);
    }

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> builder) {
        builder.accept(
                TwigsLootTables.BLOODSTONE_OBELISK_CHEST,
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(UniformGenerator.between(0, 1))
                                .with(LootItem.lootTableItem(Items.CROSSBOW).build())
                        )
                        .withPool(LootPool.lootPool()
                                .setRolls(UniformGenerator.between(2, 3))
                                .with(EmptyLootItem.emptyItem().build())
                        )
                        .withPool(LootPool.lootPool()
                                .setRolls(UniformGenerator.between(1.0F, 3.0F))
                                .with(LootItem.lootTableItem(TwigsItems.BLOODSTONE)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 3))).build()
                                )
                        )
                        .withPool(LootPool.lootPool()
                                .setRolls(UniformGenerator.between(2, 3))
                                .with(LootItem.lootTableItem(Items.EXPERIENCE_BOTTLE).setWeight(7)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 8))).build()
                                )
                                .with(LootItem.lootTableItem(Items.STRING).setWeight(4)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 6))).build()
                                )
                                .with(LootItem.lootTableItem(Items.ARROW).setWeight(4)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 7))).build()
                                )
                                .with(LootItem.lootTableItem(Items.SPECTRAL_ARROW).setWeight(5)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 6))).build()
                                )
                                .with(LootItem.lootTableItem(Items.GOLD_INGOT).setWeight(3)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))).build()
                                )
                        )
        );
    }
}
