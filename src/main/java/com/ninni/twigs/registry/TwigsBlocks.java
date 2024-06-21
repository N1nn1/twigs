package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.block.AzaleaFlowersBlock;
import com.ninni.twigs.block.BambooLeavesBlock;
import com.ninni.twigs.block.BambooMatBlock;
import com.ninni.twigs.block.ColumnBlock;
import com.ninni.twigs.block.CompactedDripstoneBlock;
import com.ninni.twigs.block.CutAmethystBlock;
import com.ninni.twigs.block.FacingBlock;
import com.ninni.twigs.block.FloorItemBlock;
import com.ninni.twigs.block.LampBlock;
import com.ninni.twigs.block.PaperLanternBlock;
import com.ninni.twigs.block.PillarOxidizableBlock;
import com.ninni.twigs.block.SeashellBlock;
import com.ninni.twigs.block.TableBlock;
import com.ninni.twigs.block.enums.SiltPotBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.GlowLichenBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.ToIntFunction;

@Mod.EventBusSubscriber(modid = Twigs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TwigsBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Twigs.MOD_ID);

    //collectibles
    public static final RegistryObject<Block> AZALEA_FLOWERS = BLOCKS.register("azalea_flowers", () -> new AzaleaFlowersBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).instabreak().noCollission().noOcclusion().sound(SoundType.MOSS_CARPET)));
    public static final RegistryObject<Block> POTTED_AZALEA_FLOWERS = BLOCKS.register("potted_azalea_flowers", () -> new FlowerPotBlock(AZALEA_FLOWERS.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_FLOWERING_AZALEA)));
    public static final RegistryObject<Block> TWIG = BLOCKS.register("twig", () -> new FloorItemBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instabreak().noOcclusion().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PEBBLE = BLOCKS.register("pebble", () -> new FloorItemBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instabreak().noOcclusion().sound(SoundType.STONE)));
    public static final RegistryObject<Block> OPALINE_SEASHELL = BLOCKS.register("opaline_seashell", () -> new SeashellBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instabreak().noOcclusion().sound(TwigsSoundEvents.SEASHELL)));
    public static final RegistryObject<Block> BRONZED_SEASHELL = BLOCKS.register("bronzed_seashell", () -> new SeashellBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instabreak().noOcclusion().sound(TwigsSoundEvents.SEASHELL)));
    public static final RegistryObject<Block> ROSEATE_SEASHELL = BLOCKS.register("roseate_seashell", () -> new SeashellBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instabreak().noOcclusion().sound(TwigsSoundEvents.SEASHELL)));
    public static final RegistryObject<Block> TANGERINE_SEASHELL = BLOCKS.register("tangerine_seashell", () -> new SeashellBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instabreak().noOcclusion().sound(TwigsSoundEvents.SEASHELL)));

    //bamboo
    public static final RegistryObject<Block> BAMBOO_LEAVES = BLOCKS.register("bamboo_leaves", () -> new BambooLeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).strength(0.2F).noOcclusion().instabreak().noCollission().sound(SoundType.MOSS_CARPET)));
    public static final RegistryObject<Block> BAMBOO_THATCH = BLOCKS.register("bamboo_thatch", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(0.2F).sound(SoundType.MOSS)));
    public static final RegistryObject<Block> BAMBOO_THATCH_SLAB = BLOCKS.register("bamboo_thatch_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(BAMBOO_THATCH.get())));
    public static final RegistryObject<Block> BAMBOO_MAT = BLOCKS.register("bamboo_mat", () -> new BambooMatBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)));

    //paper lanterns
    public static final RegistryObject<Block> PAPER_LANTERN = BLOCKS.register("paper_lantern", () -> new PaperLanternBlock(Blocks.AIR, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).strength(1.5f).sound(TwigsSoundEvents.PAPER_LANTERN).lightLevel(blockState -> 15).noOcclusion()));
    public static final RegistryObject<Block> ALLIUM_PAPER_LANTERN = BLOCKS.register("allium_paper_lantern", () -> new PaperLanternBlock(Blocks.ALLIUM, BlockBehaviour.Properties.ofFullCopy(PAPER_LANTERN.get())));
    public static final RegistryObject<Block> BLUE_ORCHID_PAPER_LANTERN = BLOCKS.register("blue_orchid_paper_lantern", () -> new PaperLanternBlock(Blocks.BLUE_ORCHID, BlockBehaviour.Properties.ofFullCopy(PAPER_LANTERN.get())));
    public static final RegistryObject<Block> CRIMSON_ROOTS_PAPER_LANTERN = BLOCKS.register("crimson_roots_paper_lantern", () -> new PaperLanternBlock(Blocks.CRIMSON_ROOTS, BlockBehaviour.Properties.ofFullCopy(PAPER_LANTERN.get())));
    public static final RegistryObject<Block> DANDELION_PAPER_LANTERN = BLOCKS.register("dandelion_paper_lantern", () -> new PaperLanternBlock(Blocks.DANDELION, BlockBehaviour.Properties.ofFullCopy(PAPER_LANTERN.get())));
    public static final RegistryObject<Block> TORCHFLOWER_PAPER_LANTERN = BLOCKS.register("torchflower_paper_lantern", () -> new PaperLanternBlock(Blocks.TORCHFLOWER, BlockBehaviour.Properties.ofFullCopy(PAPER_LANTERN.get())));

    //lamps
    public static final RegistryObject<Block> LAMP = BLOCKS.register("lamp", () -> new LampBlock(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(4.5F).sound(TwigsSoundEvents.LAMP).lightLevel(createLampLightLevel())));
    public static final RegistryObject<Block> SOUL_LAMP = BLOCKS.register("soul_lamp", () -> new LampBlock(BlockBehaviour.Properties.ofFullCopy(TwigsBlocks.LAMP.get())));
    public static final RegistryObject<Block> CRIMSON_SHROOMLAMP = BLOCKS.register("crimson_shroomlamp", () -> new Block(BlockBehaviour.Properties.of().mapColor(Blocks.CRIMSON_PLANKS.defaultMapColor()).strength(3.5F).sound(TwigsSoundEvents.SHROOMLAMP).lightLevel(state -> 15)));
    public static final RegistryObject<Block> WARPED_SHROOMLAMP = BLOCKS.register("warped_shroomlamp", () -> new Block(BlockBehaviour.Properties.ofFullCopy(CRIMSON_SHROOMLAMP.get())));

    //tables
    public static final RegistryObject<Block> OAK_TABLE = BLOCKS.register("oak_table", () -> new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_TABLE = BLOCKS.register("spruce_table", () -> new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> BIRCH_TABLE = BLOCKS.register("birch_table", () -> new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> JUNGLE_TABLE = BLOCKS.register("jungle_table", () -> new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)));
    public static final RegistryObject<Block> ACACIA_TABLE = BLOCKS.register("acacia_table", () -> new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_TABLE = BLOCKS.register("dark_oak_table", () -> new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_TABLE = BLOCKS.register("mangrove_table", () -> new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> CHERRY_TABLE = BLOCKS.register("cherry_table", () -> new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> BAMBOO_TABLE = BLOCKS.register("bamboo_table", () -> new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> CRIMSON_TABLE = BLOCKS.register("crimson_table", () -> new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> WARPED_TABLE = BLOCKS.register("warped_table", () -> new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)));

    //basalt blocks
    public static final RegistryObject<Block> POLISHED_BASALT_BRICKS = BLOCKS.register("polished_basalt_bricks", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BASALT).strength(1.75F, 4.2F).sound(TwigsSoundEvents.BASALT_BRICKS)));
    public static final RegistryObject<Block> SMOOTH_BASALT_BRICKS = BLOCKS.register("smooth_basalt_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT).strength(1.75F, 4.2F).sound(TwigsSoundEvents.BASALT_BRICKS)));
    public static final RegistryObject<Block> SMOOTH_BASALT_BRICK_STAIRS = BLOCKS.register("smooth_basalt_brick_stairs", () -> new StairBlock(SMOOTH_BASALT_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT_BRICKS.get())));
    public static final RegistryObject<Block> SMOOTH_BASALT_BRICK_SLAB = BLOCKS.register("smooth_basalt_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT_BRICKS.get())));
    public static final RegistryObject<Block> SMOOTH_BASALT_BRICK_WALL = BLOCKS.register("smooth_basalt_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT_BRICKS.get())));
    public static final RegistryObject<Block> CHISELED_SMOOTH_BASALT_BRICKS = BLOCKS.register("chiseled_smooth_basalt_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT_BRICKS.get())));

    //bricks
    public static final RegistryObject<Block> MIXED_BRICKS = BLOCKS.register("mixed_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CHISELED_BRICKS = BLOCKS.register("chiseled_bricks", () -> new FacingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CRACKED_BRICKS = BLOCKS.register("cracked_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MOSSY_BRICKS = BLOCKS.register("mossy_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MOSSY_BRICK_STAIRS = BLOCKS.register("mossy_brick_stairs", () -> new StairBlock(MOSSY_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(MOSSY_BRICKS.get())));
    public static final RegistryObject<Block> MOSSY_BRICK_SLAB = BLOCKS.register("mossy_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(MOSSY_BRICKS.get())));
    public static final RegistryObject<Block> MOSSY_BRICK_WALL = BLOCKS.register("mossy_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(MOSSY_BRICKS.get())));

    //gravel bricks
    public static final RegistryObject<Block> GRAVEL_BRICKS = BLOCKS.register("gravel_bricks", () -> new Block(BlockBehaviour.Properties.of().mapColor(Blocks.GRAVEL.defaultMapColor()).strength(0.8f).sound(TwigsSoundEvents.GRAVEL_BRICKS)));
    public static final RegistryObject<Block> GRAVEL_BRICK_STAIRS = BLOCKS.register("gravel_brick_stairs", () -> new StairBlock(GRAVEL_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(GRAVEL_BRICKS.get())));
    public static final RegistryObject<Block> GRAVEL_BRICK_SLAB = BLOCKS.register("gravel_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(GRAVEL_BRICKS.get())));
    public static final RegistryObject<Block> GRAVEL_BRICK_WALL = BLOCKS.register("gravel_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(GRAVEL_BRICKS.get())));

    //smooth stone bricks
    public static final RegistryObject<Block> SMOOTH_STONE_BRICKS = BLOCKS.register("smooth_stone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_STAIRS = BLOCKS.register("smooth_stone_brick_stairs", () -> new StairBlock(SMOOTH_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE_BRICKS.get())));
    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_SLAB = BLOCKS.register("smooth_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE_BRICKS.get())));
    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_WALL = BLOCKS.register("smooth_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE_BRICKS.get())));

    //columns
    public static final RegistryObject<Block> QUARTZ_COLUMN = BLOCKS.register("quartz_column", () -> new ColumnBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<Block> STONE_COLUMN = BLOCKS.register("stone_column", () -> new ColumnBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> DEEPSLATE_COLUMN = BLOCKS.register("deepslate_column", () -> new ColumnBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> BLACKSTONE_COLUMN = BLOCKS.register("blackstone_column", () -> new ColumnBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));

    //copper pillars
    public static final RegistryObject<Block> COPPER_PILLAR = BLOCKS.register("copper_pillar", () -> new PillarOxidizableBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> EXPOSED_COPPER_PILLAR = BLOCKS.register("exposed_copper_pillar", () -> new PillarOxidizableBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_CUT_COPPER)));
    public static final RegistryObject<Block> WEATHERED_COPPER_PILLAR = BLOCKS.register("weathered_copper_pillar", () -> new PillarOxidizableBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_CUT_COPPER)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_PILLAR = BLOCKS.register("oxidized_copper_pillar", () -> new PillarOxidizableBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_CUT_COPPER)));
    public static final RegistryObject<Block> WAXED_COPPER_PILLAR = BLOCKS.register("waxed_copper_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_CUT_COPPER)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_PILLAR = BLOCKS.register("waxed_exposed_copper_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_EXPOSED_CUT_COPPER)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_PILLAR = BLOCKS.register("waxed_weathered_copper_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_CUT_COPPER)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_PILLAR = BLOCKS.register("waxed_oxidized_copper_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_OXIDIZED_CUT_COPPER)));

    //amethyst blocks
    public static final RegistryObject<Block> POLISHED_AMETHYST = BLOCKS.register("polished_amethyst", () -> new AmethystBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> CUT_AMETHYST = BLOCKS.register("cut_amethyst", () -> new CutAmethystBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

    //misc
    public static final RegistryObject<Block> PETRIFIED_LICHEN = BLOCKS.register("petrified_lichen", () -> new GlowLichenBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).noCollission().strength(0.2f).sound(SoundType.DEEPSLATE).lightLevel(GlowLichenBlock.emission(7))));
    public static final RegistryObject<Block> COMPACTED_DRIPSTONE = BLOCKS.register("compacted_dripstone", () -> new CompactedDripstoneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ROCKY_DIRT = BLOCKS.register("rocky_dirt", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.GRAY).requiresCorrectToolForDrops().strength(1.25F, 6.0F).sound(TwigsSoundEvents.ROCKY_DIRT)));

    //cobblestone bricks
    public static final RegistryObject<Block> COBBLESTONE_BRICKS = BLOCKS.register("cobblestone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLESTONE_BRICK_STAIRS = BLOCKS.register("cobblestone_brick_stairs", () -> new StairBlock(COBBLESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_BRICKS.get())));
    public static final RegistryObject<Block> COBBLESTONE_BRICK_SLAB = BLOCKS.register("cobblestone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_BRICKS.get())));
    public static final RegistryObject<Block> COBBLESTONE_BRICK_WALL = BLOCKS.register("cobblestone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_COBBLESTONE_BRICKS = BLOCKS.register("cracked_cobblestone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_BRICKS.get())));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICKS = BLOCKS.register("mossy_cobblestone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_STAIRS = BLOCKS.register("mossy_cobblestone_brick_stairs", () -> new StairBlock(MOSSY_COBBLESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE_BRICKS.get())));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_SLAB = BLOCKS.register("mossy_cobblestone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE_BRICKS.get())));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_WALL = BLOCKS.register("mossy_cobblestone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE_BRICKS.get())));

    //decorated blackstone bricks
    public static final RegistryObject<Block> TWISTING_POLISHED_BLACKSTONE_BRICKS = BLOCKS.register("twisting_polished_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS = BLOCKS.register("twisting_polished_blackstone_brick_stairs", () -> new StairBlock(TWISTING_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(TWISTING_POLISHED_BLACKSTONE_BRICKS.get())));
    public static final RegistryObject<Block> TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB = BLOCKS.register("twisting_polished_blackstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(TWISTING_POLISHED_BLACKSTONE_BRICKS.get())));
    public static final RegistryObject<Block> TWISTING_POLISHED_BLACKSTONE_BRICK_WALL = BLOCKS.register("twisting_polished_blackstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(TWISTING_POLISHED_BLACKSTONE_BRICKS.get())));
    public static final RegistryObject<Block> WEEPING_POLISHED_BLACKSTONE_BRICKS = BLOCKS.register("weeping_polished_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS = BLOCKS.register("weeping_polished_blackstone_brick_stairs", () -> new StairBlock(WEEPING_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(WEEPING_POLISHED_BLACKSTONE_BRICKS.get())));
    public static final RegistryObject<Block> WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB = BLOCKS.register("weeping_polished_blackstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(WEEPING_POLISHED_BLACKSTONE_BRICKS.get())));
    public static final RegistryObject<Block> WEEPING_POLISHED_BLACKSTONE_BRICK_WALL = BLOCKS.register("weeping_polished_blackstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(WEEPING_POLISHED_BLACKSTONE_BRICKS.get())));

    //tuff blocks
    public static final RegistryObject<Block> TUFF_STAIRS = BLOCKS.register("tuff_stairs", () -> new StairBlock(Blocks.TUFF.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF)));
    public static final RegistryObject<Block> TUFF_SLAB = BLOCKS.register("tuff_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF)));
    public static final RegistryObject<Block> TUFF_WALL = BLOCKS.register("tuff_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF)));
    public static final RegistryObject<Block> POLISHED_TUFF = BLOCKS.register("polished_tuff", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF)));
    public static final RegistryObject<Block> POLISHED_TUFF_STAIRS = BLOCKS.register("polished_tuff_stairs", () -> new StairBlock(POLISHED_TUFF.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_TUFF.get())));
    public static final RegistryObject<Block> POLISHED_TUFF_SLAB = BLOCKS.register("polished_tuff_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_TUFF.get())));
    public static final RegistryObject<Block> POLISHED_TUFF_BRICKS = BLOCKS.register("polished_tuff_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF).sound(TwigsSoundEvents.TUFF_BRICKS)));
    public static final RegistryObject<Block> POLISHED_TUFF_BRICK_STAIRS = BLOCKS.register("polished_tuff_brick_stairs", () -> new StairBlock(POLISHED_TUFF_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_TUFF_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_TUFF_BRICK_SLAB = BLOCKS.register("polished_tuff_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_TUFF_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_TUFF_BRICK_WALL = BLOCKS.register("polished_tuff_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_TUFF_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_POLISHED_TUFF_BRICKS = BLOCKS.register("cracked_polished_tuff_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(POLISHED_TUFF_BRICKS.get())));

    //calcite blocks
    public static final RegistryObject<Block> CALCITE_STAIRS = BLOCKS.register("calcite_stairs", () -> new StairBlock(Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CALCITE_SLAB = BLOCKS.register("calcite_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CALCITE_WALL = BLOCKS.register("calcite_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final RegistryObject<Block> POLISHED_CALCITE = BLOCKS.register("polished_calcite", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final RegistryObject<Block> POLISHED_CALCITE_STAIRS = BLOCKS.register("polished_calcite_stairs", () -> new StairBlock(POLISHED_CALCITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE.get())));
    public static final RegistryObject<Block> POLISHED_CALCITE_SLAB = BLOCKS.register("polished_calcite_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE.get())));
    public static final RegistryObject<Block> POLISHED_CALCITE_BRICKS = BLOCKS.register("polished_calcite_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).sound(TwigsSoundEvents.CALCITE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_CALCITE_BRICK_STAIRS = BLOCKS.register("polished_calcite_brick_stairs", () -> new StairBlock(POLISHED_CALCITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_CALCITE_BRICK_SLAB = BLOCKS.register("polished_calcite_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_CALCITE_BRICK_WALL = BLOCKS.register("polished_calcite_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_POLISHED_CALCITE_BRICKS = BLOCKS.register("cracked_polished_calcite_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE_BRICKS.get())));

    //schist blocks
    public static final RegistryObject<Block> SCHIST = BLOCKS.register("schist", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.WHITE).requiresCorrectToolForDrops().strength(1F).sound(TwigsSoundEvents.SCHIST)));
    public static final RegistryObject<Block> SCHIST_STAIRS = BLOCKS.register("schist_stairs", () -> new StairBlock(SCHIST.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(SCHIST.get())));
    public static final RegistryObject<Block> SCHIST_SLAB = BLOCKS.register("schist_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(SCHIST.get())));
    public static final RegistryObject<Block> SCHIST_WALL = BLOCKS.register("schist_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SCHIST.get())));
    public static final RegistryObject<Block> POLISHED_SCHIST = BLOCKS.register("polished_schist", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SCHIST.get())));
    public static final RegistryObject<Block> POLISHED_SCHIST_STAIRS = BLOCKS.register("polished_schist_stairs", () -> new StairBlock(POLISHED_SCHIST.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_SCHIST.get())));
    public static final RegistryObject<Block> POLISHED_SCHIST_SLAB = BLOCKS.register("polished_schist_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_SCHIST.get())));
    public static final RegistryObject<Block> POLISHED_SCHIST_BRICKS = BLOCKS.register("polished_schist_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SCHIST.get()).sound(TwigsSoundEvents.SCHIST_BRICKS)));
    public static final RegistryObject<Block> POLISHED_SCHIST_BRICK_STAIRS = BLOCKS.register("polished_schist_brick_stairs", () -> new StairBlock(POLISHED_SCHIST_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_SCHIST_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_SCHIST_BRICK_SLAB = BLOCKS.register("polished_schist_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_SCHIST_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_SCHIST_BRICK_WALL = BLOCKS.register("polished_schist_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_SCHIST_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_POLISHED_SCHIST_BRICKS = BLOCKS.register("cracked_polished_schist_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(POLISHED_SCHIST_BRICKS.get())));

    //rhyolite blocks
    public static final RegistryObject<Block> RHYOLITE = BLOCKS.register("rhyolite", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(DyeColor.BROWN).requiresCorrectToolForDrops().strength(1.5F).sound(TwigsSoundEvents.RHYOLITE)));
    public static final RegistryObject<Block> RHYOLITE_STAIRS = BLOCKS.register("rhyolite_stairs", () -> new StairBlock(RHYOLITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(RHYOLITE.get())));
    public static final RegistryObject<Block> RHYOLITE_SLAB = BLOCKS.register("rhyolite_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(RHYOLITE.get())));
    public static final RegistryObject<Block> RHYOLITE_WALL = BLOCKS.register("rhyolite_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(RHYOLITE.get())));
    public static final RegistryObject<Block> POLISHED_RHYOLITE = BLOCKS.register("polished_rhyolite", () -> new Block(BlockBehaviour.Properties.ofFullCopy(RHYOLITE.get())));
    public static final RegistryObject<Block> POLISHED_RHYOLITE_STAIRS = BLOCKS.register("polished_rhyolite_stairs", () -> new StairBlock(POLISHED_RHYOLITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_RHYOLITE.get())));
    public static final RegistryObject<Block> POLISHED_RHYOLITE_SLAB = BLOCKS.register("polished_rhyolite_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_RHYOLITE.get())));
    public static final RegistryObject<Block> POLISHED_RHYOLITE_BRICKS = BLOCKS.register("polished_rhyolite_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(RHYOLITE.get()).sound(TwigsSoundEvents.RHYOLITE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_RHYOLITE_BRICK_STAIRS = BLOCKS.register("polished_rhyolite_brick_stairs", () -> new StairBlock(POLISHED_RHYOLITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_RHYOLITE_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_RHYOLITE_BRICK_SLAB = BLOCKS.register("polished_rhyolite_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_RHYOLITE_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_RHYOLITE_BRICK_WALL = BLOCKS.register("polished_rhyolite_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_RHYOLITE_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_POLISHED_RHYOLITE_BRICKS = BLOCKS.register("cracked_polished_rhyolite_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(POLISHED_RHYOLITE_BRICKS.get())));

    //bloodstone blocks
    public static final RegistryObject<Block> BLOODSTONE = BLOCKS.register("bloodstone", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.GRAY).requiresCorrectToolForDrops().strength(1F).sound(TwigsSoundEvents.BLOODSTONE)));
    public static final RegistryObject<Block> BLOODSTONE_STAIRS = BLOCKS.register("bloodstone_stairs", () -> new StairBlock(BLOODSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(BLOODSTONE.get())));
    public static final RegistryObject<Block> BLOODSTONE_SLAB = BLOCKS.register("bloodstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(BLOODSTONE.get())));
    public static final RegistryObject<Block> BLOODSTONE_WALL = BLOCKS.register("bloodstone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(BLOODSTONE.get())));
    public static final RegistryObject<Block> POLISHED_BLOODSTONE = BLOCKS.register("polished_bloodstone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(BLOODSTONE.get())));
    public static final RegistryObject<Block> POLISHED_BLOODSTONE_STAIRS = BLOCKS.register("polished_bloodstone_stairs", () -> new StairBlock(POLISHED_BLOODSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_BLOODSTONE.get())));
    public static final RegistryObject<Block> POLISHED_BLOODSTONE_SLAB = BLOCKS.register("polished_bloodstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_BLOODSTONE.get())));
    public static final RegistryObject<Block> POLISHED_BLOODSTONE_BRICKS = BLOCKS.register("polished_bloodstone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(BLOODSTONE.get()).sound(TwigsSoundEvents.BLOODSTONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_BLOODSTONE_BRICK_STAIRS = BLOCKS.register("polished_bloodstone_brick_stairs", () -> new StairBlock(POLISHED_BLOODSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_BLOODSTONE_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_BLOODSTONE_BRICK_SLAB = BLOCKS.register("polished_bloodstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_BLOODSTONE_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_BLOODSTONE_BRICK_WALL = BLOCKS.register("polished_bloodstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_BLOODSTONE_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLOODSTONE_BRICKS = BLOCKS.register("cracked_polished_bloodstone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(POLISHED_BLOODSTONE_BRICKS.get())));

    //silt blocks
    public static final RegistryObject<Block> SILT = BLOCKS.register("silt", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).mapColor(MapColor.COLOR_BROWN).sound(TwigsSoundEvents.SILT)));
    public static final RegistryObject<Block> SILT_BRICKS = BLOCKS.register("silt_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> SILT_BRICK_STAIRS = BLOCKS.register("silt_brick_stairs", () -> new StairBlock(SILT_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(SILT_BRICKS.get())));
    public static final RegistryObject<Block> SILT_BRICK_SLAB = BLOCKS.register("silt_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(SILT_BRICKS.get())));
    public static final RegistryObject<Block> SILT_BRICK_WALL = BLOCKS.register("silt_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SILT_BRICKS.get())));
    public static final RegistryObject<Block> MIXED_SILT_BRICKS = BLOCKS.register("mixed_silt_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_BRICKS.get())));
    public static final RegistryObject<Block> CHISELED_SILT_BRICKS = BLOCKS.register("chiseled_silt_bricks", () -> new FacingBlock(BlockBehaviour.Properties.ofFullCopy(SILT_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_SILT_BRICKS = BLOCKS.register("cracked_silt_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_BRICKS.get())));

    public static final RegistryObject<Block> SILT_POT = BLOCKS.register("silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA).strength(0.5f, 2f)));
    public static final RegistryObject<Block> WHITE_SILT_POT = BLOCKS.register("white_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final RegistryObject<Block> ORANGE_SILT_POT = BLOCKS.register("orange_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> MAGENTA_SILT_POT = BLOCKS.register("magenta_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_SILT_POT = BLOCKS.register("light_blue_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> YELLOW_SILT_POT = BLOCKS.register("yellow_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> LIME_SILT_POT = BLOCKS.register("lime_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryObject<Block> PINK_SILT_POT = BLOCKS.register("pink_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> GRAY_SILT_POT = BLOCKS.register("gray_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.COLOR_GRAY)));
    public static final RegistryObject<Block> LIGHT_GRAY_SILT_POT = BLOCKS.register("light_gray_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final RegistryObject<Block> CYAN_SILT_POT = BLOCKS.register("cyan_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryObject<Block> PURPLE_SILT_POT = BLOCKS.register("purple_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> BLUE_SILT_POT = BLOCKS.register("blue_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryObject<Block> BROWN_SILT_POT = BLOCKS.register("brown_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.COLOR_BROWN)));
    public static final RegistryObject<Block> GREEN_SILT_POT = BLOCKS.register("green_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.COLOR_GREEN)));
    public static final RegistryObject<Block> RED_SILT_POT = BLOCKS.register("red_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.COLOR_RED)));
    public static final RegistryObject<Block> BLACK_SILT_POT = BLOCKS.register("black_silt_pot", () -> new SiltPotBlock(BlockBehaviour.Properties.ofFullCopy(SILT_POT.get()).mapColor(MapColor.COLOR_BLACK)));

    public static final RegistryObject<Block> PACKED_SILT = BLOCKS.register("packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA).sound(TwigsSoundEvents.PACKED_SILT)));
    public static final RegistryObject<Block> WHITE_PACKED_SILT = BLOCKS.register("white_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final RegistryObject<Block> ORANGE_PACKED_SILT = BLOCKS.register("orange_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> MAGENTA_PACKED_SILT = BLOCKS.register("magenta_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_PACKED_SILT = BLOCKS.register("light_blue_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> YELLOW_PACKED_SILT = BLOCKS.register("yellow_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> LIME_PACKED_SILT = BLOCKS.register("lime_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryObject<Block> PINK_PACKED_SILT = BLOCKS.register("pink_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> GRAY_PACKED_SILT = BLOCKS.register("gray_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.COLOR_GRAY)));
    public static final RegistryObject<Block> LIGHT_GRAY_PACKED_SILT = BLOCKS.register("light_gray_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final RegistryObject<Block> CYAN_PACKED_SILT = BLOCKS.register("cyan_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryObject<Block> PURPLE_PACKED_SILT = BLOCKS.register("purple_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> BLUE_PACKED_SILT = BLOCKS.register("blue_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryObject<Block> BROWN_PACKED_SILT = BLOCKS.register("brown_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.COLOR_BROWN)));
    public static final RegistryObject<Block> GREEN_PACKED_SILT = BLOCKS.register("green_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.COLOR_GREEN)));
    public static final RegistryObject<Block> RED_PACKED_SILT = BLOCKS.register("red_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.COLOR_RED)));
    public static final RegistryObject<Block> BLACK_PACKED_SILT = BLOCKS.register("black_packed_silt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(PACKED_SILT.get()).mapColor(MapColor.COLOR_BLACK)));

    public static final RegistryObject<Block> SILT_SHINGLES = BLOCKS.register("silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA).sound(TwigsSoundEvents.SILT_SHINGLES)));
    public static final RegistryObject<Block> WHITE_SILT_SHINGLES = BLOCKS.register("white_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final RegistryObject<Block> ORANGE_SILT_SHINGLES = BLOCKS.register("orange_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> MAGENTA_SILT_SHINGLES = BLOCKS.register("magenta_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_SILT_SHINGLES = BLOCKS.register("light_blue_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> YELLOW_SILT_SHINGLES = BLOCKS.register("yellow_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> LIME_SILT_SHINGLES = BLOCKS.register("lime_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryObject<Block> PINK_SILT_SHINGLES = BLOCKS.register("pink_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> GRAY_SILT_SHINGLES = BLOCKS.register("gray_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.COLOR_GRAY)));
    public static final RegistryObject<Block> LIGHT_GRAY_SILT_SHINGLES = BLOCKS.register("light_gray_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final RegistryObject<Block> CYAN_SILT_SHINGLES = BLOCKS.register("cyan_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryObject<Block> PURPLE_SILT_SHINGLES = BLOCKS.register("purple_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> BLUE_SILT_SHINGLES = BLOCKS.register("blue_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryObject<Block> BROWN_SILT_SHINGLES = BLOCKS.register("brown_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.COLOR_BROWN)));
    public static final RegistryObject<Block> GREEN_SILT_SHINGLES = BLOCKS.register("green_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.COLOR_GREEN)));
    public static final RegistryObject<Block> RED_SILT_SHINGLES = BLOCKS.register("red_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.COLOR_RED)));
    public static final RegistryObject<Block> BLACK_SILT_SHINGLES = BLOCKS.register("black_silt_shingles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get()).mapColor(MapColor.COLOR_BLACK)));

    public static final RegistryObject<Block> SILT_SHINGLE_STAIRS = BLOCKS.register("silt_shingle_stairs", () -> new StairBlock(SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get())));
    public static final RegistryObject<Block> WHITE_SILT_SHINGLE_STAIRS = BLOCKS.register("white_silt_shingle_stairs", () -> new StairBlock(WHITE_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(WHITE_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> ORANGE_SILT_SHINGLE_STAIRS = BLOCKS.register("orange_silt_shingle_stairs", () -> new StairBlock(ORANGE_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(ORANGE_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> MAGENTA_SILT_SHINGLE_STAIRS = BLOCKS.register("magenta_silt_shingle_stairs", () -> new StairBlock(MAGENTA_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(MAGENTA_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_SILT_SHINGLE_STAIRS = BLOCKS.register("light_blue_silt_shingle_stairs", () -> new StairBlock(LIGHT_BLUE_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(LIGHT_BLUE_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> YELLOW_SILT_SHINGLE_STAIRS = BLOCKS.register("yellow_silt_shingle_stairs", () -> new StairBlock(YELLOW_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(YELLOW_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> LIME_SILT_SHINGLE_STAIRS = BLOCKS.register("lime_silt_shingle_stairs", () -> new StairBlock(LIME_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(LIME_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> PINK_SILT_SHINGLE_STAIRS = BLOCKS.register("pink_silt_shingle_stairs", () -> new StairBlock(PINK_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(PINK_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> GRAY_SILT_SHINGLE_STAIRS = BLOCKS.register("gray_silt_shingle_stairs", () -> new StairBlock(GRAY_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(GRAY_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_SILT_SHINGLE_STAIRS = BLOCKS.register("light_gray_silt_shingle_stairs", () -> new StairBlock(LIGHT_GRAY_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(LIGHT_GRAY_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> CYAN_SILT_SHINGLE_STAIRS = BLOCKS.register("cyan_silt_shingle_stairs", () -> new StairBlock(CYAN_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CYAN_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> PURPLE_SILT_SHINGLE_STAIRS = BLOCKS.register("purple_silt_shingle_stairs", () -> new StairBlock(PURPLE_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(PURPLE_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> BLUE_SILT_SHINGLE_STAIRS = BLOCKS.register("blue_silt_shingle_stairs", () -> new StairBlock(BLUE_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(BLUE_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> BROWN_SILT_SHINGLE_STAIRS = BLOCKS.register("brown_silt_shingle_stairs", () -> new StairBlock(BROWN_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(BROWN_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> GREEN_SILT_SHINGLE_STAIRS = BLOCKS.register("green_silt_shingle_stairs", () -> new StairBlock(GREEN_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(GREEN_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> RED_SILT_SHINGLE_STAIRS = BLOCKS.register("red_silt_shingle_stairs", () -> new StairBlock(RED_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(RED_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> BLACK_SILT_SHINGLE_STAIRS = BLOCKS.register("black_silt_shingle_stairs", () -> new StairBlock(BLACK_SILT_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(BLACK_SILT_SHINGLES.get())));

    public static final RegistryObject<Block> SILT_SHINGLE_SLAB = BLOCKS.register("silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get())));
    public static final RegistryObject<Block> WHITE_SILT_SHINGLE_SLAB = BLOCKS.register("white_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(WHITE_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> ORANGE_SILT_SHINGLE_SLAB = BLOCKS.register("orange_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(ORANGE_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> MAGENTA_SILT_SHINGLE_SLAB = BLOCKS.register("magenta_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(MAGENTA_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_SILT_SHINGLE_SLAB = BLOCKS.register("light_blue_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(LIGHT_BLUE_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> YELLOW_SILT_SHINGLE_SLAB = BLOCKS.register("yellow_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(YELLOW_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> LIME_SILT_SHINGLE_SLAB = BLOCKS.register("lime_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(LIME_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> PINK_SILT_SHINGLE_SLAB = BLOCKS.register("pink_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(PINK_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> GRAY_SILT_SHINGLE_SLAB = BLOCKS.register("gray_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(GRAY_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_SILT_SHINGLE_SLAB = BLOCKS.register("light_gray_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(LIGHT_GRAY_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> CYAN_SILT_SHINGLE_SLAB = BLOCKS.register("cyan_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CYAN_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> PURPLE_SILT_SHINGLE_SLAB = BLOCKS.register("purple_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(PURPLE_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> BLUE_SILT_SHINGLE_SLAB = BLOCKS.register("blue_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(BLUE_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> BROWN_SILT_SHINGLE_SLAB = BLOCKS.register("brown_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(BROWN_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> GREEN_SILT_SHINGLE_SLAB = BLOCKS.register("green_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(GREEN_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> RED_SILT_SHINGLE_SLAB = BLOCKS.register("red_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(RED_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> BLACK_SILT_SHINGLE_SLAB = BLOCKS.register("black_silt_shingle_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(BLACK_SILT_SHINGLES.get())));

    public static final RegistryObject<Block> SILT_SHINGLE_WALL = BLOCKS.register("silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SILT_SHINGLES.get())));
    public static final RegistryObject<Block> WHITE_SILT_SHINGLE_WALL = BLOCKS.register("white_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(WHITE_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> ORANGE_SILT_SHINGLE_WALL = BLOCKS.register("orange_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(ORANGE_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> MAGENTA_SILT_SHINGLE_WALL = BLOCKS.register("magenta_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(MAGENTA_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_SILT_SHINGLE_WALL = BLOCKS.register("light_blue_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(LIGHT_BLUE_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> YELLOW_SILT_SHINGLE_WALL = BLOCKS.register("yellow_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(YELLOW_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> LIME_SILT_SHINGLE_WALL = BLOCKS.register("lime_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(LIME_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> PINK_SILT_SHINGLE_WALL = BLOCKS.register("pink_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(PINK_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> GRAY_SILT_SHINGLE_WALL = BLOCKS.register("gray_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(GRAY_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_SILT_SHINGLE_WALL = BLOCKS.register("light_gray_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(LIGHT_GRAY_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> CYAN_SILT_SHINGLE_WALL = BLOCKS.register("cyan_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CYAN_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> PURPLE_SILT_SHINGLE_WALL = BLOCKS.register("purple_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(PURPLE_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> BLUE_SILT_SHINGLE_WALL = BLOCKS.register("blue_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(BLUE_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> BROWN_SILT_SHINGLE_WALL = BLOCKS.register("brown_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(BROWN_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> GREEN_SILT_SHINGLE_WALL = BLOCKS.register("green_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(GREEN_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> RED_SILT_SHINGLE_WALL = BLOCKS.register("red_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(RED_SILT_SHINGLES.get())));
    public static final RegistryObject<Block> BLACK_SILT_SHINGLE_WALL = BLOCKS.register("black_silt_shingle_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(BLACK_SILT_SHINGLES.get())));

    private static ToIntFunction<BlockState> createLampLightLevel() {
        return (state) -> (Boolean)state.getValue(BlockStateProperties.LIT) ? 15 : 0;
    }

    private static Block register(String id, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(Twigs.MOD_ID, id), block);
    }
}
