package com.ninni.twigs.registry;


import com.google.common.base.Suppliers;
import com.ninni.twigs.mixin.LootItemAccessor;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.BambooStalkBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.properties.BambooLeaves;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.InvertedLootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TwigsLootTableAdditions {

    static {
        Supplier<Set<ResourceLocation>> leafTablesSupplier = Suppliers.memoize(() -> {
            return BuiltInRegistries.BLOCK.stream()
                    .filter(LeavesBlock.class::isInstance)
                    .map(Block::getLootTable)
                    .collect(Collectors.toSet());
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (equals(id, Blocks.BAMBOO)) {
                tableBuilder.pool(
                        LootPool.lootPool()
                                .with(
                                        LootItem.lootTableItem(TwigsBlocks.BAMBOO_LEAVES)
                                                .when(
                                                        InvertedLootItemCondition.invert(
                                                                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.BAMBOO)
                                                                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BambooStalkBlock.LEAVES, BambooLeaves.NONE))
                                                        )
                                                ).build()
                                ).build()
                );
            } else if (equals(id, Blocks.GRAVEL)) {
                tableBuilder.pool(
                        LootPool.lootPool()
                                .with(
                                        LootItem.lootTableItem(TwigsItems.PEBBLE)
                                                .when(InvertedLootItemCondition.invert(
                                                        MatchTool.toolMatches(
                                                                ItemPredicate.Builder.item()
                                                                        .hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.ANY)))
                                                ))
                                                .when(LootItemRandomChanceCondition.randomChance(0.2F))
                                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))).build()
                                ).build()
                );
            } else {
                if (leafTablesSupplier.get().contains(id)) {
                    tableBuilder.modifyPools(original -> {
                        LootPool pool = original.build();
                        LootPool.Builder builder = LootPool.lootPool();

                        for (LootItemCondition condition : pool.conditions) builder.conditionally(condition);
                        for (LootItemFunction function : pool.functions) builder.apply(function);
                        builder.setRolls(pool.rolls);
                        builder.setBonusRolls(pool.bonusRolls);

                        for (LootPoolEntryContainer entry : pool.entries) {
                            if (entry instanceof LootItemAccessor itemEntry && itemEntry.getItem() == Items.STICK) itemEntry.setItem(TwigsItems.TWIG);
                            builder.with(entry);
                        }
                    });
                }
            }
        });
    }

    public static boolean equals(ResourceLocation id, Block block) {
        return id.equals(block.getLootTable());
    }
}
