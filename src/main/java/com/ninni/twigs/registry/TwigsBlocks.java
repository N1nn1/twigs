package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.block.*;
import com.ninni.twigs.block.SiltPotBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.ToIntFunction;

import static net.minecraft.world.level.block.Blocks.BRICKS;

public class TwigsBlocks {

    //collectibles
    public static final Block AZALEA_FLOWERS = register("azalea_flowers", new AzaleaFlowersBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).instabreak().noCollission().noOcclusion().sound(SoundType.MOSS_CARPET)));
    @SuppressWarnings("unused") public static final Block POTTED_AZALEA_FLOWERS = register("potted_azalea_flowers", new FlowerPotBlock(AZALEA_FLOWERS, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_FLOWERING_AZALEA)));
    public static final Block TWIG = register("twig", new FloorItemBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instabreak().noOcclusion().sound(SoundType.WOOD).noCollission()));
    public static final Block PEBBLE = register("pebble", new FloorItemBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instabreak().noOcclusion().noCollission().sound(SoundType.STONE)));
    public static final Block OPALINE_SEASHELL = register("opaline_seashell", new SeashellBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).instabreak().noOcclusion().sound(TwigsSoundEvents.SEASHELL)));
    public static final Block BRONZED_SEASHELL = register("bronzed_seashell", new SeashellBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instabreak().noOcclusion().sound(TwigsSoundEvents.SEASHELL)));
    public static final Block ROSEATE_SEASHELL = register("roseate_seashell", new SeashellBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PINK).instabreak().noOcclusion().sound(TwigsSoundEvents.SEASHELL)));
    public static final Block TANGERINE_SEASHELL = register("tangerine_seashell", new SeashellBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instabreak().noOcclusion().sound(TwigsSoundEvents.SEASHELL)));

    //bamboo
    public static final Block BAMBOO_LEAVES = register("bamboo_leaves", new BambooLeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).strength(0.2F).noOcclusion().instabreak().noCollission().sound(SoundType.MOSS_CARPET)));
    public static final Block BAMBOO_THATCH = register("bamboo_thatch", new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(0.2F).sound(SoundType.MOSS)));
    public static final Block BAMBOO_THATCH_SLAB = register("bamboo_thatch_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(BAMBOO_THATCH)));
    public static final Block BAMBOO_MAT = register("bamboo_mat", new BambooMatBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)));

    //paper lanterns
    public static final Block PAPER_LANTERN = register("paper_lantern", new PaperLanternBlock(Blocks.AIR, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).strength(1.5f).pushReaction(PushReaction.DESTROY).sound(TwigsSoundEvents.PAPER_LANTERN).lightLevel(blockState -> 15).noOcclusion()));
    public static final Block ALLIUM_PAPER_LANTERN = register("allium_paper_lantern", new PaperLanternBlock(Blocks.ALLIUM, BlockBehaviour.Properties.ofFullCopy(PAPER_LANTERN)));
    public static final Block BLUE_ORCHID_PAPER_LANTERN = register("blue_orchid_paper_lantern", new PaperLanternBlock(Blocks.BLUE_ORCHID, BlockBehaviour.Properties.ofFullCopy(PAPER_LANTERN)));
    public static final Block CRIMSON_ROOTS_PAPER_LANTERN = register("crimson_roots_paper_lantern", new PaperLanternBlock(Blocks.CRIMSON_ROOTS, BlockBehaviour.Properties.ofFullCopy(PAPER_LANTERN)));
    public static final Block DANDELION_PAPER_LANTERN = register("dandelion_paper_lantern", new PaperLanternBlock(Blocks.DANDELION, BlockBehaviour.Properties.ofFullCopy(PAPER_LANTERN)));
    public static final Block TORCHFLOWER_PAPER_LANTERN = register("torchflower_paper_lantern", new PaperLanternBlock(Blocks.TORCHFLOWER, BlockBehaviour.Properties.ofFullCopy(PAPER_LANTERN)));

    //lamps
    public static final Block LAMP = register("lamp", new LampBlock(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(4.5F).sound(TwigsSoundEvents.LAMP).lightLevel(createLampLightLevel())));
    public static final Block SOUL_LAMP = register("soul_lamp", new LampBlock(BlockBehaviour.Properties.ofFullCopy(TwigsBlocks.LAMP)));
    public static final Block CRIMSON_SHROOMLAMP = register("crimson_shroomlamp", new Block(BlockBehaviour.Properties.of().mapColor(Blocks.CRIMSON_PLANKS.defaultMapColor()).strength(3.5F).sound(TwigsSoundEvents.SHROOMLAMP).lightLevel(blockState -> 15)));
    public static final Block WARPED_SHROOMLAMP = register("warped_shroomlamp", new Block(BlockBehaviour.Properties.ofFullCopy(CRIMSON_SHROOMLAMP).mapColor(Blocks.WARPED_PLANKS.defaultMapColor())));

    //tables
    public static final Block OAK_TABLE = register("oak_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_TABLE = register("spruce_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)));
    public static final Block BIRCH_TABLE = register("birch_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)));
    public static final Block JUNGLE_TABLE = register("jungle_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)));
    public static final Block ACACIA_TABLE = register("acacia_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)));
    public static final Block DARK_OAK_TABLE = register("dark_oak_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)));
    public static final Block MANGROVE_TABLE = register("mangrove_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_TABLE = register("cherry_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Block BAMBOO_TABLE = register("bamboo_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)));
    public static final Block CRIMSON_TABLE = register("crimson_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_TABLE = register("warped_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)));

    //basalt blocks
    public static final Block POLISHED_BASALT_BRICKS = register("polished_basalt_bricks", new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BASALT).strength(1.75F, 4.2F).sound(TwigsSoundEvents.BASALT_BRICKS)));
    public static final Block SMOOTH_BASALT_BRICKS = register("smooth_basalt_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT).strength(1.75F, 4.2F).sound(TwigsSoundEvents.BASALT_BRICKS)));
    public static final Block SMOOTH_BASALT_BRICK_STAIRS = register("smooth_basalt_brick_stairs", new StairBlock(SMOOTH_BASALT_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT_BRICKS)));
    public static final Block SMOOTH_BASALT_BRICK_SLAB = register("smooth_basalt_brick_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT_BRICKS)));
    public static final Block SMOOTH_BASALT_BRICK_WALL = register("smooth_basalt_brick_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT_BRICKS)));
    public static final Block CHISELED_SMOOTH_BASALT_BRICKS = register("chiseled_smooth_basalt_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT_BRICKS)));

    //bricks
    public static final Block MIXED_BRICKS = register("mixed_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(BRICKS)));
    public static final Block CHISELED_BRICKS = register("chiseled_bricks", new FacingBlock(BlockBehaviour.Properties.ofFullCopy(BRICKS)));
    public static final Block CRACKED_BRICKS = register("cracked_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(BRICKS)));
    public static final Block MOSSY_BRICKS = register("mossy_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(BRICKS)));
    public static final Block MOSSY_BRICK_STAIRS = register("mossy_brick_stairs", new StairBlock(MOSSY_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(MOSSY_BRICKS)));
    public static final Block MOSSY_BRICK_SLAB = register("mossy_brick_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(MOSSY_BRICKS)));
    public static final Block MOSSY_BRICK_WALL = register("mossy_brick_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(MOSSY_BRICKS)));
    public static final Block BRICK_TRAIL = register("brick_trail", new BrickTrailBlock(BlockBehaviour.Properties.ofFullCopy(BRICKS).noCollission().noOcclusion().instabreak()));

    //gravel bricks
    public static final Block GRAVEL_BRICKS = register("gravel_bricks", new Block(BlockBehaviour.Properties.of().mapColor(Blocks.GRAVEL.defaultMapColor()).strength(0.8f).sound(TwigsSoundEvents.GRAVEL_BRICKS)));
    public static final Block GRAVEL_BRICK_STAIRS = register("gravel_brick_stairs", new StairBlock(GRAVEL_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(GRAVEL_BRICKS)));
    public static final Block GRAVEL_BRICK_SLAB = register("gravel_brick_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(GRAVEL_BRICKS)));
    public static final Block GRAVEL_BRICK_WALL = register("gravel_brick_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(GRAVEL_BRICKS)));

    //smooth stone bricks
    public static final Block SMOOTH_STONE_BRICKS = register("smooth_stone_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final Block SMOOTH_STONE_BRICK_STAIRS = register("smooth_stone_brick_stairs", new StairBlock(SMOOTH_STONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE_BRICKS)));
    public static final Block SMOOTH_STONE_BRICK_SLAB = register("smooth_stone_brick_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE_BRICKS)));
    public static final Block SMOOTH_STONE_BRICK_WALL = register("smooth_stone_brick_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE_BRICKS)));

    //columns
    public static final Block QUARTZ_COLUMN = register("quartz_column", new ColumnBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)));
    public static final Block STONE_COLUMN = register("stone_column", new ColumnBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final Block DEEPSLATE_COLUMN = register("deepslate_column", new ColumnBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block BLACKSTONE_COLUMN = register("blackstone_column", new ColumnBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));

    //copper pillars
    public static final Block COPPER_PILLAR = register("copper_pillar", new PillarOxidizableBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER)));
    public static final Block EXPOSED_COPPER_PILLAR = register("exposed_copper_pillar", new PillarOxidizableBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_CUT_COPPER)));
    public static final Block WEATHERED_COPPER_PILLAR = register("weathered_copper_pillar", new PillarOxidizableBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_CUT_COPPER)));
    public static final Block OXIDIZED_COPPER_PILLAR = register("oxidized_copper_pillar", new PillarOxidizableBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_CUT_COPPER)));
    public static final Block WAXED_COPPER_PILLAR = register("waxed_copper_pillar", new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_CUT_COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_PILLAR = register("waxed_exposed_copper_pillar", new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_EXPOSED_CUT_COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_PILLAR = register("waxed_weathered_copper_pillar", new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_PILLAR = register("waxed_oxidized_copper_pillar", new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_OXIDIZED_CUT_COPPER)));

    //amethyst blocks
    public static final Block POLISHED_AMETHYST = register("polished_amethyst", new AmethystBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
    public static final Block CUT_AMETHYST = register("cut_amethyst", new CutAmethystBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

    //misc
    public static final Block PETRIFIED_LICHEN = register("petrified_lichen", new GlowLichenBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).noCollission().strength(0.2f).sound(SoundType.DEEPSLATE).lightLevel(GlowLichenBlock.emission(7))));
    public static final Block COMPACTED_DRIPSTONE = register("compacted_dripstone", new CompactedDripstoneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block ROCKY_DIRT = register("rocky_dirt", new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.GRAY).requiresCorrectToolForDrops().strength(1.25F, 6.0F).sound(TwigsSoundEvents.ROCKY_DIRT)));

    //cobblestone bricks
    public static final Block COBBLESTONE_BRICKS = register("cobblestone_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)));
    public static final Block COBBLESTONE_BRICK_STAIRS = register("cobblestone_brick_stairs", new StairBlock(COBBLESTONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_BRICKS)));
    public static final Block COBBLESTONE_BRICK_SLAB = register("cobblestone_brick_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_BRICKS)));
    public static final Block COBBLESTONE_BRICK_WALL = register("cobblestone_brick_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_BRICKS)));
    public static final Block CRACKED_COBBLESTONE_BRICKS = register("cracked_cobblestone_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_BRICKS)));
    public static final Block MOSSY_COBBLESTONE_BRICKS = register("mossy_cobblestone_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE)));
    public static final Block MOSSY_COBBLESTONE_BRICK_STAIRS = register("mossy_cobblestone_brick_stairs", new StairBlock(MOSSY_COBBLESTONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE_BRICKS)));
    public static final Block MOSSY_COBBLESTONE_BRICK_SLAB = register("mossy_cobblestone_brick_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE_BRICKS)));
    public static final Block MOSSY_COBBLESTONE_BRICK_WALL = register("mossy_cobblestone_brick_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE_BRICKS)));

    //decorated blackstone bricks
    public static final Block TWISTING_POLISHED_BLACKSTONE_BRICKS = register("twisting_polished_blackstone_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS = register("twisting_polished_blackstone_brick_stairs", new StairBlock(TWISTING_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(TWISTING_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB = register("twisting_polished_blackstone_brick_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(TWISTING_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block TWISTING_POLISHED_BLACKSTONE_BRICK_WALL = register("twisting_polished_blackstone_brick_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(TWISTING_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICKS = register("weeping_polished_blackstone_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS = register("weeping_polished_blackstone_brick_stairs", new StairBlock(WEEPING_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(WEEPING_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB = register("weeping_polished_blackstone_brick_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(WEEPING_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICK_WALL = register("weeping_polished_blackstone_brick_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(WEEPING_POLISHED_BLACKSTONE_BRICKS)));

    //tuff blocks
    public static final Block TUFF_STAIRS = register("tuff_stairs", new StairBlock(Blocks.TUFF.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF)));
    public static final Block TUFF_SLAB = register("tuff_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF)));
    public static final Block TUFF_WALL = register("tuff_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF)));
    public static final Block POLISHED_TUFF = register("polished_tuff", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF)));
    public static final Block POLISHED_TUFF_STAIRS = register("polished_tuff_stairs", new StairBlock(POLISHED_TUFF.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_TUFF)));
    public static final Block POLISHED_TUFF_SLAB = register("polished_tuff_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_TUFF)));
    public static final Block POLISHED_TUFF_BRICKS = register("polished_tuff_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF).sound(TwigsSoundEvents.TUFF_BRICKS)));
    public static final Block POLISHED_TUFF_BRICK_STAIRS = register("polished_tuff_brick_stairs", new StairBlock(POLISHED_TUFF_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_TUFF_BRICKS)));
    public static final Block POLISHED_TUFF_BRICK_SLAB = register("polished_tuff_brick_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_TUFF_BRICKS)));
    public static final Block POLISHED_TUFF_BRICK_WALL = register("polished_tuff_brick_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_TUFF_BRICKS)));
    public static final Block CRACKED_POLISHED_TUFF_BRICKS = register("cracked_polished_tuff_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(POLISHED_TUFF_BRICKS)));

    //calcite blocks
    public static final Block CALCITE_STAIRS = register("calcite_stairs", new StairBlock(Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final Block CALCITE_SLAB = register("calcite_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final Block CALCITE_WALL = register("calcite_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final Block POLISHED_CALCITE = register("polished_calcite", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final Block POLISHED_CALCITE_STAIRS = register("polished_calcite_stairs", new StairBlock(POLISHED_CALCITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE)));
    public static final Block POLISHED_CALCITE_SLAB = register("polished_calcite_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE)));
    public static final Block POLISHED_CALCITE_BRICKS = register("polished_calcite_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).sound(TwigsSoundEvents.CALCITE_BRICKS)));
    public static final Block POLISHED_CALCITE_BRICK_STAIRS = register("polished_calcite_brick_stairs", new StairBlock(POLISHED_CALCITE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE_BRICKS)));
    public static final Block POLISHED_CALCITE_BRICK_SLAB = register("polished_calcite_brick_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE_BRICKS)));
    public static final Block POLISHED_CALCITE_BRICK_WALL = register("polished_calcite_brick_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE_BRICKS)));
    public static final Block CRACKED_POLISHED_CALCITE_BRICKS = register("cracked_polished_calcite_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE_BRICKS)));

    //schist blocks
    public static final Block SCHIST = register("schist", new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.WHITE).requiresCorrectToolForDrops().strength(1F).sound(TwigsSoundEvents.SCHIST)));
    public static final Block SCHIST_STAIRS = register("schist_stairs", new StairBlock(SCHIST.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(SCHIST)));
    public static final Block SCHIST_SLAB = register("schist_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(SCHIST)));
    public static final Block SCHIST_WALL = register("schist_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(SCHIST)));
    public static final Block POLISHED_SCHIST = register("polished_schist", new Block(BlockBehaviour.Properties.ofFullCopy(SCHIST)));
    public static final Block POLISHED_SCHIST_STAIRS = register("polished_schist_stairs", new StairBlock(POLISHED_SCHIST.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_SCHIST)));
    public static final Block POLISHED_SCHIST_SLAB = register("polished_schist_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_SCHIST)));
    public static final Block POLISHED_SCHIST_BRICKS = register("polished_schist_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(SCHIST).sound(TwigsSoundEvents.SCHIST_BRICKS)));
    public static final Block POLISHED_SCHIST_BRICK_STAIRS = register("polished_schist_brick_stairs", new StairBlock(POLISHED_SCHIST_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_SCHIST_BRICKS)));
    public static final Block POLISHED_SCHIST_BRICK_SLAB = register("polished_schist_brick_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_SCHIST_BRICKS)));
    public static final Block POLISHED_SCHIST_BRICK_WALL = register("polished_schist_brick_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_SCHIST_BRICKS)));
    public static final Block CRACKED_POLISHED_SCHIST_BRICKS = register("cracked_polished_schist_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(POLISHED_SCHIST_BRICKS)));

    //rhyolite blocks
    public static final Block RHYOLITE = register("rhyolite", new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(DyeColor.BROWN).requiresCorrectToolForDrops().strength(1.5F).sound(TwigsSoundEvents.RHYOLITE)));
    public static final Block RHYOLITE_STAIRS = register("rhyolite_stairs", new StairBlock(RHYOLITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(RHYOLITE)));
    public static final Block RHYOLITE_SLAB = register("rhyolite_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(RHYOLITE)));
    public static final Block RHYOLITE_WALL = register("rhyolite_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(RHYOLITE)));
    public static final Block POLISHED_RHYOLITE = register("polished_rhyolite", new Block(BlockBehaviour.Properties.ofFullCopy(RHYOLITE)));
    public static final Block POLISHED_RHYOLITE_STAIRS = register("polished_rhyolite_stairs", new StairBlock(POLISHED_RHYOLITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_RHYOLITE)));
    public static final Block POLISHED_RHYOLITE_SLAB = register("polished_rhyolite_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_RHYOLITE)));
    public static final Block POLISHED_RHYOLITE_BRICKS = register("polished_rhyolite_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(RHYOLITE).sound(TwigsSoundEvents.RHYOLITE_BRICKS)));
    public static final Block POLISHED_RHYOLITE_BRICK_STAIRS = register("polished_rhyolite_brick_stairs", new StairBlock(POLISHED_RHYOLITE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_RHYOLITE_BRICKS)));
    public static final Block POLISHED_RHYOLITE_BRICK_SLAB = register("polished_rhyolite_brick_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_RHYOLITE_BRICKS)));
    public static final Block POLISHED_RHYOLITE_BRICK_WALL = register("polished_rhyolite_brick_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_RHYOLITE_BRICKS)));
    public static final Block CRACKED_POLISHED_RHYOLITE_BRICKS = register("cracked_polished_rhyolite_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(POLISHED_RHYOLITE_BRICKS)));

    //bloodstone blocks
    public static final Block BLOODSTONE = register("bloodstone", new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.GRAY).requiresCorrectToolForDrops().strength(1F).sound(TwigsSoundEvents.BLOODSTONE)));
    public static final Block BLOODSTONE_STAIRS = register("bloodstone_stairs", new StairBlock(BLOODSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(BLOODSTONE)));
    public static final Block BLOODSTONE_SLAB = register("bloodstone_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(BLOODSTONE)));
    public static final Block BLOODSTONE_WALL = register("bloodstone_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(BLOODSTONE)));
    public static final Block POLISHED_BLOODSTONE = register("polished_bloodstone", new Block(BlockBehaviour.Properties.ofFullCopy(BLOODSTONE)));
    public static final Block POLISHED_BLOODSTONE_STAIRS = register("polished_bloodstone_stairs", new StairBlock(POLISHED_BLOODSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_BLOODSTONE)));
    public static final Block POLISHED_BLOODSTONE_SLAB = register("polished_bloodstone_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_BLOODSTONE)));
    public static final Block POLISHED_BLOODSTONE_BRICKS = register("polished_bloodstone_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(BLOODSTONE).sound(TwigsSoundEvents.BLOODSTONE_BRICKS)));
    public static final Block POLISHED_BLOODSTONE_BRICK_STAIRS = register("polished_bloodstone_brick_stairs", new StairBlock(POLISHED_BLOODSTONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_BLOODSTONE_BRICKS)));
    public static final Block POLISHED_BLOODSTONE_BRICK_SLAB = register("polished_bloodstone_brick_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_BLOODSTONE_BRICKS)));
    public static final Block POLISHED_BLOODSTONE_BRICK_WALL = register("polished_bloodstone_brick_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_BLOODSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLOODSTONE_BRICKS = register("cracked_polished_bloodstone_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(POLISHED_BLOODSTONE_BRICKS)));

    //silt blocks
    public static final Block SILT = register("silt", new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).mapColor(DyeColor.BROWN).sound(TwigsSoundEvents.SILT)));
    public static final Block SILT_BRICKS = register("silt_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(BRICKS).mapColor(DyeColor.YELLOW)));
    public static final Block SILT_BRICK_STAIRS = register("silt_brick_stairs", new StairBlock(SILT_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(SILT_BRICKS)));
    public static final Block SILT_BRICK_SLAB = register("silt_brick_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(SILT_BRICKS)));
    public static final Block SILT_BRICK_WALL = register("silt_brick_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(SILT_BRICKS)));
    public static final Block MIXED_SILT_BRICKS = register("mixed_silt_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_BRICKS)));
    public static final Block CHISELED_SILT_BRICKS = register("chiseled_silt_bricks", new FacingBlock(BlockBehaviour.Properties.ofFullCopy(SILT_BRICKS)));
    public static final Block CRACKED_SILT_BRICKS = register("cracked_silt_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_BRICKS)));
    public static final Block SILT_BRICK_TRAIL = register("silt_brick_trail", new BrickTrailBlock(BlockBehaviour.Properties.ofFullCopy(SILT_BRICKS).noCollission().noOcclusion().instabreak()));

    public static final Block SILT_POT = register("silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA).strength(0.5f, 2f).pushReaction(PushReaction.NORMAL)));
    public static final Block WHITE_SILT_POT = register("white_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block ORANGE_SILT_POT = register("orange_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.COLOR_ORANGE)));
    public static final Block MAGENTA_SILT_POT = register("magenta_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.COLOR_MAGENTA)));
    public static final Block LIGHT_BLUE_SILT_POT = register("light_blue_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final Block YELLOW_SILT_POT = register("yellow_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.COLOR_YELLOW)));
    public static final Block LIME_SILT_POT = register("lime_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final Block PINK_SILT_POT = register("pink_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.COLOR_PINK)));
    public static final Block GRAY_SILT_POT = register("gray_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.COLOR_GRAY)));
    public static final Block LIGHT_GRAY_SILT_POT = register("light_gray_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final Block CYAN_SILT_POT = register("cyan_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.COLOR_CYAN)));
    public static final Block PURPLE_SILT_POT = register("purple_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.COLOR_PURPLE)));
    public static final Block BLUE_SILT_POT = register("blue_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.COLOR_BLUE)));
    public static final Block BROWN_SILT_POT = register("brown_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.COLOR_BROWN)));
    public static final Block GREEN_SILT_POT = register("green_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.COLOR_GREEN)));
    public static final Block RED_SILT_POT = register("red_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.COLOR_RED)));
    public static final Block BLACK_SILT_POT = register("black_silt_pot", new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT).mapColor(MapColor.COLOR_BLACK)));

    public static final Block PACKED_SILT = register("packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA).sound(TwigsSoundEvents.PACKED_SILT)));
    public static final Block WHITE_PACKED_SILT = register("white_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block ORANGE_PACKED_SILT = register("orange_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.COLOR_ORANGE)));
    public static final Block MAGENTA_PACKED_SILT = register("magenta_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.COLOR_MAGENTA)));
    public static final Block LIGHT_BLUE_PACKED_SILT = register("light_blue_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final Block YELLOW_PACKED_SILT = register("yellow_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.COLOR_YELLOW)));
    public static final Block LIME_PACKED_SILT = register("lime_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final Block PINK_PACKED_SILT = register("pink_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.COLOR_PINK)));
    public static final Block GRAY_PACKED_SILT = register("gray_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.COLOR_GRAY)));
    public static final Block LIGHT_GRAY_PACKED_SILT = register("light_gray_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final Block CYAN_PACKED_SILT = register("cyan_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.COLOR_CYAN)));
    public static final Block PURPLE_PACKED_SILT = register("purple_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.COLOR_PURPLE)));
    public static final Block BLUE_PACKED_SILT = register("blue_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.COLOR_BLUE)));
    public static final Block BROWN_PACKED_SILT = register("brown_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.COLOR_BROWN)));
    public static final Block GREEN_PACKED_SILT = register("green_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.COLOR_GREEN)));
    public static final Block RED_PACKED_SILT = register("red_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.COLOR_RED)));
    public static final Block BLACK_PACKED_SILT = register("black_packed_silt", new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT).mapColor(MapColor.COLOR_BLACK)));

    public static final Block SILT_SHINGLES = register("silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA).sound(TwigsSoundEvents.SILT_SHINGLES)));
    public static final Block WHITE_SILT_SHINGLES = register("white_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block ORANGE_SILT_SHINGLES = register("orange_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.COLOR_ORANGE)));
    public static final Block MAGENTA_SILT_SHINGLES = register("magenta_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.COLOR_MAGENTA)));
    public static final Block LIGHT_BLUE_SILT_SHINGLES = register("light_blue_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final Block YELLOW_SILT_SHINGLES = register("yellow_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.COLOR_YELLOW)));
    public static final Block LIME_SILT_SHINGLES = register("lime_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final Block PINK_SILT_SHINGLES = register("pink_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.COLOR_PINK)));
    public static final Block GRAY_SILT_SHINGLES = register("gray_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.COLOR_GRAY)));
    public static final Block LIGHT_GRAY_SILT_SHINGLES = register("light_gray_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final Block CYAN_SILT_SHINGLES = register("cyan_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.COLOR_CYAN)));
    public static final Block PURPLE_SILT_SHINGLES = register("purple_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.COLOR_PURPLE)));
    public static final Block BLUE_SILT_SHINGLES = register("blue_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.COLOR_BLUE)));
    public static final Block BROWN_SILT_SHINGLES = register("brown_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.COLOR_BROWN)));
    public static final Block GREEN_SILT_SHINGLES = register("green_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.COLOR_GREEN)));
    public static final Block RED_SILT_SHINGLES = register("red_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.COLOR_RED)));
    public static final Block BLACK_SILT_SHINGLES = register("black_silt_shingles", new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES).mapColor(MapColor.COLOR_BLACK)));

    public static final Block SILT_SHINGLE_STAIRS = register("silt_shingle_stairs", new StairBlock(SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES)));
    public static final Block WHITE_SILT_SHINGLE_STAIRS = register("white_silt_shingle_stairs", new StairBlock(WHITE_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(WHITE_SILT_SHINGLES)));
    public static final Block ORANGE_SILT_SHINGLE_STAIRS = register("orange_silt_shingle_stairs", new StairBlock(ORANGE_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(ORANGE_SILT_SHINGLES)));
    public static final Block MAGENTA_SILT_SHINGLE_STAIRS = register("magenta_silt_shingle_stairs", new StairBlock(MAGENTA_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(MAGENTA_SILT_SHINGLES)));
    public static final Block LIGHT_BLUE_SILT_SHINGLE_STAIRS = register("light_blue_silt_shingle_stairs", new StairBlock(LIGHT_BLUE_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(LIGHT_BLUE_SILT_SHINGLES)));
    public static final Block YELLOW_SILT_SHINGLE_STAIRS = register("yellow_silt_shingle_stairs", new StairBlock(YELLOW_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(YELLOW_SILT_SHINGLES)));
    public static final Block LIME_SILT_SHINGLE_STAIRS = register("lime_silt_shingle_stairs", new StairBlock(LIME_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(LIME_SILT_SHINGLES)));
    public static final Block PINK_SILT_SHINGLE_STAIRS = register("pink_silt_shingle_stairs", new StairBlock(PINK_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(PINK_SILT_SHINGLES)));
    public static final Block GRAY_SILT_SHINGLE_STAIRS = register("gray_silt_shingle_stairs", new StairBlock(GRAY_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(GRAY_SILT_SHINGLES)));
    public static final Block LIGHT_GRAY_SILT_SHINGLE_STAIRS = register("light_gray_silt_shingle_stairs", new StairBlock(LIGHT_GRAY_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(LIGHT_GRAY_SILT_SHINGLES)));
    public static final Block CYAN_SILT_SHINGLE_STAIRS = register("cyan_silt_shingle_stairs", new StairBlock(CYAN_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CYAN_SILT_SHINGLES)));
    public static final Block PURPLE_SILT_SHINGLE_STAIRS = register("purple_silt_shingle_stairs", new StairBlock(PURPLE_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(PURPLE_SILT_SHINGLES)));
    public static final Block BLUE_SILT_SHINGLE_STAIRS = register("blue_silt_shingle_stairs", new StairBlock(BLUE_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(BLUE_SILT_SHINGLES)));
    public static final Block BROWN_SILT_SHINGLE_STAIRS = register("brown_silt_shingle_stairs", new StairBlock(BROWN_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(BROWN_SILT_SHINGLES)));
    public static final Block GREEN_SILT_SHINGLE_STAIRS = register("green_silt_shingle_stairs", new StairBlock(GREEN_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(GREEN_SILT_SHINGLES)));
    public static final Block RED_SILT_SHINGLE_STAIRS = register("red_silt_shingle_stairs", new StairBlock(RED_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(RED_SILT_SHINGLES)));
    public static final Block BLACK_SILT_SHINGLE_STAIRS = register("black_silt_shingle_stairs", new StairBlock(BLACK_SILT_SHINGLES.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(BLACK_SILT_SHINGLES)));

    public static final Block SILT_SHINGLE_SLAB = register("silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES)));
    public static final Block WHITE_SILT_SHINGLE_SLAB = register("white_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(WHITE_SILT_SHINGLES)));
    public static final Block ORANGE_SILT_SHINGLE_SLAB = register("orange_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(ORANGE_SILT_SHINGLES)));
    public static final Block MAGENTA_SILT_SHINGLE_SLAB = register("magenta_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(MAGENTA_SILT_SHINGLES)));
    public static final Block LIGHT_BLUE_SILT_SHINGLE_SLAB = register("light_blue_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(LIGHT_BLUE_SILT_SHINGLES)));
    public static final Block YELLOW_SILT_SHINGLE_SLAB = register("yellow_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(YELLOW_SILT_SHINGLES)));
    public static final Block LIME_SILT_SHINGLE_SLAB = register("lime_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(LIME_SILT_SHINGLES)));
    public static final Block PINK_SILT_SHINGLE_SLAB = register("pink_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(PINK_SILT_SHINGLES)));
    public static final Block GRAY_SILT_SHINGLE_SLAB = register("gray_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(GRAY_SILT_SHINGLES)));
    public static final Block LIGHT_GRAY_SILT_SHINGLE_SLAB = register("light_gray_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(LIGHT_GRAY_SILT_SHINGLES)));
    public static final Block CYAN_SILT_SHINGLE_SLAB = register("cyan_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CYAN_SILT_SHINGLES)));
    public static final Block PURPLE_SILT_SHINGLE_SLAB = register("purple_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(PURPLE_SILT_SHINGLES)));
    public static final Block BLUE_SILT_SHINGLE_SLAB = register("blue_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(BLUE_SILT_SHINGLES)));
    public static final Block BROWN_SILT_SHINGLE_SLAB = register("brown_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(BROWN_SILT_SHINGLES)));
    public static final Block GREEN_SILT_SHINGLE_SLAB = register("green_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(GREEN_SILT_SHINGLES)));
    public static final Block RED_SILT_SHINGLE_SLAB = register("red_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(RED_SILT_SHINGLES)));
    public static final Block BLACK_SILT_SHINGLE_SLAB = register("black_silt_shingle_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(BLACK_SILT_SHINGLES)));

    public static final Block SILT_SHINGLE_WALL = register("silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES)));
    public static final Block WHITE_SILT_SHINGLE_WALL = register("white_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(WHITE_SILT_SHINGLES)));
    public static final Block ORANGE_SILT_SHINGLE_WALL = register("orange_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(ORANGE_SILT_SHINGLES)));
    public static final Block MAGENTA_SILT_SHINGLE_WALL = register("magenta_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(MAGENTA_SILT_SHINGLES)));
    public static final Block LIGHT_BLUE_SILT_SHINGLE_WALL = register("light_blue_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(LIGHT_BLUE_SILT_SHINGLES)));
    public static final Block YELLOW_SILT_SHINGLE_WALL = register("yellow_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(YELLOW_SILT_SHINGLES)));
    public static final Block LIME_SILT_SHINGLE_WALL = register("lime_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(LIME_SILT_SHINGLES)));
    public static final Block PINK_SILT_SHINGLE_WALL = register("pink_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(PINK_SILT_SHINGLES)));
    public static final Block GRAY_SILT_SHINGLE_WALL = register("gray_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(GRAY_SILT_SHINGLES)));
    public static final Block LIGHT_GRAY_SILT_SHINGLE_WALL = register("light_gray_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(LIGHT_GRAY_SILT_SHINGLES)));
    public static final Block CYAN_SILT_SHINGLE_WALL = register("cyan_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(CYAN_SILT_SHINGLES)));
    public static final Block PURPLE_SILT_SHINGLE_WALL = register("purple_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(PURPLE_SILT_SHINGLES)));
    public static final Block BLUE_SILT_SHINGLE_WALL = register("blue_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(BLUE_SILT_SHINGLES)));
    public static final Block BROWN_SILT_SHINGLE_WALL = register("brown_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(BROWN_SILT_SHINGLES)));
    public static final Block GREEN_SILT_SHINGLE_WALL = register("green_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(GREEN_SILT_SHINGLES)));
    public static final Block RED_SILT_SHINGLE_WALL = register("red_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(RED_SILT_SHINGLES)));
    public static final Block BLACK_SILT_SHINGLE_WALL = register("black_silt_shingle_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(BLACK_SILT_SHINGLES)));

    private static ToIntFunction<BlockState> createLampLightLevel() {
        return (state) -> (Boolean)state.getValue(BlockStateProperties.LIT) ? 15 : 0;
    }

    private static Block register(String id, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(Twigs.MOD_ID, id), block);
    }
}
