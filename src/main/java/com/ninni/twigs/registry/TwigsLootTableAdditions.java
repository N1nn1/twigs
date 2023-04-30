package com.ninni.twigs.registry;


import com.google.common.base.Suppliers;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;

import java.util.Set;
import java.util.stream.Collectors;

public class TwigsLootTableAdditions {

    static {
//        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
//            if (equals(id, Blocks.BAMBOO)) {
//                tableBuilder.pool(
//                        LootPool.lootPool()
//                                .with(
//                                        LootItem.lootTableItem(TwigsBlocks.BAMBOO_LEAVES.get())
//                                                .when(
//                                                        InvertedLootItemCondition.invert(
//                                                                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.BAMBOO)
//                                                                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BambooStalkBlock.LEAVES, BambooLeaves.NONE))
//                                                        )
//                                                ).build()
//                                ).build()
//                );
//            } else if (equals(id, Blocks.GRAVEL)) {
//                tableBuilder.pool(
//                        LootPool.lootPool()
//                                .with(
//                                        LootItem.lootTableItem(TwigsItems.PEBBLE.get())
//                                                .when(InvertedLootItemCondition.invert(
//                                                        MatchTool.toolMatches(
//                                                                ItemPredicate.Builder.item()
//                                                                        .hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.ANY)))
//                                                ))
//                                                .when(LootItemRandomChanceCondition.randomChance(0.2F))
//                                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))).build()
//                                ).build()
//                );
//            } else {
//                if (leafTablesSupplier.get().contains(id)) {
//                    tableBuilder.modifyPools(original -> {
//                        LootPool pool = original.build();
//                        LootPool.Builder builder = LootPool.lootPool();
//
//                        for (LootItemCondition condition : pool.conditions) builder.conditionally(condition);
//                        for (LootItemFunction function : pool.functions) builder.apply(function);
//                        builder.setRolls(pool.rolls);
//                        builder.setBonusRolls(pool.bonusRolls);
//
//                        for (LootPoolEntryContainer entry : pool.entries) {
//                            if (entry instanceof LootItemAccessor itemEntry && itemEntry.getItem() == Items.STICK) itemEntry.setItem(TwigsItems.TWIG);
//                            builder.with(entry);
//                        }
//                    });
//                }
//            }
//        });
    }

    public static boolean equals(ResourceLocation id, Block block) {
        return id.equals(block.getLootTable());
    }
}
