package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.block.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.ToIntFunction;

public class TwigsBlocks {

    //lamps
    public static final Block LAMP = register("lamp", new LampBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(4.5F).sounds(TwigsSoundTypes.LAMP).luminance(createLampLightLevel())));
    public static final Block SOUL_LAMP = register("soul_lamp", new LampBlock(FabricBlockSettings.copyOf(TwigsBlocks.LAMP)));
    public static final Block CRIMSON_SHROOMLAMP = register("crimson_shroomlamp", new Block(FabricBlockSettings.of(Material.NETHER_WOOD).strength(3.5F).sounds(TwigsSoundTypes.SHROOMLAMP).luminance(15)));
    public static final Block WARPED_SHROOMLAMP = register("warped_shroomlamp", new Block(FabricBlockSettings.copyOf(CRIMSON_SHROOMLAMP)));

    //basalt blocks
    public static final Block POLISHED_BASALT_BRICKS = register("polished_basalt_bricks", new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BASALT).strength(1.75F, 4.2F).sounds(TwigsSoundTypes.BASALT_BRICKS)));
    public static final Block SMOOTH_BASALT_BRICKS = register("smooth_basalt_bricks", new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT).strength(1.75F, 4.2F).sounds(TwigsSoundTypes.BASALT_BRICKS)));
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

    //misc
    public static final Block ROCKY_DIRT = register("rocky_dirt", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 6.0F).sounds(TwigsSoundTypes.ROCKY_DIRT)));

    private static ToIntFunction<BlockState> createLampLightLevel() {
        return (state) -> (Boolean)state.getValue(BlockStateProperties.LIT) ? 15 : 0;
    }

    private static Block register(String id, Block block) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(Twigs.MOD_ID, id), block);
    }
}
