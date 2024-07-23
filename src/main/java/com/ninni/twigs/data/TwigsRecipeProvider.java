package com.ninni.twigs.data;

import com.ninni.twigs.TwigsTags;
import com.ninni.twigs.registry.TwigsBlocks;
import com.ninni.twigs.registry.TwigsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

import static com.ninni.twigs.Twigs.MOD_ID;
import static com.ninni.twigs.util.RecipeHelper.*;
import static net.minecraft.data.recipes.RecipeCategory.BUILDING_BLOCKS;

public class TwigsRecipeProvider extends FabricRecipeProvider {
    public TwigsRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        collectiblesRecipes(exporter);
        bambooRecipes(exporter);
        paperLanternRecipes(exporter);
        lampRecipes(exporter);
        tableRecipes(exporter);
        basaltRecipes(exporter);
        brickRecipes(exporter);
        gravelBricksRecipes(exporter);
        smoothStoneBricksRecipes(exporter);
        columnRecipes(exporter);
        copperPillarRecipes(exporter);
        amethystAndMiscRecipes(exporter);
        cobblestoneBricksRecipes(exporter);
        twistingAndWeepingRecipes(exporter);
        polishedTuffRecipes(exporter);
        calciteRecipes(exporter);
        schistRecipes(exporter);
        rhyoliteRecipes(exporter);
        bloodstoneRecipes(exporter);
        siltRecipes(exporter);
        coloredSiltRecipes(exporter);
    }

    private void collectiblesRecipes(RecipeOutput exporter) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.AZALEA_FLOWERS, 6)
                .requires(Blocks.FLOWERING_AZALEA_LEAVES)
                .unlockedBy("has_azalea_leaves", has(Blocks.FLOWERING_AZALEA_LEAVES))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "azalea_flowers_from_flowering_azalea_leaves"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.AZALEA_FLOWERS, 6)
                .requires(Blocks.FLOWERING_AZALEA)
                .unlockedBy("has_azalea", has(Blocks.FLOWERING_AZALEA))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "azalea_flowers_from_flowering_azalea"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, Items.STICK, 2)
                .requires(TwigsItems.TWIG)
                .unlockedBy("has_twig", has(TwigsItems.TWIG))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "twig_to_stick"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE, 1)
                .pattern("##")
                .pattern("##")
                .define('#', TwigsItems.PEBBLE)
                .unlockedBy("has_pebble", has(TwigsItems.PEBBLE))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "cobblestone_from_pebble"));


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Items.BONE_MEAL, 3)
                .pattern("#")
                .define('#', TwigsTags.SEASHELLS)
                .unlockedBy("has_seashells", has(TwigsTags.SEASHELLS))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "bone_meal_from_seashells"));

    }

    private void bambooRecipes(RecipeOutput exporter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.BAMBOO_MAT, 2)
                .pattern("###")
                .define('#', Items.BAMBOO)
                .unlockedBy("has_bamboo", has(Items.BAMBOO))
                .save(exporter);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.BAMBOO_THATCH_SLAB, 6)
                .pattern("###")
                .define('#', TwigsBlocks.BAMBOO_THATCH)
                .unlockedBy("has_bamboo_thatch", has(TwigsBlocks.BAMBOO_THATCH))
                .save(exporter);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.BAMBOO_THATCH, 2)
                .pattern("##")
                .pattern("##")
                .define('#', TwigsBlocks.BAMBOO_LEAVES)
                .unlockedBy("has_bamboo_leaves", has(TwigsBlocks.BAMBOO_LEAVES))
                .save(exporter);
    }

    private void paperLanternRecipes(RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.PAPER_LANTERN, 1)
                .pattern("###")
                .pattern("#T#")
                .pattern("###")
                .define('#', Items.PAPER)
                .define('T', Items.TORCH)
                .unlockedBy("has_paper", has(Items.PAPER))
                .unlockedBy("has_torch", has(Items.TORCH))
                .save(exporter);
        quickPaperLanternRecipe(exporter, TwigsBlocks.ALLIUM_PAPER_LANTERN, Items.ALLIUM);
        quickPaperLanternRecipe(exporter, TwigsBlocks.BLUE_ORCHID_PAPER_LANTERN, Items.BLUE_ORCHID);
        quickPaperLanternRecipe(exporter, TwigsBlocks.CRIMSON_ROOTS_PAPER_LANTERN, Items.CRIMSON_ROOTS);
        quickPaperLanternRecipe(exporter, TwigsBlocks.DANDELION_PAPER_LANTERN, Items.DANDELION);
        quickPaperLanternRecipe(exporter, TwigsBlocks.TORCHFLOWER_PAPER_LANTERN, Items.TORCHFLOWER);
    }

    private void lampRecipes(RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.LAMP, 1)
                .pattern("iii")
                .pattern("iTi")
                .pattern("iCi")
                .define('i', Items.IRON_INGOT)
                .define('T', Items.TORCH)
                .define('C', Items.COAL)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .unlockedBy("has_torch", has(Items.TORCH))
                .unlockedBy("has_coal", has(Items.COAL))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.SOUL_LAMP, 1)
                .pattern("iii")
                .pattern("iSi")
                .pattern("iFi")
                .define('i', Items.IRON_INGOT)
                .define('S', Items.SOUL_TORCH)
                .define('F', Items.SOUL_SAND)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .unlockedBy("has_soul_torch", has(Items.SOUL_TORCH))
                .unlockedBy("has_soul_sand", has(Items.SOUL_SAND))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.WARPED_SHROOMLAMP, 1)
                .pattern("###")
                .pattern("SSS")
                .pattern("###")
                .define('#', Items.WARPED_PLANKS)
                .define('S', Items.SHROOMLIGHT)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .unlockedBy("has_shroomlight", has(Items.SHROOMLIGHT))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.CRIMSON_SHROOMLAMP, 1)
                .pattern("###")
                .pattern("SSS")
                .pattern("###")
                .define('#', Items.CRIMSON_PLANKS)
                .define('S', Items.SHROOMLIGHT)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .unlockedBy("has_shroomlight", has(Items.SHROOMLIGHT))
                .save(exporter);
    }

    private void tableRecipes(RecipeOutput exporter) {
        quickTableRecipe(exporter, TwigsBlocks.ACACIA_TABLE, Blocks.ACACIA_SLAB, Blocks.ACACIA_FENCE, Blocks.ACACIA_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.BAMBOO_TABLE, Blocks.BAMBOO_SLAB, Blocks.BAMBOO_FENCE, Blocks.BAMBOO_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.BIRCH_TABLE, Blocks.BIRCH_SLAB, Blocks.BIRCH_FENCE, Blocks.BIRCH_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.CHERRY_TABLE, Blocks.CHERRY_SLAB, Blocks.CHERRY_FENCE, Blocks.CHERRY_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.CRIMSON_TABLE, Blocks.CRIMSON_SLAB, Blocks.CRIMSON_FENCE, Blocks.CRIMSON_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.DARK_OAK_TABLE, Blocks.DARK_OAK_SLAB, Blocks.DARK_OAK_FENCE, Blocks.DARK_OAK_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.JUNGLE_TABLE, Blocks.JUNGLE_SLAB, Blocks.JUNGLE_FENCE, Blocks.JUNGLE_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.MANGROVE_TABLE, Blocks.MANGROVE_SLAB, Blocks.MANGROVE_FENCE, Blocks.MANGROVE_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.OAK_TABLE, Blocks.OAK_SLAB, Blocks.OAK_FENCE, Blocks.OAK_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.SPRUCE_TABLE, Blocks.SPRUCE_SLAB, Blocks.SPRUCE_FENCE, Blocks.SPRUCE_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.WARPED_TABLE, Blocks.WARPED_SLAB, Blocks.WARPED_FENCE, Blocks.WARPED_PLANKS);
    }

    private void basaltRecipes(RecipeOutput exporter) {

        quick2x2Recipe(exporter, TwigsBlocks.POLISHED_BASALT_BRICKS, Blocks.POLISHED_BASALT);
        quickStonecuttingRecipe(exporter, TwigsBlocks.POLISHED_BASALT_BRICKS, Blocks.POLISHED_BASALT, 1);

        quickPolishedRecipes(exporter, TwigsBlocks.SMOOTH_BASALT_BRICKS,
                TwigsBlocks.SMOOTH_BASALT_BRICK_SLAB, TwigsBlocks.SMOOTH_BASALT_BRICK_STAIRS, TwigsBlocks.SMOOTH_BASALT_BRICK_WALL,
                Blocks.SMOOTH_BASALT);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.CHISELED_SMOOTH_BASALT_BRICKS, 1)
                .pattern("#")
                .pattern("#")
                .define('#', TwigsBlocks.SMOOTH_BASALT_BRICK_SLAB)
                .unlockedBy("has_smooth_basalt_brick_slab", has(TwigsBlocks.SMOOTH_BASALT_BRICK_SLAB))
                .unlockedBy("has_chiseled_smooth_basalt_bricks", has(TwigsBlocks.CHISELED_SMOOTH_BASALT_BRICKS))
                .save(exporter);

        quickStonecuttingRecipe(exporter, TwigsBlocks.CHISELED_SMOOTH_BASALT_BRICKS, TwigsBlocks.SMOOTH_BASALT_BRICKS, 1);
    }

    private void brickRecipes(RecipeOutput exporter) {
        quick2x2Recipe(exporter, TwigsBlocks.MIXED_BRICKS, Blocks.BRICKS);
        quickStonecuttingRecipe(exporter, TwigsBlocks.MIXED_BRICKS, Blocks.BRICKS, 1);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.CHISELED_BRICKS, 1)
                .pattern("#")
                .pattern("#")
                .define('#', Blocks.BRICK_SLAB)
                .unlockedBy("has_brick_slab", has(Blocks.BRICK_SLAB))
                .unlockedBy("has_chiseled_bricks", has(TwigsBlocks.CHISELED_BRICKS))
                .save(exporter);
        quickStonecuttingRecipe(exporter, TwigsBlocks.CHISELED_BRICKS, Blocks.BRICKS, 1);

        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_BRICKS, Blocks.BRICKS);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.MOSSY_BRICKS)
                .requires(Blocks.BRICKS)
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_bricks_from_bricks"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.MOSSY_BRICKS)
                .requires(Blocks.BRICKS)
                .requires(Blocks.VINE)
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .unlockedBy("has_vines", has(Blocks.VINE))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_bricks_from_vines"));
        quickSlabStairsWallRecipe(exporter, TwigsBlocks.MOSSY_BRICK_SLAB, TwigsBlocks.MOSSY_BRICK_STAIRS, TwigsBlocks.MOSSY_BRICK_WALL,
                TwigsBlocks.MOSSY_BRICKS);

        quickTrailRecipe(exporter, TwigsBlocks.BRICK_TRAIL, Blocks.BRICKS);
        quickStonecuttingRecipe(exporter, TwigsBlocks.BRICK_TRAIL, Blocks.BRICKS, 2);

    }

    private void gravelBricksRecipes(RecipeOutput exporter) {
        Block brick = TwigsBlocks.GRAVEL_BRICKS;
        quick2x2Recipe(exporter, brick, Blocks.GRAVEL);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, TwigsBlocks.GRAVEL_BRICK_SLAB, 6)
                .pattern("###")
                .define('#', brick)
                .unlockedBy(getHasName(brick), has(brick))
                .save(exporter);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, TwigsBlocks.GRAVEL_BRICK_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', brick)
                .unlockedBy(getHasName(brick), has(brick))
                .save(exporter);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, TwigsBlocks.GRAVEL_BRICK_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', brick)
                .unlockedBy(getHasName(brick), has(brick))
                .save(exporter);

    }

    private void smoothStoneBricksRecipes(RecipeOutput exporter) {
        quickPolishedRecipes(exporter, TwigsBlocks.SMOOTH_STONE_BRICKS,
                TwigsBlocks.SMOOTH_STONE_BRICK_SLAB, TwigsBlocks.SMOOTH_STONE_BRICK_STAIRS, TwigsBlocks.SMOOTH_STONE_BRICK_WALL,
                Blocks.SMOOTH_STONE);
    }

    private void columnRecipes(RecipeOutput exporter) {
        quickColumnRecipe(exporter, TwigsBlocks.QUARTZ_COLUMN, Blocks.QUARTZ_BLOCK);
        quickColumnRecipe(exporter, TwigsBlocks.STONE_COLUMN, Blocks.STONE);
        quickColumnRecipe(exporter, TwigsBlocks.DEEPSLATE_COLUMN, Blocks.DEEPSLATE);
        quickColumnRecipe(exporter, TwigsBlocks.BLACKSTONE_COLUMN, Blocks.BLACKSTONE);
    }

    private void copperPillarRecipes(RecipeOutput exporter) {
        quickCopperPillarRecipe(exporter, TwigsBlocks.COPPER_PILLAR,
                Blocks.CUT_COPPER, Blocks.CUT_COPPER_SLAB, Blocks.COPPER_BLOCK);
        quickCopperPillarRecipe(exporter, TwigsBlocks.EXPOSED_COPPER_PILLAR,
                Blocks.EXPOSED_CUT_COPPER, Blocks.EXPOSED_CUT_COPPER_SLAB, Blocks.EXPOSED_COPPER);
        quickCopperPillarRecipe(exporter, TwigsBlocks.WEATHERED_COPPER_PILLAR,
                Blocks.WEATHERED_CUT_COPPER, Blocks.WEATHERED_CUT_COPPER_SLAB, Blocks.WEATHERED_COPPER);
        quickCopperPillarRecipe(exporter, TwigsBlocks.OXIDIZED_COPPER_PILLAR,
                Blocks.OXIDIZED_CUT_COPPER, Blocks.OXIDIZED_CUT_COPPER_SLAB, Blocks.OXIDIZED_COPPER);

        quickCopperPillarRecipe(exporter, TwigsBlocks.WAXED_COPPER_PILLAR,
                Blocks.WAXED_CUT_COPPER, Blocks.WAXED_CUT_COPPER_SLAB, Blocks.WAXED_COPPER_BLOCK);
        quickCopperPillarRecipe(exporter, TwigsBlocks.WAXED_EXPOSED_COPPER_PILLAR,
                Blocks.WAXED_EXPOSED_CUT_COPPER, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, Blocks.WAXED_EXPOSED_COPPER);
        quickCopperPillarRecipe(exporter, TwigsBlocks.WAXED_WEATHERED_COPPER_PILLAR,
                Blocks.WAXED_WEATHERED_CUT_COPPER, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, Blocks.WAXED_WEATHERED_COPPER);
        quickCopperPillarRecipe(exporter, TwigsBlocks.WAXED_OXIDIZED_COPPER_PILLAR,
                Blocks.WAXED_OXIDIZED_CUT_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, Blocks.WAXED_OXIDIZED_COPPER);
    }

    private void amethystAndMiscRecipes(RecipeOutput exporter) {

        quick2x2Recipe(exporter, TwigsBlocks.POLISHED_AMETHYST, Blocks.AMETHYST_BLOCK);
        quickStonecuttingRecipe(exporter, TwigsBlocks.POLISHED_AMETHYST, Blocks.AMETHYST_BLOCK, 1);

        quick2x2Recipe(exporter, TwigsBlocks.CUT_AMETHYST, TwigsBlocks.POLISHED_AMETHYST);
        quickStonecuttingRecipe(exporter, TwigsBlocks.CUT_AMETHYST, TwigsBlocks.POLISHED_AMETHYST, 1);
        quickStonecuttingRecipe(exporter, TwigsBlocks.CUT_AMETHYST, Blocks.AMETHYST_BLOCK, 1);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.COMPACTED_DRIPSTONE, 2)
                .pattern("#")
                .pattern("#")
                .define('#', Blocks.POINTED_DRIPSTONE)
                .unlockedBy("has_pointed_dripstone", has(Blocks.POINTED_DRIPSTONE))
                .unlockedBy("has_compacted_dripstone", has(TwigsBlocks.COMPACTED_DRIPSTONE))
                .save(exporter);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.ROCKY_DIRT, 4)
                .pattern("#C")
                .pattern("C#")
                .define('#', Blocks.DIRT)
                .define('C', TwigsItems.PEBBLE)
                .unlockedBy("has_pebble", has(TwigsItems.PEBBLE))
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(exporter);
    }

    private void cobblestoneBricksRecipes(RecipeOutput exporter) {

        quick2x2Recipe(exporter, TwigsBlocks.COBBLESTONE_BRICKS, Blocks.COBBLESTONE);
        quickStonecuttingRecipe(exporter, TwigsBlocks.COBBLESTONE_BRICKS, Blocks.COBBLESTONE, 1);

        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.COBBLESTONE_BRICK_SLAB, TwigsBlocks.COBBLESTONE_BRICK_STAIRS, TwigsBlocks.COBBLESTONE_BRICK_WALL,
                TwigsBlocks.COBBLESTONE_BRICKS);
        quickSlabStairsWallStonecuttingRecipe(exporter,
                TwigsBlocks.COBBLESTONE_BRICK_SLAB, TwigsBlocks.COBBLESTONE_BRICK_STAIRS, TwigsBlocks.COBBLESTONE_BRICK_WALL,
                Blocks.COBBLESTONE);
        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_COBBLESTONE_BRICKS, TwigsBlocks.COBBLESTONE_BRICKS);

        // this is a new recipe yes but it makes sense
        quick2x2Recipe(exporter, TwigsBlocks.MOSSY_COBBLESTONE_BRICKS, Blocks.MOSSY_COBBLESTONE);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.MOSSY_COBBLESTONE_BRICKS)
                .requires(TwigsBlocks.COBBLESTONE_BRICKS)
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_cobblestone_bricks", has(TwigsBlocks.COBBLESTONE_BRICKS))
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_cobblestone_bricks_from_moss"));
        quickStonecuttingRecipe(exporter, TwigsBlocks.MOSSY_COBBLESTONE_BRICKS, Blocks.MOSSY_COBBLESTONE, 1);
        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.MOSSY_COBBLESTONE_BRICK_SLAB, TwigsBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS, TwigsBlocks.MOSSY_COBBLESTONE_BRICK_WALL,
                TwigsBlocks.MOSSY_COBBLESTONE_BRICKS);
        quickSlabStairsWallStonecuttingRecipe(exporter,
                TwigsBlocks.MOSSY_COBBLESTONE_BRICK_SLAB, TwigsBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS, TwigsBlocks.MOSSY_COBBLESTONE_BRICK_WALL,
                Blocks.MOSSY_COBBLESTONE);
    }

    private void twistingAndWeepingRecipes(RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS, 8)
                .pattern("###")
                .pattern("#T#")
                .pattern("###")
                .define('#', Blocks.POLISHED_BLACKSTONE_BRICKS)
                .define('T', Items.TWISTING_VINES)
                .unlockedBy("has_polished_blackstone_bricks", has(Blocks.POLISHED_BLACKSTONE_BRICKS))
                .unlockedBy("has_twisting_vines", has(Items.TWISTING_VINES))
                .save(exporter);
        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB,
                TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS,
                TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_WALL,
                TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS
        );

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS, 8)
                .pattern("###")
                .pattern("#W#")
                .pattern("###")
                .define('#', Blocks.POLISHED_BLACKSTONE_BRICKS)
                .define('W', Items.WEEPING_VINES)
                .unlockedBy("has_polished_blackstone_bricks", has(Blocks.POLISHED_BLACKSTONE_BRICKS))
                .unlockedBy("has_weeping_vines", has(Items.WEEPING_VINES))
                .save(exporter);
        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB,
                TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS,
                TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_WALL,
                TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS
        );
    }

    private void polishedTuffRecipes(RecipeOutput exporter) {
        quickPolishedRecipes(exporter, TwigsBlocks.POLISHED_TUFF,
                TwigsBlocks.POLISHED_TUFF_SLAB, TwigsBlocks.POLISHED_TUFF_STAIRS, Blocks.TUFF);

        quickPolishedBrickRecipes(exporter, TwigsBlocks.POLISHED_TUFF_BRICKS,
                TwigsBlocks.POLISHED_TUFF_BRICK_SLAB, TwigsBlocks.POLISHED_TUFF_BRICK_STAIRS, TwigsBlocks.POLISHED_TUFF_BRICK_WALL,
                TwigsBlocks.POLISHED_TUFF, Blocks.TUFF);

        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_POLISHED_TUFF_BRICKS, TwigsBlocks.POLISHED_TUFF_BRICKS);
    }

    private void calciteRecipes(RecipeOutput exporter) {
        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.CALCITE_SLAB, TwigsBlocks.CALCITE_STAIRS, TwigsBlocks.CALCITE_WALL, Blocks.CALCITE);

        quickPolishedRecipes(exporter, TwigsBlocks.POLISHED_CALCITE,
                TwigsBlocks.POLISHED_CALCITE_SLAB, TwigsBlocks.POLISHED_CALCITE_STAIRS, Blocks.CALCITE);

        quickPolishedBrickRecipes(exporter, TwigsBlocks.POLISHED_CALCITE_BRICKS,
                TwigsBlocks.POLISHED_CALCITE_BRICK_SLAB, TwigsBlocks.POLISHED_CALCITE_BRICK_STAIRS, TwigsBlocks.POLISHED_CALCITE_BRICK_WALL,
                TwigsBlocks.POLISHED_CALCITE, Blocks.CALCITE);

        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_POLISHED_CALCITE_BRICKS, TwigsBlocks.POLISHED_CALCITE_BRICKS);
    }

    private void schistRecipes(RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.SCHIST, 2)
                .pattern("#C")
                .pattern("C#")
                .define('#', Items.QUARTZ)
                .define('C', Items.CLAY_BALL)
                .unlockedBy("has_red_sand", has(Blocks.RED_SAND))
                .unlockedBy("has_clay_ball", has(Items.CLAY_BALL))
                .save(exporter);

        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.SCHIST_SLAB, TwigsBlocks.SCHIST_STAIRS, TwigsBlocks.SCHIST_WALL, TwigsBlocks.SCHIST);

        quickPolishedRecipes(exporter, TwigsBlocks.POLISHED_SCHIST,
                TwigsBlocks.POLISHED_SCHIST_SLAB, TwigsBlocks.POLISHED_SCHIST_STAIRS, TwigsBlocks.SCHIST);

        quickPolishedBrickRecipes(exporter, TwigsBlocks.POLISHED_SCHIST_BRICKS,
                TwigsBlocks.POLISHED_SCHIST_BRICK_SLAB, TwigsBlocks.POLISHED_SCHIST_BRICK_STAIRS, TwigsBlocks.POLISHED_SCHIST_BRICK_WALL,
                TwigsBlocks.POLISHED_SCHIST, TwigsBlocks.SCHIST);

        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_POLISHED_SCHIST_BRICKS, TwigsBlocks.POLISHED_SCHIST_BRICKS);
    }

    private void rhyoliteRecipes(RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.RHYOLITE, 2)
                .pattern("#R")
                .pattern("R#")
                .define('#', Items.QUARTZ)
                .define('R', Blocks.RED_SAND)
                .unlockedBy("has_quartz", has(Items.QUARTZ))
                .unlockedBy("has_red_sand", has(Blocks.RED_SAND))
                .save(exporter);

        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.RHYOLITE_SLAB, TwigsBlocks.RHYOLITE_STAIRS, TwigsBlocks.RHYOLITE_WALL, TwigsBlocks.RHYOLITE);

        quickPolishedRecipes(exporter, TwigsBlocks.POLISHED_RHYOLITE,
                TwigsBlocks.POLISHED_RHYOLITE_SLAB, TwigsBlocks.POLISHED_RHYOLITE_STAIRS, TwigsBlocks.RHYOLITE);

        quickPolishedBrickRecipes(exporter, TwigsBlocks.POLISHED_RHYOLITE_BRICKS,
                TwigsBlocks.POLISHED_RHYOLITE_BRICK_SLAB, TwigsBlocks.POLISHED_RHYOLITE_BRICK_STAIRS, TwigsBlocks.POLISHED_RHYOLITE_BRICK_WALL,
                TwigsBlocks.POLISHED_RHYOLITE, TwigsBlocks.RHYOLITE);

        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_POLISHED_RHYOLITE_BRICKS, TwigsBlocks.POLISHED_RHYOLITE_BRICKS);
    }

    private void bloodstoneRecipes(RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.BLOODSTONE, 2)
                .pattern("#I")
                .pattern("I#")
                .define('#', Items.QUARTZ)
                .define('I', Items.IRON_NUGGET)
                .unlockedBy("has_red_sand", has(Blocks.RED_SAND))
                .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                .save(exporter);

        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.BLOODSTONE_SLAB, TwigsBlocks.BLOODSTONE_STAIRS, TwigsBlocks.BLOODSTONE_WALL, TwigsBlocks.BLOODSTONE);

        quickPolishedRecipes(exporter, TwigsBlocks.POLISHED_BLOODSTONE,
                TwigsBlocks.POLISHED_BLOODSTONE_SLAB, TwigsBlocks.POLISHED_BLOODSTONE_STAIRS, TwigsBlocks.BLOODSTONE);

        quickPolishedBrickRecipes(exporter, TwigsBlocks.POLISHED_BLOODSTONE_BRICKS,
                TwigsBlocks.POLISHED_BLOODSTONE_BRICK_SLAB, TwigsBlocks.POLISHED_BLOODSTONE_BRICK_STAIRS, TwigsBlocks.POLISHED_BLOODSTONE_BRICK_WALL,
                TwigsBlocks.POLISHED_BLOODSTONE, TwigsBlocks.BLOODSTONE);

        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_POLISHED_BLOODSTONE_BRICKS, TwigsBlocks.POLISHED_BLOODSTONE_BRICKS);
    }

    private void siltRecipes(RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.SILT, 1)
                .pattern("##")
                .pattern("##")
                .define('#', TwigsItems.SILT_BALL)
                .unlockedBy("has_silt_ball", has(TwigsItems.SILT_BALL))
                .unlockedBy("has_silt", has(TwigsItems.SILT))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "silt_from_silt_ball"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.SILT, 4)
                .pattern("DG")
                .pattern("GD")
                .define('D', Items.SAND)
                .define('G', Items.CLAY)
                .unlockedBy("has_sand", has(Items.SAND))
                .unlockedBy("has_clay", has(Items.CLAY))
                .unlockedBy("has_silt", has(TwigsBlocks.SILT))
                .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.PACKED_SILT, 4)
                .requires(TwigsBlocks.SILT)
                .requires(Items.WHEAT)
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .unlockedBy("has_silt", has(TwigsBlocks.SILT))
                .unlockedBy("has_packed_silt", has(TwigsBlocks.PACKED_SILT))
                .save(exporter);

        quickPolishedRecipes(
                exporter,
                TwigsBlocks.SILT_SHINGLES,
                TwigsBlocks.SILT_SHINGLE_SLAB, TwigsBlocks.SILT_SHINGLE_STAIRS, TwigsBlocks.SILT_SHINGLE_WALL,
                TwigsBlocks.PACKED_SILT
        );

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.SILT_POT, 1)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .define('#', TwigsBlocks.SILT_BRICKS)
                .unlockedBy("has_packed_silt", has(TwigsBlocks.PACKED_SILT))
                .unlockedBy("has_silt", has(TwigsBlocks.SILT))
                .save(exporter);

        quickSmeltingRecipe(exporter, TwigsItems.SILT_BRICK, TwigsItems.SILT_BALL, .3f);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.SILT_BRICKS, 1)
                .pattern("##")
                .pattern("##")
                .define('#', TwigsItems.SILT_BRICK)
                .unlockedBy("has_silt_brick", has(TwigsItems.SILT_BRICK))
                .unlockedBy("has_silt_bricks", has(TwigsBlocks.SILT_BRICKS))
                .save(exporter);
        quickSlabStairsWallRecipe(exporter, TwigsBlocks.SILT_BRICK_SLAB, TwigsBlocks.SILT_BRICK_STAIRS, TwigsBlocks.SILT_BRICK_WALL,
                TwigsBlocks.SILT_BRICKS);

        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_SILT_BRICKS, TwigsBlocks.SILT_BRICKS);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.CHISELED_SILT_BRICKS, 1)
                .pattern("#")
                .pattern("#")
                .define('#', TwigsBlocks.SILT_BRICK_SLAB)
                .unlockedBy("has_silt_brick_slab", has(TwigsBlocks.SILT_BRICK_SLAB))
                .unlockedBy("has_chiseled_silt_bricks", has(TwigsBlocks.CHISELED_SILT_BRICKS))
                .save(exporter);

        quickStonecuttingRecipe(exporter, TwigsBlocks.CHISELED_SILT_BRICKS, TwigsBlocks.SILT_BRICKS, 1);

        quick2x2Recipe(exporter, TwigsBlocks.MIXED_SILT_BRICKS, TwigsBlocks.SILT_BRICKS);
        quickStonecuttingRecipe(exporter, TwigsBlocks.MIXED_SILT_BRICKS, TwigsBlocks.SILT_BRICKS, 1);

        quickTrailRecipe(exporter, TwigsBlocks.SILT_BRICK_TRAIL, TwigsBlocks.SILT_BRICKS);
        quickStonecuttingRecipe(exporter, TwigsBlocks.SILT_BRICK_TRAIL, TwigsBlocks.SILT_BRICKS, 2);
    }

    private void coloredSiltRecipes(RecipeOutput exporter) {
        quickColoredSiltRecipes(exporter,
                Items.WHITE_DYE, TwigsBlocks.WHITE_PACKED_SILT,
                TwigsBlocks.WHITE_SILT_SHINGLES, TwigsBlocks.WHITE_SILT_SHINGLE_STAIRS, TwigsBlocks.WHITE_SILT_SHINGLE_SLAB, TwigsBlocks.WHITE_SILT_SHINGLE_WALL,
                TwigsBlocks.WHITE_SILT_POT
        );
        quickColoredSiltRecipes(exporter,
                Items.ORANGE_DYE, TwigsBlocks.ORANGE_PACKED_SILT,
                TwigsBlocks.ORANGE_SILT_SHINGLES, TwigsBlocks.ORANGE_SILT_SHINGLE_STAIRS, TwigsBlocks.ORANGE_SILT_SHINGLE_SLAB, TwigsBlocks.ORANGE_SILT_SHINGLE_WALL,
                TwigsBlocks.ORANGE_SILT_POT
        );
        quickColoredSiltRecipes(exporter,
                Items.MAGENTA_DYE, TwigsBlocks.MAGENTA_PACKED_SILT,
                TwigsBlocks.MAGENTA_SILT_SHINGLES, TwigsBlocks.MAGENTA_SILT_SHINGLE_STAIRS, TwigsBlocks.MAGENTA_SILT_SHINGLE_SLAB, TwigsBlocks.MAGENTA_SILT_SHINGLE_WALL,
                TwigsBlocks.MAGENTA_SILT_POT
        );
        quickColoredSiltRecipes(exporter,
                Items.LIGHT_BLUE_DYE, TwigsBlocks.LIGHT_BLUE_PACKED_SILT,
                TwigsBlocks.LIGHT_BLUE_SILT_SHINGLES, TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_STAIRS, TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_SLAB, TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_WALL,
                TwigsBlocks.LIGHT_BLUE_SILT_POT
        );
        quickColoredSiltRecipes(exporter,
                Items.YELLOW_DYE, TwigsBlocks.YELLOW_PACKED_SILT,
                TwigsBlocks.YELLOW_SILT_SHINGLES, TwigsBlocks.YELLOW_SILT_SHINGLE_STAIRS, TwigsBlocks.YELLOW_SILT_SHINGLE_SLAB, TwigsBlocks.YELLOW_SILT_SHINGLE_WALL,
                TwigsBlocks.YELLOW_SILT_POT
        );
        quickColoredSiltRecipes(exporter,
                Items.LIME_DYE, TwigsBlocks.LIME_PACKED_SILT,
                TwigsBlocks.LIME_SILT_SHINGLES, TwigsBlocks.LIME_SILT_SHINGLE_STAIRS, TwigsBlocks.LIME_SILT_SHINGLE_SLAB, TwigsBlocks.LIME_SILT_SHINGLE_WALL,
                TwigsBlocks.LIME_SILT_POT
        );
        quickColoredSiltRecipes(exporter,
                Items.PINK_DYE, TwigsBlocks.PINK_PACKED_SILT,
                TwigsBlocks.PINK_SILT_SHINGLES, TwigsBlocks.PINK_SILT_SHINGLE_STAIRS, TwigsBlocks.PINK_SILT_SHINGLE_SLAB, TwigsBlocks.PINK_SILT_SHINGLE_WALL,
                TwigsBlocks.PINK_SILT_POT
        );
        quickColoredSiltRecipes(exporter,
                Items.GRAY_DYE, TwigsBlocks.GRAY_PACKED_SILT,
                TwigsBlocks.GRAY_SILT_SHINGLES, TwigsBlocks.GRAY_SILT_SHINGLE_STAIRS, TwigsBlocks.GRAY_SILT_SHINGLE_SLAB, TwigsBlocks.GRAY_SILT_SHINGLE_WALL,
                TwigsBlocks.GRAY_SILT_POT
        );
        quickColoredSiltRecipes(exporter,
                Items.LIGHT_GRAY_DYE, TwigsBlocks.LIGHT_GRAY_PACKED_SILT,
                TwigsBlocks.LIGHT_GRAY_SILT_SHINGLES, TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_STAIRS, TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_SLAB, TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_WALL,
                TwigsBlocks.LIGHT_GRAY_SILT_POT
        );
        quickColoredSiltRecipes(exporter,
                Items.CYAN_DYE, TwigsBlocks.CYAN_PACKED_SILT,
                TwigsBlocks.CYAN_SILT_SHINGLES, TwigsBlocks.CYAN_SILT_SHINGLE_STAIRS, TwigsBlocks.CYAN_SILT_SHINGLE_SLAB, TwigsBlocks.CYAN_SILT_SHINGLE_WALL,
                TwigsBlocks.CYAN_SILT_POT
        );
        quickColoredSiltRecipes(exporter,
                Items.PURPLE_DYE, TwigsBlocks.PURPLE_PACKED_SILT,
                TwigsBlocks.PURPLE_SILT_SHINGLES, TwigsBlocks.PURPLE_SILT_SHINGLE_STAIRS, TwigsBlocks.PURPLE_SILT_SHINGLE_SLAB, TwigsBlocks.PURPLE_SILT_SHINGLE_WALL,
                TwigsBlocks.PURPLE_SILT_POT
        );
        quickColoredSiltRecipes(exporter,
                Items.BLUE_DYE, TwigsBlocks.BLUE_PACKED_SILT,
                TwigsBlocks.BLUE_SILT_SHINGLES, TwigsBlocks.BLUE_SILT_SHINGLE_STAIRS, TwigsBlocks.BLUE_SILT_SHINGLE_SLAB, TwigsBlocks.BLUE_SILT_SHINGLE_WALL,
                TwigsBlocks.BLUE_SILT_POT
        );
        quickColoredSiltRecipes(exporter,
                Items.BROWN_DYE, TwigsBlocks.BROWN_PACKED_SILT,
                TwigsBlocks.BROWN_SILT_SHINGLES, TwigsBlocks.BROWN_SILT_SHINGLE_STAIRS, TwigsBlocks.BROWN_SILT_SHINGLE_SLAB, TwigsBlocks.BROWN_SILT_SHINGLE_WALL,
                TwigsBlocks.BROWN_SILT_POT
        );
        quickColoredSiltRecipes(exporter,
                Items.GREEN_DYE, TwigsBlocks.GREEN_PACKED_SILT,
                TwigsBlocks.GREEN_SILT_SHINGLES, TwigsBlocks.GREEN_SILT_SHINGLE_STAIRS, TwigsBlocks.GREEN_SILT_SHINGLE_SLAB, TwigsBlocks.GREEN_SILT_SHINGLE_WALL,
                TwigsBlocks.GREEN_SILT_POT
        );
        quickColoredSiltRecipes(exporter,
                Items.RED_DYE, TwigsBlocks.RED_PACKED_SILT,
                TwigsBlocks.RED_SILT_SHINGLES, TwigsBlocks.RED_SILT_SHINGLE_STAIRS, TwigsBlocks.RED_SILT_SHINGLE_SLAB, TwigsBlocks.RED_SILT_SHINGLE_WALL,
                TwigsBlocks.RED_SILT_POT
        );
        quickColoredSiltRecipes(exporter,
                Items.BLACK_DYE, TwigsBlocks.BLACK_PACKED_SILT,
                TwigsBlocks.BLACK_SILT_SHINGLES, TwigsBlocks.BLACK_SILT_SHINGLE_STAIRS, TwigsBlocks.BLACK_SILT_SHINGLE_SLAB, TwigsBlocks.BLACK_SILT_SHINGLE_WALL,
                TwigsBlocks.BLACK_SILT_POT
        );
    }

}
