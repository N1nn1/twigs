package com.ninni.twigs.registry;

import com.google.common.base.Suppliers;
import com.ninni.twigs.mixin.LootItemAccessor;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemEnchantmentsPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.ItemSubPredicates;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.BambooStalkBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.properties.BambooLeaves;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
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

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@SuppressWarnings("deprecation")
public class TwigsLootTableAdditions {

    static {
        Supplier<Set<ResourceKey<LootTable>>> leafTablesSupplier = Suppliers.memoize(() -> BuiltInRegistries.BLOCK.stream()
                .filter(LeavesBlock.class::isInstance)
                .map(Block::getLootTable)
                .collect(Collectors.toSet()));
        LootTableEvents.MODIFY.register((id, builder, source, registries) -> {
            if (equals(id, Blocks.BAMBOO)) {
                builder.pool(
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
                builder.pool(
                        LootPool.lootPool()
                                .with(
                                        LootItem.lootTableItem(TwigsItems.PEBBLE)
                                                .when(InvertedLootItemCondition.invert(hasSilkTouch(registries)))
                                                .when(LootItemRandomChanceCondition.randomChance(0.2F))
                                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))).build()
                                ).build()
                );
            } else {
                if (leafTablesSupplier.get().contains(id)) {
                    builder.modifyPools(original -> {
                        LootPool pool = original.build();
                        LootPool.Builder newPool = LootPool.lootPool();

                        for (LootItemCondition condition : pool.conditions) newPool.conditionally(condition);
                        for (LootItemFunction function : pool.functions) newPool.apply(function);
                        newPool.setRolls(pool.rolls);
                        newPool.setBonusRolls(pool.bonusRolls);

                        for (LootPoolEntryContainer entry : pool.entries) {
                            if (entry instanceof LootItemAccessor itemEntry && itemEntry.getItem() == Items.STICK) itemEntry.setItem(TwigsItems.TWIG.builtInRegistryHolder());
                            newPool.with(entry);
                        }
                    });
                }
            }
        });
    }

    public static LootItemCondition.Builder hasSilkTouch(HolderLookup.Provider registries) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = registries.lookupOrThrow(Registries.ENCHANTMENT);
        return MatchTool.toolMatches(
                ItemPredicate.Builder.item()
                        .withSubPredicate(
                                ItemSubPredicates.ENCHANTMENTS,
                                ItemEnchantmentsPredicate.enchantments(List.of(new EnchantmentPredicate(registryLookup.getOrThrow(Enchantments.SILK_TOUCH), MinMaxBounds.Ints.atLeast(1))))
                        )
        );
    }

    public static boolean equals(ResourceKey<LootTable> id, Block block) {
        return id.equals(block.getLootTable());
    }
}
