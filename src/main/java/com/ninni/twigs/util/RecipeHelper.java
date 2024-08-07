package com.ninni.twigs.util;

import com.ninni.twigs.registry.TwigsBlocks;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.ninni.twigs.Twigs.MOD_ID;
import static com.ninni.twigs.data.TwigsDataGenerator.getId;
import static net.minecraft.data.recipes.RecipeCategory.BUILDING_BLOCKS;

public interface RecipeHelper {


    private static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    private static ResourceLocation smeltingName(ItemLike item, ItemLike from) {
        return id("smelting/" + getItemName(item) + "_from_" + getItemName(from) + "_smelting");
    }

    private static ResourceLocation blastingName(ItemLike item, ItemLike from) {
        return id("blasting/" + getItemName(item) + "_from_" + getItemName(from) + "_blasting");
    }

    private static ResourceLocation cuttingName(ItemLike item, ItemLike from) {
        var string = getItemName(item) + "_from_" + getItemName(from);
        return id("stonecutting/" + string);
    }

    static void quickStonecuttingRecipe(RecipeOutput output, ItemLike result, ItemLike from, int amount) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(from), BUILDING_BLOCKS, result, amount)
                .unlockedBy(getHasName(from), has(from))
                .save(output, cuttingName(result, from));
    }

    static void quickSmeltingRecipe(RecipeOutput output, ItemLike result, ItemLike from) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(from), BUILDING_BLOCKS, result, .1f, 200)
                .unlockedBy(getHasName(from), has(from))
                .save(output, smeltingName(result, from));
    }

    static void quickSmeltingRecipe(RecipeOutput output, ItemLike result, ItemLike from, float xp) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(from), BUILDING_BLOCKS, result, xp, 200)
                .unlockedBy(getHasName(from), has(from))
                .save(output, smeltingName(result, from));
    }

    // Semi-generic recipes
    static void quick2x2Recipe(RecipeOutput output, ItemLike result, ItemLike input) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, result, 4)
                .pattern("##")
                .pattern("##")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(output);
    }

    static void quickSlabRecipe(RecipeOutput output, ItemLike slab, ItemLike input) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, slab, 6)
                .pattern("###")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(output);
        quickStonecuttingRecipe(output, slab, input, 2);
    }

    static void quickStairsRecipe(RecipeOutput output, ItemLike stair, ItemLike input) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, stair, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(output);
        quickStonecuttingRecipe(output, stair, input, 1);
    }

    static void quickWallRecipe(RecipeOutput output, ItemLike wall, ItemLike input) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, wall, 6)
                .pattern("###")
                .pattern("###")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(output);
        quickStonecuttingRecipe(output, wall, input, 1);
    }

    static void quickSlabStairsWallStonecuttingRecipe(RecipeOutput output, ItemLike slab, ItemLike stair, ItemLike wall, ItemLike input) {
        quickStonecuttingRecipe(output, slab, input, 2);
        quickStonecuttingRecipe(output, stair, input, 1);
        quickStonecuttingRecipe(output, wall, input, 1);
    }

    static void quickSlabStairsRecipe(RecipeOutput output, ItemLike slab, ItemLike stair, ItemLike input) {
        quickSlabRecipe(output, slab, input);
        quickStairsRecipe(output, stair, input);
    }

    static void quickSlabStairsWallRecipe(RecipeOutput output, ItemLike slab, ItemLike stair, ItemLike wall, ItemLike input) {
        quickSlabStairsRecipe(output, slab, stair, input);
        quickWallRecipe(output, wall, input);
    }

    static void quickPolishedRecipes(RecipeOutput output, ItemLike polished, ItemLike polishedSlab, ItemLike polishedStair, ItemLike raw) {
        quick2x2Recipe(output, polished, raw);
        quickStonecuttingRecipe(output, polished, raw, 1);

        quickSlabStairsRecipe(output, polishedSlab, polishedStair, polished);
        quickStonecuttingRecipe(output, polishedSlab, raw, 2);
        quickStonecuttingRecipe(output, polishedStair, raw, 1);
    }

    static void quickPolishedRecipes(RecipeOutput output, ItemLike polished, ItemLike polishedSlab, ItemLike polishedStair, ItemLike polishedWall, ItemLike raw) {
        quick2x2Recipe(output, polished, raw);
        quickStonecuttingRecipe(output, polished, raw, 1);

        quickSlabStairsWallRecipe(output, polishedSlab, polishedStair, polishedWall, polished);
        quickStonecuttingRecipe(output, polishedSlab, raw, 2);
        quickStonecuttingRecipe(output, polishedStair, raw, 1);
        quickStonecuttingRecipe(output, polishedWall, raw, 1);
    }

    static void quickPolishedBrickRecipes(RecipeOutput output, ItemLike bricks, ItemLike brickSlab, ItemLike brickStair, ItemLike brickWall, ItemLike polished, ItemLike raw) {
        quick2x2Recipe(output, bricks, polished);
        quickStonecuttingRecipe(output, bricks, polished, 1);
        quickStonecuttingRecipe(output, bricks, raw, 1);

        quickSlabStairsWallRecipe(output, brickSlab, brickStair, brickWall, bricks);
        quickStonecuttingRecipe(output, brickSlab, raw, 2);
        quickStonecuttingRecipe(output, brickStair, raw, 1);
        quickStonecuttingRecipe(output, brickWall, raw, 1);

        quickSlabStairsWallStonecuttingRecipe(output, brickSlab, brickStair, brickWall, polished);
    }

    // Specific recipes
    static void quickTableRecipe(RecipeOutput output, ItemLike result, ItemLike slab, ItemLike fence, ItemLike plank) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, result, 1)
                .pattern("___")
                .pattern("O O")
                .pattern("O O")
                .define('_', slab)
                .define('O', fence)
                .unlockedBy(getHasName(slab), has(slab))
                .unlockedBy(getHasName(fence), has(fence))
                .unlockedBy(getHasName(plank), has(plank))
                .save(output);
    }

    static void quickPaperLanternRecipe(RecipeOutput output, ItemLike result, ItemLike plant) {
        ShapelessRecipeBuilder.shapeless(BUILDING_BLOCKS, result, 1)
                .requires(TwigsBlocks.PAPER_LANTERN.get())
                .requires(plant)
                .unlockedBy(getHasName(TwigsBlocks.PAPER_LANTERN.get()), has(TwigsBlocks.PAPER_LANTERN.get()))
                .save(output);
    }

    static void quickTrailRecipe(RecipeOutput output, ItemLike result, ItemLike input) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, result, 4)
                .pattern(" #")
                .pattern("# ")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(result), has(result))
                .save(output);
    }

    static void quickColumnRecipe(RecipeOutput output, ItemLike result, ItemLike input) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, result, 4)
                .pattern("###")
                .pattern(" # ")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(result), has(result))
                .save(output);
        quickStonecuttingRecipe(output, result, input, 1);
    }

    static void quickCopperPillarRecipe(RecipeOutput output, ItemLike pillar, ItemLike cutSlab, ItemLike cutBlock, ItemLike block) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, pillar)
                .pattern("#")
                .pattern("#")
                .define('#', cutSlab)
                .unlockedBy(getHasName(cutSlab), has(cutSlab))
                .unlockedBy(getHasName(pillar), has(pillar))
                .save(output);

        quickStonecuttingRecipe(output, pillar, cutBlock, 1);
        quickStonecuttingRecipe(output, pillar, block, 4);
    }

    static void quickColoredSiltRecipes(RecipeOutput output, ItemLike dye, ItemLike coloredPacked,
                                        ItemLike coloredShingles, ItemLike coloredShingleStairs, ItemLike coloredShingleSlab, ItemLike coloredShingleWall,
                                        ItemLike pot
    ) {

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, coloredPacked, 8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', TwigsBlocks.PACKED_SILT.get())
                .define('X', dye)
                .group("packed_silt")
                .unlockedBy("has_packed_silt", has(TwigsBlocks.PACKED_SILT.get()))
                .unlockedBy("has_dye", has(dye))
                .save(output, id(getId(coloredPacked.asItem()).getPath() + "_from_packed_silt"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, coloredShingles, 8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', TwigsBlocks.SILT_SHINGLES.get())
                .define('X', dye)
                .group("silt_shingles")
                .unlockedBy("has_silt_shingles", has(TwigsBlocks.SILT_SHINGLES.get()))
                .unlockedBy("has_dye", has(dye))
                .save(output, id(getId(coloredPacked.asItem()).getPath() + "_from_silt_shingles"));

        quickPolishedRecipes(
                output,
                coloredShingles,
                coloredShingleSlab,
                coloredShingleStairs,
                coloredShingleWall,
                coloredPacked
        );

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pot)
                .requires(TwigsBlocks.SILT_POT.get())
                .requires(dye)
                .unlockedBy("has_silt_pot", has(TwigsBlocks.SILT_POT.get()))
                .unlockedBy("has_dye", has(dye))
                .save(output);
    }


    // (ender)  :( why forge?
    static String getItemName(ItemLike item) {
        return BuiltInRegistries.ITEM.getKey(item.asItem()).getPath();
    }

    static String getHasName(ItemLike item) {
        return "has_" + getItemName(item);
    }

    static Criterion<InventoryChangeTrigger.TriggerInstance> has(ItemLike item) {
        return inventoryTrigger(ItemPredicate.Builder.item().of(item));
    }

    static Criterion<InventoryChangeTrigger.TriggerInstance> inventoryTrigger(ItemPredicate.Builder... builders) {
        return inventoryTrigger(Arrays.stream(builders).map(ItemPredicate.Builder::build).toArray(ItemPredicate[]::new));
    }
    private static Criterion<InventoryChangeTrigger.TriggerInstance> inventoryTrigger(ItemPredicate... predicates) {
        return CriteriaTriggers.INVENTORY_CHANGED.createCriterion(new InventoryChangeTrigger.TriggerInstance(Optional.empty(), InventoryChangeTrigger.TriggerInstance.Slots.ANY, List.of(predicates)));
    }
}