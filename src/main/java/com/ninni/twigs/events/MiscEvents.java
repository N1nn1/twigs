package com.ninni.twigs.events;

import com.google.common.base.Suppliers;
import com.ninni.twigs.Twigs;
import com.ninni.twigs.registry.TwigsBlocks;
import com.ninni.twigs.registry.TwigsItems;
import com.ninni.twigs.registry.TwigsLootTables;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BambooLeaves;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.NestedLootTable;
import net.minecraft.world.level.storage.loot.predicates.InvertedLootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraftforge.common.util.MutableHashedLinkedMap;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.TagsUpdatedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Mod.EventBusSubscriber(modid = Twigs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MiscEvents {

    @SubscribeEvent
    public void onBuildContents(BuildCreativeModeTabContentsEvent event) {
        MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> entries = event.getEntries();
        CreativeModeTab tab = event.getTab();
        if (tab.equals(CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
            putAfter(entries, Items.REDSTONE_TORCH,
                    TwigsItems.PAPER_LANTERN.get(),
                    TwigsItems.ALLIUM_PAPER_LANTERN.get(),
                    TwigsItems.BLUE_ORCHID_PAPER_LANTERN.get(),
                    TwigsItems.CRIMSON_ROOTS_PAPER_LANTERN.get(),
                    TwigsItems.DANDELION_PAPER_LANTERN.get(),
                    TwigsItems.TORCHFLOWER_PAPER_LANTERN.get(),
                    TwigsItems.LAMP.get(),
                    TwigsItems.SOUL_LAMP.get());
            putAfter(entries, Items.GLOW_LICHEN, TwigsItems.PETRIFIED_LICHEN.get());
            putAfter(entries, Items.SHROOMLIGHT, TwigsItems.CRIMSON_SHROOMLAMP.get(), TwigsItems.WARPED_SHROOMLAMP.get());
            putAfter(entries, Items.FLOWER_POT, TwigsItems.SILT_POT.get(), TwigsItems.WHITE_SILT_POT.get(), TwigsItems.LIGHT_GRAY_SILT_POT.get(), TwigsItems.GRAY_SILT_POT.get(), TwigsItems.BLACK_SILT_POT.get(), TwigsItems.BROWN_SILT_POT.get(), TwigsItems.RED_SILT_POT.get(), TwigsItems.ORANGE_SILT_POT.get(), TwigsItems.YELLOW_SILT_POT.get(), TwigsItems.LIME_SILT_POT.get(), TwigsItems.GREEN_SILT_POT.get(), TwigsItems.CYAN_SILT_POT.get(), TwigsItems.LIGHT_BLUE_SILT_POT.get(), TwigsItems.BLUE_SILT_POT.get(), TwigsItems.PURPLE_SILT_POT.get(), TwigsItems.MAGENTA_SILT_POT.get(), TwigsItems.PINK_SILT_POT.get());
        }
        if (tab.equals(CreativeModeTabs.TOOLS_AND_UTILITIES)) {
            putAfter(entries, Items.TNT_MINECART, TwigsItems.BRONZED_SEASHELL.get());
            putAfter(entries, Items.FLINT_AND_STEEL, TwigsItems.TWIG.get());
        }
        if (tab.equals(CreativeModeTabs.NATURAL_BLOCKS)) {
            putAfter(entries, Items.GLOW_LICHEN, TwigsItems.PETRIFIED_LICHEN.get());
            putAfter(entries, Items.MUD, TwigsItems.SILT.get());
            putAfter(entries, Items.ANDESITE, TwigsItems.RHYOLITE.get());
            putAfter(entries, Items.BLACKSTONE, TwigsItems.BLOODSTONE.get());
            putAfter(entries, Items.FARMLAND, TwigsItems.ROCKY_DIRT.get());
            putAfter(entries, Items.BAMBOO, TwigsItems.BAMBOO_LEAVES.get());
            putAfter(entries, Items.FLOWERING_AZALEA, TwigsItems.AZALEA_FLOWERS.get(), TwigsItems.TWIG.get(), TwigsItems.PEBBLE.get(), TwigsItems.BRONZED_SEASHELL.get(), TwigsItems.OPALINE_SEASHELL.get(), TwigsItems.ROSEATE_SEASHELL.get(), TwigsItems.TANGERINE_SEASHELL.get());
        }
        if (tab.equals(CreativeModeTabs.REDSTONE_BLOCKS)) {
            putAfter(entries, Items.BARREL, TwigsItems.SILT_POT.get());
        }
        if (tab.equals(CreativeModeTabs.INGREDIENTS)) {
            putAfter(entries, Items.WHEAT, TwigsItems.BAMBOO_LEAVES.get());
            putAfter(entries, Items.CLAY_BALL, TwigsItems.SILT_BALL.get());
            putAfter(entries, Items.BRICK, TwigsItems.SILT_BRICK.get());
            putAfter(entries, Items.EGG, TwigsItems.PEBBLE.get());
        }
        if (tab.equals(CreativeModeTabs.BUILDING_BLOCKS)) {
            putAfter(entries, Items.OAK_SLAB, TwigsItems.OAK_TABLE.get());
            putAfter(entries, Items.SPRUCE_SLAB, TwigsItems.SPRUCE_TABLE.get());
            putAfter(entries, Items.BIRCH_SLAB, TwigsItems.BIRCH_TABLE.get());
            putAfter(entries, Items.JUNGLE_SLAB, TwigsItems.JUNGLE_TABLE.get());
            putAfter(entries, Items.ACACIA_SLAB, TwigsItems.ACACIA_TABLE.get());
            putAfter(entries, Items.DARK_OAK_SLAB, TwigsItems.DARK_OAK_TABLE.get());
            putAfter(entries, Items.MANGROVE_SLAB, TwigsItems.MANGROVE_TABLE.get());
            putAfter(entries, Items.CHERRY_SLAB, TwigsItems.CHERRY_TABLE.get());
            putAfter(entries, Items.BAMBOO_SLAB, TwigsItems.BAMBOO_TABLE.get());
            putAfter(entries, Items.CRIMSON_SLAB, TwigsItems.CRIMSON_TABLE.get());
            putAfter(entries, Items.WARPED_SLAB, TwigsItems.WARPED_TABLE.get());

            putAfter(entries, Items.REINFORCED_DEEPSLATE, Items.DRIPSTONE_BLOCK, TwigsItems.COMPACTED_DRIPSTONE.get());

            putAfter(entries, Items.QUARTZ_BLOCK, TwigsItems.QUARTZ_COLUMN.get());
            putAfter(entries, Items.STONE, TwigsItems.STONE_COLUMN.get());
            putAfter(entries, Items.DEEPSLATE, TwigsItems.DEEPSLATE_COLUMN.get());
            putAfter(entries, Items.GILDED_BLACKSTONE, TwigsItems.BLACKSTONE_COLUMN.get());

            putAfter(entries, Items.MANGROVE_BUTTON,
                    TwigsItems.BAMBOO_THATCH.get(),
                    TwigsItems.BAMBOO_THATCH_SLAB.get()
            );
            putAfter(entries, Items.BAMBOO_TRAPDOOR, TwigsItems.BAMBOO_MAT.get());
            putAfter(entries, Items.AMETHYST_BLOCK, TwigsItems.POLISHED_AMETHYST.get(), TwigsItems.CUT_AMETHYST.get());

            putAfter(entries, Items.COBBLESTONE_WALL,
                    TwigsItems.COBBLESTONE_BRICKS.get(),
                    TwigsItems.COBBLESTONE_BRICK_STAIRS.get(),
                    TwigsItems.COBBLESTONE_BRICK_SLAB.get(),
                    TwigsItems.COBBLESTONE_BRICK_WALL.get(),
                    TwigsItems.CRACKED_COBBLESTONE_BRICKS.get()
            );

            putAfter(entries, Items.MOSSY_COBBLESTONE_WALL,
                    TwigsItems.MOSSY_COBBLESTONE_BRICKS.get(),
                    TwigsItems.MOSSY_COBBLESTONE_BRICK_STAIRS.get(),
                    TwigsItems.MOSSY_COBBLESTONE_BRICK_SLAB.get(),
                    TwigsItems.MOSSY_COBBLESTONE_BRICK_WALL.get()
            );

            putAfter(entries, Items.BRICKS, TwigsItems.CRACKED_BRICKS.get());
            putAfter(entries, Items.BRICK_WALL,
                    TwigsItems.CHISELED_BRICKS.get(),
                    TwigsItems.MIXED_BRICKS.get(),
                    TwigsItems.MOSSY_BRICKS.get(),
                    TwigsItems.MOSSY_BRICK_STAIRS.get(),
                    TwigsItems.MOSSY_BRICK_SLAB.get(),
                    TwigsItems.MOSSY_BRICK_WALL.get(),
                    TwigsItems.SILT_BRICKS.get(),
                    TwigsItems.CRACKED_SILT_BRICKS.get(),
                    TwigsItems.SILT_BRICK_STAIRS.get(),
                    TwigsItems.SILT_BRICK_SLAB.get(),
                    TwigsItems.SILT_BRICK_WALL.get(),
                    TwigsItems.CHISELED_SILT_BRICKS.get(),
                    TwigsItems.MIXED_SILT_BRICKS.get()
            );

            putAfter(entries, Items.POLISHED_BLACKSTONE_BRICK_WALL,
                    TwigsItems.WEEPING_POLISHED_BLACKSTONE_BRICKS.get(),
                    TwigsItems.WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS.get(),
                    TwigsItems.WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB.get(),
                    TwigsItems.WEEPING_POLISHED_BLACKSTONE_BRICK_WALL.get(),
                    TwigsItems.TWISTING_POLISHED_BLACKSTONE_BRICKS.get(),
                    TwigsItems.TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS.get(),
                    TwigsItems.TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB.get(),
                    TwigsItems.TWISTING_POLISHED_BLACKSTONE_BRICK_WALL.get(),
                    TwigsItems.BLOODSTONE.get(),
                    TwigsItems.BLOODSTONE_STAIRS.get(),
                    TwigsItems.BLOODSTONE_SLAB.get(),
                    TwigsItems.BLOODSTONE_WALL.get(),
                    TwigsItems.POLISHED_BLOODSTONE.get(),
                    TwigsItems.POLISHED_BLOODSTONE_STAIRS.get(),
                    TwigsItems.POLISHED_BLOODSTONE_SLAB.get(),
                    TwigsItems.POLISHED_BLOODSTONE_BRICKS.get(),
                    TwigsItems.CRACKED_POLISHED_BLOODSTONE_BRICKS.get(),
                    TwigsItems.POLISHED_BLOODSTONE_BRICK_STAIRS.get(),
                    TwigsItems.POLISHED_BLOODSTONE_BRICK_SLAB.get(),
                    TwigsItems.POLISHED_BLOODSTONE_BRICK_WALL.get()
            );

            putAfter(entries, Items.POLISHED_BASALT, TwigsItems.POLISHED_BASALT_BRICKS.get());
            putAfter(entries, Items.SMOOTH_BASALT,
                    TwigsItems.SMOOTH_BASALT_BRICKS.get(),
                    TwigsItems.SMOOTH_BASALT_BRICK_STAIRS.get(),
                    TwigsItems.SMOOTH_BASALT_BRICK_SLAB.get(),
                    TwigsItems.SMOOTH_BASALT_BRICK_WALL.get(),
                    TwigsItems.CHISELED_SMOOTH_BASALT_BRICKS.get()
            );

            putAfter(entries, Items.MUD_BRICK_WALL,
                    TwigsItems.GRAVEL_BRICKS.get(),
                    TwigsItems.GRAVEL_BRICK_STAIRS.get(),
                    TwigsItems.GRAVEL_BRICK_SLAB.get(),
                    TwigsItems.GRAVEL_BRICK_WALL.get()
            );

            putAfter(entries, Items.SMOOTH_STONE_SLAB,
                    TwigsItems.SMOOTH_STONE_BRICKS.get(),
                    TwigsItems.SMOOTH_STONE_BRICK_STAIRS.get(),
                    TwigsItems.SMOOTH_STONE_BRICK_SLAB.get(),
                    TwigsItems.SMOOTH_STONE_BRICK_WALL.get()
            );

            putAfter(entries, Items.POLISHED_ANDESITE_SLAB,
                    Items.CALCITE,
                    TwigsItems.CALCITE_STAIRS.get(),
                    TwigsItems.CALCITE_SLAB.get(),
                    TwigsItems.CALCITE_WALL.get(),
                    TwigsItems.POLISHED_CALCITE.get(),
                    TwigsItems.POLISHED_CALCITE_STAIRS.get(),
                    TwigsItems.POLISHED_CALCITE_SLAB.get(),
                    TwigsItems.POLISHED_CALCITE_BRICKS.get(),
                    TwigsItems.CRACKED_POLISHED_CALCITE_BRICKS.get(),
                    TwigsItems.POLISHED_CALCITE_BRICK_STAIRS.get(),
                    TwigsItems.POLISHED_CALCITE_BRICK_SLAB.get(),
                    TwigsItems.POLISHED_CALCITE_BRICK_WALL.get(),
                    Items.TUFF,
                    TwigsItems.TUFF_STAIRS.get(),
                    TwigsItems.TUFF_SLAB.get(),
                    TwigsItems.TUFF_WALL.get(),
                    TwigsItems.POLISHED_TUFF.get(),
                    TwigsItems.POLISHED_TUFF_STAIRS.get(),
                    TwigsItems.POLISHED_TUFF_SLAB.get(),
                    TwigsItems.POLISHED_TUFF_BRICKS.get(),
                    TwigsItems.CRACKED_POLISHED_TUFF_BRICKS.get(),
                    TwigsItems.POLISHED_TUFF_BRICK_STAIRS.get(),
                    TwigsItems.POLISHED_TUFF_BRICK_SLAB.get(),
                    TwigsItems.POLISHED_TUFF_BRICK_WALL.get(),
                    TwigsItems.SCHIST.get(),
                    TwigsItems.SCHIST_STAIRS.get(),
                    TwigsItems.SCHIST_SLAB.get(),
                    TwigsItems.SCHIST_WALL.get(),
                    TwigsItems.POLISHED_SCHIST.get(),
                    TwigsItems.POLISHED_SCHIST_STAIRS.get(),
                    TwigsItems.POLISHED_SCHIST_SLAB.get(),
                    TwigsItems.POLISHED_SCHIST_BRICKS.get(),
                    TwigsItems.CRACKED_POLISHED_SCHIST_BRICKS.get(),
                    TwigsItems.POLISHED_SCHIST_BRICK_STAIRS.get(),
                    TwigsItems.POLISHED_SCHIST_BRICK_SLAB.get(),
                    TwigsItems.POLISHED_SCHIST_BRICK_WALL.get(),
                    TwigsItems.RHYOLITE.get(),
                    TwigsItems.RHYOLITE_STAIRS.get(),
                    TwigsItems.RHYOLITE_SLAB.get(),
                    TwigsItems.RHYOLITE_WALL.get(),
                    TwigsItems.POLISHED_RHYOLITE.get(),
                    TwigsItems.POLISHED_RHYOLITE_STAIRS.get(),
                    TwigsItems.POLISHED_RHYOLITE_SLAB.get(),
                    TwigsItems.POLISHED_RHYOLITE_BRICKS.get(),
                    TwigsItems.CRACKED_POLISHED_RHYOLITE_BRICKS.get(),
                    TwigsItems.POLISHED_RHYOLITE_BRICK_STAIRS.get(),
                    TwigsItems.POLISHED_RHYOLITE_BRICK_SLAB.get(),
                    TwigsItems.POLISHED_RHYOLITE_BRICK_WALL.get()
            );

            putAfter(entries, Items.CUT_COPPER_SLAB,
                    TwigsItems.COPPER_PILLAR.get()
            );
            putAfter(entries, Items.EXPOSED_CUT_COPPER_SLAB,
                    TwigsItems.EXPOSED_COPPER_PILLAR.get()
            );
            putAfter(entries, Items.WEATHERED_CUT_COPPER_SLAB,
                    TwigsItems.WEATHERED_COPPER_PILLAR.get()
            );
            putAfter(entries, Items.OXIDIZED_CUT_COPPER_SLAB,
                    TwigsItems.OXIDIZED_COPPER_PILLAR.get()
            );
            putAfter(entries, Items.WAXED_CUT_COPPER_SLAB,
                    TwigsItems.WAXED_COPPER_PILLAR.get()
            );
            putAfter(entries, Items.WAXED_EXPOSED_CUT_COPPER_SLAB,
                    TwigsItems.WAXED_EXPOSED_COPPER_PILLAR.get()
            );
            putAfter(entries, Items.WAXED_WEATHERED_CUT_COPPER_SLAB,
                    TwigsItems.WAXED_WEATHERED_COPPER_PILLAR.get()
            );
            putAfter(entries, Items.WAXED_OXIDIZED_CUT_COPPER_SLAB,
                    TwigsItems.WAXED_OXIDIZED_COPPER_PILLAR.get()
            );
        }
        ;

        if (tab.equals(CreativeModeTabs.COLORED_BLOCKS)) {
            putAfter(entries, Items.PINK_TERRACOTTA,
                    TwigsItems.PACKED_SILT.get(),
                    TwigsItems.WHITE_PACKED_SILT.get(),
                    TwigsItems.LIGHT_GRAY_PACKED_SILT.get(),
                    TwigsItems.GRAY_PACKED_SILT.get(),
                    TwigsItems.BLACK_PACKED_SILT.get(),
                    TwigsItems.BROWN_PACKED_SILT.get(),
                    TwigsItems.RED_PACKED_SILT.get(),
                    TwigsItems.ORANGE_PACKED_SILT.get(),
                    TwigsItems.YELLOW_PACKED_SILT.get(),
                    TwigsItems.LIME_PACKED_SILT.get(),
                    TwigsItems.GREEN_PACKED_SILT.get(),
                    TwigsItems.CYAN_PACKED_SILT.get(),
                    TwigsItems.LIGHT_BLUE_PACKED_SILT.get(),
                    TwigsItems.BLUE_PACKED_SILT.get(),
                    TwigsItems.PURPLE_PACKED_SILT.get(),
                    TwigsItems.MAGENTA_PACKED_SILT.get(),
                    TwigsItems.PINK_PACKED_SILT.get(),

                    TwigsItems.SILT_POT.get(),
                    TwigsItems.WHITE_SILT_POT.get(),
                    TwigsItems.LIGHT_GRAY_SILT_POT.get(),
                    TwigsItems.GRAY_SILT_POT.get(),
                    TwigsItems.BLACK_SILT_POT.get(),
                    TwigsItems.BROWN_SILT_POT.get(),
                    TwigsItems.RED_SILT_POT.get(),
                    TwigsItems.ORANGE_SILT_POT.get(),
                    TwigsItems.YELLOW_SILT_POT.get(),
                    TwigsItems.LIME_SILT_POT.get(),
                    TwigsItems.GREEN_SILT_POT.get(),
                    TwigsItems.CYAN_SILT_POT.get(),
                    TwigsItems.LIGHT_BLUE_SILT_POT.get(),
                    TwigsItems.BLUE_SILT_POT.get(),
                    TwigsItems.PURPLE_SILT_POT.get(),
                    TwigsItems.MAGENTA_SILT_POT.get(),
                    TwigsItems.PINK_SILT_POT.get(),

                    TwigsItems.SILT_SHINGLES.get(),
                    TwigsItems.WHITE_SILT_SHINGLES.get(),
                    TwigsItems.LIGHT_GRAY_SILT_SHINGLES.get(),
                    TwigsItems.GRAY_SILT_SHINGLES.get(),
                    TwigsItems.BLACK_SILT_SHINGLES.get(),
                    TwigsItems.BROWN_SILT_SHINGLES.get(),
                    TwigsItems.RED_SILT_SHINGLES.get(),
                    TwigsItems.ORANGE_SILT_SHINGLES.get(),
                    TwigsItems.YELLOW_SILT_SHINGLES.get(),
                    TwigsItems.LIME_SILT_SHINGLES.get(),
                    TwigsItems.GREEN_SILT_SHINGLES.get(),
                    TwigsItems.CYAN_SILT_SHINGLES.get(),
                    TwigsItems.LIGHT_BLUE_SILT_SHINGLES.get(),
                    TwigsItems.BLUE_SILT_SHINGLES.get(),
                    TwigsItems.PURPLE_SILT_SHINGLES.get(),
                    TwigsItems.MAGENTA_SILT_SHINGLES.get(),
                    TwigsItems.PINK_SILT_SHINGLES.get(),

                    TwigsItems.SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.WHITE_SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.LIGHT_GRAY_SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.GRAY_SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.BLACK_SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.BROWN_SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.RED_SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.ORANGE_SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.YELLOW_SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.LIME_SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.GREEN_SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.CYAN_SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.LIGHT_BLUE_SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.BLUE_SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.PURPLE_SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.MAGENTA_SILT_SHINGLE_STAIRS.get(),
                    TwigsItems.PINK_SILT_SHINGLE_STAIRS.get(),

                    TwigsItems.SILT_SHINGLE_SLAB.get(),
                    TwigsItems.WHITE_SILT_SHINGLE_SLAB.get(),
                    TwigsItems.LIGHT_GRAY_SILT_SHINGLE_SLAB.get(),
                    TwigsItems.GRAY_SILT_SHINGLE_SLAB.get(),
                    TwigsItems.BLACK_SILT_SHINGLE_SLAB.get(),
                    TwigsItems.BROWN_SILT_SHINGLE_SLAB.get(),
                    TwigsItems.RED_SILT_SHINGLE_SLAB.get(),
                    TwigsItems.ORANGE_SILT_SHINGLE_SLAB.get(),
                    TwigsItems.YELLOW_SILT_SHINGLE_SLAB.get(),
                    TwigsItems.LIME_SILT_SHINGLE_SLAB.get(),
                    TwigsItems.GREEN_SILT_SHINGLE_SLAB.get(),
                    TwigsItems.CYAN_SILT_SHINGLE_SLAB.get(),
                    TwigsItems.LIGHT_BLUE_SILT_SHINGLE_SLAB.get(),
                    TwigsItems.BLUE_SILT_SHINGLE_SLAB.get(),
                    TwigsItems.PURPLE_SILT_SHINGLE_SLAB.get(),
                    TwigsItems.MAGENTA_SILT_SHINGLE_SLAB.get(),
                    TwigsItems.PINK_SILT_SHINGLE_SLAB.get(),

                    TwigsItems.SILT_SHINGLE_WALL.get(),
                    TwigsItems.WHITE_SILT_SHINGLE_WALL.get(),
                    TwigsItems.LIGHT_GRAY_SILT_SHINGLE_WALL.get(),
                    TwigsItems.GRAY_SILT_SHINGLE_WALL.get(),
                    TwigsItems.BLACK_SILT_SHINGLE_WALL.get(),
                    TwigsItems.BROWN_SILT_SHINGLE_WALL.get(),
                    TwigsItems.RED_SILT_SHINGLE_WALL.get(),
                    TwigsItems.ORANGE_SILT_SHINGLE_WALL.get(),
                    TwigsItems.YELLOW_SILT_SHINGLE_WALL.get(),
                    TwigsItems.LIME_SILT_SHINGLE_WALL.get(),
                    TwigsItems.GREEN_SILT_SHINGLE_WALL.get(),
                    TwigsItems.CYAN_SILT_SHINGLE_WALL.get(),
                    TwigsItems.LIGHT_BLUE_SILT_SHINGLE_WALL.get(),
                    TwigsItems.BLUE_SILT_SHINGLE_WALL.get(),
                    TwigsItems.PURPLE_SILT_SHINGLE_WALL.get(),
                    TwigsItems.MAGENTA_SILT_SHINGLE_WALL.get(),
                    TwigsItems.PINK_SILT_SHINGLE_WALL.get());
        }
    }

    private static void putAfter(MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> entries, Item selectedItem, Item... registryObjects) {
        List<Item> list = new ArrayList<>(List.copyOf(List.of(registryObjects)));
        Collections.reverse(list);
        list.forEach(item -> putAfter(entries, selectedItem, item));
    }

    private static void putAfter(MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> entries, Item selectedItem, Item item) {
        entries.putAfter(selectedItem.getDefaultInstance(), item.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    @SubscribeEvent
    public void onTagsUpdated(TagsUpdatedEvent event) {
        DispenserBlock.registerProjectileBehavior(TwigsItems.PEBBLE.get());
    }

    @SubscribeEvent
    public void onLootTableLoad(LootTableLoadEvent event) {
        ResourceLocation id = event.getName();
        Supplier<Set<ResourceLocation>> leafTablesSupplier = Suppliers.memoize(() -> {
            return BuiltInRegistries.BLOCK.stream()
                    .filter(LeavesBlock.class::isInstance)
                    .map(Block::getLootTable)
                    .map(ResourceKey::location)
                    .collect(Collectors.toSet());
        });
        if (id.equals(Blocks.BAMBOO.getLootTable().location())) {
            event.getTable().addPool(
                    LootPool.lootPool()
                            .add(
                                    LootItem.lootTableItem(TwigsBlocks.BAMBOO_LEAVES.get())
                                            .when(
                                                    InvertedLootItemCondition.invert(
                                                            LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.BAMBOO)
                                                                    .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BambooStalkBlock.LEAVES, BambooLeaves.NONE))
                                                    )
                                            )
                            ).build()
            );
        }
        if (id.equals(Blocks.GRAVEL.getLootTable().location())) {
            event.getTable().addPool(
                    LootPool.lootPool()
                            .add(
                                    // Since enchantments now are dynamically registered
                                    // and we don't have registry access to them, we have to use a table reference
                                    // Unless I(Ender) am very silly this is the only way to do it
                                    NestedLootTable.lootTableReference(TwigsLootTables.PEBBLE_INJECTION)
                            )
                            .build()
            );
        }
    }

}
