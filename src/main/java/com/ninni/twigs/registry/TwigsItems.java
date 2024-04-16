package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.item.InstrumentBlockItem;
import com.ninni.twigs.item.PebbleItem;
import com.ninni.twigs.item.TwigItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.InstrumentTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

@SuppressWarnings("unused")
public class TwigsItems {
    //logo
    public static final Item TWIGS = register("twigs", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC).fireproof()));

    //collectibles
    public static final Item AZALEA_FLOWERS = register("azalea_flowers", new BlockItem(TwigsBlocks.AZALEA_FLOWERS, new FabricItemSettings()));
    public static final Item TWIG = register("twig", new TwigItem(TwigsBlocks.TWIG, new Item.Properties()));
    public static final Item PEBBLE = register("pebble", new PebbleItem(TwigsBlocks.PEBBLE, new Item.Properties()));
    public static final Item BRONZED_SEASHELL = register("bronzed_seashell", new InstrumentBlockItem(TwigsBlocks.BRONZED_SEASHELL, new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1)));
    public static final Item OPALINE_SEASHELL = register("opaline_seashell", new BlockItem(TwigsBlocks.OPALINE_SEASHELL, new Item.Properties()));
    public static final Item ROSEATE_SEASHELL = register("roseate_seashell", new BlockItem(TwigsBlocks.ROSEATE_SEASHELL, new Item.Properties()));
    public static final Item TANGERINE_SEASHELL = register("tangerine_seashell", new BlockItem(TwigsBlocks.TANGERINE_SEASHELL, new Item.Properties()));

    //bamboo
    public static final Item BAMBOO_LEAVES = register("bamboo_leaves", new BlockItem(TwigsBlocks.BAMBOO_LEAVES, new Item.Properties()));
    public static final Item BAMBOO_THATCH = register("bamboo_thatch", new BlockItem(TwigsBlocks.BAMBOO_THATCH, new Item.Properties()));
    public static final Item BAMBOO_THATCH_SLAB = register("bamboo_thatch_slab", new BlockItem(TwigsBlocks.BAMBOO_THATCH_SLAB, new Item.Properties()));
    public static final Item BAMBOO_MAT = register("bamboo_mat", new BlockItem(TwigsBlocks.BAMBOO_MAT, new FabricItemSettings()));

    //paper lanterns
    public static final Item PAPER_LANTERN = register("paper_lantern", new BlockItem(TwigsBlocks.PAPER_LANTERN, new FabricItemSettings()));
    public static final Item ALLIUM_PAPER_LANTERN = register("allium_paper_lantern", new BlockItem(TwigsBlocks.ALLIUM_PAPER_LANTERN, new FabricItemSettings()));
    public static final Item BLUE_ORCHID_PAPER_LANTERN = register("blue_orchid_paper_lantern", new BlockItem(TwigsBlocks.BLUE_ORCHID_PAPER_LANTERN, new FabricItemSettings()));
    public static final Item CRIMSON_ROOTS_PAPER_LANTERN = register("crimson_roots_paper_lantern", new BlockItem(TwigsBlocks.CRIMSON_ROOTS_PAPER_LANTERN, new FabricItemSettings()));
    public static final Item DANDELION_PAPER_LANTERN = register("dandelion_paper_lantern", new BlockItem(TwigsBlocks.DANDELION_PAPER_LANTERN, new FabricItemSettings()));
    public static final Item TORCHFLOWER_PAPER_LANTERN = register("torchflower_paper_lantern", new BlockItem(TwigsBlocks.TORCHFLOWER_PAPER_LANTERN, new FabricItemSettings()));

    //lamps
    public static final Item lAMP = register("lamp", new BlockItem(TwigsBlocks.LAMP, new FabricItemSettings()));
    public static final Item SOUL_LAMP = register("soul_lamp", new BlockItem(TwigsBlocks.SOUL_LAMP, new FabricItemSettings()));
    public static final Item CRIMSON_SHROOMLAMP = register("crimson_shroomlamp", new BlockItem(TwigsBlocks.CRIMSON_SHROOMLAMP, new FabricItemSettings()));
    public static final Item WARPED_SHROOMLAMP = register("warped_shroomlamp", new BlockItem(TwigsBlocks.WARPED_SHROOMLAMP, new FabricItemSettings()));

    //tables
    public static final Item OAK_TABLE = register("oak_table", new BlockItem(TwigsBlocks.OAK_TABLE, new FabricItemSettings()));
    public static final Item SPRUCE_TABLE = register("spruce_table", new BlockItem(TwigsBlocks.SPRUCE_TABLE, new FabricItemSettings()));
    public static final Item BIRCH_TABLE = register("birch_table", new BlockItem(TwigsBlocks.BIRCH_TABLE, new FabricItemSettings()));
    public static final Item JUNGLE_TABLE = register("jungle_table", new BlockItem(TwigsBlocks.JUNGLE_TABLE, new FabricItemSettings()));
    public static final Item ACACIA_TABLE = register("acacia_table", new BlockItem(TwigsBlocks.ACACIA_TABLE, new FabricItemSettings()));
    public static final Item DARK_OAK_TABLE = register("dark_oak_table", new BlockItem(TwigsBlocks.DARK_OAK_TABLE, new FabricItemSettings()));
    public static final Item MANGROVE_TABLE = register("mangrove_table", new BlockItem(TwigsBlocks.MANGROVE_TABLE, new FabricItemSettings()));
    public static final Item CHERRY_TABLE = register("cherry_table", new BlockItem(TwigsBlocks.CHERRY_TABLE, new FabricItemSettings()));
    public static final Item BAMBOO_TABLE = register("bamboo_table", new BlockItem(TwigsBlocks.BAMBOO_TABLE, new FabricItemSettings()));
    public static final Item CRIMSON_TABLE = register("crimson_table", new BlockItem(TwigsBlocks.CRIMSON_TABLE, new FabricItemSettings()));
    public static final Item WARPED_TABLE = register("warped_table", new BlockItem(TwigsBlocks.WARPED_TABLE, new FabricItemSettings()));

    //basalt blocks
    public static final Item POLISHED_BASALT_BRICKS = register("polished_basalt_bricks", new BlockItem(TwigsBlocks.POLISHED_BASALT_BRICKS, new FabricItemSettings()));
    public static final Item SMOOTH_BASALT_BRICKS = register("smooth_basalt_bricks", new BlockItem(TwigsBlocks.SMOOTH_BASALT_BRICKS, new FabricItemSettings()));
    public static final Item SMOOTH_BASALT_BRICK_STAIRS = register("smooth_basalt_brick_stairs", new BlockItem(TwigsBlocks.SMOOTH_BASALT_BRICK_STAIRS, new FabricItemSettings()));
    public static final Item SMOOTH_BASALT_BRICK_SLAB = register("smooth_basalt_brick_slab", new BlockItem(TwigsBlocks.SMOOTH_BASALT_BRICK_SLAB, new FabricItemSettings()));
    public static final Item SMOOTH_BASALT_BRICK_WALL = register("smooth_basalt_brick_wall", new BlockItem(TwigsBlocks.SMOOTH_BASALT_BRICK_WALL, new FabricItemSettings()));
    public static final Item CHISELED_SMOOTH_BASALT_BRICKS = register("chiseled_smooth_basalt_bricks", new BlockItem(TwigsBlocks.CHISELED_SMOOTH_BASALT_BRICKS, new FabricItemSettings()));

    //bricks
    public static final Item MIXED_BRICKS = register("mixed_bricks", new BlockItem(TwigsBlocks.MIXED_BRICKS, new FabricItemSettings()));
    public static final Item CHISELED_BRICKS = register("chiseled_bricks", new BlockItem(TwigsBlocks.CHISELED_BRICKS, new FabricItemSettings()));
    public static final Item CRACKED_BRICKS = register("cracked_bricks", new BlockItem(TwigsBlocks.CRACKED_BRICKS, new FabricItemSettings()));
    public static final Item MOSSY_BRICKS = register("mossy_bricks", new BlockItem(TwigsBlocks.MOSSY_BRICKS, new FabricItemSettings()));
    public static final Item MOSSY_BRICK_STAIRS = register("mossy_brick_stairs", new BlockItem(TwigsBlocks.MOSSY_BRICK_STAIRS, new FabricItemSettings()));
    public static final Item MOSSY_BRICK_SLAB = register("mossy_brick_slab", new BlockItem(TwigsBlocks.MOSSY_BRICK_SLAB, new FabricItemSettings()));
    public static final Item MOSSY_BRICK_WALL = register("mossy_brick_wall", new BlockItem(TwigsBlocks.MOSSY_BRICK_WALL, new FabricItemSettings()));
    public static final Item BRICK_TRAIL = register("brick_trail", new BlockItem(TwigsBlocks.BRICK_TRAIL, new FabricItemSettings()));

    //gravel bricks
    public static final Item GRAVEL_BRICKS = register("gravel_bricks", new BlockItem(TwigsBlocks.GRAVEL_BRICKS, new FabricItemSettings()));
    public static final Item GRAVEL_BRICK_STAIRS = register("gravel_brick_stairs", new BlockItem(TwigsBlocks.GRAVEL_BRICK_STAIRS, new FabricItemSettings()));
    public static final Item GRAVEL_BRICK_SLAB = register("gravel_brick_slab", new BlockItem(TwigsBlocks.GRAVEL_BRICK_SLAB, new FabricItemSettings()));
    public static final Item GRAVEL_BRICK_WALL = register("gravel_brick_wall", new BlockItem(TwigsBlocks.GRAVEL_BRICK_WALL, new FabricItemSettings()));

    //smooth stone bricks
    public static final Item SMOOTH_STONE_BRICKS = register("smooth_stone_bricks", new BlockItem(TwigsBlocks.SMOOTH_STONE_BRICKS, new FabricItemSettings()));
    public static final Item SMOOTH_STONE_BRICK_STAIRS = register("smooth_stone_brick_stairs", new BlockItem(TwigsBlocks.SMOOTH_STONE_BRICK_STAIRS, new FabricItemSettings()));
    public static final Item SMOOTH_STONE_BRICK_SLAB = register("smooth_stone_brick_slab", new BlockItem(TwigsBlocks.SMOOTH_STONE_BRICK_SLAB, new FabricItemSettings()));
    public static final Item SMOOTH_STONE_BRICK_WALL = register("smooth_stone_brick_wall", new BlockItem(TwigsBlocks.SMOOTH_STONE_BRICK_WALL, new FabricItemSettings()));

    //columns
    public static final Item QUARTZ_COLUMN = register("quartz_column", new BlockItem(TwigsBlocks.QUARTZ_COLUMN, new FabricItemSettings()));
    public static final Item STONE_COLUMN = register("stone_column", new BlockItem(TwigsBlocks.STONE_COLUMN, new FabricItemSettings()));
    public static final Item DEEPSLATE_COLUMN = register("deepslate_column", new BlockItem(TwigsBlocks.DEEPSLATE_COLUMN, new FabricItemSettings()));
    public static final Item BLACKSTONE_COLUMN = register("blackstone_column", new BlockItem(TwigsBlocks.BLACKSTONE_COLUMN, new FabricItemSettings()));

    //copper pillars
    public static final Item COPPER_PILLAR = register("copper_pillar", new BlockItem(TwigsBlocks.COPPER_PILLAR, new FabricItemSettings()));
    public static final Item EXPOSED_COPPER_PILLAR = register("exposed_copper_pillar", new BlockItem(TwigsBlocks.EXPOSED_COPPER_PILLAR, new FabricItemSettings()));
    public static final Item WEATHERED_COPPER_PILLAR = register("weathered_copper_pillar", new BlockItem(TwigsBlocks.WEATHERED_COPPER_PILLAR, new FabricItemSettings()));
    public static final Item OXIDIZED_COPPER_PILLAR = register("oxidized_copper_pillar", new BlockItem(TwigsBlocks.OXIDIZED_COPPER_PILLAR, new FabricItemSettings()));
    public static final Item WAXED_COPPER_PILLAR = register("waxed_copper_pillar", new BlockItem(TwigsBlocks.WAXED_COPPER_PILLAR, new FabricItemSettings()));
    public static final Item WAXED_EXPOSED_COPPER_PILLAR = register("waxed_exposed_copper_pillar", new BlockItem(TwigsBlocks.WAXED_EXPOSED_COPPER_PILLAR, new FabricItemSettings()));
    public static final Item WAXED_WEATHERED_COPPER_PILLAR = register("waxed_weathered_copper_pillar", new BlockItem(TwigsBlocks.WAXED_WEATHERED_COPPER_PILLAR, new FabricItemSettings()));
    public static final Item WAXED_OXIDIZED_COPPER_PILLAR = register("waxed_oxidized_copper_pillar", new BlockItem(TwigsBlocks.WAXED_OXIDIZED_COPPER_PILLAR, new FabricItemSettings()));

    //amethyst blocks
    public static final Item POLISHED_AMETHYST = register("polished_amethyst", new BlockItem(TwigsBlocks.POLISHED_AMETHYST, new FabricItemSettings()));
    public static final Item CUT_AMETHYST = register("cut_amethyst", new BlockItem(TwigsBlocks.CUT_AMETHYST, new FabricItemSettings()));

    //misc
    public static final Item PETRIFIED_LICHEN = register("petrified_lichen", new BlockItem(TwigsBlocks.PETRIFIED_LICHEN, new Item.Properties()));
    public static final Item COMPACTED_DRIPSTONE = register("compacted_dripstone", new BlockItem(TwigsBlocks.COMPACTED_DRIPSTONE, new FabricItemSettings()));
    public static final Item ROCKY_DIRT = register("rocky_dirt", new BlockItem(TwigsBlocks.ROCKY_DIRT, new FabricItemSettings()));

    //cobblestone bricks
    public static final Item COBBLESTONE_BRICKS = register("cobblestone_bricks", new BlockItem(TwigsBlocks.COBBLESTONE_BRICKS, new FabricItemSettings()));
    public static final Item COBBLESTONE_BRICK_STAIRS = register("cobblestone_brick_stairs", new BlockItem(TwigsBlocks.COBBLESTONE_BRICK_STAIRS, new FabricItemSettings()));
    public static final Item COBBLESTONE_BRICK_SLAB = register("cobblestone_brick_slab", new BlockItem(TwigsBlocks.COBBLESTONE_BRICK_SLAB, new FabricItemSettings()));
    public static final Item COBBLESTONE_BRICK_WALL = register("cobblestone_brick_wall", new BlockItem(TwigsBlocks.COBBLESTONE_BRICK_WALL, new FabricItemSettings()));
    public static final Item CRACKED_COBBLESTONE_BRICKS = register("cracked_cobblestone_bricks", new BlockItem(TwigsBlocks.CRACKED_COBBLESTONE_BRICKS, new FabricItemSettings()));
    public static final Item MOSSY_COBBLESTONE_BRICKS = register("mossy_cobblestone_bricks", new BlockItem(TwigsBlocks.MOSSY_COBBLESTONE_BRICKS, new FabricItemSettings()));
    public static final Item MOSSY_COBBLESTONE_BRICK_STAIRS = register("mossy_cobblestone_brick_stairs", new BlockItem(TwigsBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS, new FabricItemSettings()));
    public static final Item MOSSY_COBBLESTONE_BRICK_SLAB = register("mossy_cobblestone_brick_slab", new BlockItem(TwigsBlocks.MOSSY_COBBLESTONE_BRICK_SLAB, new FabricItemSettings()));
    public static final Item MOSSY_COBBLESTONE_BRICK_WALL = register("mossy_cobblestone_brick_wall", new BlockItem(TwigsBlocks.MOSSY_COBBLESTONE_BRICK_WALL, new FabricItemSettings()));

    //decorated blackstone bricks
    public static final Item TWISTING_POLISHED_BLACKSTONE_BRICKS = register("twisting_polished_blackstone_bricks", new BlockItem(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS, new FabricItemSettings()));
    public static final Item TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS = register("twisting_polished_blackstone_brick_stairs", new BlockItem(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS, new FabricItemSettings()));
    public static final Item TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB = register("twisting_polished_blackstone_brick_slab", new BlockItem(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB, new FabricItemSettings()));
    public static final Item TWISTING_POLISHED_BLACKSTONE_BRICK_WALL = register("twisting_polished_blackstone_brick_wall", new BlockItem(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_WALL, new FabricItemSettings()));
    public static final Item WEEPING_POLISHED_BLACKSTONE_BRICKS = register("weeping_polished_blackstone_bricks", new BlockItem(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS, new FabricItemSettings()));
    public static final Item WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS = register("weeping_polished_blackstone_brick_stairs", new BlockItem(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS, new FabricItemSettings()));
    public static final Item WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB = register("weeping_polished_blackstone_brick_slab", new BlockItem(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB, new FabricItemSettings()));
    public static final Item WEEPING_POLISHED_BLACKSTONE_BRICK_WALL = register("weeping_polished_blackstone_brick_wall", new BlockItem(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_WALL, new FabricItemSettings()));

    //tuff blocks
    public static final Item TUFF_STAIRS = register("tuff_stairs", new BlockItem(TwigsBlocks.TUFF_STAIRS, new FabricItemSettings()));
    public static final Item TUFF_SLAB = register("tuff_slab", new BlockItem(TwigsBlocks.TUFF_SLAB, new FabricItemSettings()));
    public static final Item TUFF_WALL = register("tuff_wall", new BlockItem(TwigsBlocks.TUFF_WALL, new FabricItemSettings()));
    public static final Item POLISHED_TUFF = register("polished_tuff", new BlockItem(TwigsBlocks.POLISHED_TUFF, new FabricItemSettings()));
    public static final Item POLISHED_TUFF_STAIRS = register("polished_tuff_stairs", new BlockItem(TwigsBlocks.POLISHED_TUFF_STAIRS, new FabricItemSettings()));
    public static final Item POLISHED_TUFF_SLAB = register("polished_tuff_slab", new BlockItem(TwigsBlocks.POLISHED_TUFF_SLAB, new FabricItemSettings()));
    public static final Item POLISHED_TUFF_BRICKS = register("polished_tuff_bricks", new BlockItem(TwigsBlocks.POLISHED_TUFF_BRICKS, new FabricItemSettings()));
    public static final Item POLISHED_TUFF_BRICK_STAIRS = register("polished_tuff_brick_stairs", new BlockItem(TwigsBlocks.POLISHED_TUFF_BRICK_STAIRS, new FabricItemSettings()));
    public static final Item POLISHED_TUFF_BRICK_SLAB = register("polished_tuff_brick_slab", new BlockItem(TwigsBlocks.POLISHED_TUFF_BRICK_SLAB, new FabricItemSettings()));
    public static final Item POLISHED_TUFF_BRICK_WALL = register("polished_tuff_brick_wall", new BlockItem(TwigsBlocks.POLISHED_TUFF_BRICK_WALL, new FabricItemSettings()));
    public static final Item CRACKED_POLISHED_TUFF_BRICKS = register("cracked_polished_tuff_bricks", new BlockItem(TwigsBlocks.CRACKED_POLISHED_TUFF_BRICKS, new FabricItemSettings()));

    //calcite blocks
    public static final Item CALCITE_STAIRS = register("calcite_stairs", new BlockItem(TwigsBlocks.CALCITE_STAIRS, new FabricItemSettings()));
    public static final Item CALCITE_SLAB = register("calcite_slab", new BlockItem(TwigsBlocks.CALCITE_SLAB, new FabricItemSettings()));
    public static final Item CALCITE_WALL = register("calcite_wall", new BlockItem(TwigsBlocks.CALCITE_WALL, new FabricItemSettings()));
    public static final Item POLISHED_CALCITE = register("polished_calcite", new BlockItem(TwigsBlocks.POLISHED_CALCITE, new FabricItemSettings()));
    public static final Item POLISHED_CALCITE_STAIRS = register("polished_calcite_stairs", new BlockItem(TwigsBlocks.POLISHED_CALCITE_STAIRS, new FabricItemSettings()));
    public static final Item POLISHED_CALCITE_SLAB = register("polished_calcite_slab", new BlockItem(TwigsBlocks.POLISHED_CALCITE_SLAB, new FabricItemSettings()));
    public static final Item POLISHED_CALCITE_BRICKS = register("polished_calcite_bricks", new BlockItem(TwigsBlocks.POLISHED_CALCITE_BRICKS, new FabricItemSettings()));
    public static final Item POLISHED_CALCITE_BRICK_STAIRS = register("polished_calcite_brick_stairs", new BlockItem(TwigsBlocks.POLISHED_CALCITE_BRICK_STAIRS, new FabricItemSettings()));
    public static final Item POLISHED_CALCITE_BRICK_SLAB = register("polished_calcite_brick_slab", new BlockItem(TwigsBlocks.POLISHED_CALCITE_BRICK_SLAB, new FabricItemSettings()));
    public static final Item POLISHED_CALCITE_BRICK_WALL = register("polished_calcite_brick_wall", new BlockItem(TwigsBlocks.POLISHED_CALCITE_BRICK_WALL, new FabricItemSettings()));
    public static final Item CRACKED_POLISHED_CALCITE_BRICKS = register("cracked_polished_calcite_bricks", new BlockItem(TwigsBlocks.CRACKED_POLISHED_CALCITE_BRICKS, new FabricItemSettings()));

    //schist blocks
    public static final Item SCHIST = register("schist", new BlockItem(TwigsBlocks.SCHIST, new FabricItemSettings()));
    public static final Item SCHIST_STAIRS = register("schist_stairs", new BlockItem(TwigsBlocks.SCHIST_STAIRS, new FabricItemSettings()));
    public static final Item SCHIST_SLAB = register("schist_slab", new BlockItem(TwigsBlocks.SCHIST_SLAB, new FabricItemSettings()));
    public static final Item SCHIST_WALL = register("schist_wall", new BlockItem(TwigsBlocks.SCHIST_WALL, new FabricItemSettings()));
    public static final Item POLISHED_SCHIST = register("polished_schist", new BlockItem(TwigsBlocks.POLISHED_SCHIST, new FabricItemSettings()));
    public static final Item POLISHED_SCHIST_STAIRS = register("polished_schist_stairs", new BlockItem(TwigsBlocks.POLISHED_SCHIST_STAIRS, new FabricItemSettings()));
    public static final Item POLISHED_SCHIST_SLAB = register("polished_schist_slab", new BlockItem(TwigsBlocks.POLISHED_SCHIST_SLAB, new FabricItemSettings()));
    public static final Item POLISHED_SCHIST_BRICKS = register("polished_schist_bricks", new BlockItem(TwigsBlocks.POLISHED_SCHIST_BRICKS, new FabricItemSettings()));
    public static final Item POLISHED_SCHIST_BRICK_STAIRS = register("polished_schist_brick_stairs", new BlockItem(TwigsBlocks.POLISHED_SCHIST_BRICK_STAIRS, new FabricItemSettings()));
    public static final Item POLISHED_SCHIST_BRICK_SLAB = register("polished_schist_brick_slab", new BlockItem(TwigsBlocks.POLISHED_SCHIST_BRICK_SLAB, new FabricItemSettings()));
    public static final Item POLISHED_SCHIST_BRICK_WALL = register("polished_schist_brick_wall", new BlockItem(TwigsBlocks.POLISHED_SCHIST_BRICK_WALL, new FabricItemSettings()));
    public static final Item CRACKED_POLISHED_SCHIST_BRICKS = register("cracked_polished_schist_bricks", new BlockItem(TwigsBlocks.CRACKED_POLISHED_SCHIST_BRICKS, new FabricItemSettings()));

    //rhyolite blocks
    public static final Item RHYOLITE = register("rhyolite", new BlockItem(TwigsBlocks.RHYOLITE, new FabricItemSettings()));
    public static final Item RHYOLITE_STAIRS = register("rhyolite_stairs", new BlockItem(TwigsBlocks.RHYOLITE_STAIRS, new FabricItemSettings()));
    public static final Item RHYOLITE_SLAB = register("rhyolite_slab", new BlockItem(TwigsBlocks.RHYOLITE_SLAB, new FabricItemSettings()));
    public static final Item RHYOLITE_WALL = register("rhyolite_wall", new BlockItem(TwigsBlocks.RHYOLITE_WALL, new FabricItemSettings()));
    public static final Item POLISHED_RHYOLITE = register("polished_rhyolite", new BlockItem(TwigsBlocks.POLISHED_RHYOLITE, new FabricItemSettings()));
    public static final Item POLISHED_RHYOLITE_STAIRS = register("polished_rhyolite_stairs", new BlockItem(TwigsBlocks.POLISHED_RHYOLITE_STAIRS, new FabricItemSettings()));
    public static final Item POLISHED_RHYOLITE_SLAB = register("polished_rhyolite_slab", new BlockItem(TwigsBlocks.POLISHED_RHYOLITE_SLAB, new FabricItemSettings()));
    public static final Item POLISHED_RHYOLITE_BRICKS = register("polished_rhyolite_bricks", new BlockItem(TwigsBlocks.POLISHED_RHYOLITE_BRICKS, new FabricItemSettings()));
    public static final Item POLISHED_RHYOLITE_BRICK_STAIRS = register("polished_rhyolite_brick_stairs", new BlockItem(TwigsBlocks.POLISHED_RHYOLITE_BRICK_STAIRS, new FabricItemSettings()));
    public static final Item POLISHED_RHYOLITE_BRICK_SLAB = register("polished_rhyolite_brick_slab", new BlockItem(TwigsBlocks.POLISHED_RHYOLITE_BRICK_SLAB, new FabricItemSettings()));
    public static final Item POLISHED_RHYOLITE_BRICK_WALL = register("polished_rhyolite_brick_wall", new BlockItem(TwigsBlocks.POLISHED_RHYOLITE_BRICK_WALL, new FabricItemSettings()));
    public static final Item CRACKED_POLISHED_RHYOLITE_BRICKS = register("cracked_polished_rhyolite_bricks", new BlockItem(TwigsBlocks.CRACKED_POLISHED_RHYOLITE_BRICKS, new FabricItemSettings()));

    //bloodstone blocks
    public static final Item BLOODSTONE = register("bloodstone", new BlockItem(TwigsBlocks.BLOODSTONE, new FabricItemSettings()));
    public static final Item BLOODSTONE_STAIRS = register("bloodstone_stairs", new BlockItem(TwigsBlocks.BLOODSTONE_STAIRS, new FabricItemSettings()));
    public static final Item BLOODSTONE_SLAB = register("bloodstone_slab", new BlockItem(TwigsBlocks.BLOODSTONE_SLAB, new FabricItemSettings()));
    public static final Item BLOODSTONE_WALL = register("bloodstone_wall", new BlockItem(TwigsBlocks.BLOODSTONE_WALL, new FabricItemSettings()));
    public static final Item POLISHED_BLOODSTONE = register("polished_bloodstone", new BlockItem(TwigsBlocks.POLISHED_BLOODSTONE, new FabricItemSettings()));
    public static final Item POLISHED_BLOODSTONE_STAIRS = register("polished_bloodstone_stairs", new BlockItem(TwigsBlocks.POLISHED_BLOODSTONE_STAIRS, new FabricItemSettings()));
    public static final Item POLISHED_BLOODSTONE_SLAB = register("polished_bloodstone_slab", new BlockItem(TwigsBlocks.POLISHED_BLOODSTONE_SLAB, new FabricItemSettings()));
    public static final Item POLISHED_BLOODSTONE_BRICKS = register("polished_bloodstone_bricks", new BlockItem(TwigsBlocks.POLISHED_BLOODSTONE_BRICKS, new FabricItemSettings()));
    public static final Item POLISHED_BLOODSTONE_BRICK_STAIRS = register("polished_bloodstone_brick_stairs", new BlockItem(TwigsBlocks.POLISHED_BLOODSTONE_BRICK_STAIRS, new FabricItemSettings()));
    public static final Item POLISHED_BLOODSTONE_BRICK_SLAB = register("polished_bloodstone_brick_slab", new BlockItem(TwigsBlocks.POLISHED_BLOODSTONE_BRICK_SLAB, new FabricItemSettings()));
    public static final Item POLISHED_BLOODSTONE_BRICK_WALL = register("polished_bloodstone_brick_wall", new BlockItem(TwigsBlocks.POLISHED_BLOODSTONE_BRICK_WALL, new FabricItemSettings()));
    public static final Item CRACKED_POLISHED_BLOODSTONE_BRICKS = register("cracked_polished_bloodstone_bricks", new BlockItem(TwigsBlocks.CRACKED_POLISHED_BLOODSTONE_BRICKS, new FabricItemSettings()));

    //silt blocks
    public static final Item SILT = register("silt", new BlockItem(TwigsBlocks.SILT, new FabricItemSettings()));
    public static final Item SILT_BALL = register("silt_ball", new Item(new FabricItemSettings()));
    public static final Item SILT_BRICK = register("silt_brick", new Item(new FabricItemSettings()));
    public static final Item SILT_BRICKS = register("silt_bricks", new BlockItem(TwigsBlocks.SILT_BRICKS, new FabricItemSettings()));
    public static final Item SILT_BRICK_STAIRS = register("silt_brick_stairs", new BlockItem(TwigsBlocks.SILT_BRICK_STAIRS, new FabricItemSettings()));
    public static final Item SILT_BRICK_SLAB = register("silt_brick_slab", new BlockItem(TwigsBlocks.SILT_BRICK_SLAB, new FabricItemSettings()));
    public static final Item SILT_BRICK_WALL = register("silt_brick_wall", new BlockItem(TwigsBlocks.SILT_BRICK_WALL, new FabricItemSettings()));
    public static final Item MIXED_SILT_BRICKS = register("mixed_silt_bricks", new BlockItem(TwigsBlocks.MIXED_SILT_BRICKS, new FabricItemSettings()));
    public static final Item CHISELED_SILT_BRICKS = register("chiseled_silt_bricks", new BlockItem(TwigsBlocks.CHISELED_SILT_BRICKS, new FabricItemSettings()));
    public static final Item CRACKED_SILT_BRICKS = register("cracked_silt_bricks", new BlockItem(TwigsBlocks.CRACKED_SILT_BRICKS, new FabricItemSettings()));
    public static final Item SILT_BRICK_TRAIL = register("silt_brick_trail", new BlockItem(TwigsBlocks.SILT_BRICK_TRAIL, new FabricItemSettings()));

    public static final Item SILT_POT = register("silt_pot", new BlockItem(TwigsBlocks.SILT_POT, new FabricItemSettings()));
    public static final Item WHITE_SILT_POT = register("white_silt_pot", new BlockItem(TwigsBlocks.WHITE_SILT_POT, new FabricItemSettings()));
    public static final Item ORANGE_SILT_POT = register("orange_silt_pot", new BlockItem(TwigsBlocks.ORANGE_SILT_POT, new FabricItemSettings()));
    public static final Item MAGENTA_SILT_POT = register("magenta_silt_pot", new BlockItem(TwigsBlocks.MAGENTA_SILT_POT, new FabricItemSettings()));
    public static final Item LIGHT_BLUE_SILT_POT = register("light_blue_silt_pot", new BlockItem(TwigsBlocks.LIGHT_BLUE_SILT_POT, new FabricItemSettings()));
    public static final Item YELLOW_SILT_POT = register("yellow_silt_pot", new BlockItem(TwigsBlocks.YELLOW_SILT_POT, new FabricItemSettings()));
    public static final Item LIME_SILT_POT = register("lime_silt_pot", new BlockItem(TwigsBlocks.LIME_SILT_POT, new FabricItemSettings()));
    public static final Item PINK_SILT_POT = register("pink_silt_pot", new BlockItem(TwigsBlocks.PINK_SILT_POT, new FabricItemSettings()));
    public static final Item GRAY_SILT_POT = register("gray_silt_pot", new BlockItem(TwigsBlocks.GRAY_SILT_POT, new FabricItemSettings()));
    public static final Item LIGHT_GRAY_SILT_POT = register("light_gray_silt_pot", new BlockItem(TwigsBlocks.LIGHT_GRAY_SILT_POT, new FabricItemSettings()));
    public static final Item CYAN_SILT_POT = register("cyan_silt_pot", new BlockItem(TwigsBlocks.CYAN_SILT_POT, new FabricItemSettings()));
    public static final Item PURPLE_SILT_POT = register("purple_silt_pot", new BlockItem(TwigsBlocks.PURPLE_SILT_POT, new FabricItemSettings()));
    public static final Item BLUE_SILT_POT = register("blue_silt_pot", new BlockItem(TwigsBlocks.BLUE_SILT_POT, new FabricItemSettings()));
    public static final Item BROWN_SILT_POT =  register("brown_silt_pot", new BlockItem(TwigsBlocks.BROWN_SILT_POT, new FabricItemSettings()));
    public static final Item GREEN_SILT_POT =  register("green_silt_pot", new BlockItem(TwigsBlocks.GREEN_SILT_POT, new FabricItemSettings()));
    public static final Item RED_SILT_POT =  register("red_silt_pot", new BlockItem(TwigsBlocks.RED_SILT_POT, new FabricItemSettings()));
    public static final Item BLACK_SILT_POT =  register("black_silt_pot", new BlockItem(TwigsBlocks.BLACK_SILT_POT, new FabricItemSettings()));

    public static final Item PACKED_SILT = register("packed_silt", new BlockItem(TwigsBlocks.PACKED_SILT, new FabricItemSettings()));
    public static final Item WHITE_PACKED_SILT = register("white_packed_silt", new BlockItem(TwigsBlocks.WHITE_PACKED_SILT, new FabricItemSettings()));
    public static final Item ORANGE_PACKED_SILT = register("orange_packed_silt", new BlockItem(TwigsBlocks.ORANGE_PACKED_SILT, new FabricItemSettings()));
    public static final Item MAGENTA_PACKED_SILT = register("magenta_packed_silt", new BlockItem(TwigsBlocks.MAGENTA_PACKED_SILT, new FabricItemSettings()));
    public static final Item LIGHT_BLUE_PACKED_SILT = register("light_blue_packed_silt", new BlockItem(TwigsBlocks.LIGHT_BLUE_PACKED_SILT, new FabricItemSettings()));
    public static final Item YELLOW_PACKED_SILT = register("yellow_packed_silt", new BlockItem(TwigsBlocks.YELLOW_PACKED_SILT, new FabricItemSettings()));
    public static final Item LIME_PACKED_SILT = register("lime_packed_silt", new BlockItem(TwigsBlocks.LIME_PACKED_SILT, new FabricItemSettings()));
    public static final Item PINK_PACKED_SILT = register("pink_packed_silt", new BlockItem(TwigsBlocks.PINK_PACKED_SILT, new FabricItemSettings()));
    public static final Item GRAY_PACKED_SILT = register("gray_packed_silt", new BlockItem(TwigsBlocks.GRAY_PACKED_SILT, new FabricItemSettings()));
    public static final Item LIGHT_GRAY_PACKED_SILT = register("light_gray_packed_silt", new BlockItem(TwigsBlocks.LIGHT_GRAY_PACKED_SILT, new FabricItemSettings()));
    public static final Item CYAN_PACKED_SILT = register("cyan_packed_silt", new BlockItem(TwigsBlocks.CYAN_PACKED_SILT, new FabricItemSettings()));
    public static final Item PURPLE_PACKED_SILT = register("purple_packed_silt", new BlockItem(TwigsBlocks.PURPLE_PACKED_SILT, new FabricItemSettings()));
    public static final Item BLUE_PACKED_SILT = register("blue_packed_silt", new BlockItem(TwigsBlocks.BLUE_PACKED_SILT, new FabricItemSettings()));
    public static final Item BROWN_PACKED_SILT =  register("brown_packed_silt", new BlockItem(TwigsBlocks.BROWN_PACKED_SILT, new FabricItemSettings()));
    public static final Item GREEN_PACKED_SILT =  register("green_packed_silt", new BlockItem(TwigsBlocks.GREEN_PACKED_SILT, new FabricItemSettings()));
    public static final Item RED_PACKED_SILT =  register("red_packed_silt", new BlockItem(TwigsBlocks.RED_PACKED_SILT, new FabricItemSettings()));
    public static final Item BLACK_PACKED_SILT =  register("black_packed_silt", new BlockItem(TwigsBlocks.BLACK_PACKED_SILT, new FabricItemSettings()));

    public static final Item SILT_SHINGLES = register("silt_shingles", new BlockItem(TwigsBlocks.SILT_SHINGLES, new FabricItemSettings()));
    public static final Item WHITE_SILT_SHINGLES = register("white_silt_shingles", new BlockItem(TwigsBlocks.WHITE_SILT_SHINGLES, new FabricItemSettings()));
    public static final Item ORANGE_SILT_SHINGLES = register("orange_silt_shingles", new BlockItem(TwigsBlocks.ORANGE_SILT_SHINGLES, new FabricItemSettings()));
    public static final Item MAGENTA_SILT_SHINGLES = register("magenta_silt_shingles", new BlockItem(TwigsBlocks.MAGENTA_SILT_SHINGLES, new FabricItemSettings()));
    public static final Item LIGHT_BLUE_SILT_SHINGLES = register("light_blue_silt_shingles", new BlockItem(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLES, new FabricItemSettings()));
    public static final Item YELLOW_SILT_SHINGLES = register("yellow_silt_shingles", new BlockItem(TwigsBlocks.YELLOW_SILT_SHINGLES, new FabricItemSettings()));
    public static final Item LIME_SILT_SHINGLES = register("lime_silt_shingles", new BlockItem(TwigsBlocks.LIME_SILT_SHINGLES, new FabricItemSettings()));
    public static final Item PINK_SILT_SHINGLES = register("pink_silt_shingles", new BlockItem(TwigsBlocks.PINK_SILT_SHINGLES, new FabricItemSettings()));
    public static final Item GRAY_SILT_SHINGLES = register("gray_silt_shingles", new BlockItem(TwigsBlocks.GRAY_SILT_SHINGLES, new FabricItemSettings()));
    public static final Item LIGHT_GRAY_SILT_SHINGLES = register("light_gray_silt_shingles", new BlockItem(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLES, new FabricItemSettings()));
    public static final Item CYAN_SILT_SHINGLES = register("cyan_silt_shingles", new BlockItem(TwigsBlocks.CYAN_SILT_SHINGLES, new FabricItemSettings()));
    public static final Item PURPLE_SILT_SHINGLES = register("purple_silt_shingles", new BlockItem(TwigsBlocks.PURPLE_SILT_SHINGLES, new FabricItemSettings()));
    public static final Item BLUE_SILT_SHINGLES = register("blue_silt_shingles", new BlockItem(TwigsBlocks.BLUE_SILT_SHINGLES, new FabricItemSettings()));
    public static final Item BROWN_SILT_SHINGLES =  register("brown_silt_shingles", new BlockItem(TwigsBlocks.BROWN_SILT_SHINGLES, new FabricItemSettings()));
    public static final Item GREEN_SILT_SHINGLES =  register("green_silt_shingles", new BlockItem(TwigsBlocks.GREEN_SILT_SHINGLES, new FabricItemSettings()));
    public static final Item RED_SILT_SHINGLES =  register("red_silt_shingles", new BlockItem(TwigsBlocks.RED_SILT_SHINGLES, new FabricItemSettings()));
    public static final Item BLACK_SILT_SHINGLES =  register("black_silt_shingles", new BlockItem(TwigsBlocks.BLACK_SILT_SHINGLES, new FabricItemSettings()));

    public static final Item SILT_SHINGLE_STAIRS = register("silt_shingle_stairs", new BlockItem(TwigsBlocks.SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item WHITE_SILT_SHINGLE_STAIRS = register("white_silt_shingle_stairs", new BlockItem(TwigsBlocks.WHITE_SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item ORANGE_SILT_SHINGLE_STAIRS = register("orange_silt_shingle_stairs", new BlockItem(TwigsBlocks.ORANGE_SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item MAGENTA_SILT_SHINGLE_STAIRS = register("magenta_silt_shingle_stairs", new BlockItem(TwigsBlocks.MAGENTA_SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item LIGHT_BLUE_SILT_SHINGLE_STAIRS = register("light_blue_silt_shingle_stairs", new BlockItem(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item YELLOW_SILT_SHINGLE_STAIRS = register("yellow_silt_shingle_stairs", new BlockItem(TwigsBlocks.YELLOW_SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item LIME_SILT_SHINGLE_STAIRS = register("lime_silt_shingle_stairs", new BlockItem(TwigsBlocks.LIME_SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item PINK_SILT_SHINGLE_STAIRS = register("pink_silt_shingle_stairs", new BlockItem(TwigsBlocks.PINK_SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item GRAY_SILT_SHINGLE_STAIRS = register("gray_silt_shingle_stairs", new BlockItem(TwigsBlocks.GRAY_SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item LIGHT_GRAY_SILT_SHINGLE_STAIRS = register("light_gray_silt_shingle_stairs", new BlockItem(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item CYAN_SILT_SHINGLE_STAIRS = register("cyan_silt_shingle_stairs", new BlockItem(TwigsBlocks.CYAN_SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item PURPLE_SILT_SHINGLE_STAIRS = register("purple_silt_shingle_stairs", new BlockItem(TwigsBlocks.PURPLE_SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item BLUE_SILT_SHINGLE_STAIRS = register("blue_silt_shingle_stairs", new BlockItem(TwigsBlocks.BLUE_SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item BROWN_SILT_SHINGLE_STAIRS =  register("brown_silt_shingle_stairs", new BlockItem(TwigsBlocks.BROWN_SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item GREEN_SILT_SHINGLE_STAIRS =  register("green_silt_shingle_stairs", new BlockItem(TwigsBlocks.GREEN_SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item RED_SILT_SHINGLE_STAIRS =  register("red_silt_shingle_stairs", new BlockItem(TwigsBlocks.RED_SILT_SHINGLE_STAIRS, new FabricItemSettings()));
    public static final Item BLACK_SILT_SHINGLE_STAIRS =  register("black_silt_shingle_stairs", new BlockItem(TwigsBlocks.BLACK_SILT_SHINGLE_STAIRS, new FabricItemSettings()));

    public static final Item SILT_SHINGLE_SLAB = register("silt_shingle_slab", new BlockItem(TwigsBlocks.SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item WHITE_SILT_SHINGLE_SLAB = register("white_silt_shingle_slab", new BlockItem(TwigsBlocks.WHITE_SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item ORANGE_SILT_SHINGLE_SLAB = register("orange_silt_shingle_slab", new BlockItem(TwigsBlocks.ORANGE_SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item MAGENTA_SILT_SHINGLE_SLAB = register("magenta_silt_shingle_slab", new BlockItem(TwigsBlocks.MAGENTA_SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item LIGHT_BLUE_SILT_SHINGLE_SLAB = register("light_blue_silt_shingle_slab", new BlockItem(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item YELLOW_SILT_SHINGLE_SLAB = register("yellow_silt_shingle_slab", new BlockItem(TwigsBlocks.YELLOW_SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item LIME_SILT_SHINGLE_SLAB = register("lime_silt_shingle_slab", new BlockItem(TwigsBlocks.LIME_SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item PINK_SILT_SHINGLE_SLAB = register("pink_silt_shingle_slab", new BlockItem(TwigsBlocks.PINK_SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item GRAY_SILT_SHINGLE_SLAB = register("gray_silt_shingle_slab", new BlockItem(TwigsBlocks.GRAY_SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item LIGHT_GRAY_SILT_SHINGLE_SLAB = register("light_gray_silt_shingle_slab", new BlockItem(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item CYAN_SILT_SHINGLE_SLAB = register("cyan_silt_shingle_slab", new BlockItem(TwigsBlocks.CYAN_SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item PURPLE_SILT_SHINGLE_SLAB = register("purple_silt_shingle_slab", new BlockItem(TwigsBlocks.PURPLE_SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item BLUE_SILT_SHINGLE_SLAB = register("blue_silt_shingle_slab", new BlockItem(TwigsBlocks.BLUE_SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item BROWN_SILT_SHINGLE_SLAB =  register("brown_silt_shingle_slab", new BlockItem(TwigsBlocks.BROWN_SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item GREEN_SILT_SHINGLE_SLAB =  register("green_silt_shingle_slab", new BlockItem(TwigsBlocks.GREEN_SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item RED_SILT_SHINGLE_SLAB =  register("red_silt_shingle_slab", new BlockItem(TwigsBlocks.RED_SILT_SHINGLE_SLAB, new FabricItemSettings()));
    public static final Item BLACK_SILT_SHINGLE_SLAB =  register("black_silt_shingle_slab", new BlockItem(TwigsBlocks.BLACK_SILT_SHINGLE_SLAB, new FabricItemSettings()));

    public static final Item SILT_SHINGLE_WALL = register("silt_shingle_wall", new BlockItem(TwigsBlocks.SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item WHITE_SILT_SHINGLE_WALL = register("white_silt_shingle_wall", new BlockItem(TwigsBlocks.WHITE_SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item ORANGE_SILT_SHINGLE_WALL = register("orange_silt_shingle_wall", new BlockItem(TwigsBlocks.ORANGE_SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item MAGENTA_SILT_SHINGLE_WALL = register("magenta_silt_shingle_wall", new BlockItem(TwigsBlocks.MAGENTA_SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item LIGHT_BLUE_SILT_SHINGLE_WALL = register("light_blue_silt_shingle_wall", new BlockItem(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item YELLOW_SILT_SHINGLE_WALL = register("yellow_silt_shingle_wall", new BlockItem(TwigsBlocks.YELLOW_SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item LIME_SILT_SHINGLE_WALL = register("lime_silt_shingle_wall", new BlockItem(TwigsBlocks.LIME_SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item PINK_SILT_SHINGLE_WALL = register("pink_silt_shingle_wall", new BlockItem(TwigsBlocks.PINK_SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item GRAY_SILT_SHINGLE_WALL = register("gray_silt_shingle_wall", new BlockItem(TwigsBlocks.GRAY_SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item LIGHT_GRAY_SILT_SHINGLE_WALL = register("light_gray_silt_shingle_wall", new BlockItem(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item CYAN_SILT_SHINGLE_WALL = register("cyan_silt_shingle_wall", new BlockItem(TwigsBlocks.CYAN_SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item PURPLE_SILT_SHINGLE_WALL = register("purple_silt_shingle_wall", new BlockItem(TwigsBlocks.PURPLE_SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item BLUE_SILT_SHINGLE_WALL = register("blue_silt_shingle_wall", new BlockItem(TwigsBlocks.BLUE_SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item BROWN_SILT_SHINGLE_WALL =  register("brown_silt_shingle_wall", new BlockItem(TwigsBlocks.BROWN_SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item GREEN_SILT_SHINGLE_WALL =  register("green_silt_shingle_wall", new BlockItem(TwigsBlocks.GREEN_SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item RED_SILT_SHINGLE_WALL =  register("red_silt_shingle_wall", new BlockItem(TwigsBlocks.RED_SILT_SHINGLE_WALL, new FabricItemSettings()));
    public static final Item BLACK_SILT_SHINGLE_WALL =  register("black_silt_shingle_wall", new BlockItem(TwigsBlocks.BLACK_SILT_SHINGLE_WALL, new FabricItemSettings()));

    static {
        CompostingChanceRegistry composting = CompostingChanceRegistry.INSTANCE;
        composting.add(BAMBOO_LEAVES, 0.3F);
    }

    private static Item register(String id, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Twigs.MOD_ID, id), item);
    }
}
