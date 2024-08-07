package com.ninni.twigs.data;

import com.ninni.twigs.TwigsTags;
import com.ninni.twigs.registry.TwigsBlocks;
import com.ninni.twigs.registry.TwigsItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static com.ninni.twigs.Twigs.MOD_ID;
import static com.ninni.twigs.util.RecipeHelper.*;
import static net.minecraft.data.recipes.RecipeCategory.BUILDING_BLOCKS;

public class TwigsRecipeProvider extends RecipeProvider {
    public TwigsRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }


    @Override
    public void buildRecipes(@NotNull RecipeOutput exporter) {
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
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.AZALEA_FLOWERS.get(), 6)
                .requires(Blocks.FLOWERING_AZALEA_LEAVES)
                .unlockedBy("has_azalea_leaves", has(Blocks.FLOWERING_AZALEA_LEAVES))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "azalea_flowers_from_flowering_azalea_leaves"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.AZALEA_FLOWERS.get(), 6)
                .requires(Blocks.FLOWERING_AZALEA)
                .unlockedBy("has_azalea", has(Blocks.FLOWERING_AZALEA))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "azalea_flowers_from_flowering_azalea"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, Items.STICK, 2)
                .requires(TwigsItems.TWIG.get())
                .unlockedBy("has_twig", has(TwigsItems.TWIG.get()))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "twig_to_stick"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE, 1)
                .pattern("##")
                .pattern("##")
                .define('#', TwigsItems.PEBBLE.get())
                .unlockedBy("has_pebble", has(TwigsItems.PEBBLE.get()))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "cobblestone_from_pebble"));


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Items.BONE_MEAL, 3)
                .pattern("#")
                .define('#', TwigsTags.SEASHELLS)
                .unlockedBy("has_seashells", has(TwigsTags.SEASHELLS))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "bone_meal_from_seashells"));

    }

    private void bambooRecipes(RecipeOutput exporter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.BAMBOO_MAT.get(), 2)
                .pattern("###")
                .define('#', Items.BAMBOO)
                .unlockedBy("has_bamboo", has(Items.BAMBOO))
                .save(exporter);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.BAMBOO_THATCH_SLAB.get(), 6)
                .pattern("###")
                .define('#', TwigsBlocks.BAMBOO_THATCH.get())
                .unlockedBy("has_bamboo_thatch", has(TwigsBlocks.BAMBOO_THATCH.get()))
                .save(exporter);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.BAMBOO_THATCH.get(), 2)
                .pattern("##")
                .pattern("##")
                .define('#', TwigsBlocks.BAMBOO_LEAVES.get())
                .unlockedBy("has_bamboo_leaves", has(TwigsBlocks.BAMBOO_LEAVES.get()))
                .save(exporter);
    }

    private void paperLanternRecipes(RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.PAPER_LANTERN.get(), 1)
                .pattern("###")
                .pattern("#T#")
                .pattern("###")
                .define('#', Items.PAPER)
                .define('T', Items.TORCH)
                .unlockedBy("has_paper", has(Items.PAPER))
                .unlockedBy("has_torch", has(Items.TORCH))
                .save(exporter);
        quickPaperLanternRecipe(exporter, TwigsBlocks.ALLIUM_PAPER_LANTERN.get(), Items.ALLIUM);
        quickPaperLanternRecipe(exporter, TwigsBlocks.BLUE_ORCHID_PAPER_LANTERN.get(), Items.BLUE_ORCHID);
        quickPaperLanternRecipe(exporter, TwigsBlocks.CRIMSON_ROOTS_PAPER_LANTERN.get(), Items.CRIMSON_ROOTS);
        quickPaperLanternRecipe(exporter, TwigsBlocks.DANDELION_PAPER_LANTERN.get(), Items.DANDELION);
        quickPaperLanternRecipe(exporter, TwigsBlocks.TORCHFLOWER_PAPER_LANTERN.get(), Items.TORCHFLOWER);
    }

    private void lampRecipes(RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.LAMP.get(), 1)
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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.SOUL_LAMP.get(), 1)
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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.WARPED_SHROOMLAMP.get(), 1)
                .pattern("###")
                .pattern("SSS")
                .pattern("###")
                .define('#', Items.WARPED_PLANKS)
                .define('S', Items.SHROOMLIGHT)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .unlockedBy("has_shroomlight", has(Items.SHROOMLIGHT))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.CRIMSON_SHROOMLAMP.get(), 1)
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
        quickTableRecipe(exporter, TwigsBlocks.ACACIA_TABLE.get(), Blocks.ACACIA_SLAB, Blocks.ACACIA_FENCE, Blocks.ACACIA_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.BAMBOO_TABLE.get(), Blocks.BAMBOO_SLAB, Blocks.BAMBOO_FENCE, Blocks.BAMBOO_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.BIRCH_TABLE.get(), Blocks.BIRCH_SLAB, Blocks.BIRCH_FENCE, Blocks.BIRCH_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.CHERRY_TABLE.get(), Blocks.CHERRY_SLAB, Blocks.CHERRY_FENCE, Blocks.CHERRY_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.CRIMSON_TABLE.get(), Blocks.CRIMSON_SLAB, Blocks.CRIMSON_FENCE, Blocks.CRIMSON_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.DARK_OAK_TABLE.get(), Blocks.DARK_OAK_SLAB, Blocks.DARK_OAK_FENCE, Blocks.DARK_OAK_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.JUNGLE_TABLE.get(), Blocks.JUNGLE_SLAB, Blocks.JUNGLE_FENCE, Blocks.JUNGLE_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.MANGROVE_TABLE.get(), Blocks.MANGROVE_SLAB, Blocks.MANGROVE_FENCE, Blocks.MANGROVE_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.OAK_TABLE.get(), Blocks.OAK_SLAB, Blocks.OAK_FENCE, Blocks.OAK_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.SPRUCE_TABLE.get(), Blocks.SPRUCE_SLAB, Blocks.SPRUCE_FENCE, Blocks.SPRUCE_PLANKS);
        quickTableRecipe(exporter, TwigsBlocks.WARPED_TABLE.get(), Blocks.WARPED_SLAB, Blocks.WARPED_FENCE, Blocks.WARPED_PLANKS);
    }

    private void basaltRecipes(RecipeOutput exporter) {

        quick2x2Recipe(exporter, TwigsBlocks.POLISHED_BASALT_BRICKS.get(), Blocks.POLISHED_BASALT);
        quickStonecuttingRecipe(exporter, TwigsBlocks.POLISHED_BASALT_BRICKS.get(), Blocks.POLISHED_BASALT, 1);

        quickPolishedRecipes(exporter, TwigsBlocks.SMOOTH_BASALT_BRICKS.get(),
                TwigsBlocks.SMOOTH_BASALT_BRICK_SLAB.get(), TwigsBlocks.SMOOTH_BASALT_BRICK_STAIRS.get(), TwigsBlocks.SMOOTH_BASALT_BRICK_WALL.get(),
                Blocks.SMOOTH_BASALT);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.CHISELED_SMOOTH_BASALT_BRICKS.get(), 1)
                .pattern("#")
                .pattern("#")
                .define('#', TwigsBlocks.SMOOTH_BASALT_BRICK_SLAB.get())
                .unlockedBy("has_smooth_basalt_brick_slab", has(TwigsBlocks.SMOOTH_BASALT_BRICK_SLAB.get()))
                .unlockedBy("has_chiseled_smooth_basalt_bricks", has(TwigsBlocks.CHISELED_SMOOTH_BASALT_BRICKS.get()))
                .save(exporter);

        quickStonecuttingRecipe(exporter, TwigsBlocks.CHISELED_SMOOTH_BASALT_BRICKS.get(), TwigsBlocks.SMOOTH_BASALT_BRICKS.get(), 1);
    }

    private void brickRecipes(RecipeOutput exporter) {
        quick2x2Recipe(exporter, TwigsBlocks.MIXED_BRICKS.get(), Blocks.BRICKS);
        quickStonecuttingRecipe(exporter, TwigsBlocks.MIXED_BRICKS.get(), Blocks.BRICKS, 1);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.CHISELED_BRICKS.get(), 1)
                .pattern("#")
                .pattern("#")
                .define('#', Blocks.BRICK_SLAB)
                .unlockedBy("has_brick_slab", has(Blocks.BRICK_SLAB))
                .unlockedBy("has_chiseled_bricks", has(TwigsBlocks.CHISELED_BRICKS.get()))
                .save(exporter);
        quickStonecuttingRecipe(exporter, TwigsBlocks.CHISELED_BRICKS.get(), Blocks.BRICKS, 1);

        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_BRICKS.get(), Blocks.BRICKS);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.MOSSY_BRICKS.get())
                .requires(Blocks.BRICKS)
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_bricks_from_bricks"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.MOSSY_BRICKS.get())
                .requires(Blocks.BRICKS)
                .requires(Blocks.VINE)
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .unlockedBy("has_vines", has(Blocks.VINE))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_bricks_from_vines"));
        quickSlabStairsWallRecipe(exporter, TwigsBlocks.MOSSY_BRICK_SLAB.get(), TwigsBlocks.MOSSY_BRICK_STAIRS.get(), TwigsBlocks.MOSSY_BRICK_WALL.get(),
                TwigsBlocks.MOSSY_BRICKS.get());

//        quickTrailRecipe(exporter, TwigsBlocks.BRICK_TRAIL.get(), Blocks.BRICKS);
//        quickStonecuttingRecipe(exporter, TwigsBlocks.BRICK_TRAIL.get(), Blocks.BRICKS, 2);

    }

    private void gravelBricksRecipes(RecipeOutput exporter) {
        Block brick = TwigsBlocks.GRAVEL_BRICKS.get();
        quick2x2Recipe(exporter, brick, Blocks.GRAVEL);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, TwigsBlocks.GRAVEL_BRICK_SLAB.get(), 6)
                .pattern("###")
                .define('#', brick)
                .unlockedBy(getHasName(brick), has(brick))
                .save(exporter);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, TwigsBlocks.GRAVEL_BRICK_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', brick)
                .unlockedBy(getHasName(brick), has(brick))
                .save(exporter);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, TwigsBlocks.GRAVEL_BRICK_WALL.get(), 6)
                .pattern("###")
                .pattern("###")
                .define('#', brick)
                .unlockedBy(getHasName(brick), has(brick))
                .save(exporter);

    }

    private void smoothStoneBricksRecipes(RecipeOutput exporter) {
        quickPolishedRecipes(exporter, TwigsBlocks.SMOOTH_STONE_BRICKS.get(),
                TwigsBlocks.SMOOTH_STONE_BRICK_SLAB.get(), TwigsBlocks.SMOOTH_STONE_BRICK_STAIRS.get(), TwigsBlocks.SMOOTH_STONE_BRICK_WALL.get(),
                Blocks.SMOOTH_STONE);
    }

    private void columnRecipes(RecipeOutput exporter) {
        quickColumnRecipe(exporter, TwigsBlocks.QUARTZ_COLUMN.get(), Blocks.QUARTZ_BLOCK);
        quickColumnRecipe(exporter, TwigsBlocks.STONE_COLUMN.get(), Blocks.STONE);
        quickColumnRecipe(exporter, TwigsBlocks.DEEPSLATE_COLUMN.get(), Blocks.DEEPSLATE);
        quickColumnRecipe(exporter, TwigsBlocks.BLACKSTONE_COLUMN.get(), Blocks.BLACKSTONE);
    }

    private void copperPillarRecipes(RecipeOutput exporter) {
        quickCopperPillarRecipe(exporter, TwigsBlocks.COPPER_PILLAR.get(),
                Blocks.CUT_COPPER, Blocks.CUT_COPPER_SLAB, Blocks.COPPER_BLOCK);
        quickCopperPillarRecipe(exporter, TwigsBlocks.EXPOSED_COPPER_PILLAR.get(),
                Blocks.EXPOSED_CUT_COPPER, Blocks.EXPOSED_CUT_COPPER_SLAB, Blocks.EXPOSED_COPPER);
        quickCopperPillarRecipe(exporter, TwigsBlocks.WEATHERED_COPPER_PILLAR.get(),
                Blocks.WEATHERED_CUT_COPPER, Blocks.WEATHERED_CUT_COPPER_SLAB, Blocks.WEATHERED_COPPER);
        quickCopperPillarRecipe(exporter, TwigsBlocks.OXIDIZED_COPPER_PILLAR.get(),
                Blocks.OXIDIZED_CUT_COPPER, Blocks.OXIDIZED_CUT_COPPER_SLAB, Blocks.OXIDIZED_COPPER);

        quickCopperPillarRecipe(exporter, TwigsBlocks.WAXED_COPPER_PILLAR.get(),
                Blocks.WAXED_CUT_COPPER, Blocks.WAXED_CUT_COPPER_SLAB, Blocks.WAXED_COPPER_BLOCK);
        quickCopperPillarRecipe(exporter, TwigsBlocks.WAXED_EXPOSED_COPPER_PILLAR.get(),
                Blocks.WAXED_EXPOSED_CUT_COPPER, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, Blocks.WAXED_EXPOSED_COPPER);
        quickCopperPillarRecipe(exporter, TwigsBlocks.WAXED_WEATHERED_COPPER_PILLAR.get(),
                Blocks.WAXED_WEATHERED_CUT_COPPER, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, Blocks.WAXED_WEATHERED_COPPER);
        quickCopperPillarRecipe(exporter, TwigsBlocks.WAXED_OXIDIZED_COPPER_PILLAR.get(),
                Blocks.WAXED_OXIDIZED_CUT_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, Blocks.WAXED_OXIDIZED_COPPER);
    }

    private void amethystAndMiscRecipes(RecipeOutput exporter) {

        quick2x2Recipe(exporter, TwigsBlocks.POLISHED_AMETHYST.get(), Blocks.AMETHYST_BLOCK);
        quickStonecuttingRecipe(exporter, TwigsBlocks.POLISHED_AMETHYST.get(), Blocks.AMETHYST_BLOCK, 1);

        quick2x2Recipe(exporter, TwigsBlocks.CUT_AMETHYST.get(), TwigsBlocks.POLISHED_AMETHYST.get());
        quickStonecuttingRecipe(exporter, TwigsBlocks.CUT_AMETHYST.get(), TwigsBlocks.POLISHED_AMETHYST.get(), 1);
        quickStonecuttingRecipe(exporter, TwigsBlocks.CUT_AMETHYST.get(), Blocks.AMETHYST_BLOCK, 1);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.COMPACTED_DRIPSTONE.get(), 2)
                .pattern("#")
                .pattern("#")
                .define('#', Blocks.POINTED_DRIPSTONE)
                .unlockedBy("has_pointed_dripstone", has(Blocks.POINTED_DRIPSTONE))
                .unlockedBy("has_compacted_dripstone", has(TwigsBlocks.COMPACTED_DRIPSTONE.get()))
                .save(exporter);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.ROCKY_DIRT.get(), 4)
                .pattern("#C")
                .pattern("C#")
                .define('#', Blocks.DIRT)
                .define('C', TwigsItems.PEBBLE.get())
                .unlockedBy("has_pebble", has(TwigsItems.PEBBLE.get()))
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(exporter);
    }

    private void cobblestoneBricksRecipes(RecipeOutput exporter) {

        quick2x2Recipe(exporter, TwigsBlocks.COBBLESTONE_BRICKS.get(), Blocks.COBBLESTONE);
        quickStonecuttingRecipe(exporter, TwigsBlocks.COBBLESTONE_BRICKS.get(), Blocks.COBBLESTONE, 1);

        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.COBBLESTONE_BRICK_SLAB.get(), TwigsBlocks.COBBLESTONE_BRICK_STAIRS.get(), TwigsBlocks.COBBLESTONE_BRICK_WALL.get(),
                TwigsBlocks.COBBLESTONE_BRICKS.get());
        quickSlabStairsWallStonecuttingRecipe(exporter,
                TwigsBlocks.COBBLESTONE_BRICK_SLAB.get(), TwigsBlocks.COBBLESTONE_BRICK_STAIRS.get(), TwigsBlocks.COBBLESTONE_BRICK_WALL.get(),
                Blocks.COBBLESTONE);
        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_COBBLESTONE_BRICKS.get(), TwigsBlocks.COBBLESTONE_BRICKS.get());

        // this is a new recipe yes but it makes sense
        quick2x2Recipe(exporter, TwigsBlocks.MOSSY_COBBLESTONE_BRICKS.get(), Blocks.MOSSY_COBBLESTONE);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.MOSSY_COBBLESTONE_BRICKS.get())
                .requires(TwigsBlocks.COBBLESTONE_BRICKS.get())
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_cobblestone_bricks", has(TwigsBlocks.COBBLESTONE_BRICKS.get()))
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_cobblestone_bricks_from_moss"));
        quickStonecuttingRecipe(exporter, TwigsBlocks.MOSSY_COBBLESTONE_BRICKS.get(), Blocks.MOSSY_COBBLESTONE, 1);
        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.MOSSY_COBBLESTONE_BRICK_SLAB.get(), TwigsBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS.get(), TwigsBlocks.MOSSY_COBBLESTONE_BRICK_WALL.get(),
                TwigsBlocks.MOSSY_COBBLESTONE_BRICKS.get());
        quickSlabStairsWallStonecuttingRecipe(exporter,
                TwigsBlocks.MOSSY_COBBLESTONE_BRICK_SLAB.get(), TwigsBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS.get(), TwigsBlocks.MOSSY_COBBLESTONE_BRICK_WALL.get(),
                Blocks.MOSSY_COBBLESTONE);
    }

    private void twistingAndWeepingRecipes(RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS.get(), 8)
                .pattern("###")
                .pattern("#T#")
                .pattern("###")
                .define('#', Blocks.POLISHED_BLACKSTONE_BRICKS)
                .define('T', Items.TWISTING_VINES)
                .unlockedBy("has_polished_blackstone_bricks", has(Blocks.POLISHED_BLACKSTONE_BRICKS))
                .unlockedBy("has_twisting_vines", has(Items.TWISTING_VINES))
                .save(exporter);
        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB.get(),
                TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS.get(),
                TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_WALL.get(),
                TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS.get()
        );

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS.get(), 8)
                .pattern("###")
                .pattern("#W#")
                .pattern("###")
                .define('#', Blocks.POLISHED_BLACKSTONE_BRICKS)
                .define('W', Items.WEEPING_VINES)
                .unlockedBy("has_polished_blackstone_bricks", has(Blocks.POLISHED_BLACKSTONE_BRICKS))
                .unlockedBy("has_weeping_vines", has(Items.WEEPING_VINES))
                .save(exporter);
        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB.get(),
                TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS.get(),
                TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_WALL.get(),
                TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS.get()
        );
    }

    private void polishedTuffRecipes(RecipeOutput exporter) {
        quickPolishedRecipes(exporter, TwigsBlocks.POLISHED_TUFF.get(),
                TwigsBlocks.POLISHED_TUFF_SLAB.get(), TwigsBlocks.POLISHED_TUFF_STAIRS.get(), Blocks.TUFF);

        quickPolishedBrickRecipes(exporter, TwigsBlocks.POLISHED_TUFF_BRICKS.get(),
                TwigsBlocks.POLISHED_TUFF_BRICK_SLAB.get(), TwigsBlocks.POLISHED_TUFF_BRICK_STAIRS.get(), TwigsBlocks.POLISHED_TUFF_BRICK_WALL.get(),
                TwigsBlocks.POLISHED_TUFF.get(), Blocks.TUFF);

        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_POLISHED_TUFF_BRICKS.get(), TwigsBlocks.POLISHED_TUFF_BRICKS.get());
    }

    private void calciteRecipes(RecipeOutput exporter) {
        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.CALCITE_SLAB.get(), TwigsBlocks.CALCITE_STAIRS.get(), TwigsBlocks.CALCITE_WALL.get(), Blocks.CALCITE);

        quickPolishedRecipes(exporter, TwigsBlocks.POLISHED_CALCITE.get(),
                TwigsBlocks.POLISHED_CALCITE_SLAB.get(), TwigsBlocks.POLISHED_CALCITE_STAIRS.get(), Blocks.CALCITE);

        quickPolishedBrickRecipes(exporter, TwigsBlocks.POLISHED_CALCITE_BRICKS.get(),
                TwigsBlocks.POLISHED_CALCITE_BRICK_SLAB.get(), TwigsBlocks.POLISHED_CALCITE_BRICK_STAIRS.get(), TwigsBlocks.POLISHED_CALCITE_BRICK_WALL.get(),
                TwigsBlocks.POLISHED_CALCITE.get(), Blocks.CALCITE);

        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_POLISHED_CALCITE_BRICKS.get(), TwigsBlocks.POLISHED_CALCITE_BRICKS.get());
    }

    private void schistRecipes(RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.SCHIST.get(), 2)
                .pattern("#C")
                .pattern("C#")
                .define('#', Items.QUARTZ)
                .define('C', Items.CLAY_BALL)
                .unlockedBy("has_red_sand", has(Blocks.RED_SAND))
                .unlockedBy("has_clay_ball", has(Items.CLAY_BALL))
                .save(exporter);

        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.SCHIST_SLAB.get(), TwigsBlocks.SCHIST_STAIRS.get(), TwigsBlocks.SCHIST_WALL.get(), TwigsBlocks.SCHIST.get());

        quickPolishedRecipes(exporter, TwigsBlocks.POLISHED_SCHIST.get(),
                TwigsBlocks.POLISHED_SCHIST_SLAB.get(), TwigsBlocks.POLISHED_SCHIST_STAIRS.get(), TwigsBlocks.SCHIST.get());

        quickPolishedBrickRecipes(exporter, TwigsBlocks.POLISHED_SCHIST_BRICKS.get(),
                TwigsBlocks.POLISHED_SCHIST_BRICK_SLAB.get(), TwigsBlocks.POLISHED_SCHIST_BRICK_STAIRS.get(), TwigsBlocks.POLISHED_SCHIST_BRICK_WALL.get(),
                TwigsBlocks.POLISHED_SCHIST.get(), TwigsBlocks.SCHIST.get());

        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_POLISHED_SCHIST_BRICKS.get(), TwigsBlocks.POLISHED_SCHIST_BRICKS.get());
    }

    private void rhyoliteRecipes(RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.RHYOLITE.get(), 2)
                .pattern("#R")
                .pattern("R#")
                .define('#', Items.QUARTZ)
                .define('R', Blocks.RED_SAND)
                .unlockedBy("has_quartz", has(Items.QUARTZ))
                .unlockedBy("has_red_sand", has(Blocks.RED_SAND))
                .save(exporter);

        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.RHYOLITE_SLAB.get(), TwigsBlocks.RHYOLITE_STAIRS.get(), TwigsBlocks.RHYOLITE_WALL.get(), TwigsBlocks.RHYOLITE.get());

        quickPolishedRecipes(exporter, TwigsBlocks.POLISHED_RHYOLITE.get(),
                TwigsBlocks.POLISHED_RHYOLITE_SLAB.get(), TwigsBlocks.POLISHED_RHYOLITE_STAIRS.get(), TwigsBlocks.RHYOLITE.get());

        quickPolishedBrickRecipes(exporter, TwigsBlocks.POLISHED_RHYOLITE_BRICKS.get(),
                TwigsBlocks.POLISHED_RHYOLITE_BRICK_SLAB.get(), TwigsBlocks.POLISHED_RHYOLITE_BRICK_STAIRS.get(), TwigsBlocks.POLISHED_RHYOLITE_BRICK_WALL.get(),
                TwigsBlocks.POLISHED_RHYOLITE.get(), TwigsBlocks.RHYOLITE.get());

        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_POLISHED_RHYOLITE_BRICKS.get(), TwigsBlocks.POLISHED_RHYOLITE_BRICKS.get());
    }

    private void bloodstoneRecipes(RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.BLOODSTONE.get(), 2)
                .pattern("#I")
                .pattern("I#")
                .define('#', Items.QUARTZ)
                .define('I', Items.IRON_NUGGET)
                .unlockedBy("has_red_sand", has(Blocks.RED_SAND))
                .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                .save(exporter);

        quickSlabStairsWallRecipe(exporter,
                TwigsBlocks.BLOODSTONE_SLAB.get(), TwigsBlocks.BLOODSTONE_STAIRS.get(), TwigsBlocks.BLOODSTONE_WALL.get(), TwigsBlocks.BLOODSTONE.get());

        quickPolishedRecipes(exporter, TwigsBlocks.POLISHED_BLOODSTONE.get(),
                TwigsBlocks.POLISHED_BLOODSTONE_SLAB.get(), TwigsBlocks.POLISHED_BLOODSTONE_STAIRS.get(), TwigsBlocks.BLOODSTONE.get());

        quickPolishedBrickRecipes(exporter, TwigsBlocks.POLISHED_BLOODSTONE_BRICKS.get(),
                TwigsBlocks.POLISHED_BLOODSTONE_BRICK_SLAB.get(), TwigsBlocks.POLISHED_BLOODSTONE_BRICK_STAIRS.get(), TwigsBlocks.POLISHED_BLOODSTONE_BRICK_WALL.get(),
                TwigsBlocks.POLISHED_BLOODSTONE.get(), TwigsBlocks.BLOODSTONE.get());

        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_POLISHED_BLOODSTONE_BRICKS.get(), TwigsBlocks.POLISHED_BLOODSTONE_BRICKS.get());
    }

    private void siltRecipes(RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.SILT.get(), 1)
                .pattern("##")
                .pattern("##")
                .define('#', TwigsItems.SILT_BALL.get())
                .unlockedBy("has_silt_ball", has(TwigsItems.SILT_BALL.get()))
                .unlockedBy("has_silt", has(TwigsItems.SILT.get()))
                .save(exporter, ResourceLocation.fromNamespaceAndPath(MOD_ID, "silt_from_silt_ball"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.SILT.get(), 4)
                .pattern("DG")
                .pattern("GD")
                .define('D', Items.SAND)
                .define('G', Items.CLAY)
                .unlockedBy("has_sand", has(Items.SAND))
                .unlockedBy("has_clay", has(Items.CLAY))
                .unlockedBy("has_silt", has(TwigsBlocks.SILT.get()))
                .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.PACKED_SILT.get(), 4)
                .requires(TwigsBlocks.SILT.get())
                .requires(Items.WHEAT)
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .unlockedBy("has_silt", has(TwigsBlocks.SILT.get()))
                .unlockedBy("has_packed_silt", has(TwigsBlocks.PACKED_SILT.get()))
                .save(exporter);

        quickPolishedRecipes(
                exporter,
                TwigsBlocks.SILT_SHINGLES.get(),
                TwigsBlocks.SILT_SHINGLE_SLAB.get(), TwigsBlocks.SILT_SHINGLE_STAIRS.get(), TwigsBlocks.SILT_SHINGLE_WALL.get(),
                TwigsBlocks.PACKED_SILT.get()
        );

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.SILT_POT.get(), 1)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .define('#', TwigsBlocks.SILT_BRICKS.get())
                .unlockedBy("has_packed_silt", has(TwigsBlocks.PACKED_SILT.get()))
                .unlockedBy("has_silt", has(TwigsBlocks.SILT.get()))
                .save(exporter);

        quickSmeltingRecipe(exporter, TwigsItems.SILT_BRICK.get(), TwigsItems.SILT_BALL.get(), .3f);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.SILT_BRICKS.get(), 1)
                .pattern("##")
                .pattern("##")
                .define('#', TwigsItems.SILT_BRICK.get())
                .unlockedBy("has_silt_brick", has(TwigsItems.SILT_BRICK.get()))
                .unlockedBy("has_silt_bricks", has(TwigsBlocks.SILT_BRICKS.get()))
                .save(exporter);
        quickSlabStairsWallRecipe(exporter, TwigsBlocks.SILT_BRICK_SLAB.get(), TwigsBlocks.SILT_BRICK_STAIRS.get(), TwigsBlocks.SILT_BRICK_WALL.get(),
                TwigsBlocks.SILT_BRICKS.get());

        quickSmeltingRecipe(exporter, TwigsBlocks.CRACKED_SILT_BRICKS.get(), TwigsBlocks.SILT_BRICKS.get());


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TwigsBlocks.CHISELED_SILT_BRICKS.get(), 1)
                .pattern("#")
                .pattern("#")
                .define('#', TwigsBlocks.SILT_BRICK_SLAB.get())
                .unlockedBy("has_silt_brick_slab", has(TwigsBlocks.SILT_BRICK_SLAB.get()))
                .unlockedBy("has_chiseled_silt_bricks", has(TwigsBlocks.CHISELED_SILT_BRICKS.get()))
                .save(exporter);

        quickStonecuttingRecipe(exporter, TwigsBlocks.CHISELED_SILT_BRICKS.get(), TwigsBlocks.SILT_BRICKS.get(), 1);

        quick2x2Recipe(exporter, TwigsBlocks.MIXED_SILT_BRICKS.get(), TwigsBlocks.SILT_BRICKS.get());
        quickStonecuttingRecipe(exporter, TwigsBlocks.MIXED_SILT_BRICKS.get(), TwigsBlocks.SILT_BRICKS.get(), 1);

//        quickTrailRecipe(exporter, TwigsBlocks.SILT_BRICK_TRAIL.get(), TwigsBlocks.SILT_BRICKS.get());
//        quickStonecuttingRecipe(exporter, TwigsBlocks.SILT_BRICK_TRAIL.get(), TwigsBlocks.SILT_BRICKS.get(), 2);
    }

    private void coloredSiltRecipes(RecipeOutput exporter) {
        quickColoredSiltRecipes(exporter,
                Items.WHITE_DYE, TwigsBlocks.WHITE_PACKED_SILT.get(),
                TwigsBlocks.WHITE_SILT_SHINGLES.get(), TwigsBlocks.WHITE_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.WHITE_SILT_SHINGLE_SLAB.get(), TwigsBlocks.WHITE_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.WHITE_SILT_POT.get()
        );
        quickColoredSiltRecipes(exporter,
                Items.ORANGE_DYE, TwigsBlocks.ORANGE_PACKED_SILT.get(),
                TwigsBlocks.ORANGE_SILT_SHINGLES.get(), TwigsBlocks.ORANGE_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.ORANGE_SILT_SHINGLE_SLAB.get(), TwigsBlocks.ORANGE_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.ORANGE_SILT_POT.get()
        );
        quickColoredSiltRecipes(exporter,
                Items.MAGENTA_DYE, TwigsBlocks.MAGENTA_PACKED_SILT.get(),
                TwigsBlocks.MAGENTA_SILT_SHINGLES.get(), TwigsBlocks.MAGENTA_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.MAGENTA_SILT_SHINGLE_SLAB.get(), TwigsBlocks.MAGENTA_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.MAGENTA_SILT_POT.get()
        );
        quickColoredSiltRecipes(exporter,
                Items.LIGHT_BLUE_DYE, TwigsBlocks.LIGHT_BLUE_PACKED_SILT.get(),
                TwigsBlocks.LIGHT_BLUE_SILT_SHINGLES.get(), TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_SLAB.get(), TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.LIGHT_BLUE_SILT_POT.get()
        );
        quickColoredSiltRecipes(exporter,
                Items.YELLOW_DYE, TwigsBlocks.YELLOW_PACKED_SILT.get(),
                TwigsBlocks.YELLOW_SILT_SHINGLES.get(), TwigsBlocks.YELLOW_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.YELLOW_SILT_SHINGLE_SLAB.get(), TwigsBlocks.YELLOW_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.YELLOW_SILT_POT.get()
        );
        quickColoredSiltRecipes(exporter,
                Items.LIME_DYE, TwigsBlocks.LIME_PACKED_SILT.get(),
                TwigsBlocks.LIME_SILT_SHINGLES.get(), TwigsBlocks.LIME_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.LIME_SILT_SHINGLE_SLAB.get(), TwigsBlocks.LIME_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.LIME_SILT_POT.get()
        );
        quickColoredSiltRecipes(exporter,
                Items.PINK_DYE, TwigsBlocks.PINK_PACKED_SILT.get(),
                TwigsBlocks.PINK_SILT_SHINGLES.get(), TwigsBlocks.PINK_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.PINK_SILT_SHINGLE_SLAB.get(), TwigsBlocks.PINK_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.PINK_SILT_POT.get()
        );
        quickColoredSiltRecipes(exporter,
                Items.GRAY_DYE, TwigsBlocks.GRAY_PACKED_SILT.get(),
                TwigsBlocks.GRAY_SILT_SHINGLES.get(), TwigsBlocks.GRAY_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.GRAY_SILT_SHINGLE_SLAB.get(), TwigsBlocks.GRAY_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.GRAY_SILT_POT.get()
        );
        quickColoredSiltRecipes(exporter,
                Items.LIGHT_GRAY_DYE, TwigsBlocks.LIGHT_GRAY_PACKED_SILT.get(),
                TwigsBlocks.LIGHT_GRAY_SILT_SHINGLES.get(), TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_SLAB.get(), TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.LIGHT_GRAY_SILT_POT.get()
        );
        quickColoredSiltRecipes(exporter,
                Items.CYAN_DYE, TwigsBlocks.CYAN_PACKED_SILT.get(),
                TwigsBlocks.CYAN_SILT_SHINGLES.get(), TwigsBlocks.CYAN_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.CYAN_SILT_SHINGLE_SLAB.get(), TwigsBlocks.CYAN_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.CYAN_SILT_POT.get()
        );
        quickColoredSiltRecipes(exporter,
                Items.PURPLE_DYE, TwigsBlocks.PURPLE_PACKED_SILT.get(),
                TwigsBlocks.PURPLE_SILT_SHINGLES.get(), TwigsBlocks.PURPLE_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.PURPLE_SILT_SHINGLE_SLAB.get(), TwigsBlocks.PURPLE_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.PURPLE_SILT_POT.get()
        );
        quickColoredSiltRecipes(exporter,
                Items.BLUE_DYE, TwigsBlocks.BLUE_PACKED_SILT.get(),
                TwigsBlocks.BLUE_SILT_SHINGLES.get(), TwigsBlocks.BLUE_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.BLUE_SILT_SHINGLE_SLAB.get(), TwigsBlocks.BLUE_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.BLUE_SILT_POT.get()
        );
        quickColoredSiltRecipes(exporter,
                Items.BROWN_DYE, TwigsBlocks.BROWN_PACKED_SILT.get(),
                TwigsBlocks.BROWN_SILT_SHINGLES.get(), TwigsBlocks.BROWN_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.BROWN_SILT_SHINGLE_SLAB.get(), TwigsBlocks.BROWN_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.BROWN_SILT_POT.get()
        );
        quickColoredSiltRecipes(exporter,
                Items.GREEN_DYE, TwigsBlocks.GREEN_PACKED_SILT.get(),
                TwigsBlocks.GREEN_SILT_SHINGLES.get(), TwigsBlocks.GREEN_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.GREEN_SILT_SHINGLE_SLAB.get(), TwigsBlocks.GREEN_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.GREEN_SILT_POT.get()
        );
        quickColoredSiltRecipes(exporter,
                Items.RED_DYE, TwigsBlocks.RED_PACKED_SILT.get(),
                TwigsBlocks.RED_SILT_SHINGLES.get(), TwigsBlocks.RED_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.RED_SILT_SHINGLE_SLAB.get(), TwigsBlocks.RED_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.RED_SILT_POT.get()
        );
        quickColoredSiltRecipes(exporter,
                Items.BLACK_DYE, TwigsBlocks.BLACK_PACKED_SILT.get(),
                TwigsBlocks.BLACK_SILT_SHINGLES.get(), TwigsBlocks.BLACK_SILT_SHINGLE_STAIRS.get(), TwigsBlocks.BLACK_SILT_SHINGLE_SLAB.get(), TwigsBlocks.BLACK_SILT_SHINGLE_WALL.get(),
                TwigsBlocks.BLACK_SILT_POT.get()
        );
    }

}
