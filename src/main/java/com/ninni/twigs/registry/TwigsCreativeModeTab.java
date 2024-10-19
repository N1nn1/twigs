package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import static com.ninni.twigs.Twigs.MOD_ID;
import static com.ninni.twigs.registry.TwigsBlocks.BRICK_TRAIL;
import static com.ninni.twigs.registry.TwigsBlocks.CHERRY_TABLE;
import static com.ninni.twigs.registry.TwigsBlocks.SILT_BRICK_TRAIL;
import static com.ninni.twigs.registry.TwigsBlocks.TORCHFLOWER_PAPER_LANTERN;
import static com.ninni.twigs.registry.TwigsItems.ACACIA_TABLE;
import static com.ninni.twigs.registry.TwigsItems.ALLIUM_PAPER_LANTERN;
import static com.ninni.twigs.registry.TwigsItems.AZALEA_FLOWERS;
import static com.ninni.twigs.registry.TwigsItems.BAMBOO_LEAVES;
import static com.ninni.twigs.registry.TwigsItems.BAMBOO_MAT;
import static com.ninni.twigs.registry.TwigsItems.BAMBOO_TABLE;
import static com.ninni.twigs.registry.TwigsItems.BAMBOO_THATCH;
import static com.ninni.twigs.registry.TwigsItems.BAMBOO_THATCH_SLAB;
import static com.ninni.twigs.registry.TwigsItems.BIRCH_TABLE;
import static com.ninni.twigs.registry.TwigsItems.BLACKSTONE_COLUMN;
import static com.ninni.twigs.registry.TwigsItems.BLACK_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.BLACK_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.BLACK_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.BLACK_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.BLACK_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.BLACK_SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.BLOODSTONE;
import static com.ninni.twigs.registry.TwigsItems.BLOODSTONE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.BLOODSTONE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.BLOODSTONE_WALL;
import static com.ninni.twigs.registry.TwigsItems.BLUE_ORCHID_PAPER_LANTERN;
import static com.ninni.twigs.registry.TwigsItems.BLUE_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.BLUE_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.BLUE_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.BLUE_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.BLUE_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.BLUE_SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.BRONZED_SEASHELL;
import static com.ninni.twigs.registry.TwigsItems.BROWN_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.BROWN_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.BROWN_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.BROWN_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.BROWN_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.BROWN_SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.CALCITE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.CALCITE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.CALCITE_WALL;
import static com.ninni.twigs.registry.TwigsItems.CHISELED_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.CHISELED_SILT_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.CHISELED_SMOOTH_BASALT_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.COBBLESTONE_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.COBBLESTONE_BRICK_SLAB;
import static com.ninni.twigs.registry.TwigsItems.COBBLESTONE_BRICK_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.COBBLESTONE_BRICK_WALL;
import static com.ninni.twigs.registry.TwigsItems.COMPACTED_DRIPSTONE;
import static com.ninni.twigs.registry.TwigsItems.COPPER_PILLAR;
import static com.ninni.twigs.registry.TwigsItems.CRACKED_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.CRACKED_COBBLESTONE_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.CRACKED_POLISHED_BLOODSTONE_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.CRACKED_POLISHED_CALCITE_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.CRACKED_POLISHED_RHYOLITE_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.CRACKED_POLISHED_SCHIST_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.CRACKED_POLISHED_TUFF_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.CRACKED_SILT_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.CRIMSON_ROOTS_PAPER_LANTERN;
import static com.ninni.twigs.registry.TwigsItems.CRIMSON_SHROOMLAMP;
import static com.ninni.twigs.registry.TwigsItems.CRIMSON_TABLE;
import static com.ninni.twigs.registry.TwigsItems.CUT_AMETHYST;
import static com.ninni.twigs.registry.TwigsItems.CYAN_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.CYAN_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.CYAN_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.CYAN_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.CYAN_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.CYAN_SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.DANDELION_PAPER_LANTERN;
import static com.ninni.twigs.registry.TwigsItems.DARK_OAK_TABLE;
import static com.ninni.twigs.registry.TwigsItems.DEEPSLATE_COLUMN;
import static com.ninni.twigs.registry.TwigsItems.EXPOSED_COPPER_PILLAR;
import static com.ninni.twigs.registry.TwigsItems.GRAVEL_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.GRAVEL_BRICK_SLAB;
import static com.ninni.twigs.registry.TwigsItems.GRAVEL_BRICK_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.GRAVEL_BRICK_WALL;
import static com.ninni.twigs.registry.TwigsItems.GRAY_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.GRAY_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.GRAY_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.GRAY_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.GRAY_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.GRAY_SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.GREEN_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.GREEN_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.GREEN_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.GREEN_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.GREEN_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.GREEN_SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.JUNGLE_TABLE;
import static com.ninni.twigs.registry.TwigsItems.LAMP;
import static com.ninni.twigs.registry.TwigsItems.LIGHT_BLUE_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.LIGHT_BLUE_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.LIGHT_BLUE_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.LIGHT_BLUE_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.LIGHT_BLUE_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.LIGHT_BLUE_SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.LIGHT_GRAY_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.LIGHT_GRAY_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.LIGHT_GRAY_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.LIGHT_GRAY_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.LIGHT_GRAY_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.LIGHT_GRAY_SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.LIME_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.LIME_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.LIME_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.LIME_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.LIME_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.LIME_SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.MAGENTA_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.MAGENTA_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.MAGENTA_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.MAGENTA_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.MAGENTA_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.MAGENTA_SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.MANGROVE_TABLE;
import static com.ninni.twigs.registry.TwigsItems.MIXED_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.MIXED_SILT_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.MOSSY_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.MOSSY_BRICK_SLAB;
import static com.ninni.twigs.registry.TwigsItems.MOSSY_BRICK_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.MOSSY_BRICK_WALL;
import static com.ninni.twigs.registry.TwigsItems.MOSSY_COBBLESTONE_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.MOSSY_COBBLESTONE_BRICK_SLAB;
import static com.ninni.twigs.registry.TwigsItems.MOSSY_COBBLESTONE_BRICK_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.MOSSY_COBBLESTONE_BRICK_WALL;
import static com.ninni.twigs.registry.TwigsItems.OAK_TABLE;
import static com.ninni.twigs.registry.TwigsItems.OPALINE_SEASHELL;
import static com.ninni.twigs.registry.TwigsItems.ORANGE_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.ORANGE_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.ORANGE_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.ORANGE_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.ORANGE_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.ORANGE_SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.OXIDIZED_COPPER_PILLAR;
import static com.ninni.twigs.registry.TwigsItems.PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.PAPER_LANTERN;
import static com.ninni.twigs.registry.TwigsItems.PEBBLE;
import static com.ninni.twigs.registry.TwigsItems.PETRIFIED_LICHEN;
import static com.ninni.twigs.registry.TwigsItems.PINK_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.PINK_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.PINK_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.PINK_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.PINK_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.PINK_SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_AMETHYST;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_BASALT_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_BLOODSTONE;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_BLOODSTONE_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_BLOODSTONE_BRICK_SLAB;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_BLOODSTONE_BRICK_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_BLOODSTONE_BRICK_WALL;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_BLOODSTONE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_BLOODSTONE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_CALCITE;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_CALCITE_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_CALCITE_BRICK_SLAB;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_CALCITE_BRICK_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_CALCITE_BRICK_WALL;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_CALCITE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_CALCITE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_RHYOLITE;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_RHYOLITE_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_RHYOLITE_BRICK_SLAB;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_RHYOLITE_BRICK_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_RHYOLITE_BRICK_WALL;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_RHYOLITE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_RHYOLITE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_SCHIST;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_SCHIST_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_SCHIST_BRICK_SLAB;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_SCHIST_BRICK_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_SCHIST_BRICK_WALL;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_SCHIST_SLAB;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_SCHIST_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_TUFF;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_TUFF_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_TUFF_BRICK_SLAB;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_TUFF_BRICK_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_TUFF_BRICK_WALL;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_TUFF_SLAB;
import static com.ninni.twigs.registry.TwigsItems.POLISHED_TUFF_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.PURPLE_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.PURPLE_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.PURPLE_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.PURPLE_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.PURPLE_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.PURPLE_SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.QUARTZ_COLUMN;
import static com.ninni.twigs.registry.TwigsItems.RED_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.RED_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.RED_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.RED_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.RED_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.RED_SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.RHYOLITE;
import static com.ninni.twigs.registry.TwigsItems.RHYOLITE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.RHYOLITE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.RHYOLITE_WALL;
import static com.ninni.twigs.registry.TwigsItems.ROCKY_DIRT;
import static com.ninni.twigs.registry.TwigsItems.ROSEATE_SEASHELL;
import static com.ninni.twigs.registry.TwigsItems.SCHIST;
import static com.ninni.twigs.registry.TwigsItems.SCHIST_SLAB;
import static com.ninni.twigs.registry.TwigsItems.SCHIST_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.SCHIST_WALL;
import static com.ninni.twigs.registry.TwigsItems.SILT;
import static com.ninni.twigs.registry.TwigsItems.SILT_BALL;
import static com.ninni.twigs.registry.TwigsItems.SILT_BRICK;
import static com.ninni.twigs.registry.TwigsItems.SILT_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.SILT_BRICK_SLAB;
import static com.ninni.twigs.registry.TwigsItems.SILT_BRICK_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.SILT_BRICK_WALL;
import static com.ninni.twigs.registry.TwigsItems.SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.SMOOTH_BASALT_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.SMOOTH_BASALT_BRICK_SLAB;
import static com.ninni.twigs.registry.TwigsItems.SMOOTH_BASALT_BRICK_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.SMOOTH_BASALT_BRICK_WALL;
import static com.ninni.twigs.registry.TwigsItems.SMOOTH_STONE_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.SMOOTH_STONE_BRICK_SLAB;
import static com.ninni.twigs.registry.TwigsItems.SMOOTH_STONE_BRICK_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.SMOOTH_STONE_BRICK_WALL;
import static com.ninni.twigs.registry.TwigsItems.SOUL_LAMP;
import static com.ninni.twigs.registry.TwigsItems.SPRUCE_TABLE;
import static com.ninni.twigs.registry.TwigsItems.STONE_COLUMN;
import static com.ninni.twigs.registry.TwigsItems.TANGERINE_SEASHELL;
import static com.ninni.twigs.registry.TwigsItems.TUFF_SLAB;
import static com.ninni.twigs.registry.TwigsItems.TUFF_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.TUFF_WALL;
import static com.ninni.twigs.registry.TwigsItems.TWIG;
import static com.ninni.twigs.registry.TwigsItems.TWIGS;
import static com.ninni.twigs.registry.TwigsItems.TWISTING_POLISHED_BLACKSTONE_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB;
import static com.ninni.twigs.registry.TwigsItems.TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.TWISTING_POLISHED_BLACKSTONE_BRICK_WALL;
import static com.ninni.twigs.registry.TwigsItems.WARPED_SHROOMLAMP;
import static com.ninni.twigs.registry.TwigsItems.WARPED_TABLE;
import static com.ninni.twigs.registry.TwigsItems.WAXED_COPPER_PILLAR;
import static com.ninni.twigs.registry.TwigsItems.WAXED_EXPOSED_COPPER_PILLAR;
import static com.ninni.twigs.registry.TwigsItems.WAXED_OXIDIZED_COPPER_PILLAR;
import static com.ninni.twigs.registry.TwigsItems.WAXED_WEATHERED_COPPER_PILLAR;
import static com.ninni.twigs.registry.TwigsItems.WEATHERED_COPPER_PILLAR;
import static com.ninni.twigs.registry.TwigsItems.WEEPING_POLISHED_BLACKSTONE_BRICKS;
import static com.ninni.twigs.registry.TwigsItems.WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB;
import static com.ninni.twigs.registry.TwigsItems.WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.WEEPING_POLISHED_BLACKSTONE_BRICK_WALL;
import static com.ninni.twigs.registry.TwigsItems.WHITE_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.WHITE_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.WHITE_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.WHITE_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.WHITE_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.WHITE_SILT_SHINGLE_WALL;
import static com.ninni.twigs.registry.TwigsItems.YELLOW_PACKED_SILT;
import static com.ninni.twigs.registry.TwigsItems.YELLOW_SILT_POT;
import static com.ninni.twigs.registry.TwigsItems.YELLOW_SILT_SHINGLES;
import static com.ninni.twigs.registry.TwigsItems.YELLOW_SILT_SHINGLE_SLAB;
import static com.ninni.twigs.registry.TwigsItems.YELLOW_SILT_SHINGLE_STAIRS;
import static com.ninni.twigs.registry.TwigsItems.YELLOW_SILT_SHINGLE_WALL;

public class TwigsCreativeModeTab {

    static {

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> {

            entries.addAfter(Items.REDSTONE_TORCH,
                    PAPER_LANTERN,
                    ALLIUM_PAPER_LANTERN,
                    BLUE_ORCHID_PAPER_LANTERN,
                    CRIMSON_ROOTS_PAPER_LANTERN,
                    DANDELION_PAPER_LANTERN,
                    TORCHFLOWER_PAPER_LANTERN,
                    LAMP,
                    SOUL_LAMP
            );
            entries.addAfter(Items.GLOW_LICHEN, PETRIFIED_LICHEN);
            entries.addAfter(Items.SHROOMLIGHT, CRIMSON_SHROOMLAMP, WARPED_SHROOMLAMP);
            entries.addAfter(Items.FLOWER_POT,
                    SILT_POT,
                    WHITE_SILT_POT,
                    LIGHT_GRAY_SILT_POT,
                    GRAY_SILT_POT,
                    BLACK_SILT_POT,
                    BROWN_SILT_POT,
                    RED_SILT_POT,
                    ORANGE_SILT_POT,
                    YELLOW_SILT_POT,
                    LIME_SILT_POT,
                    GREEN_SILT_POT,
                    CYAN_SILT_POT,
                    LIGHT_BLUE_SILT_POT,
                    BLUE_SILT_POT,
                    PURPLE_SILT_POT,
                    MAGENTA_SILT_POT,
                    PINK_SILT_POT
            );
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> {
            entries.addAfter(Items.TNT_MINECART, BRONZED_SEASHELL);
            entries.addAfter(Items.FLINT_AND_STEEL, TWIG);
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(entries -> {

            entries.addAfter(Items.GLOW_LICHEN, PETRIFIED_LICHEN);
            entries.addAfter(Items.MUD, SILT);
            entries.addAfter(Items.ANDESITE, SCHIST, RHYOLITE);
            entries.addAfter(Items.BLACKSTONE, BLOODSTONE);

            entries.addAfter(Items.FARMLAND, ROCKY_DIRT);

            entries.addAfter(Items.BAMBOO, BAMBOO_LEAVES);

            entries.addAfter(Items.FLOWERING_AZALEA,
                    AZALEA_FLOWERS,
                    TWIG,
                    PEBBLE,
                    BRONZED_SEASHELL,
                    OPALINE_SEASHELL,
                    ROSEATE_SEASHELL,
                    TANGERINE_SEASHELL
            );
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.REDSTONE_BLOCKS).register(entries -> entries.addAfter(Items.BARREL, SILT_POT));

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> {

            entries.addAfter(Items.WHEAT, BAMBOO_LEAVES);
            entries.addAfter(Items.CLAY_BALL, SILT_BALL);
            entries.addAfter(Items.BRICK, SILT_BRICK);
            entries.addAfter(Items.EGG, PEBBLE);
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {

            entries.addAfter(Items.OAK_SLAB, OAK_TABLE);
            entries.addAfter(Items.SPRUCE_SLAB, SPRUCE_TABLE);
            entries.addAfter(Items.BIRCH_SLAB, BIRCH_TABLE);
            entries.addAfter(Items.JUNGLE_SLAB, JUNGLE_TABLE);
            entries.addAfter(Items.ACACIA_SLAB, ACACIA_TABLE);
            entries.addAfter(Items.CHERRY_SLAB, CHERRY_TABLE);
            entries.addAfter(Items.DARK_OAK_SLAB, DARK_OAK_TABLE);
            entries.addAfter(Items.MANGROVE_SLAB, MANGROVE_TABLE);
            entries.addAfter(Items.BAMBOO_SLAB, BAMBOO_TABLE);
            entries.addAfter(Items.CRIMSON_SLAB, CRIMSON_TABLE);
            entries.addAfter(Items.WARPED_SLAB, WARPED_TABLE);

            entries.addAfter(Items.REINFORCED_DEEPSLATE, Blocks.DRIPSTONE_BLOCK, COMPACTED_DRIPSTONE);

            entries.addAfter(Items.QUARTZ_BLOCK, QUARTZ_COLUMN);
            entries.addAfter(Items.STONE, STONE_COLUMN);
            entries.addAfter(Items.DEEPSLATE, DEEPSLATE_COLUMN);
            entries.addAfter(Items.GILDED_BLACKSTONE, BLACKSTONE_COLUMN);
            entries.addAfter(Items.MANGROVE_BUTTON,
                    BAMBOO_THATCH,
                    BAMBOO_THATCH_SLAB
            );
            entries.addAfter(Items.BAMBOO_TRAPDOOR, BAMBOO_MAT);

            entries.addAfter(Items.AMETHYST_BLOCK, POLISHED_AMETHYST, CUT_AMETHYST);

            entries.addAfter(Items.COBBLESTONE_WALL,
                    COBBLESTONE_BRICKS,
                    COBBLESTONE_BRICK_STAIRS,
                    COBBLESTONE_BRICK_SLAB,
                    COBBLESTONE_BRICK_WALL,
                    CRACKED_COBBLESTONE_BRICKS
            );

            entries.addAfter(Items.MOSSY_COBBLESTONE_WALL,
                    MOSSY_COBBLESTONE_BRICKS,
                    MOSSY_COBBLESTONE_BRICK_STAIRS,
                    MOSSY_COBBLESTONE_BRICK_SLAB,
                    MOSSY_COBBLESTONE_BRICK_WALL
            );

            entries.addAfter(Items.BRICKS, CRACKED_BRICKS);
            entries.addAfter(Items.BRICK_WALL,
                    CHISELED_BRICKS,
                    MIXED_BRICKS,
                    MOSSY_BRICKS,
                    MOSSY_BRICK_STAIRS,
                    MOSSY_BRICK_SLAB,
                    MOSSY_BRICK_WALL,
                    BRICK_TRAIL,
                    SILT_BRICKS,
                    CRACKED_SILT_BRICKS,
                    SILT_BRICK_STAIRS,
                    SILT_BRICK_SLAB,
                    SILT_BRICK_WALL,
                    CHISELED_SILT_BRICKS,
                    MIXED_SILT_BRICKS,
                    SILT_BRICK_TRAIL
            );

            entries.addAfter(Items.POLISHED_BLACKSTONE_BRICK_WALL,
                    WEEPING_POLISHED_BLACKSTONE_BRICKS,
                    WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS,
                    WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB,
                    WEEPING_POLISHED_BLACKSTONE_BRICK_WALL,
                    TWISTING_POLISHED_BLACKSTONE_BRICKS,
                    TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS,
                    TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB,
                    TWISTING_POLISHED_BLACKSTONE_BRICK_WALL,
                    BLOODSTONE,
                    BLOODSTONE_STAIRS,
                    BLOODSTONE_SLAB,
                    BLOODSTONE_WALL,
                    POLISHED_BLOODSTONE,
                    POLISHED_BLOODSTONE_STAIRS,
                    POLISHED_BLOODSTONE_SLAB,
                    POLISHED_BLOODSTONE_BRICKS,
                    CRACKED_POLISHED_BLOODSTONE_BRICKS,
                    POLISHED_BLOODSTONE_BRICK_STAIRS,
                    POLISHED_BLOODSTONE_BRICK_SLAB,
                    POLISHED_BLOODSTONE_BRICK_WALL
            );

            entries.addAfter(Items.POLISHED_BASALT, POLISHED_BASALT_BRICKS);
            entries.addAfter(Items.SMOOTH_BASALT,
                    SMOOTH_BASALT_BRICKS,
                    SMOOTH_BASALT_BRICK_STAIRS,
                    SMOOTH_BASALT_BRICK_SLAB,
                    SMOOTH_BASALT_BRICK_WALL,
                    CHISELED_SMOOTH_BASALT_BRICKS
            );

            entries.addAfter(Items.MUD_BRICK_WALL,
                    GRAVEL_BRICKS,
                    GRAVEL_BRICK_STAIRS,
                    GRAVEL_BRICK_SLAB,
                    GRAVEL_BRICK_WALL
            );

            entries.addAfter(Items.SMOOTH_STONE_SLAB,
                    SMOOTH_STONE_BRICKS,
                    SMOOTH_STONE_BRICK_STAIRS,
                    SMOOTH_STONE_BRICK_SLAB,
                    SMOOTH_STONE_BRICK_WALL
            );

            entries.addAfter(Items.POLISHED_ANDESITE_SLAB,
                    Blocks.CALCITE,
                    CALCITE_STAIRS,
                    CALCITE_SLAB,
                    CALCITE_WALL,
                    POLISHED_CALCITE,
                    POLISHED_CALCITE_STAIRS,
                    POLISHED_CALCITE_SLAB,
                    POLISHED_CALCITE_BRICKS,
                    CRACKED_POLISHED_CALCITE_BRICKS,
                    POLISHED_CALCITE_BRICK_STAIRS,
                    POLISHED_CALCITE_BRICK_SLAB,
                    POLISHED_CALCITE_BRICK_WALL,
                    Blocks.TUFF,
                    TUFF_STAIRS,
                    TUFF_SLAB,
                    TUFF_WALL,
                    POLISHED_TUFF,
                    POLISHED_TUFF_STAIRS,
                    POLISHED_TUFF_SLAB,
                    POLISHED_TUFF_BRICKS,
                    CRACKED_POLISHED_TUFF_BRICKS,
                    POLISHED_TUFF_BRICK_STAIRS,
                    POLISHED_TUFF_BRICK_SLAB,
                    POLISHED_TUFF_BRICK_WALL,
                    SCHIST,
                    SCHIST_STAIRS,
                    SCHIST_SLAB,
                    SCHIST_WALL,
                    POLISHED_SCHIST,
                    POLISHED_SCHIST_STAIRS,
                    POLISHED_SCHIST_SLAB,
                    POLISHED_SCHIST_BRICKS,
                    CRACKED_POLISHED_SCHIST_BRICKS,
                    POLISHED_SCHIST_BRICK_STAIRS,
                    POLISHED_SCHIST_BRICK_SLAB,
                    POLISHED_SCHIST_BRICK_WALL,
                    RHYOLITE,
                    RHYOLITE_STAIRS,
                    RHYOLITE_SLAB,
                    RHYOLITE_WALL,
                    POLISHED_RHYOLITE,
                    POLISHED_RHYOLITE_STAIRS,
                    POLISHED_RHYOLITE_SLAB,
                    POLISHED_RHYOLITE_BRICKS,
                    CRACKED_POLISHED_RHYOLITE_BRICKS,
                    POLISHED_RHYOLITE_BRICK_STAIRS,
                    POLISHED_RHYOLITE_BRICK_SLAB,
                    POLISHED_RHYOLITE_BRICK_WALL
            );

            entries.addAfter(Items.CUT_COPPER_SLAB,
                    COPPER_PILLAR
                    );
            entries.addAfter(Items.EXPOSED_CUT_COPPER_SLAB,
                    EXPOSED_COPPER_PILLAR
            );
            entries.addAfter(Items.WEATHERED_CUT_COPPER_SLAB,
                    WEATHERED_COPPER_PILLAR
            );
            entries.addAfter(Items.OXIDIZED_CUT_COPPER_SLAB,
                    OXIDIZED_COPPER_PILLAR
            );
            entries.addAfter(Items.WAXED_CUT_COPPER_SLAB,
                    WAXED_COPPER_PILLAR
            );
            entries.addAfter(Items.WAXED_EXPOSED_CUT_COPPER_SLAB,
                    WAXED_EXPOSED_COPPER_PILLAR
            );
            entries.addAfter(Items.WAXED_WEATHERED_CUT_COPPER_SLAB,
                    WAXED_WEATHERED_COPPER_PILLAR
            );
            entries.addAfter(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB,
                    WAXED_OXIDIZED_COPPER_PILLAR
            );
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(entries -> entries.addAfter(Items.PINK_TERRACOTTA,
                PACKED_SILT,
                WHITE_PACKED_SILT,
                LIGHT_GRAY_PACKED_SILT,
                GRAY_PACKED_SILT,
                BLACK_PACKED_SILT,
                BROWN_PACKED_SILT,
                RED_PACKED_SILT,
                ORANGE_PACKED_SILT,
                YELLOW_PACKED_SILT,
                LIME_PACKED_SILT,
                GREEN_PACKED_SILT,
                CYAN_PACKED_SILT,
                LIGHT_BLUE_PACKED_SILT,
                BLUE_PACKED_SILT,
                PURPLE_PACKED_SILT,
                MAGENTA_PACKED_SILT,
                PINK_PACKED_SILT,

                SILT_POT,
                WHITE_SILT_POT,
                LIGHT_GRAY_SILT_POT,
                GRAY_SILT_POT,
                BLACK_SILT_POT,
                BROWN_SILT_POT,
                RED_SILT_POT,
                ORANGE_SILT_POT,
                YELLOW_SILT_POT,
                LIME_SILT_POT,
                GREEN_SILT_POT,
                CYAN_SILT_POT,
                LIGHT_BLUE_SILT_POT,
                BLUE_SILT_POT,
                PURPLE_SILT_POT,
                MAGENTA_SILT_POT,
                PINK_SILT_POT,

                SILT_SHINGLES,
                WHITE_SILT_SHINGLES,
                LIGHT_GRAY_SILT_SHINGLES,
                GRAY_SILT_SHINGLES,
                BLACK_SILT_SHINGLES,
                BROWN_SILT_SHINGLES,
                RED_SILT_SHINGLES,
                ORANGE_SILT_SHINGLES,
                YELLOW_SILT_SHINGLES,
                LIME_SILT_SHINGLES,
                GREEN_SILT_SHINGLES,
                CYAN_SILT_SHINGLES,
                LIGHT_BLUE_SILT_SHINGLES,
                BLUE_SILT_SHINGLES,
                PURPLE_SILT_SHINGLES,
                MAGENTA_SILT_SHINGLES,
                PINK_SILT_SHINGLES,

                SILT_SHINGLE_STAIRS,
                WHITE_SILT_SHINGLE_STAIRS,
                LIGHT_GRAY_SILT_SHINGLE_STAIRS,
                GRAY_SILT_SHINGLE_STAIRS,
                BLACK_SILT_SHINGLE_STAIRS,
                BROWN_SILT_SHINGLE_STAIRS,
                RED_SILT_SHINGLE_STAIRS,
                ORANGE_SILT_SHINGLE_STAIRS,
                YELLOW_SILT_SHINGLE_STAIRS,
                LIME_SILT_SHINGLE_STAIRS,
                GREEN_SILT_SHINGLE_STAIRS,
                CYAN_SILT_SHINGLE_STAIRS,
                LIGHT_BLUE_SILT_SHINGLE_STAIRS,
                BLUE_SILT_SHINGLE_STAIRS,
                PURPLE_SILT_SHINGLE_STAIRS,
                MAGENTA_SILT_SHINGLE_STAIRS,
                PINK_SILT_SHINGLE_STAIRS,

                SILT_SHINGLE_SLAB,
                WHITE_SILT_SHINGLE_SLAB,
                LIGHT_GRAY_SILT_SHINGLE_SLAB,
                GRAY_SILT_SHINGLE_SLAB,
                BLACK_SILT_SHINGLE_SLAB,
                BROWN_SILT_SHINGLE_SLAB,
                RED_SILT_SHINGLE_SLAB,
                ORANGE_SILT_SHINGLE_SLAB,
                YELLOW_SILT_SHINGLE_SLAB,
                LIME_SILT_SHINGLE_SLAB,
                GREEN_SILT_SHINGLE_SLAB,
                CYAN_SILT_SHINGLE_SLAB,
                LIGHT_BLUE_SILT_SHINGLE_SLAB,
                BLUE_SILT_SHINGLE_SLAB,
                PURPLE_SILT_SHINGLE_SLAB,
                MAGENTA_SILT_SHINGLE_SLAB,
                PINK_SILT_SHINGLE_SLAB,

                SILT_SHINGLE_WALL,
                WHITE_SILT_SHINGLE_WALL,
                LIGHT_GRAY_SILT_SHINGLE_WALL,
                GRAY_SILT_SHINGLE_WALL,
                BLACK_SILT_SHINGLE_WALL,
                BROWN_SILT_SHINGLE_WALL,
                RED_SILT_SHINGLE_WALL,
                ORANGE_SILT_SHINGLE_WALL,
                YELLOW_SILT_SHINGLE_WALL,
                LIME_SILT_SHINGLE_WALL,
                GREEN_SILT_SHINGLE_WALL,
                CYAN_SILT_SHINGLE_WALL,
                LIGHT_BLUE_SILT_SHINGLE_WALL,
                BLUE_SILT_SHINGLE_WALL,
                PURPLE_SILT_SHINGLE_WALL,
                MAGENTA_SILT_SHINGLE_WALL,
                PINK_SILT_SHINGLE_WALL
        ));

        CreativeModeTab tab = FabricItemGroup.builder().title(Component.translatable("itemGroup." + Twigs.MOD_ID + ".item_group")).icon(TWIGS::getDefaultInstance).displayItems((featureFlagSet, output) -> {

            //collectibles
            output.accept(AZALEA_FLOWERS);
            output.accept(TWIG);
            output.accept(PEBBLE);
            output.accept(BRONZED_SEASHELL);
            output.accept(OPALINE_SEASHELL);
            output.accept(ROSEATE_SEASHELL);
            output.accept(TANGERINE_SEASHELL);

            output.accept(BAMBOO_LEAVES);
            output.accept(BAMBOO_THATCH);
            output.accept(BAMBOO_THATCH_SLAB);
            output.accept(BAMBOO_MAT);

            //paper lanterns
            output.accept(PAPER_LANTERN);
            output.accept(ALLIUM_PAPER_LANTERN);
            output.accept(BLUE_ORCHID_PAPER_LANTERN);
            output.accept(CRIMSON_ROOTS_PAPER_LANTERN);
            output.accept(DANDELION_PAPER_LANTERN);
            output.accept(TORCHFLOWER_PAPER_LANTERN);

            //lamps
            output.accept(LAMP);
            output.accept(SOUL_LAMP);
            output.accept(CRIMSON_SHROOMLAMP);
            output.accept(WARPED_SHROOMLAMP);

            //tables
            output.accept(OAK_TABLE);
            output.accept(SPRUCE_TABLE);
            output.accept(BIRCH_TABLE);
            output.accept(JUNGLE_TABLE);
            output.accept(ACACIA_TABLE);
            output.accept(DARK_OAK_TABLE);
            output.accept(MANGROVE_TABLE);
            output.accept(CHERRY_TABLE);
            output.accept(BAMBOO_TABLE);
            output.accept(CRIMSON_TABLE);
            output.accept(WARPED_TABLE);

            //basalt blocks
            output.accept(POLISHED_BASALT_BRICKS);
            output.accept(CHISELED_SMOOTH_BASALT_BRICKS);
            output.accept(SMOOTH_BASALT_BRICKS);
            output.accept(SMOOTH_BASALT_BRICK_STAIRS);
            output.accept(SMOOTH_BASALT_BRICK_SLAB);
            output.accept(SMOOTH_BASALT_BRICK_WALL);

            //bricks
            output.accept(CRACKED_BRICKS);
            output.accept(MIXED_BRICKS);
            output.accept(CHISELED_BRICKS);
            output.accept(MOSSY_BRICKS);
            output.accept(MOSSY_BRICK_STAIRS);
            output.accept(MOSSY_BRICK_SLAB);
            output.accept(MOSSY_BRICK_WALL);
            output.accept(BRICK_TRAIL);

            //gravel bricks
            output.accept(GRAVEL_BRICKS);
            output.accept(GRAVEL_BRICK_STAIRS);
            output.accept(GRAVEL_BRICK_SLAB);
            output.accept(GRAVEL_BRICK_WALL);

            //smooth stone bricks
            output.accept(SMOOTH_STONE_BRICKS);
            output.accept(SMOOTH_STONE_BRICK_STAIRS);
            output.accept(SMOOTH_STONE_BRICK_SLAB);
            output.accept(SMOOTH_STONE_BRICK_WALL);

            //columns
            output.accept(QUARTZ_COLUMN);
            output.accept(STONE_COLUMN);
            output.accept(DEEPSLATE_COLUMN);
            output.accept(BLACKSTONE_COLUMN);

            //copper pillars
            output.accept(COPPER_PILLAR);
            output.accept(EXPOSED_COPPER_PILLAR);
            output.accept(WEATHERED_COPPER_PILLAR);
            output.accept(OXIDIZED_COPPER_PILLAR);
            output.accept(WAXED_COPPER_PILLAR);
            output.accept(WAXED_EXPOSED_COPPER_PILLAR);
            output.accept(WAXED_WEATHERED_COPPER_PILLAR);
            output.accept(WAXED_OXIDIZED_COPPER_PILLAR);

            //amethyst blocks
            output.accept(POLISHED_AMETHYST);
            output.accept(CUT_AMETHYST);

            //misc
            output.accept(PETRIFIED_LICHEN);
            output.accept(COMPACTED_DRIPSTONE);
            output.accept(ROCKY_DIRT);

            //cobblestone bricks
            output.accept(COBBLESTONE_BRICKS);
            output.accept(COBBLESTONE_BRICK_STAIRS);
            output.accept(COBBLESTONE_BRICK_SLAB);
            output.accept(COBBLESTONE_BRICK_WALL);
            output.accept(CRACKED_COBBLESTONE_BRICKS);
            output.accept(MOSSY_COBBLESTONE_BRICKS);
            output.accept(MOSSY_COBBLESTONE_BRICK_STAIRS);
            output.accept(MOSSY_COBBLESTONE_BRICK_SLAB);
            output.accept(MOSSY_COBBLESTONE_BRICK_WALL);

            //decorated blackstone bricks
            output.accept(TWISTING_POLISHED_BLACKSTONE_BRICKS);
            output.accept(TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS);
            output.accept(TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB);
            output.accept(TWISTING_POLISHED_BLACKSTONE_BRICK_WALL);
            output.accept(WEEPING_POLISHED_BLACKSTONE_BRICKS);
            output.accept(WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS);
            output.accept(WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB);
            output.accept(WEEPING_POLISHED_BLACKSTONE_BRICK_WALL);

            //tuff blocks
            output.accept(TUFF_STAIRS);
            output.accept(TUFF_SLAB);
            output.accept(TUFF_WALL);
            output.accept(POLISHED_TUFF);
            output.accept(POLISHED_TUFF_STAIRS);
            output.accept(POLISHED_TUFF_SLAB);
            output.accept(POLISHED_TUFF_BRICKS);
            output.accept(CRACKED_POLISHED_TUFF_BRICKS);
            output.accept(POLISHED_TUFF_BRICK_STAIRS);
            output.accept(POLISHED_TUFF_BRICK_SLAB);
            output.accept(POLISHED_TUFF_BRICK_WALL);

            //calcite blocks
            output.accept(CALCITE_STAIRS);
            output.accept(CALCITE_SLAB);
            output.accept(CALCITE_WALL);
            output.accept(POLISHED_CALCITE);
            output.accept(POLISHED_CALCITE_STAIRS);
            output.accept(POLISHED_CALCITE_SLAB);
            output.accept(POLISHED_CALCITE_BRICKS);
            output.accept(CRACKED_POLISHED_CALCITE_BRICKS);
            output.accept(POLISHED_CALCITE_BRICK_STAIRS);
            output.accept(POLISHED_CALCITE_BRICK_SLAB);
            output.accept(POLISHED_CALCITE_BRICK_WALL);

            //schist blocks
            output.accept(SCHIST);
            output.accept(SCHIST_STAIRS);
            output.accept(SCHIST_SLAB);
            output.accept(SCHIST_WALL);
            output.accept(POLISHED_SCHIST);
            output.accept(POLISHED_SCHIST_STAIRS);
            output.accept(POLISHED_SCHIST_SLAB);
            output.accept(POLISHED_SCHIST_BRICKS);
            output.accept(CRACKED_POLISHED_SCHIST_BRICKS);
            output.accept(POLISHED_SCHIST_BRICK_STAIRS);
            output.accept(POLISHED_SCHIST_BRICK_SLAB);
            output.accept(POLISHED_SCHIST_BRICK_WALL);

            //rhyolite blocks
            output.accept(RHYOLITE);
            output.accept(RHYOLITE_STAIRS);
            output.accept(RHYOLITE_SLAB);
            output.accept(RHYOLITE_WALL);
            output.accept(POLISHED_RHYOLITE);
            output.accept(POLISHED_RHYOLITE_STAIRS);
            output.accept(POLISHED_RHYOLITE_SLAB);
            output.accept(POLISHED_RHYOLITE_BRICKS);
            output.accept(CRACKED_POLISHED_RHYOLITE_BRICKS);
            output.accept(POLISHED_RHYOLITE_BRICK_STAIRS);
            output.accept(POLISHED_RHYOLITE_BRICK_SLAB);
            output.accept(POLISHED_RHYOLITE_BRICK_WALL);

            //bloodstone blocks
            output.accept(BLOODSTONE);
            output.accept(BLOODSTONE_STAIRS);
            output.accept(BLOODSTONE_SLAB);
            output.accept(BLOODSTONE_WALL);
            output.accept(POLISHED_BLOODSTONE);
            output.accept(POLISHED_BLOODSTONE_STAIRS);
            output.accept(POLISHED_BLOODSTONE_SLAB);
            output.accept(POLISHED_BLOODSTONE_BRICKS);
            output.accept(CRACKED_POLISHED_BLOODSTONE_BRICKS);
            output.accept(POLISHED_BLOODSTONE_BRICK_STAIRS);
            output.accept(POLISHED_BLOODSTONE_BRICK_SLAB);
            output.accept(POLISHED_BLOODSTONE_BRICK_WALL);

            //silt blocks
            output.accept(SILT);
            output.accept(SILT_BALL);
            output.accept(SILT_BRICK);
            output.accept(SILT_BRICKS);
            output.accept(CRACKED_SILT_BRICKS);
            output.accept(SILT_BRICK_STAIRS);
            output.accept(SILT_BRICK_SLAB);
            output.accept(SILT_BRICK_WALL);
            output.accept(CHISELED_SILT_BRICKS);
            output.accept(MIXED_SILT_BRICKS);
            output.accept(SILT_BRICK_TRAIL);


            output.accept(PACKED_SILT);
            output.accept(SILT_POT);
            output.accept(SILT_SHINGLES);
            output.accept(SILT_SHINGLE_STAIRS);
            output.accept(SILT_SHINGLE_SLAB);
            output.accept(SILT_SHINGLE_WALL);

            output.accept(WHITE_PACKED_SILT);
            output.accept(WHITE_SILT_POT);
            output.accept(WHITE_SILT_SHINGLES);
            output.accept(WHITE_SILT_SHINGLE_STAIRS);
            output.accept(WHITE_SILT_SHINGLE_SLAB);
            output.accept(WHITE_SILT_SHINGLE_WALL);

            output.accept(LIGHT_GRAY_PACKED_SILT);
            output.accept(LIGHT_GRAY_SILT_POT);
            output.accept(LIGHT_GRAY_SILT_SHINGLES);
            output.accept(LIGHT_GRAY_SILT_SHINGLE_STAIRS);
            output.accept(LIGHT_GRAY_SILT_SHINGLE_SLAB);
            output.accept(LIGHT_GRAY_SILT_SHINGLE_WALL);

            output.accept(GRAY_PACKED_SILT);
            output.accept(GRAY_SILT_POT);
            output.accept(GRAY_SILT_SHINGLES);
            output.accept(GRAY_SILT_SHINGLE_STAIRS);
            output.accept(GRAY_SILT_SHINGLE_SLAB);
            output.accept(GRAY_SILT_SHINGLE_WALL);

            output.accept(BLACK_PACKED_SILT);
            output.accept(BLACK_SILT_POT);
            output.accept(BLACK_SILT_SHINGLES);
            output.accept(BLACK_SILT_SHINGLE_STAIRS);
            output.accept(BLACK_SILT_SHINGLE_SLAB);
            output.accept(BLACK_SILT_SHINGLE_WALL);

            output.accept(BROWN_PACKED_SILT);
            output.accept(BROWN_SILT_POT);
            output.accept(BROWN_SILT_SHINGLES);
            output.accept(BROWN_SILT_SHINGLE_STAIRS);
            output.accept(BROWN_SILT_SHINGLE_SLAB);
            output.accept(BROWN_SILT_SHINGLE_WALL);

            output.accept(RED_PACKED_SILT);
            output.accept(RED_SILT_POT);
            output.accept(RED_SILT_SHINGLES);
            output.accept(RED_SILT_SHINGLE_STAIRS);
            output.accept(RED_SILT_SHINGLE_SLAB);
            output.accept(RED_SILT_SHINGLE_WALL);

            output.accept(ORANGE_PACKED_SILT);
            output.accept(ORANGE_SILT_POT);
            output.accept(ORANGE_SILT_SHINGLES);
            output.accept(ORANGE_SILT_SHINGLE_STAIRS);
            output.accept(ORANGE_SILT_SHINGLE_SLAB);
            output.accept(ORANGE_SILT_SHINGLE_WALL);

            output.accept(YELLOW_PACKED_SILT);
            output.accept(YELLOW_SILT_POT);
            output.accept(YELLOW_SILT_SHINGLES);
            output.accept(YELLOW_SILT_SHINGLE_STAIRS);
            output.accept(YELLOW_SILT_SHINGLE_SLAB);
            output.accept(YELLOW_SILT_SHINGLE_WALL);

            output.accept(LIME_PACKED_SILT);
            output.accept(LIME_SILT_POT);
            output.accept(LIME_SILT_SHINGLES);
            output.accept(LIME_SILT_SHINGLE_STAIRS);
            output.accept(LIME_SILT_SHINGLE_SLAB);
            output.accept(LIME_SILT_SHINGLE_WALL);

            output.accept(GREEN_PACKED_SILT);
            output.accept(GREEN_SILT_POT);
            output.accept(GREEN_SILT_SHINGLES);
            output.accept(GREEN_SILT_SHINGLE_STAIRS);
            output.accept(GREEN_SILT_SHINGLE_SLAB);
            output.accept(GREEN_SILT_SHINGLE_WALL);

            output.accept(CYAN_PACKED_SILT);
            output.accept(CYAN_SILT_POT);
            output.accept(CYAN_SILT_SHINGLES);
            output.accept(CYAN_SILT_SHINGLE_STAIRS);
            output.accept(CYAN_SILT_SHINGLE_SLAB);
            output.accept(CYAN_SILT_SHINGLE_WALL);

            output.accept(LIGHT_BLUE_PACKED_SILT);
            output.accept(LIGHT_BLUE_SILT_POT);
            output.accept(LIGHT_BLUE_SILT_SHINGLES);
            output.accept(LIGHT_BLUE_SILT_SHINGLE_STAIRS);
            output.accept(LIGHT_BLUE_SILT_SHINGLE_SLAB);
            output.accept(LIGHT_BLUE_SILT_SHINGLE_WALL);

            output.accept(BLUE_PACKED_SILT);
            output.accept(BLUE_SILT_POT);
            output.accept(BLUE_SILT_SHINGLES);
            output.accept(BLUE_SILT_SHINGLE_STAIRS);
            output.accept(BLUE_SILT_SHINGLE_SLAB);
            output.accept(BLUE_SILT_SHINGLE_WALL);

            output.accept(PURPLE_PACKED_SILT);
            output.accept(PURPLE_SILT_POT);
            output.accept(PURPLE_SILT_SHINGLES);
            output.accept(PURPLE_SILT_SHINGLE_STAIRS);
            output.accept(PURPLE_SILT_SHINGLE_SLAB);
            output.accept(PURPLE_SILT_SHINGLE_WALL);

            output.accept(MAGENTA_PACKED_SILT);
            output.accept(MAGENTA_SILT_POT);
            output.accept(MAGENTA_SILT_SHINGLES);
            output.accept(MAGENTA_SILT_SHINGLE_STAIRS);
            output.accept(MAGENTA_SILT_SHINGLE_SLAB);
            output.accept(MAGENTA_SILT_SHINGLE_WALL);

            output.accept(PINK_PACKED_SILT);
            output.accept(PINK_SILT_POT);
            output.accept(PINK_SILT_SHINGLES);
            output.accept(PINK_SILT_SHINGLE_STAIRS);
            output.accept(PINK_SILT_SHINGLE_SLAB);
            output.accept(PINK_SILT_SHINGLE_WALL);

        }).build();

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID,"item_group"), tab);
    }
}
