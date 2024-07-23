package com.ninni.twigs.data.tags;

import com.ninni.twigs.TwigsTags;
import com.ninni.twigs.data.TwigsDataGenerator;
import com.ninni.twigs.registry.TwigsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class TwigsBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public TwigsBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        flowerTags();
        microBlockTags();
        mineableTags();
        modTags();


        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS)
                .add(TwigsBlocks.POLISHED_AMETHYST)
                .add(TwigsBlocks.CUT_AMETHYST);
        getOrCreateTagBuilder(BlockTags.INSIDE_STEP_SOUND_BLOCKS)
                .add(TwigsBlocks.PETRIFIED_LICHEN)
                .add(TwigsBlocks.BRICK_TRAIL)
                .add(TwigsBlocks.SILT_BRICK_TRAIL)
                .add(TwigsBlocks.AZALEA_FLOWERS);
        getOrCreateTagBuilder(BlockTags.PIGLIN_REPELLENTS)
                .add(TwigsBlocks.SOUL_LAMP);
    }

    private void flowerTags() {
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(TwigsBlocks.AZALEA_FLOWERS);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(TwigsBlocks.POTTED_AZALEA_FLOWERS);

        // (ender) replaceable_plants got replaced by replaceable_by_trees in 1.20,
        // but I feel like these 2 items should also be in replaceable
        // also replaceable is referenced in enchantment_power_transmitter

        getOrCreateTagBuilder(BlockTags.REPLACEABLE)
                .add(TwigsBlocks.AZALEA_FLOWERS)
                .add(TwigsBlocks.PETRIFIED_LICHEN);

        getOrCreateTagBuilder(BlockTags.REPLACEABLE_BY_TREES)
                .add(TwigsBlocks.AZALEA_FLOWERS)
                .add(TwigsBlocks.PETRIFIED_LICHEN);
    }

    private void microBlockTags() {
        var stairsTag = getOrCreateTagBuilder(BlockTags.STAIRS);
        var slabTag = getOrCreateTagBuilder(BlockTags.SLABS);
        var wallTag = getOrCreateTagBuilder(BlockTags.WALLS);
        for (Block block : TwigsDataGenerator.getModBlocks()) {
            if (block instanceof StairBlock) stairsTag.add(block);
            else if (block instanceof SlabBlock) slabTag.add(block);
            else if (block instanceof WallBlock) wallTag.add(block);
        }
    }

    private void mineableTags() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
                .forceAddTag(TwigsTags.TABLES_BLOCK)
                .add(TwigsBlocks.CRIMSON_SHROOMLAMP)
                .add(TwigsBlocks.WARPED_SHROOMLAMP);

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(TwigsBlocks.ROCKY_DIRT)
                .add(TwigsBlocks.SILT);

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(TwigsBlocks.LAMP)
                .add(TwigsBlocks.SOUL_LAMP)
                .add(TwigsBlocks.POLISHED_BASALT_BRICKS)
                .add(TwigsBlocks.CHISELED_SMOOTH_BASALT_BRICKS)
                .add(TwigsBlocks.SMOOTH_BASALT_BRICKS)
                .add(TwigsBlocks.SMOOTH_BASALT_BRICK_STAIRS)
                .add(TwigsBlocks.SMOOTH_BASALT_BRICK_SLAB)
                .add(TwigsBlocks.SMOOTH_BASALT_BRICK_WALL)
                .add(TwigsBlocks.MIXED_BRICKS)
                .add(TwigsBlocks.CHISELED_BRICKS)
                .add(TwigsBlocks.CRACKED_BRICKS)
                .add(TwigsBlocks.MOSSY_BRICKS)
                .add(TwigsBlocks.MOSSY_BRICK_STAIRS)
                .add(TwigsBlocks.MOSSY_BRICK_SLAB)
                .add(TwigsBlocks.MOSSY_BRICK_WALL)
                .add(TwigsBlocks.POLISHED_AMETHYST)
                .add(TwigsBlocks.CUT_AMETHYST)
                .add(TwigsBlocks.COBBLESTONE_BRICKS)
                .add(TwigsBlocks.COBBLESTONE_BRICK_SLAB)
                .add(TwigsBlocks.COBBLESTONE_BRICK_STAIRS)
                .add(TwigsBlocks.COBBLESTONE_BRICK_WALL)
                .add(TwigsBlocks.CRACKED_COBBLESTONE_BRICKS)
                .add(TwigsBlocks.MOSSY_COBBLESTONE_BRICKS)
                .add(TwigsBlocks.MOSSY_COBBLESTONE_BRICK_SLAB)
                .add(TwigsBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS)
                .add(TwigsBlocks.MOSSY_COBBLESTONE_BRICK_WALL)
                .add(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS)
                .add(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB)
                .add(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS)
                .add(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_WALL)
                .add(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS)
                .add(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS)
                .add(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB)
                .add(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_WALL)
                .add(TwigsBlocks.POLISHED_TUFF)
                .add(TwigsBlocks.POLISHED_TUFF_STAIRS)
                .add(TwigsBlocks.POLISHED_TUFF_SLAB)
                .add(TwigsBlocks.POLISHED_TUFF_BRICKS)
                .add(TwigsBlocks.POLISHED_TUFF_BRICK_STAIRS)
                .add(TwigsBlocks.POLISHED_TUFF_BRICK_SLAB)
                .add(TwigsBlocks.POLISHED_TUFF_BRICK_WALL)
                .add(TwigsBlocks.CRACKED_POLISHED_TUFF_BRICKS)
                .add(TwigsBlocks.CALCITE_STAIRS)
                .add(TwigsBlocks.CALCITE_SLAB)
                .add(TwigsBlocks.CALCITE_WALL)
                .add(TwigsBlocks.POLISHED_CALCITE)
                .add(TwigsBlocks.POLISHED_CALCITE_STAIRS)
                .add(TwigsBlocks.POLISHED_CALCITE_SLAB)
                .add(TwigsBlocks.POLISHED_CALCITE_BRICKS)
                .add(TwigsBlocks.POLISHED_CALCITE_BRICK_STAIRS)
                .add(TwigsBlocks.POLISHED_CALCITE_BRICK_SLAB)
                .add(TwigsBlocks.POLISHED_CALCITE_BRICK_WALL)
                .add(TwigsBlocks.CRACKED_POLISHED_CALCITE_BRICKS)
                .forceAddTag(TwigsTags.SCHIST_BLOCK)
                .forceAddTag(TwigsTags.RHYOLITE_BLOCK)
                .forceAddTag(TwigsTags.BLOODSTONE_BLOCK)
                .add(TwigsBlocks.ROCKY_DIRT)
                .forceAddTag(TwigsTags.PACKED_SILT_BLOCK)
                .forceAddTag(TwigsTags.SILT_POTS_BLOCK)
                .add(TwigsBlocks.GRAVEL_BRICKS)
                .add(TwigsBlocks.GRAVEL_BRICK_STAIRS)
                .add(TwigsBlocks.GRAVEL_BRICK_SLAB)
                .add(TwigsBlocks.GRAVEL_BRICK_WALL)
                .add(TwigsBlocks.SILT_BRICKS)
                .add(TwigsBlocks.SILT_BRICK_STAIRS)
                .add(TwigsBlocks.SILT_BRICK_SLAB)
                .add(TwigsBlocks.SILT_BRICK_WALL)
                .add(TwigsBlocks.MIXED_SILT_BRICKS)
                .add(TwigsBlocks.CHISELED_SILT_BRICKS)
                .add(TwigsBlocks.CRACKED_SILT_BRICKS)
                .add(TwigsBlocks.COMPACTED_DRIPSTONE)
                .add(TwigsBlocks.SMOOTH_STONE_BRICKS)
                .add(TwigsBlocks.SMOOTH_STONE_BRICK_STAIRS)
                .add(TwigsBlocks.SMOOTH_STONE_BRICK_SLAB)
                .add(TwigsBlocks.SMOOTH_STONE_BRICK_WALL)
                .add(TwigsBlocks.QUARTZ_COLUMN)
                .add(TwigsBlocks.STONE_COLUMN)
                .add(TwigsBlocks.DEEPSLATE_COLUMN)
                .add(TwigsBlocks.BLACKSTONE_COLUMN)
                .add(TwigsBlocks.PETRIFIED_LICHEN)
                .add(TwigsBlocks.COPPER_PILLAR)
                .add(TwigsBlocks.EXPOSED_COPPER_PILLAR)
                .add(TwigsBlocks.WEATHERED_COPPER_PILLAR)
                .add(TwigsBlocks.OXIDIZED_COPPER_PILLAR)
                .add(TwigsBlocks.WAXED_COPPER_PILLAR)
                .add(TwigsBlocks.WAXED_EXPOSED_COPPER_PILLAR)
                .add(TwigsBlocks.WAXED_WEATHERED_COPPER_PILLAR)
                .add(TwigsBlocks.WAXED_OXIDIZED_COPPER_PILLAR);
    }


    private void modTags() {
        getOrCreateTagBuilder(TwigsTags.BLOODSTONE_BLOCK)
                .add(TwigsBlocks.BLOODSTONE)
                .add(TwigsBlocks.BLOODSTONE_STAIRS)
                .add(TwigsBlocks.BLOODSTONE_SLAB)
                .add(TwigsBlocks.BLOODSTONE_WALL)
                .add(TwigsBlocks.POLISHED_BLOODSTONE)
                .add(TwigsBlocks.POLISHED_BLOODSTONE_STAIRS)
                .add(TwigsBlocks.POLISHED_BLOODSTONE_SLAB)
                .add(TwigsBlocks.POLISHED_BLOODSTONE_BRICKS)
                .add(TwigsBlocks.POLISHED_BLOODSTONE_BRICK_STAIRS)
                .add(TwigsBlocks.POLISHED_BLOODSTONE_BRICK_SLAB)
                .add(TwigsBlocks.POLISHED_BLOODSTONE_BRICK_WALL)
                .add(TwigsBlocks.CRACKED_POLISHED_BLOODSTONE_BRICKS);

        getOrCreateTagBuilder(TwigsTags.OFFSET_REMOVER)
                .forceAddTag(TwigsTags.SILT_POTS_BLOCK);

        getOrCreateTagBuilder(TwigsTags.PACKED_SILT_BLOCK)
                .add(TwigsBlocks.PACKED_SILT)
                .add(TwigsBlocks.WHITE_PACKED_SILT)
                .add(TwigsBlocks.ORANGE_PACKED_SILT)
                .add(TwigsBlocks.MAGENTA_PACKED_SILT)
                .add(TwigsBlocks.LIGHT_BLUE_PACKED_SILT)
                .add(TwigsBlocks.YELLOW_PACKED_SILT)
                .add(TwigsBlocks.LIME_PACKED_SILT)
                .add(TwigsBlocks.PINK_PACKED_SILT)
                .add(TwigsBlocks.GRAY_PACKED_SILT)
                .add(TwigsBlocks.LIGHT_GRAY_PACKED_SILT)
                .add(TwigsBlocks.CYAN_PACKED_SILT)
                .add(TwigsBlocks.PURPLE_PACKED_SILT)
                .add(TwigsBlocks.BLUE_PACKED_SILT)
                .add(TwigsBlocks.BROWN_PACKED_SILT)
                .add(TwigsBlocks.GREEN_PACKED_SILT)
                .add(TwigsBlocks.RED_PACKED_SILT)
                .add(TwigsBlocks.BLACK_PACKED_SILT)
                .add(TwigsBlocks.SILT_SHINGLES)
                .add(TwigsBlocks.WHITE_SILT_SHINGLES)
                .add(TwigsBlocks.ORANGE_SILT_SHINGLES)
                .add(TwigsBlocks.MAGENTA_SILT_SHINGLES)
                .add(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLES)
                .add(TwigsBlocks.YELLOW_SILT_SHINGLES)
                .add(TwigsBlocks.LIME_SILT_SHINGLES)
                .add(TwigsBlocks.PINK_SILT_SHINGLES)
                .add(TwigsBlocks.GRAY_SILT_SHINGLES)
                .add(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLES)
                .add(TwigsBlocks.CYAN_SILT_SHINGLES)
                .add(TwigsBlocks.PURPLE_SILT_SHINGLES)
                .add(TwigsBlocks.BLUE_SILT_SHINGLES)
                .add(TwigsBlocks.BROWN_SILT_SHINGLES)
                .add(TwigsBlocks.GREEN_SILT_SHINGLES)
                .add(TwigsBlocks.RED_SILT_SHINGLES)
                .add(TwigsBlocks.BLACK_SILT_SHINGLES)
                .add(TwigsBlocks.SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.WHITE_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.ORANGE_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.MAGENTA_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.YELLOW_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.LIME_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.PINK_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.GRAY_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.CYAN_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.PURPLE_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.BLUE_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.BROWN_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.GREEN_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.RED_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.BLACK_SILT_SHINGLE_STAIRS)
                .add(TwigsBlocks.SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.WHITE_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.ORANGE_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.MAGENTA_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.YELLOW_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.LIME_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.PINK_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.GRAY_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.CYAN_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.PURPLE_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.BLUE_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.BROWN_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.GREEN_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.RED_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.BLACK_SILT_SHINGLE_SLAB)
                .add(TwigsBlocks.SILT_SHINGLE_WALL)
                .add(TwigsBlocks.WHITE_SILT_SHINGLE_WALL)
                .add(TwigsBlocks.ORANGE_SILT_SHINGLE_WALL)
                .add(TwigsBlocks.MAGENTA_SILT_SHINGLE_WALL)
                .add(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_WALL)
                .add(TwigsBlocks.YELLOW_SILT_SHINGLE_WALL)
                .add(TwigsBlocks.LIME_SILT_SHINGLE_WALL)
                .add(TwigsBlocks.PINK_SILT_SHINGLE_WALL)
                .add(TwigsBlocks.GRAY_SILT_SHINGLE_WALL)
                .add(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_WALL)
                .add(TwigsBlocks.CYAN_SILT_SHINGLE_WALL)
                .add(TwigsBlocks.PURPLE_SILT_SHINGLE_WALL)
                .add(TwigsBlocks.BLUE_SILT_SHINGLE_WALL)
                .add(TwigsBlocks.BROWN_SILT_SHINGLE_WALL)
                .add(TwigsBlocks.GREEN_SILT_SHINGLE_WALL)
                .add(TwigsBlocks.RED_SILT_SHINGLE_WALL)
                .add(TwigsBlocks.BLACK_SILT_SHINGLE_WALL);

        getOrCreateTagBuilder(TwigsTags.RHYOLITE_BLOCK)
                .add(TwigsBlocks.RHYOLITE)
                .add(TwigsBlocks.RHYOLITE_STAIRS)
                .add(TwigsBlocks.RHYOLITE_SLAB)
                .add(TwigsBlocks.RHYOLITE_WALL)
                .add(TwigsBlocks.POLISHED_RHYOLITE)
                .add(TwigsBlocks.POLISHED_RHYOLITE_STAIRS)
                .add(TwigsBlocks.POLISHED_RHYOLITE_SLAB)
                .add(TwigsBlocks.POLISHED_RHYOLITE_BRICKS)
                .add(TwigsBlocks.POLISHED_RHYOLITE_BRICK_STAIRS)
                .add(TwigsBlocks.POLISHED_RHYOLITE_BRICK_SLAB)
                .add(TwigsBlocks.POLISHED_RHYOLITE_BRICK_WALL)
                .add(TwigsBlocks.CRACKED_POLISHED_RHYOLITE_BRICKS);

        getOrCreateTagBuilder(TwigsTags.SCHIST_BLOCK)
                .add(TwigsBlocks.SCHIST)
                .add(TwigsBlocks.SCHIST_STAIRS)
                .add(TwigsBlocks.SCHIST_SLAB)
                .add(TwigsBlocks.SCHIST_WALL)
                .add(TwigsBlocks.POLISHED_SCHIST)
                .add(TwigsBlocks.POLISHED_SCHIST_STAIRS)
                .add(TwigsBlocks.POLISHED_SCHIST_SLAB)
                .add(TwigsBlocks.POLISHED_SCHIST_BRICKS)
                .add(TwigsBlocks.POLISHED_SCHIST_BRICK_STAIRS)
                .add(TwigsBlocks.POLISHED_SCHIST_BRICK_SLAB)
                .add(TwigsBlocks.POLISHED_SCHIST_BRICK_WALL)
                .add(TwigsBlocks.CRACKED_POLISHED_SCHIST_BRICKS);

        getOrCreateTagBuilder(TwigsTags.SILT_POTS_BLOCK)
                .add(TwigsBlocks.SILT_POT)
                .add(TwigsBlocks.WHITE_SILT_POT)
                .add(TwigsBlocks.ORANGE_SILT_POT)
                .add(TwigsBlocks.MAGENTA_SILT_POT)
                .add(TwigsBlocks.LIGHT_BLUE_SILT_POT)
                .add(TwigsBlocks.YELLOW_SILT_POT)
                .add(TwigsBlocks.LIME_SILT_POT)
                .add(TwigsBlocks.PINK_SILT_POT)
                .add(TwigsBlocks.GRAY_SILT_POT)
                .add(TwigsBlocks.LIGHT_GRAY_SILT_POT)
                .add(TwigsBlocks.CYAN_SILT_POT)
                .add(TwigsBlocks.PURPLE_SILT_POT)
                .add(TwigsBlocks.BLUE_SILT_POT)
                .add(TwigsBlocks.BROWN_SILT_POT)
                .add(TwigsBlocks.GREEN_SILT_POT)
                .add(TwigsBlocks.RED_SILT_POT)
                .add(TwigsBlocks.BLACK_SILT_POT);

        getOrCreateTagBuilder(TwigsTags.TABLES_BLOCK)
                .add(TwigsBlocks.OAK_TABLE)
                .add(TwigsBlocks.SPRUCE_TABLE)
                .add(TwigsBlocks.BIRCH_TABLE)
                .add(TwigsBlocks.JUNGLE_TABLE)
                .add(TwigsBlocks.DARK_OAK_TABLE)
                .add(TwigsBlocks.ACACIA_TABLE)
                .add(TwigsBlocks.CHERRY_TABLE)
                .add(TwigsBlocks.MANGROVE_TABLE)
                .add(TwigsBlocks.BAMBOO_TABLE)
                .add(TwigsBlocks.CRIMSON_TABLE)
                .add(TwigsBlocks.WARPED_TABLE);
    }

}
