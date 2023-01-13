package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.block.*;
import com.ninni.twigs.block.enums.SiltPotBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.ToIntFunction;

public class TwigsBlocks {

    //lamps
    public static final Block LAMP = register("lamp", new LampBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(4.5F).sounds(TwigsSoundEvents.LAMP).luminance(createLampLightLevel())));
    public static final Block SOUL_LAMP = register("soul_lamp", new LampBlock(FabricBlockSettings.copyOf(TwigsBlocks.LAMP)));
    public static final Block CRIMSON_SHROOMLAMP = register("crimson_shroomlamp", new Block(FabricBlockSettings.of(Material.NETHER_WOOD).strength(3.5F).sounds(TwigsSoundEvents.SHROOMLAMP).luminance(15)));
    public static final Block WARPED_SHROOMLAMP = register("warped_shroomlamp", new Block(FabricBlockSettings.copyOf(CRIMSON_SHROOMLAMP)));

    //basalt blocks
    public static final Block POLISHED_BASALT_BRICKS = register("polished_basalt_bricks", new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BASALT).strength(1.75F, 4.2F).sounds(TwigsSoundEvents.BASALT_BRICKS)));
    public static final Block SMOOTH_BASALT_BRICKS = register("smooth_basalt_bricks", new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT).strength(1.75F, 4.2F).sounds(TwigsSoundEvents.BASALT_BRICKS)));
    public static final Block SMOOTH_BASALT_BRICK_STAIRS = register("smooth_basalt_brick_stairs", new StairBlock(SMOOTH_BASALT_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(SMOOTH_BASALT_BRICKS)));
    public static final Block SMOOTH_BASALT_BRICK_SLAB = register("smooth_basalt_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_BASALT_BRICKS)));
    public static final Block SMOOTH_BASALT_BRICK_WALL = register("smooth_basalt_brick_wall", new WallBlock(FabricBlockSettings.copyOf(SMOOTH_BASALT_BRICKS)));
    public static final Block CHISELED_SMOOTH_BASALT_BRICKS = register("chiseled_smooth_basalt_bricks", new Block(FabricBlockSettings.copyOf(SMOOTH_BASALT_BRICKS)));

    //bricks
    public static final Block MIXED_BRICKS = register("mixed_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block CHISELED_BRICKS = register("chiseled_bricks", new FacingBlock(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block CRACKED_BRICKS = register("cracked_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block MOSSY_BRICKS = register("mossy_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block MOSSY_BRICK_STAIRS = register("mossy_brick_stairs", new StairBlock(MOSSY_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(MOSSY_BRICKS)));
    public static final Block MOSSY_BRICK_SLAB = register("mossy_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(MOSSY_BRICKS)));
    public static final Block MOSSY_BRICK_WALL = register("mossy_brick_wall", new WallBlock(FabricBlockSettings.copyOf(MOSSY_BRICKS)));

    //gravel bricks
    public static final Block GRAVEL_BRICKS = register("gravel_bricks", new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(0.8f).sound(TwigsSoundEvents.GRAVEL_BRICKS)));
    public static final Block GRAVEL_BRICK_STAIRS = register("gravel_brick_stairs", new StairBlock(GRAVEL_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(GRAVEL_BRICKS)));
    public static final Block GRAVEL_BRICK_SLAB = register("gravel_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(GRAVEL_BRICKS)));
    public static final Block GRAVEL_BRICK_WALL = register("gravel_brick_wall", new WallBlock(FabricBlockSettings.copyOf(GRAVEL_BRICKS)));

    //smooth stone bricks
    public static final Block SMOOTH_STONE_BRICKS = register("smooth_stone_bricks", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block SMOOTH_STONE_BRICK_STAIRS = register("smooth_stone_brick_stairs", new StairBlock(SMOOTH_STONE_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(SMOOTH_STONE_BRICKS)));
    public static final Block SMOOTH_STONE_BRICK_SLAB = register("smooth_stone_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE_BRICKS)));
    public static final Block SMOOTH_STONE_BRICK_WALL = register("smooth_stone_brick_wall", new WallBlock(FabricBlockSettings.copyOf(SMOOTH_STONE_BRICKS)));

    //columns
    public static final Block QUARTZ_COLUMN = register("quartz_column", new ColumnBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block STONE_COLUMN = register("stone_column", new ColumnBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block DEEPSLATE_COLUMN = register("deepslate_column", new ColumnBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block BLACKSTONE_COLUMN = register("blackstone_column", new ColumnBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));

    //amethyst blocks
    public static final Block POLISHED_AMETHYST = register("polished_amethyst", new AmethystBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block CUT_AMETHYST = register("cut_amethyst", new CutAmethystBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    //misc
    public static final Block COMPACTED_DRIPSTONE = register("compacted_dripstone", new CompactedDripstoneBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block ROCKY_DIRT = register("rocky_dirt", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 6.0F).sounds(TwigsSoundEvents.ROCKY_DIRT)));

    //decorated blackstone bricks
    public static final Block TWISTING_POLISHED_BLACKSTONE_BRICKS = register("twisting_polished_blackstone_bricks", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS = register("twisting_polished_blackstone_brick_stairs", new StairBlock(TWISTING_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(TWISTING_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB = register("twisting_polished_blackstone_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(TWISTING_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block TWISTING_POLISHED_BLACKSTONE_BRICK_WALL = register("twisting_polished_blackstone_brick_wall", new WallBlock(FabricBlockSettings.copyOf(TWISTING_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICKS = register("weeping_polished_blackstone_bricks", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS = register("weeping_polished_blackstone_brick_stairs", new StairBlock(WEEPING_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(WEEPING_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB = register("weeping_polished_blackstone_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(WEEPING_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICK_WALL = register("weeping_polished_blackstone_brick_wall", new WallBlock(FabricBlockSettings.copyOf(WEEPING_POLISHED_BLACKSTONE_BRICKS)));

    //schist blocks
    public static final Block SCHIST = register("schist", new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).requiresTool().strength(1F).sounds(SoundType.CALCITE)));
    public static final Block SCHIST_STAIRS = register("schist_stairs", new StairBlock(SCHIST.defaultBlockState(), FabricBlockSettings.copyOf(SCHIST)));
    public static final Block SCHIST_SLAB = register("schist_slab", new SlabBlock(FabricBlockSettings.copyOf(SCHIST)));
    public static final Block SCHIST_WALL = register("schist_wall", new WallBlock(FabricBlockSettings.copyOf(SCHIST)));
    public static final Block POLISHED_SCHIST = register("polished_schist", new Block(FabricBlockSettings.copyOf(SCHIST)));
    public static final Block POLISHED_SCHIST_STAIRS = register("polished_schist_stairs", new StairBlock(POLISHED_SCHIST.defaultBlockState(), FabricBlockSettings.copyOf(POLISHED_SCHIST)));
    public static final Block POLISHED_SCHIST_SLAB = register("polished_schist_slab", new SlabBlock(FabricBlockSettings.copyOf(POLISHED_SCHIST)));
    public static final Block POLISHED_SCHIST_BRICKS = register("polished_schist_bricks", new Block(FabricBlockSettings.copyOf(SCHIST)));
    public static final Block POLISHED_SCHIST_BRICK_STAIRS = register("polished_schist_brick_stairs", new StairBlock(POLISHED_SCHIST_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(POLISHED_SCHIST_BRICKS)));
    public static final Block POLISHED_SCHIST_BRICK_SLAB = register("polished_schist_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(POLISHED_SCHIST_BRICKS)));
    public static final Block POLISHED_SCHIST_BRICK_WALL = register("polished_schist_brick_wall", new WallBlock(FabricBlockSettings.copyOf(POLISHED_SCHIST_BRICKS)));
    public static final Block CRACKED_POLISHED_SCHIST_BRICKS = register("cracked_polished_schist_bricks", new Block(FabricBlockSettings.copyOf(POLISHED_SCHIST_BRICKS)));

    //rhyolite blocks
    public static final Block RHYOLITE = register("rhyolite", new RotatedPillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).requiresTool().strength(1.5F).sounds(SoundType.DEEPSLATE)));
    public static final Block RHYOLITE_STAIRS = register("rhyolite_stairs", new StairBlock(RHYOLITE.defaultBlockState(), FabricBlockSettings.copyOf(RHYOLITE)));
    public static final Block RHYOLITE_SLAB = register("rhyolite_slab", new SlabBlock(FabricBlockSettings.copyOf(RHYOLITE)));
    public static final Block RHYOLITE_WALL = register("rhyolite_wall", new WallBlock(FabricBlockSettings.copyOf(RHYOLITE)));
    public static final Block POLISHED_RHYOLITE = register("polished_rhyolite", new Block(FabricBlockSettings.copyOf(RHYOLITE)));
    public static final Block POLISHED_RHYOLITE_STAIRS = register("polished_rhyolite_stairs", new StairBlock(POLISHED_RHYOLITE.defaultBlockState(), FabricBlockSettings.copyOf(POLISHED_RHYOLITE)));
    public static final Block POLISHED_RHYOLITE_SLAB = register("polished_rhyolite_slab", new SlabBlock(FabricBlockSettings.copyOf(POLISHED_RHYOLITE)));
    public static final Block POLISHED_RHYOLITE_BRICKS = register("polished_rhyolite_bricks", new Block(FabricBlockSettings.copyOf(RHYOLITE)));
    public static final Block POLISHED_RHYOLITE_BRICK_STAIRS = register("polished_rhyolite_brick_stairs", new StairBlock(POLISHED_RHYOLITE_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(POLISHED_RHYOLITE_BRICKS)));
    public static final Block POLISHED_RHYOLITE_BRICK_SLAB = register("polished_rhyolite_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(POLISHED_RHYOLITE_BRICKS)));
    public static final Block POLISHED_RHYOLITE_BRICK_WALL = register("polished_rhyolite_brick_wall", new WallBlock(FabricBlockSettings.copyOf(POLISHED_RHYOLITE_BRICKS)));
    public static final Block CRACKED_POLISHED_RHYOLITE_BRICKS = register("cracked_polished_rhyolite_bricks", new Block(FabricBlockSettings.copyOf(POLISHED_RHYOLITE_BRICKS)));

    //bloodstone blocks
    public static final Block BLOODSTONE = register("bloodstone", new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).requiresTool().strength(1F).sounds(SoundType.BASALT)));
    public static final Block BLOODSTONE_STAIRS = register("bloodstone_stairs", new StairBlock(BLOODSTONE.defaultBlockState(), FabricBlockSettings.copyOf(BLOODSTONE)));
    public static final Block BLOODSTONE_SLAB = register("bloodstone_slab", new SlabBlock(FabricBlockSettings.copyOf(BLOODSTONE)));
    public static final Block BLOODSTONE_WALL = register("bloodstone_wall", new WallBlock(FabricBlockSettings.copyOf(BLOODSTONE)));
    public static final Block POLISHED_BLOODSTONE = register("polished_bloodstone", new Block(FabricBlockSettings.copyOf(BLOODSTONE)));
    public static final Block POLISHED_BLOODSTONE_STAIRS = register("polished_bloodstone_stairs", new StairBlock(POLISHED_BLOODSTONE.defaultBlockState(), FabricBlockSettings.copyOf(POLISHED_BLOODSTONE)));
    public static final Block POLISHED_BLOODSTONE_SLAB = register("polished_bloodstone_slab", new SlabBlock(FabricBlockSettings.copyOf(POLISHED_BLOODSTONE)));
    public static final Block POLISHED_BLOODSTONE_BRICKS = register("polished_bloodstone_bricks", new Block(FabricBlockSettings.copyOf(BLOODSTONE)));
    public static final Block POLISHED_BLOODSTONE_BRICK_STAIRS = register("polished_bloodstone_brick_stairs", new StairBlock(POLISHED_BLOODSTONE_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(POLISHED_BLOODSTONE_BRICKS)));
    public static final Block POLISHED_BLOODSTONE_BRICK_SLAB = register("polished_bloodstone_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(POLISHED_BLOODSTONE_BRICKS)));
    public static final Block POLISHED_BLOODSTONE_BRICK_WALL = register("polished_bloodstone_brick_wall", new WallBlock(FabricBlockSettings.copyOf(POLISHED_BLOODSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLOODSTONE_BRICKS = register("cracked_polished_bloodstone_bricks", new Block(FabricBlockSettings.copyOf(POLISHED_BLOODSTONE_BRICKS)));

    //silt blocks
    public static final Block SILT = register("silt", new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.CLAY).color(MaterialColor.COLOR_BROWN).sound(TwigsSoundEvents.SILT)));
    public static final Block SILT_BRICKS = register("silt_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS).color(MaterialColor.COLOR_YELLOW)));
    public static final Block SILT_BRICK_STAIRS = register("silt_brick_stairs", new StairBlock(SILT_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(SILT_BRICKS)));
    public static final Block SILT_BRICK_SLAB = register("silt_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(SILT_BRICKS)));
    public static final Block SILT_BRICK_WALL = register("silt_brick_wall", new WallBlock(FabricBlockSettings.copyOf(SILT_BRICKS)));

    public static final Block SILT_POT = register("silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(0.5f, 2f)));
    public static final Block WHITE_SILT_POT = register("white_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.TERRACOTTA_WHITE)));
    public static final Block ORANGE_SILT_POT = register("orange_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.COLOR_ORANGE)));
    public static final Block MAGENTA_SILT_POT = register("magenta_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.COLOR_MAGENTA)));
    public static final Block LIGHT_BLUE_SILT_POT = register("light_blue_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.COLOR_LIGHT_BLUE)));
    public static final Block YELLOW_SILT_POT = register("yellow_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.COLOR_YELLOW)));
    public static final Block LIME_SILT_POT = register("lime_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.COLOR_LIGHT_GREEN)));
    public static final Block PINK_SILT_POT = register("pink_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.COLOR_PINK)));
    public static final Block GRAY_SILT_POT = register("gray_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.COLOR_GRAY)));
    public static final Block LIGHT_GRAY_SILT_POT = register("light_gray_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.COLOR_LIGHT_GRAY)));
    public static final Block CYAN_SILT_POT = register("cyan_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.COLOR_CYAN)));
    public static final Block PURPLE_SILT_POT = register("purple_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.COLOR_PURPLE)));
    public static final Block BLUE_SILT_POT = register("blue_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.COLOR_BLUE)));
    public static final Block BROWN_SILT_POT = register("brown_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.COLOR_BROWN)));
    public static final Block GREEN_SILT_POT = register("green_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.COLOR_GREEN)));
    public static final Block RED_SILT_POT = register("red_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.COLOR_RED)));
    public static final Block BLACK_SILT_POT = register("black_silt_pot", new SiltPotBlock(FabricBlockSettings.copyOf(SILT_POT).color(MaterialColor.COLOR_BLACK)));

    public static final Block PACKED_SILT = register("packed_silt", new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(TwigsSoundEvents.PACKED_SILT)));
    public static final Block WHITE_PACKED_SILT = register("white_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.TERRACOTTA_WHITE)));
    public static final Block ORANGE_PACKED_SILT = register("orange_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.COLOR_ORANGE)));
    public static final Block MAGENTA_PACKED_SILT = register("magenta_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.COLOR_MAGENTA)));
    public static final Block LIGHT_BLUE_PACKED_SILT = register("light_blue_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.COLOR_LIGHT_BLUE)));
    public static final Block YELLOW_PACKED_SILT = register("yellow_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.COLOR_YELLOW)));
    public static final Block LIME_PACKED_SILT = register("lime_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.COLOR_LIGHT_GREEN)));
    public static final Block PINK_PACKED_SILT = register("pink_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.COLOR_PINK)));
    public static final Block GRAY_PACKED_SILT = register("gray_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.COLOR_GRAY)));
    public static final Block LIGHT_GRAY_PACKED_SILT = register("light_gray_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.COLOR_LIGHT_GRAY)));
    public static final Block CYAN_PACKED_SILT = register("cyan_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.COLOR_CYAN)));
    public static final Block PURPLE_PACKED_SILT = register("purple_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.COLOR_PURPLE)));
    public static final Block BLUE_PACKED_SILT = register("blue_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.COLOR_BLUE)));
    public static final Block BROWN_PACKED_SILT = register("brown_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.COLOR_BROWN)));
    public static final Block GREEN_PACKED_SILT = register("green_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.COLOR_GREEN)));
    public static final Block RED_PACKED_SILT = register("red_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.COLOR_RED)));
    public static final Block BLACK_PACKED_SILT = register("black_packed_silt", new Block(FabricBlockSettings.copyOf(PACKED_SILT).color(MaterialColor.COLOR_BLACK)));

    public static final Block SILT_SHINGLES = register("silt_shingles", new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(TwigsSoundEvents.SILT_SHINGLES)));
    public static final Block WHITE_SILT_SHINGLES = register("white_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.TERRACOTTA_WHITE)));
    public static final Block ORANGE_SILT_SHINGLES = register("orange_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.COLOR_ORANGE)));
    public static final Block MAGENTA_SILT_SHINGLES = register("magenta_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.COLOR_MAGENTA)));
    public static final Block LIGHT_BLUE_SILT_SHINGLES = register("light_blue_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.COLOR_LIGHT_BLUE)));
    public static final Block YELLOW_SILT_SHINGLES = register("yellow_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.COLOR_YELLOW)));
    public static final Block LIME_SILT_SHINGLES = register("lime_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.COLOR_LIGHT_GREEN)));
    public static final Block PINK_SILT_SHINGLES = register("pink_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.COLOR_PINK)));
    public static final Block GRAY_SILT_SHINGLES = register("gray_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.COLOR_GRAY)));
    public static final Block LIGHT_GRAY_SILT_SHINGLES = register("light_gray_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.COLOR_LIGHT_GRAY)));
    public static final Block CYAN_SILT_SHINGLES = register("cyan_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.COLOR_CYAN)));
    public static final Block PURPLE_SILT_SHINGLES = register("purple_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.COLOR_PURPLE)));
    public static final Block BLUE_SILT_SHINGLES = register("blue_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.COLOR_BLUE)));
    public static final Block BROWN_SILT_SHINGLES = register("brown_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.COLOR_BROWN)));
    public static final Block GREEN_SILT_SHINGLES = register("green_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.COLOR_GREEN)));
    public static final Block RED_SILT_SHINGLES = register("red_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.COLOR_RED)));
    public static final Block BLACK_SILT_SHINGLES = register("black_silt_shingles", new Block(FabricBlockSettings.copyOf(SILT_SHINGLES).color(MaterialColor.COLOR_BLACK)));

    public static final Block SILT_SHINGLE_STAIRS = register("silt_shingle_stairs", new StairBlock(SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(SILT_SHINGLES)));
    public static final Block WHITE_SILT_SHINGLE_STAIRS = register("white_silt_shingle_stairs", new StairBlock(WHITE_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(WHITE_SILT_SHINGLES)));
    public static final Block ORANGE_SILT_SHINGLE_STAIRS = register("orange_silt_shingle_stairs", new StairBlock(ORANGE_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(ORANGE_SILT_SHINGLES)));
    public static final Block MAGENTA_SILT_SHINGLE_STAIRS = register("magenta_silt_shingle_stairs", new StairBlock(MAGENTA_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(MAGENTA_SILT_SHINGLES)));
    public static final Block LIGHT_BLUE_SILT_SHINGLE_STAIRS = register("light_blue_silt_shingle_stairs", new StairBlock(LIGHT_BLUE_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(LIGHT_BLUE_SILT_SHINGLES)));
    public static final Block YELLOW_SILT_SHINGLE_STAIRS = register("yellow_silt_shingle_stairs", new StairBlock(YELLOW_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(YELLOW_SILT_SHINGLES)));
    public static final Block LIME_SILT_SHINGLE_STAIRS = register("lime_silt_shingle_stairs", new StairBlock(LIME_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(LIME_SILT_SHINGLES)));
    public static final Block PINK_SILT_SHINGLE_STAIRS = register("pink_silt_shingle_stairs", new StairBlock(PINK_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(PINK_SILT_SHINGLES)));
    public static final Block GRAY_SILT_SHINGLE_STAIRS = register("gray_silt_shingle_stairs", new StairBlock(GRAY_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(GRAY_SILT_SHINGLES)));
    public static final Block LIGHT_GRAY_SILT_SHINGLE_STAIRS = register("light_gray_silt_shingle_stairs", new StairBlock(LIGHT_GRAY_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(LIGHT_GRAY_SILT_SHINGLES)));
    public static final Block CYAN_SILT_SHINGLE_STAIRS = register("cyan_silt_shingle_stairs", new StairBlock(CYAN_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(CYAN_SILT_SHINGLES)));
    public static final Block PURPLE_SILT_SHINGLE_STAIRS = register("purple_silt_shingle_stairs", new StairBlock(PURPLE_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(PURPLE_SILT_SHINGLES)));
    public static final Block BLUE_SILT_SHINGLE_STAIRS = register("blue_silt_shingle_stairs", new StairBlock(BLUE_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(BLUE_SILT_SHINGLES)));
    public static final Block BROWN_SILT_SHINGLE_STAIRS = register("brown_silt_shingle_stairs", new StairBlock(BROWN_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(BROWN_SILT_SHINGLES)));
    public static final Block GREEN_SILT_SHINGLE_STAIRS = register("green_silt_shingle_stairs", new StairBlock(GREEN_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(GREEN_SILT_SHINGLES)));
    public static final Block RED_SILT_SHINGLE_STAIRS = register("red_silt_shingle_stairs", new StairBlock(RED_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(RED_SILT_SHINGLES)));
    public static final Block BLACK_SILT_SHINGLE_STAIRS = register("black_silt_shingle_stairs", new StairBlock(BLACK_SILT_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(BLACK_SILT_SHINGLES)));

    public static final Block SILT_SHINGLE_SLAB = register("silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(SILT_SHINGLES)));
    public static final Block WHITE_SILT_SHINGLE_SLAB = register("white_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(WHITE_SILT_SHINGLES)));
    public static final Block ORANGE_SILT_SHINGLE_SLAB = register("orange_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(ORANGE_SILT_SHINGLES)));
    public static final Block MAGENTA_SILT_SHINGLE_SLAB = register("magenta_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(MAGENTA_SILT_SHINGLES)));
    public static final Block LIGHT_BLUE_SILT_SHINGLE_SLAB = register("light_blue_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(LIGHT_BLUE_SILT_SHINGLES)));
    public static final Block YELLOW_SILT_SHINGLE_SLAB = register("yellow_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(YELLOW_SILT_SHINGLES)));
    public static final Block LIME_SILT_SHINGLE_SLAB = register("lime_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(LIME_SILT_SHINGLES)));
    public static final Block PINK_SILT_SHINGLE_SLAB = register("pink_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(PINK_SILT_SHINGLES)));
    public static final Block GRAY_SILT_SHINGLE_SLAB = register("gray_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(GRAY_SILT_SHINGLES)));
    public static final Block LIGHT_GRAY_SILT_SHINGLE_SLAB = register("light_gray_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(LIGHT_GRAY_SILT_SHINGLES)));
    public static final Block CYAN_SILT_SHINGLE_SLAB = register("cyan_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(CYAN_SILT_SHINGLES)));
    public static final Block PURPLE_SILT_SHINGLE_SLAB = register("purple_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(PURPLE_SILT_SHINGLES)));
    public static final Block BLUE_SILT_SHINGLE_SLAB = register("blue_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(BLUE_SILT_SHINGLES)));
    public static final Block BROWN_SILT_SHINGLE_SLAB = register("brown_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(BROWN_SILT_SHINGLES)));
    public static final Block GREEN_SILT_SHINGLE_SLAB = register("green_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(GREEN_SILT_SHINGLES)));
    public static final Block RED_SILT_SHINGLE_SLAB = register("red_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(RED_SILT_SHINGLES)));
    public static final Block BLACK_SILT_SHINGLE_SLAB = register("black_silt_shingle_slab", new SlabBlock(FabricBlockSettings.copyOf(BLACK_SILT_SHINGLES)));

    public static final Block SILT_SHINGLE_WALL = register("silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(SILT_SHINGLES)));
    public static final Block WHITE_SILT_SHINGLE_WALL = register("white_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(WHITE_SILT_SHINGLES)));
    public static final Block ORANGE_SILT_SHINGLE_WALL = register("orange_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(ORANGE_SILT_SHINGLES)));
    public static final Block MAGENTA_SILT_SHINGLE_WALL = register("magenta_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(MAGENTA_SILT_SHINGLES)));
    public static final Block LIGHT_BLUE_SILT_SHINGLE_WALL = register("light_blue_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(LIGHT_BLUE_SILT_SHINGLES)));
    public static final Block YELLOW_SILT_SHINGLE_WALL = register("yellow_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(YELLOW_SILT_SHINGLES)));
    public static final Block LIME_SILT_SHINGLE_WALL = register("lime_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(LIME_SILT_SHINGLES)));
    public static final Block PINK_SILT_SHINGLE_WALL = register("pink_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(PINK_SILT_SHINGLES)));
    public static final Block GRAY_SILT_SHINGLE_WALL = register("gray_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(GRAY_SILT_SHINGLES)));
    public static final Block LIGHT_GRAY_SILT_SHINGLE_WALL = register("light_gray_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(LIGHT_GRAY_SILT_SHINGLES)));
    public static final Block CYAN_SILT_SHINGLE_WALL = register("cyan_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(CYAN_SILT_SHINGLES)));
    public static final Block PURPLE_SILT_SHINGLE_WALL = register("purple_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(PURPLE_SILT_SHINGLES)));
    public static final Block BLUE_SILT_SHINGLE_WALL = register("blue_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(BLUE_SILT_SHINGLES)));
    public static final Block BROWN_SILT_SHINGLE_WALL = register("brown_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(BROWN_SILT_SHINGLES)));
    public static final Block GREEN_SILT_SHINGLE_WALL = register("green_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(GREEN_SILT_SHINGLES)));
    public static final Block RED_SILT_SHINGLE_WALL = register("red_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(RED_SILT_SHINGLES)));
    public static final Block BLACK_SILT_SHINGLE_WALL = register("black_silt_shingle_wall", new WallBlock(FabricBlockSettings.copyOf(BLACK_SILT_SHINGLES)));

    private static ToIntFunction<BlockState> createLampLightLevel() {
        return (state) -> (Boolean)state.getValue(BlockStateProperties.LIT) ? 15 : 0;
    }

    private static Block register(String id, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Twigs.MOD_ID, id), block);
    }
}
