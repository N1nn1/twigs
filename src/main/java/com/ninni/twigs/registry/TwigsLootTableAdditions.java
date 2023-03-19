package com.ninni.twigs.registry;


import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.*;

public class TwigsLootTableAdditions {
    private static final float[] TWIG_DROP_CHANCE = new float[]{0.05F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F};
    private static final LootItemCondition.Builder WITH_SILK_TOUCH = MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1))));
    private static final LootItemCondition.Builder WITH_SHEARS = MatchTool.toolMatches(ItemPredicate.Builder.item().of(Items.SHEARS));

    static {
        //TODO replace sticks with twigs, add bamboo leaves to bamboo blocks that have leaves
        //LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
        //    if (id.equals(Blocks.SPRUCE_LEAVES.getLootTable())) {
        //        tableBuilder.pool(LootPool.lootPool()
        //                .with(LootItem.lootTableItem(TwigsItems.TWIGS)
        //                        .when(ExplosionCondition.survivesExplosion())
        //                        .when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, TWIG_DROP_CHANCE)))
        //                .when(InvertedLootItemCondition.invert(AlternativeLootItemCondition.alternative(WITH_SHEARS, WITH_SILK_TOUCH))));
        //    }
        //});

    }
}
