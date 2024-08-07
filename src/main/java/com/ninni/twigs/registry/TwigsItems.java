package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.item.InstrumentBlockItem;
import com.ninni.twigs.item.PebbleItem;
import com.ninni.twigs.item.TwigItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Twigs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TwigsItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Twigs.MOD_ID);

    //logo
    public static final RegistryObject<Item> TWIGS = ITEMS.register("twigs", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).fireResistant()));

    //collectibles
    public static final RegistryObject<Item> AZALEA_FLOWERS = ITEMS.register("azalea_flowers", () -> new BlockItem(TwigsBlocks.AZALEA_FLOWERS.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWIG = ITEMS.register("twig", () -> new TwigItem(TwigsBlocks.TWIG.get(), new Item.Properties()));
    public static final RegistryObject<Item> PEBBLE = ITEMS.register("pebble", () -> new PebbleItem(TwigsBlocks.PEBBLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRONZED_SEASHELL = ITEMS.register("bronzed_seashell", () -> new InstrumentBlockItem(TwigsBlocks.BRONZED_SEASHELL.get(), new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1)));
    public static final RegistryObject<Item> OPALINE_SEASHELL = ITEMS.register("opaline_seashell", () -> new BlockItem(TwigsBlocks.OPALINE_SEASHELL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEATE_SEASHELL = ITEMS.register("roseate_seashell", () -> new BlockItem(TwigsBlocks.ROSEATE_SEASHELL.get(), new Item.Properties()));
    public static final RegistryObject<Item> TANGERINE_SEASHELL = ITEMS.register("tangerine_seashell", () -> new BlockItem(TwigsBlocks.TANGERINE_SEASHELL.get(), new Item.Properties()));

    //bamboo
    public static final RegistryObject<Item> BAMBOO_LEAVES = ITEMS.register("bamboo_leaves", () -> new BlockItem(TwigsBlocks.BAMBOO_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_THATCH = ITEMS.register("bamboo_thatch", () -> new BlockItem(TwigsBlocks.BAMBOO_THATCH.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_THATCH_SLAB = ITEMS.register("bamboo_thatch_slab", () -> new BlockItem(TwigsBlocks.BAMBOO_THATCH_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_MAT = ITEMS.register("bamboo_mat", () -> new BlockItem(TwigsBlocks.BAMBOO_MAT.get(), new Item.Properties()));

    //paper lanterns
    public static final RegistryObject<Item> PAPER_LANTERN = ITEMS.register("paper_lantern", () -> new BlockItem(TwigsBlocks.PAPER_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALLIUM_PAPER_LANTERN = ITEMS.register("allium_paper_lantern", () -> new BlockItem(TwigsBlocks.ALLIUM_PAPER_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_ORCHID_PAPER_LANTERN = ITEMS.register("blue_orchid_paper_lantern", () -> new BlockItem(TwigsBlocks.BLUE_ORCHID_PAPER_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_ROOTS_PAPER_LANTERN = ITEMS.register("crimson_roots_paper_lantern", () -> new BlockItem(TwigsBlocks.CRIMSON_ROOTS_PAPER_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> DANDELION_PAPER_LANTERN = ITEMS.register("dandelion_paper_lantern", () -> new BlockItem(TwigsBlocks.DANDELION_PAPER_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> TORCHFLOWER_PAPER_LANTERN = ITEMS.register("torchflower_paper_lantern", () -> new BlockItem(TwigsBlocks.TORCHFLOWER_PAPER_LANTERN.get(), new Item.Properties()));

    //lamps
    public static final RegistryObject<Item> LAMP = ITEMS.register("lamp", () -> new BlockItem(TwigsBlocks.LAMP.get(), new Item.Properties()));
    public static final RegistryObject<Item> SOUL_LAMP = ITEMS.register("soul_lamp", () -> new BlockItem(TwigsBlocks.SOUL_LAMP.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_SHROOMLAMP = ITEMS.register("crimson_shroomlamp", () -> new BlockItem(TwigsBlocks.CRIMSON_SHROOMLAMP.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SHROOMLAMP = ITEMS.register("warped_shroomlamp", () -> new BlockItem(TwigsBlocks.WARPED_SHROOMLAMP.get(), new Item.Properties()));

    //tables
    public static final RegistryObject<Item> OAK_TABLE = ITEMS.register("oak_table", () -> new BlockItem(TwigsBlocks.OAK_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_TABLE = ITEMS.register("spruce_table", () -> new BlockItem(TwigsBlocks.SPRUCE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_TABLE = ITEMS.register("birch_table", () -> new BlockItem(TwigsBlocks.BIRCH_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_TABLE = ITEMS.register("jungle_table", () -> new BlockItem(TwigsBlocks.JUNGLE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_TABLE = ITEMS.register("acacia_table", () -> new BlockItem(TwigsBlocks.ACACIA_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_TABLE = ITEMS.register("dark_oak_table", () -> new BlockItem(TwigsBlocks.DARK_OAK_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_TABLE = ITEMS.register("mangrove_table", () -> new BlockItem(TwigsBlocks.MANGROVE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_TABLE = ITEMS.register("cherry_table", () -> new BlockItem(TwigsBlocks.CHERRY_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_TABLE = ITEMS.register("bamboo_table", () -> new BlockItem(TwigsBlocks.BAMBOO_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_TABLE = ITEMS.register("crimson_table", () -> new BlockItem(TwigsBlocks.CRIMSON_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_TABLE = ITEMS.register("warped_table", () -> new BlockItem(TwigsBlocks.WARPED_TABLE.get(), new Item.Properties()));

    //basalt blocks
    public static final RegistryObject<Item> POLISHED_BASALT_BRICKS = ITEMS.register("polished_basalt_bricks", () -> new BlockItem(TwigsBlocks.POLISHED_BASALT_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_BASALT_BRICKS = ITEMS.register("smooth_basalt_bricks", () -> new BlockItem(TwigsBlocks.SMOOTH_BASALT_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_BASALT_BRICK_STAIRS = ITEMS.register("smooth_basalt_brick_stairs", () -> new BlockItem(TwigsBlocks.SMOOTH_BASALT_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_BASALT_BRICK_SLAB = ITEMS.register("smooth_basalt_brick_slab", () -> new BlockItem(TwigsBlocks.SMOOTH_BASALT_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_BASALT_BRICK_WALL = ITEMS.register("smooth_basalt_brick_wall", () -> new BlockItem(TwigsBlocks.SMOOTH_BASALT_BRICK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_SMOOTH_BASALT_BRICKS = ITEMS.register("chiseled_smooth_basalt_bricks", () -> new BlockItem(TwigsBlocks.CHISELED_SMOOTH_BASALT_BRICKS.get(), new Item.Properties()));

    //bricks
    public static final RegistryObject<Item> MIXED_BRICKS = ITEMS.register("mixed_bricks", () -> new BlockItem(TwigsBlocks.MIXED_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_BRICKS = ITEMS.register("chiseled_bricks", () -> new BlockItem(TwigsBlocks.CHISELED_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_BRICKS = ITEMS.register("cracked_bricks", () -> new BlockItem(TwigsBlocks.CRACKED_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_BRICKS = ITEMS.register("mossy_bricks", () -> new BlockItem(TwigsBlocks.MOSSY_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_BRICK_STAIRS = ITEMS.register("mossy_brick_stairs", () -> new BlockItem(TwigsBlocks.MOSSY_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_BRICK_SLAB = ITEMS.register("mossy_brick_slab", () -> new BlockItem(TwigsBlocks.MOSSY_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_BRICK_WALL = ITEMS.register("mossy_brick_wall", () -> new BlockItem(TwigsBlocks.MOSSY_BRICK_WALL.get(), new Item.Properties()));

    //gravel bricks
    public static final RegistryObject<Item> GRAVEL_BRICKS = ITEMS.register("gravel_bricks", () -> new BlockItem(TwigsBlocks.GRAVEL_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAVEL_BRICK_STAIRS = ITEMS.register("gravel_brick_stairs", () -> new BlockItem(TwigsBlocks.GRAVEL_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAVEL_BRICK_SLAB = ITEMS.register("gravel_brick_slab", () -> new BlockItem(TwigsBlocks.GRAVEL_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAVEL_BRICK_WALL = ITEMS.register("gravel_brick_wall", () -> new BlockItem(TwigsBlocks.GRAVEL_BRICK_WALL.get(), new Item.Properties()));

    //smooth stone bricks
    public static final RegistryObject<Item> SMOOTH_STONE_BRICKS = ITEMS.register("smooth_stone_bricks", () -> new BlockItem(TwigsBlocks.SMOOTH_STONE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_STONE_BRICK_STAIRS = ITEMS.register("smooth_stone_brick_stairs", () -> new BlockItem(TwigsBlocks.SMOOTH_STONE_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_STONE_BRICK_SLAB = ITEMS.register("smooth_stone_brick_slab", () -> new BlockItem(TwigsBlocks.SMOOTH_STONE_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_STONE_BRICK_WALL = ITEMS.register("smooth_stone_brick_wall", () -> new BlockItem(TwigsBlocks.SMOOTH_STONE_BRICK_WALL.get(), new Item.Properties()));

    //columns
    public static final RegistryObject<Item> QUARTZ_COLUMN = ITEMS.register("quartz_column", () -> new BlockItem(TwigsBlocks.QUARTZ_COLUMN.get(), new Item.Properties()));
    public static final RegistryObject<Item> STONE_COLUMN = ITEMS.register("stone_column", () -> new BlockItem(TwigsBlocks.STONE_COLUMN.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_COLUMN = ITEMS.register("deepslate_column", () -> new BlockItem(TwigsBlocks.DEEPSLATE_COLUMN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKSTONE_COLUMN = ITEMS.register("blackstone_column", () -> new BlockItem(TwigsBlocks.BLACKSTONE_COLUMN.get(), new Item.Properties()));

    //copper pillars
    public static final RegistryObject<Item> COPPER_PILLAR = ITEMS.register("copper_pillar", () -> new BlockItem(TwigsBlocks.COPPER_PILLAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_PILLAR = ITEMS.register("exposed_copper_pillar", () -> new BlockItem(TwigsBlocks.EXPOSED_COPPER_PILLAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_PILLAR = ITEMS.register("weathered_copper_pillar", () -> new BlockItem(TwigsBlocks.WEATHERED_COPPER_PILLAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_PILLAR = ITEMS.register("oxidized_copper_pillar", () -> new BlockItem(TwigsBlocks.OXIDIZED_COPPER_PILLAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_PILLAR = ITEMS.register("waxed_copper_pillar", () -> new BlockItem(TwigsBlocks.WAXED_COPPER_PILLAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_EXPOSED_COPPER_PILLAR = ITEMS.register("waxed_exposed_copper_pillar", () -> new BlockItem(TwigsBlocks.WAXED_EXPOSED_COPPER_PILLAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_WEATHERED_COPPER_PILLAR = ITEMS.register("waxed_weathered_copper_pillar", () -> new BlockItem(TwigsBlocks.WAXED_WEATHERED_COPPER_PILLAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_OXIDIZED_COPPER_PILLAR = ITEMS.register("waxed_oxidized_copper_pillar", () -> new BlockItem(TwigsBlocks.WAXED_OXIDIZED_COPPER_PILLAR.get(), new Item.Properties()));

    //amethyst blocks
    public static final RegistryObject<Item> POLISHED_AMETHYST = ITEMS.register("polished_amethyst", () -> new BlockItem(TwigsBlocks.POLISHED_AMETHYST.get(), new Item.Properties()));
    public static final RegistryObject<Item> CUT_AMETHYST = ITEMS.register("cut_amethyst", () -> new BlockItem(TwigsBlocks.CUT_AMETHYST.get(), new Item.Properties()));

    //misc
    public static final RegistryObject<Item> PETRIFIED_LICHEN = ITEMS.register("petrified_lichen", () -> new BlockItem(TwigsBlocks.PETRIFIED_LICHEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> COMPACTED_DRIPSTONE = ITEMS.register("compacted_dripstone", () -> new BlockItem(TwigsBlocks.COMPACTED_DRIPSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROCKY_DIRT = ITEMS.register("rocky_dirt", () -> new BlockItem(TwigsBlocks.ROCKY_DIRT.get(), new Item.Properties()));

    //cobblestone bricks
    public static final RegistryObject<Item> COBBLESTONE_BRICKS = ITEMS.register("cobblestone_bricks", () -> new BlockItem(TwigsBlocks.COBBLESTONE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_BRICK_STAIRS = ITEMS.register("cobblestone_brick_stairs", () -> new BlockItem(TwigsBlocks.COBBLESTONE_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_BRICK_SLAB = ITEMS.register("cobblestone_brick_slab", () -> new BlockItem(TwigsBlocks.COBBLESTONE_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_BRICK_WALL = ITEMS.register("cobblestone_brick_wall", () -> new BlockItem(TwigsBlocks.COBBLESTONE_BRICK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_COBBLESTONE_BRICKS = ITEMS.register("cracked_cobblestone_bricks", () -> new BlockItem(TwigsBlocks.CRACKED_COBBLESTONE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_BRICKS = ITEMS.register("mossy_cobblestone_bricks", () -> new BlockItem(TwigsBlocks.MOSSY_COBBLESTONE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_BRICK_STAIRS = ITEMS.register("mossy_cobblestone_brick_stairs", () -> new BlockItem(TwigsBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_BRICK_SLAB = ITEMS.register("mossy_cobblestone_brick_slab", () -> new BlockItem(TwigsBlocks.MOSSY_COBBLESTONE_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_BRICK_WALL = ITEMS.register("mossy_cobblestone_brick_wall", () -> new BlockItem(TwigsBlocks.MOSSY_COBBLESTONE_BRICK_WALL.get(), new Item.Properties()));

    //decorated blackstone bricks
    public static final RegistryObject<Item> TWISTING_POLISHED_BLACKSTONE_BRICKS = ITEMS.register("twisting_polished_blackstone_bricks", () -> new BlockItem(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS = ITEMS.register("twisting_polished_blackstone_brick_stairs", () -> new BlockItem(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB = ITEMS.register("twisting_polished_blackstone_brick_slab", () -> new BlockItem(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWISTING_POLISHED_BLACKSTONE_BRICK_WALL = ITEMS.register("twisting_polished_blackstone_brick_wall", () -> new BlockItem(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEEPING_POLISHED_BLACKSTONE_BRICKS = ITEMS.register("weeping_polished_blackstone_bricks", () -> new BlockItem(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS = ITEMS.register("weeping_polished_blackstone_brick_stairs", () -> new BlockItem(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB = ITEMS.register("weeping_polished_blackstone_brick_slab", () -> new BlockItem(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEEPING_POLISHED_BLACKSTONE_BRICK_WALL = ITEMS.register("weeping_polished_blackstone_brick_wall", () -> new BlockItem(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_WALL.get(), new Item.Properties()));

    //tuff blocks
    public static final RegistryObject<Item> POLISHED_TUFF = ITEMS.register("polished_tuff", () -> new BlockItem(TwigsBlocks.POLISHED_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_TUFF_STAIRS = ITEMS.register("polished_tuff_stairs", () -> new BlockItem(TwigsBlocks.POLISHED_TUFF_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_TUFF_SLAB = ITEMS.register("polished_tuff_slab", () -> new BlockItem(TwigsBlocks.POLISHED_TUFF_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_TUFF_BRICKS = ITEMS.register("polished_tuff_bricks", () -> new BlockItem(TwigsBlocks.POLISHED_TUFF_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_TUFF_BRICK_STAIRS = ITEMS.register("polished_tuff_brick_stairs", () -> new BlockItem(TwigsBlocks.POLISHED_TUFF_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_TUFF_BRICK_SLAB = ITEMS.register("polished_tuff_brick_slab", () -> new BlockItem(TwigsBlocks.POLISHED_TUFF_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_TUFF_BRICK_WALL = ITEMS.register("polished_tuff_brick_wall", () -> new BlockItem(TwigsBlocks.POLISHED_TUFF_BRICK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_POLISHED_TUFF_BRICKS = ITEMS.register("cracked_polished_tuff_bricks", () -> new BlockItem(TwigsBlocks.CRACKED_POLISHED_TUFF_BRICKS.get(), new Item.Properties()));

    //calcite blocks
    public static final RegistryObject<Item> CALCITE_STAIRS = ITEMS.register("calcite_stairs", () -> new BlockItem(TwigsBlocks.CALCITE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CALCITE_SLAB = ITEMS.register("calcite_slab", () -> new BlockItem(TwigsBlocks.CALCITE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CALCITE_WALL = ITEMS.register("calcite_wall", () -> new BlockItem(TwigsBlocks.CALCITE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_CALCITE = ITEMS.register("polished_calcite", () -> new BlockItem(TwigsBlocks.POLISHED_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_CALCITE_STAIRS = ITEMS.register("polished_calcite_stairs", () -> new BlockItem(TwigsBlocks.POLISHED_CALCITE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_CALCITE_SLAB = ITEMS.register("polished_calcite_slab", () -> new BlockItem(TwigsBlocks.POLISHED_CALCITE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_CALCITE_BRICKS = ITEMS.register("polished_calcite_bricks", () -> new BlockItem(TwigsBlocks.POLISHED_CALCITE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_CALCITE_BRICK_STAIRS = ITEMS.register("polished_calcite_brick_stairs", () -> new BlockItem(TwigsBlocks.POLISHED_CALCITE_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_CALCITE_BRICK_SLAB = ITEMS.register("polished_calcite_brick_slab", () -> new BlockItem(TwigsBlocks.POLISHED_CALCITE_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_CALCITE_BRICK_WALL = ITEMS.register("polished_calcite_brick_wall", () -> new BlockItem(TwigsBlocks.POLISHED_CALCITE_BRICK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_POLISHED_CALCITE_BRICKS = ITEMS.register("cracked_polished_calcite_bricks", () -> new BlockItem(TwigsBlocks.CRACKED_POLISHED_CALCITE_BRICKS.get(), new Item.Properties()));

    //schist blocks
    public static final RegistryObject<Item> SCHIST = ITEMS.register("schist", () -> new BlockItem(TwigsBlocks.SCHIST.get(), new Item.Properties()));
    public static final RegistryObject<Item> SCHIST_STAIRS = ITEMS.register("schist_stairs", () -> new BlockItem(TwigsBlocks.SCHIST_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SCHIST_SLAB = ITEMS.register("schist_slab", () -> new BlockItem(TwigsBlocks.SCHIST_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SCHIST_WALL = ITEMS.register("schist_wall", () -> new BlockItem(TwigsBlocks.SCHIST_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_SCHIST = ITEMS.register("polished_schist", () -> new BlockItem(TwigsBlocks.POLISHED_SCHIST.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_SCHIST_STAIRS = ITEMS.register("polished_schist_stairs", () -> new BlockItem(TwigsBlocks.POLISHED_SCHIST_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_SCHIST_SLAB = ITEMS.register("polished_schist_slab", () -> new BlockItem(TwigsBlocks.POLISHED_SCHIST_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_SCHIST_BRICKS = ITEMS.register("polished_schist_bricks", () -> new BlockItem(TwigsBlocks.POLISHED_SCHIST_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_SCHIST_BRICK_STAIRS = ITEMS.register("polished_schist_brick_stairs", () -> new BlockItem(TwigsBlocks.POLISHED_SCHIST_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_SCHIST_BRICK_SLAB = ITEMS.register("polished_schist_brick_slab", () -> new BlockItem(TwigsBlocks.POLISHED_SCHIST_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_SCHIST_BRICK_WALL = ITEMS.register("polished_schist_brick_wall", () -> new BlockItem(TwigsBlocks.POLISHED_SCHIST_BRICK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_POLISHED_SCHIST_BRICKS = ITEMS.register("cracked_polished_schist_bricks", () -> new BlockItem(TwigsBlocks.CRACKED_POLISHED_SCHIST_BRICKS.get(), new Item.Properties()));

    //rhyolite blocks
    public static final RegistryObject<Item> RHYOLITE = ITEMS.register("rhyolite", () -> new BlockItem(TwigsBlocks.RHYOLITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> RHYOLITE_STAIRS = ITEMS.register("rhyolite_stairs", () -> new BlockItem(TwigsBlocks.RHYOLITE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> RHYOLITE_SLAB = ITEMS.register("rhyolite_slab", () -> new BlockItem(TwigsBlocks.RHYOLITE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> RHYOLITE_WALL = ITEMS.register("rhyolite_wall", () -> new BlockItem(TwigsBlocks.RHYOLITE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_RHYOLITE = ITEMS.register("polished_rhyolite", () -> new BlockItem(TwigsBlocks.POLISHED_RHYOLITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_RHYOLITE_STAIRS = ITEMS.register("polished_rhyolite_stairs", () -> new BlockItem(TwigsBlocks.POLISHED_RHYOLITE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_RHYOLITE_SLAB = ITEMS.register("polished_rhyolite_slab", () -> new BlockItem(TwigsBlocks.POLISHED_RHYOLITE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_RHYOLITE_BRICKS = ITEMS.register("polished_rhyolite_bricks", () -> new BlockItem(TwigsBlocks.POLISHED_RHYOLITE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_RHYOLITE_BRICK_STAIRS = ITEMS.register("polished_rhyolite_brick_stairs", () -> new BlockItem(TwigsBlocks.POLISHED_RHYOLITE_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_RHYOLITE_BRICK_SLAB = ITEMS.register("polished_rhyolite_brick_slab", () -> new BlockItem(TwigsBlocks.POLISHED_RHYOLITE_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_RHYOLITE_BRICK_WALL = ITEMS.register("polished_rhyolite_brick_wall", () -> new BlockItem(TwigsBlocks.POLISHED_RHYOLITE_BRICK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_POLISHED_RHYOLITE_BRICKS = ITEMS.register("cracked_polished_rhyolite_bricks", () -> new BlockItem(TwigsBlocks.CRACKED_POLISHED_RHYOLITE_BRICKS.get(), new Item.Properties()));

    //bloodstone blocks
    public static final RegistryObject<Item> BLOODSTONE = ITEMS.register("bloodstone", () -> new BlockItem(TwigsBlocks.BLOODSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODSTONE_STAIRS = ITEMS.register("bloodstone_stairs", () -> new BlockItem(TwigsBlocks.BLOODSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODSTONE_SLAB = ITEMS.register("bloodstone_slab", () -> new BlockItem(TwigsBlocks.BLOODSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODSTONE_WALL = ITEMS.register("bloodstone_wall", () -> new BlockItem(TwigsBlocks.BLOODSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BLOODSTONE = ITEMS.register("polished_bloodstone", () -> new BlockItem(TwigsBlocks.POLISHED_BLOODSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BLOODSTONE_STAIRS = ITEMS.register("polished_bloodstone_stairs", () -> new BlockItem(TwigsBlocks.POLISHED_BLOODSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BLOODSTONE_SLAB = ITEMS.register("polished_bloodstone_slab", () -> new BlockItem(TwigsBlocks.POLISHED_BLOODSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BLOODSTONE_BRICKS = ITEMS.register("polished_bloodstone_bricks", () -> new BlockItem(TwigsBlocks.POLISHED_BLOODSTONE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BLOODSTONE_BRICK_STAIRS = ITEMS.register("polished_bloodstone_brick_stairs", () -> new BlockItem(TwigsBlocks.POLISHED_BLOODSTONE_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BLOODSTONE_BRICK_SLAB = ITEMS.register("polished_bloodstone_brick_slab", () -> new BlockItem(TwigsBlocks.POLISHED_BLOODSTONE_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BLOODSTONE_BRICK_WALL = ITEMS.register("polished_bloodstone_brick_wall", () -> new BlockItem(TwigsBlocks.POLISHED_BLOODSTONE_BRICK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_POLISHED_BLOODSTONE_BRICKS = ITEMS.register("cracked_polished_bloodstone_bricks", () -> new BlockItem(TwigsBlocks.CRACKED_POLISHED_BLOODSTONE_BRICKS.get(), new Item.Properties()));

    //silt blocks
    public static final RegistryObject<Item> SILT = ITEMS.register("silt", () -> new BlockItem(TwigsBlocks.SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILT_BALL = ITEMS.register("silt_ball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILT_BRICK = ITEMS.register("silt_brick", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILT_BRICKS = ITEMS.register("silt_bricks", () -> new BlockItem(TwigsBlocks.SILT_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILT_BRICK_STAIRS = ITEMS.register("silt_brick_stairs", () -> new BlockItem(TwigsBlocks.SILT_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILT_BRICK_SLAB = ITEMS.register("silt_brick_slab", () -> new BlockItem(TwigsBlocks.SILT_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILT_BRICK_WALL = ITEMS.register("silt_brick_wall", () -> new BlockItem(TwigsBlocks.SILT_BRICK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MIXED_SILT_BRICKS = ITEMS.register("mixed_silt_bricks", () -> new BlockItem(TwigsBlocks.MIXED_SILT_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_SILT_BRICKS = ITEMS.register("chiseled_silt_bricks", () -> new BlockItem(TwigsBlocks.CHISELED_SILT_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_SILT_BRICKS = ITEMS.register("cracked_silt_bricks", () -> new BlockItem(TwigsBlocks.CRACKED_SILT_BRICKS.get(), new Item.Properties()));

    public static final RegistryObject<Item> SILT_POT = ITEMS.register("silt_pot", () -> new BlockItem(TwigsBlocks.SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SILT_POT = ITEMS.register("white_silt_pot", () -> new BlockItem(TwigsBlocks.WHITE_SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SILT_POT = ITEMS.register("orange_silt_pot", () -> new BlockItem(TwigsBlocks.ORANGE_SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_SILT_POT = ITEMS.register("magenta_silt_pot", () -> new BlockItem(TwigsBlocks.MAGENTA_SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_SILT_POT = ITEMS.register("light_blue_silt_pot", () -> new BlockItem(TwigsBlocks.LIGHT_BLUE_SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SILT_POT = ITEMS.register("yellow_silt_pot", () -> new BlockItem(TwigsBlocks.YELLOW_SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_SILT_POT = ITEMS.register("lime_silt_pot", () -> new BlockItem(TwigsBlocks.LIME_SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SILT_POT = ITEMS.register("pink_silt_pot", () -> new BlockItem(TwigsBlocks.PINK_SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_SILT_POT = ITEMS.register("gray_silt_pot", () -> new BlockItem(TwigsBlocks.GRAY_SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_SILT_POT = ITEMS.register("light_gray_silt_pot", () -> new BlockItem(TwigsBlocks.LIGHT_GRAY_SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_SILT_POT = ITEMS.register("cyan_silt_pot", () -> new BlockItem(TwigsBlocks.CYAN_SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_SILT_POT = ITEMS.register("purple_silt_pot", () -> new BlockItem(TwigsBlocks.PURPLE_SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SILT_POT = ITEMS.register("blue_silt_pot", () -> new BlockItem(TwigsBlocks.BLUE_SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_SILT_POT =  ITEMS.register("brown_silt_pot", () -> new BlockItem(TwigsBlocks.BROWN_SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SILT_POT =  ITEMS.register("green_silt_pot", () -> new BlockItem(TwigsBlocks.GREEN_SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SILT_POT =  ITEMS.register("red_silt_pot", () -> new BlockItem(TwigsBlocks.RED_SILT_POT.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_SILT_POT =  ITEMS.register("black_silt_pot", () -> new BlockItem(TwigsBlocks.BLACK_SILT_POT.get(), new Item.Properties()));

    public static final RegistryObject<Item> PACKED_SILT = ITEMS.register("packed_silt", () -> new BlockItem(TwigsBlocks.PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_PACKED_SILT = ITEMS.register("white_packed_silt", () -> new BlockItem(TwigsBlocks.WHITE_PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_PACKED_SILT = ITEMS.register("orange_packed_silt", () -> new BlockItem(TwigsBlocks.ORANGE_PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_PACKED_SILT = ITEMS.register("magenta_packed_silt", () -> new BlockItem(TwigsBlocks.MAGENTA_PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_PACKED_SILT = ITEMS.register("light_blue_packed_silt", () -> new BlockItem(TwigsBlocks.LIGHT_BLUE_PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_PACKED_SILT = ITEMS.register("yellow_packed_silt", () -> new BlockItem(TwigsBlocks.YELLOW_PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_PACKED_SILT = ITEMS.register("lime_packed_silt", () -> new BlockItem(TwigsBlocks.LIME_PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_PACKED_SILT = ITEMS.register("pink_packed_silt", () -> new BlockItem(TwigsBlocks.PINK_PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_PACKED_SILT = ITEMS.register("gray_packed_silt", () -> new BlockItem(TwigsBlocks.GRAY_PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_PACKED_SILT = ITEMS.register("light_gray_packed_silt", () -> new BlockItem(TwigsBlocks.LIGHT_GRAY_PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_PACKED_SILT = ITEMS.register("cyan_packed_silt", () -> new BlockItem(TwigsBlocks.CYAN_PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_PACKED_SILT = ITEMS.register("purple_packed_silt", () -> new BlockItem(TwigsBlocks.PURPLE_PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_PACKED_SILT = ITEMS.register("blue_packed_silt", () -> new BlockItem(TwigsBlocks.BLUE_PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_PACKED_SILT =  ITEMS.register("brown_packed_silt", () -> new BlockItem(TwigsBlocks.BROWN_PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_PACKED_SILT =  ITEMS.register("green_packed_silt", () -> new BlockItem(TwigsBlocks.GREEN_PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_PACKED_SILT =  ITEMS.register("red_packed_silt", () -> new BlockItem(TwigsBlocks.RED_PACKED_SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_PACKED_SILT =  ITEMS.register("black_packed_silt", () -> new BlockItem(TwigsBlocks.BLACK_PACKED_SILT.get(), new Item.Properties()));

    public static final RegistryObject<Item> SILT_SHINGLES = ITEMS.register("silt_shingles", () -> new BlockItem(TwigsBlocks.SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SILT_SHINGLES = ITEMS.register("white_silt_shingles", () -> new BlockItem(TwigsBlocks.WHITE_SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SILT_SHINGLES = ITEMS.register("orange_silt_shingles", () -> new BlockItem(TwigsBlocks.ORANGE_SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_SILT_SHINGLES = ITEMS.register("magenta_silt_shingles", () -> new BlockItem(TwigsBlocks.MAGENTA_SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_SILT_SHINGLES = ITEMS.register("light_blue_silt_shingles", () -> new BlockItem(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SILT_SHINGLES = ITEMS.register("yellow_silt_shingles", () -> new BlockItem(TwigsBlocks.YELLOW_SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_SILT_SHINGLES = ITEMS.register("lime_silt_shingles", () -> new BlockItem(TwigsBlocks.LIME_SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SILT_SHINGLES = ITEMS.register("pink_silt_shingles", () -> new BlockItem(TwigsBlocks.PINK_SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_SILT_SHINGLES = ITEMS.register("gray_silt_shingles", () -> new BlockItem(TwigsBlocks.GRAY_SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_SILT_SHINGLES = ITEMS.register("light_gray_silt_shingles", () -> new BlockItem(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_SILT_SHINGLES = ITEMS.register("cyan_silt_shingles", () -> new BlockItem(TwigsBlocks.CYAN_SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_SILT_SHINGLES = ITEMS.register("purple_silt_shingles", () -> new BlockItem(TwigsBlocks.PURPLE_SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SILT_SHINGLES = ITEMS.register("blue_silt_shingles", () -> new BlockItem(TwigsBlocks.BLUE_SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_SILT_SHINGLES =  ITEMS.register("brown_silt_shingles", () -> new BlockItem(TwigsBlocks.BROWN_SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SILT_SHINGLES =  ITEMS.register("green_silt_shingles", () -> new BlockItem(TwigsBlocks.GREEN_SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SILT_SHINGLES =  ITEMS.register("red_silt_shingles", () -> new BlockItem(TwigsBlocks.RED_SILT_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_SILT_SHINGLES =  ITEMS.register("black_silt_shingles", () -> new BlockItem(TwigsBlocks.BLACK_SILT_SHINGLES.get(), new Item.Properties()));

    public static final RegistryObject<Item> SILT_SHINGLE_STAIRS = ITEMS.register("silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SILT_SHINGLE_STAIRS = ITEMS.register("white_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.WHITE_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SILT_SHINGLE_STAIRS = ITEMS.register("orange_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.ORANGE_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_SILT_SHINGLE_STAIRS = ITEMS.register("magenta_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.MAGENTA_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_SILT_SHINGLE_STAIRS = ITEMS.register("light_blue_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SILT_SHINGLE_STAIRS = ITEMS.register("yellow_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.YELLOW_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_SILT_SHINGLE_STAIRS = ITEMS.register("lime_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.LIME_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SILT_SHINGLE_STAIRS = ITEMS.register("pink_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.PINK_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_SILT_SHINGLE_STAIRS = ITEMS.register("gray_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.GRAY_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_SILT_SHINGLE_STAIRS = ITEMS.register("light_gray_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_SILT_SHINGLE_STAIRS = ITEMS.register("cyan_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.CYAN_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_SILT_SHINGLE_STAIRS = ITEMS.register("purple_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.PURPLE_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SILT_SHINGLE_STAIRS = ITEMS.register("blue_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.BLUE_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_SILT_SHINGLE_STAIRS =  ITEMS.register("brown_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.BROWN_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SILT_SHINGLE_STAIRS =  ITEMS.register("green_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.GREEN_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SILT_SHINGLE_STAIRS =  ITEMS.register("red_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.RED_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_SILT_SHINGLE_STAIRS =  ITEMS.register("black_silt_shingle_stairs", () -> new BlockItem(TwigsBlocks.BLACK_SILT_SHINGLE_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> SILT_SHINGLE_SLAB = ITEMS.register("silt_shingle_slab", () -> new BlockItem(TwigsBlocks.SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SILT_SHINGLE_SLAB = ITEMS.register("white_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.WHITE_SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SILT_SHINGLE_SLAB = ITEMS.register("orange_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.ORANGE_SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_SILT_SHINGLE_SLAB = ITEMS.register("magenta_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.MAGENTA_SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_SILT_SHINGLE_SLAB = ITEMS.register("light_blue_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SILT_SHINGLE_SLAB = ITEMS.register("yellow_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.YELLOW_SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_SILT_SHINGLE_SLAB = ITEMS.register("lime_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.LIME_SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SILT_SHINGLE_SLAB = ITEMS.register("pink_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.PINK_SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_SILT_SHINGLE_SLAB = ITEMS.register("gray_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.GRAY_SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_SILT_SHINGLE_SLAB = ITEMS.register("light_gray_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_SILT_SHINGLE_SLAB = ITEMS.register("cyan_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.CYAN_SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_SILT_SHINGLE_SLAB = ITEMS.register("purple_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.PURPLE_SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SILT_SHINGLE_SLAB = ITEMS.register("blue_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.BLUE_SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_SILT_SHINGLE_SLAB =  ITEMS.register("brown_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.BROWN_SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SILT_SHINGLE_SLAB =  ITEMS.register("green_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.GREEN_SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SILT_SHINGLE_SLAB =  ITEMS.register("red_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.RED_SILT_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_SILT_SHINGLE_SLAB =  ITEMS.register("black_silt_shingle_slab", () -> new BlockItem(TwigsBlocks.BLACK_SILT_SHINGLE_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> SILT_SHINGLE_WALL = ITEMS.register("silt_shingle_wall", () -> new BlockItem(TwigsBlocks.SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SILT_SHINGLE_WALL = ITEMS.register("white_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.WHITE_SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SILT_SHINGLE_WALL = ITEMS.register("orange_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.ORANGE_SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_SILT_SHINGLE_WALL = ITEMS.register("magenta_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.MAGENTA_SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_SILT_SHINGLE_WALL = ITEMS.register("light_blue_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SILT_SHINGLE_WALL = ITEMS.register("yellow_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.YELLOW_SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_SILT_SHINGLE_WALL = ITEMS.register("lime_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.LIME_SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SILT_SHINGLE_WALL = ITEMS.register("pink_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.PINK_SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_SILT_SHINGLE_WALL = ITEMS.register("gray_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.GRAY_SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_SILT_SHINGLE_WALL = ITEMS.register("light_gray_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_SILT_SHINGLE_WALL = ITEMS.register("cyan_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.CYAN_SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_SILT_SHINGLE_WALL = ITEMS.register("purple_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.PURPLE_SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SILT_SHINGLE_WALL = ITEMS.register("blue_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.BLUE_SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_SILT_SHINGLE_WALL =  ITEMS.register("brown_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.BROWN_SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SILT_SHINGLE_WALL =  ITEMS.register("green_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.GREEN_SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SILT_SHINGLE_WALL =  ITEMS.register("red_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.RED_SILT_SHINGLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_SILT_SHINGLE_WALL =  ITEMS.register("black_silt_shingle_wall", () -> new BlockItem(TwigsBlocks.BLACK_SILT_SHINGLE_WALL.get(), new Item.Properties()));

}
