package com.ninni.twigs.data.tags;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.TwigsTags;
import com.ninni.twigs.data.TwigsDataGenerator;
import com.ninni.twigs.registry.TwigsBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class TwigsBlockTagProvider extends BlockTagsProvider {
    public TwigsBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Twigs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        flowerTags();
        microBlockTags();
        mineableTags();
        modTags();


        tag(BlockTags.CRYSTAL_SOUND_BLOCKS)
                .add(TwigsBlocks.POLISHED_AMETHYST.get())
                .add(TwigsBlocks.CUT_AMETHYST.get());
        tag(BlockTags.INSIDE_STEP_SOUND_BLOCKS)
                .add(TwigsBlocks.PETRIFIED_LICHEN.get())
//                .add(TwigsBlocks.BRICK_TRAIL)
//                .add(TwigsBlocks.SILT_BRICK_TRAIL)
                .add(TwigsBlocks.AZALEA_FLOWERS.get());
        tag(BlockTags.PIGLIN_REPELLENTS)
                .add(TwigsBlocks.SOUL_LAMP.get());
    }

    private void flowerTags() {
        tag(BlockTags.SMALL_FLOWERS)
                .add(TwigsBlocks.AZALEA_FLOWERS.get());

        tag(BlockTags.FLOWER_POTS)
                .add(TwigsBlocks.POTTED_AZALEA_FLOWERS.get());

        // (ender) replaceable_plants got replaced by replaceable_by_trees in 1.20,
        // but I feel like these 2 items should also be in replaceable
        // also replaceable is referenced in enchantment_power_transmitter

        tag(BlockTags.REPLACEABLE)
                .add(TwigsBlocks.AZALEA_FLOWERS.get())
                .add(TwigsBlocks.PETRIFIED_LICHEN.get());

        tag(BlockTags.REPLACEABLE_BY_TREES)
                .add(TwigsBlocks.AZALEA_FLOWERS.get())
                .add(TwigsBlocks.PETRIFIED_LICHEN.get());
    }

    private void microBlockTags() {
        var stairsTag = tag(BlockTags.STAIRS);
        var slabTag = tag(BlockTags.SLABS);
        var wallTag = tag(BlockTags.WALLS);
        for (Block block : TwigsDataGenerator.getModBlocks()) {
            if (block instanceof StairBlock) stairsTag.add(block);
            else if (block instanceof SlabBlock) slabTag.add(block);
            else if (block instanceof WallBlock) wallTag.add(block);
        }
    }

    private void mineableTags() {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .addTag(TwigsTags.TABLES_BLOCK)
                .add(TwigsBlocks.CRIMSON_SHROOMLAMP.get())
                .add(TwigsBlocks.WARPED_SHROOMLAMP.get());

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(TwigsBlocks.ROCKY_DIRT.get())
                .add(TwigsBlocks.SILT.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(TwigsBlocks.LAMP.get())
                .add(TwigsBlocks.SOUL_LAMP.get())
                .add(TwigsBlocks.POLISHED_BASALT_BRICKS.get())
                .add(TwigsBlocks.CHISELED_SMOOTH_BASALT_BRICKS.get())
                .add(TwigsBlocks.SMOOTH_BASALT_BRICKS.get())
                .add(TwigsBlocks.SMOOTH_BASALT_BRICK_STAIRS.get())
                .add(TwigsBlocks.SMOOTH_BASALT_BRICK_SLAB.get())
                .add(TwigsBlocks.SMOOTH_BASALT_BRICK_WALL.get())
                .add(TwigsBlocks.MIXED_BRICKS.get())
                .add(TwigsBlocks.CHISELED_BRICKS.get())
                .add(TwigsBlocks.CRACKED_BRICKS.get())
                .add(TwigsBlocks.MOSSY_BRICKS.get())
                .add(TwigsBlocks.MOSSY_BRICK_STAIRS.get())
                .add(TwigsBlocks.MOSSY_BRICK_SLAB.get())
                .add(TwigsBlocks.MOSSY_BRICK_WALL.get())
                .add(TwigsBlocks.POLISHED_AMETHYST.get())
                .add(TwigsBlocks.CUT_AMETHYST.get())
                .add(TwigsBlocks.COBBLESTONE_BRICKS.get())
                .add(TwigsBlocks.COBBLESTONE_BRICK_SLAB.get())
                .add(TwigsBlocks.COBBLESTONE_BRICK_STAIRS.get())
                .add(TwigsBlocks.COBBLESTONE_BRICK_WALL.get())
                .add(TwigsBlocks.CRACKED_COBBLESTONE_BRICKS.get())
                .add(TwigsBlocks.MOSSY_COBBLESTONE_BRICKS.get())
                .add(TwigsBlocks.MOSSY_COBBLESTONE_BRICK_SLAB.get())
                .add(TwigsBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS.get())
                .add(TwigsBlocks.MOSSY_COBBLESTONE_BRICK_WALL.get())
                .add(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS.get())
                .add(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB.get())
                .add(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS.get())
                .add(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_WALL.get())
                .add(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS.get())
                .add(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS.get())
                .add(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB.get())
                .add(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_WALL.get())
                .add(TwigsBlocks.POLISHED_TUFF.get())
                .add(TwigsBlocks.POLISHED_TUFF_STAIRS.get())
                .add(TwigsBlocks.POLISHED_TUFF_SLAB.get())
                .add(TwigsBlocks.POLISHED_TUFF_BRICKS.get())
                .add(TwigsBlocks.POLISHED_TUFF_BRICK_STAIRS.get())
                .add(TwigsBlocks.POLISHED_TUFF_BRICK_SLAB.get())
                .add(TwigsBlocks.POLISHED_TUFF_BRICK_WALL.get())
                .add(TwigsBlocks.CRACKED_POLISHED_TUFF_BRICKS.get())
                .add(TwigsBlocks.CALCITE_STAIRS.get())
                .add(TwigsBlocks.CALCITE_SLAB.get())
                .add(TwigsBlocks.CALCITE_WALL.get())
                .add(TwigsBlocks.POLISHED_CALCITE.get())
                .add(TwigsBlocks.POLISHED_CALCITE_STAIRS.get())
                .add(TwigsBlocks.POLISHED_CALCITE_SLAB.get())
                .add(TwigsBlocks.POLISHED_CALCITE_BRICKS.get())
                .add(TwigsBlocks.POLISHED_CALCITE_BRICK_STAIRS.get())
                .add(TwigsBlocks.POLISHED_CALCITE_BRICK_SLAB.get())
                .add(TwigsBlocks.POLISHED_CALCITE_BRICK_WALL.get())
                .add(TwigsBlocks.CRACKED_POLISHED_CALCITE_BRICKS.get())
                .addTag(TwigsTags.SCHIST_BLOCK)
                .addTag(TwigsTags.RHYOLITE_BLOCK)
                .addTag(TwigsTags.BLOODSTONE_BLOCK)
                .add(TwigsBlocks.ROCKY_DIRT.get())
                .addTag(TwigsTags.PACKED_SILT_BLOCK)
                .addTag(TwigsTags.SILT_POTS_BLOCK)
                .add(TwigsBlocks.GRAVEL_BRICKS.get())
                .add(TwigsBlocks.GRAVEL_BRICK_STAIRS.get())
                .add(TwigsBlocks.GRAVEL_BRICK_SLAB.get())
                .add(TwigsBlocks.GRAVEL_BRICK_WALL.get())
                .add(TwigsBlocks.SILT_BRICKS.get())
                .add(TwigsBlocks.SILT_BRICK_STAIRS.get())
                .add(TwigsBlocks.SILT_BRICK_SLAB.get())
                .add(TwigsBlocks.SILT_BRICK_WALL.get())
                .add(TwigsBlocks.MIXED_SILT_BRICKS.get())
                .add(TwigsBlocks.CHISELED_SILT_BRICKS.get())
                .add(TwigsBlocks.CRACKED_SILT_BRICKS.get())
                .add(TwigsBlocks.COMPACTED_DRIPSTONE.get())
                .add(TwigsBlocks.SMOOTH_STONE_BRICKS.get())
                .add(TwigsBlocks.SMOOTH_STONE_BRICK_STAIRS.get())
                .add(TwigsBlocks.SMOOTH_STONE_BRICK_SLAB.get())
                .add(TwigsBlocks.SMOOTH_STONE_BRICK_WALL.get())
                .add(TwigsBlocks.QUARTZ_COLUMN.get())
                .add(TwigsBlocks.STONE_COLUMN.get())
                .add(TwigsBlocks.DEEPSLATE_COLUMN.get())
                .add(TwigsBlocks.BLACKSTONE_COLUMN.get())
                .add(TwigsBlocks.PETRIFIED_LICHEN.get())
                .add(TwigsBlocks.COPPER_PILLAR.get())
                .add(TwigsBlocks.EXPOSED_COPPER_PILLAR.get())
                .add(TwigsBlocks.WEATHERED_COPPER_PILLAR.get())
                .add(TwigsBlocks.OXIDIZED_COPPER_PILLAR.get())
                .add(TwigsBlocks.WAXED_COPPER_PILLAR.get())
                .add(TwigsBlocks.WAXED_EXPOSED_COPPER_PILLAR.get())
                .add(TwigsBlocks.WAXED_WEATHERED_COPPER_PILLAR.get())
                .add(TwigsBlocks.WAXED_OXIDIZED_COPPER_PILLAR.get());
    }


    private void modTags() {
        tag(TwigsTags.BLOODSTONE_BLOCK)
                .add(TwigsBlocks.BLOODSTONE.get())
                .add(TwigsBlocks.BLOODSTONE_STAIRS.get())
                .add(TwigsBlocks.BLOODSTONE_SLAB.get())
                .add(TwigsBlocks.BLOODSTONE_WALL.get())
                .add(TwigsBlocks.POLISHED_BLOODSTONE.get())
                .add(TwigsBlocks.POLISHED_BLOODSTONE_STAIRS.get())
                .add(TwigsBlocks.POLISHED_BLOODSTONE_SLAB.get())
                .add(TwigsBlocks.POLISHED_BLOODSTONE_BRICKS.get())
                .add(TwigsBlocks.POLISHED_BLOODSTONE_BRICK_STAIRS.get())
                .add(TwigsBlocks.POLISHED_BLOODSTONE_BRICK_SLAB.get())
                .add(TwigsBlocks.POLISHED_BLOODSTONE_BRICK_WALL.get())
                .add(TwigsBlocks.CRACKED_POLISHED_BLOODSTONE_BRICKS.get());

        tag(TwigsTags.OFFSET_REMOVER)
                .addTag(TwigsTags.SILT_POTS_BLOCK);

        tag(TwigsTags.PACKED_SILT_BLOCK)
                .add(TwigsBlocks.PACKED_SILT.get())
                .add(TwigsBlocks.WHITE_PACKED_SILT.get())
                .add(TwigsBlocks.ORANGE_PACKED_SILT.get())
                .add(TwigsBlocks.MAGENTA_PACKED_SILT.get())
                .add(TwigsBlocks.LIGHT_BLUE_PACKED_SILT.get())
                .add(TwigsBlocks.YELLOW_PACKED_SILT.get())
                .add(TwigsBlocks.LIME_PACKED_SILT.get())
                .add(TwigsBlocks.PINK_PACKED_SILT.get())
                .add(TwigsBlocks.GRAY_PACKED_SILT.get())
                .add(TwigsBlocks.LIGHT_GRAY_PACKED_SILT.get())
                .add(TwigsBlocks.CYAN_PACKED_SILT.get())
                .add(TwigsBlocks.PURPLE_PACKED_SILT.get())
                .add(TwigsBlocks.BLUE_PACKED_SILT.get())
                .add(TwigsBlocks.BROWN_PACKED_SILT.get())
                .add(TwigsBlocks.GREEN_PACKED_SILT.get())
                .add(TwigsBlocks.RED_PACKED_SILT.get())
                .add(TwigsBlocks.BLACK_PACKED_SILT.get())
                .add(TwigsBlocks.SILT_SHINGLES.get())
                .add(TwigsBlocks.WHITE_SILT_SHINGLES.get())
                .add(TwigsBlocks.ORANGE_SILT_SHINGLES.get())
                .add(TwigsBlocks.MAGENTA_SILT_SHINGLES.get())
                .add(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLES.get())
                .add(TwigsBlocks.YELLOW_SILT_SHINGLES.get())
                .add(TwigsBlocks.LIME_SILT_SHINGLES.get())
                .add(TwigsBlocks.PINK_SILT_SHINGLES.get())
                .add(TwigsBlocks.GRAY_SILT_SHINGLES.get())
                .add(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLES.get())
                .add(TwigsBlocks.CYAN_SILT_SHINGLES.get())
                .add(TwigsBlocks.PURPLE_SILT_SHINGLES.get())
                .add(TwigsBlocks.BLUE_SILT_SHINGLES.get())
                .add(TwigsBlocks.BROWN_SILT_SHINGLES.get())
                .add(TwigsBlocks.GREEN_SILT_SHINGLES.get())
                .add(TwigsBlocks.RED_SILT_SHINGLES.get())
                .add(TwigsBlocks.BLACK_SILT_SHINGLES.get())
                .add(TwigsBlocks.SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.WHITE_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.ORANGE_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.MAGENTA_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.YELLOW_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.LIME_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.PINK_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.GRAY_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.CYAN_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.PURPLE_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.BLUE_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.BROWN_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.GREEN_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.RED_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.BLACK_SILT_SHINGLE_STAIRS.get())
                .add(TwigsBlocks.SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.WHITE_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.ORANGE_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.MAGENTA_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.YELLOW_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.LIME_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.PINK_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.GRAY_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.CYAN_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.PURPLE_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.BLUE_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.BROWN_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.GREEN_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.RED_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.BLACK_SILT_SHINGLE_SLAB.get())
                .add(TwigsBlocks.SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.WHITE_SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.ORANGE_SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.MAGENTA_SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.LIGHT_BLUE_SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.YELLOW_SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.LIME_SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.PINK_SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.GRAY_SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.LIGHT_GRAY_SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.CYAN_SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.PURPLE_SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.BLUE_SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.BROWN_SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.GREEN_SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.RED_SILT_SHINGLE_WALL.get())
                .add(TwigsBlocks.BLACK_SILT_SHINGLE_WALL.get());

        tag(TwigsTags.RHYOLITE_BLOCK)
                .add(TwigsBlocks.RHYOLITE.get())
                .add(TwigsBlocks.RHYOLITE_STAIRS.get())
                .add(TwigsBlocks.RHYOLITE_SLAB.get())
                .add(TwigsBlocks.RHYOLITE_WALL.get())
                .add(TwigsBlocks.POLISHED_RHYOLITE.get())
                .add(TwigsBlocks.POLISHED_RHYOLITE_STAIRS.get())
                .add(TwigsBlocks.POLISHED_RHYOLITE_SLAB.get())
                .add(TwigsBlocks.POLISHED_RHYOLITE_BRICKS.get())
                .add(TwigsBlocks.POLISHED_RHYOLITE_BRICK_STAIRS.get())
                .add(TwigsBlocks.POLISHED_RHYOLITE_BRICK_SLAB.get())
                .add(TwigsBlocks.POLISHED_RHYOLITE_BRICK_WALL.get())
                .add(TwigsBlocks.CRACKED_POLISHED_RHYOLITE_BRICKS.get());

        tag(TwigsTags.SCHIST_BLOCK)
                .add(TwigsBlocks.SCHIST.get())
                .add(TwigsBlocks.SCHIST_STAIRS.get())
                .add(TwigsBlocks.SCHIST_SLAB.get())
                .add(TwigsBlocks.SCHIST_WALL.get())
                .add(TwigsBlocks.POLISHED_SCHIST.get())
                .add(TwigsBlocks.POLISHED_SCHIST_STAIRS.get())
                .add(TwigsBlocks.POLISHED_SCHIST_SLAB.get())
                .add(TwigsBlocks.POLISHED_SCHIST_BRICKS.get())
                .add(TwigsBlocks.POLISHED_SCHIST_BRICK_STAIRS.get())
                .add(TwigsBlocks.POLISHED_SCHIST_BRICK_SLAB.get())
                .add(TwigsBlocks.POLISHED_SCHIST_BRICK_WALL.get())
                .add(TwigsBlocks.CRACKED_POLISHED_SCHIST_BRICKS.get());

        tag(TwigsTags.SILT_POTS_BLOCK)
                .add(TwigsBlocks.SILT_POT.get())
                .add(TwigsBlocks.WHITE_SILT_POT.get())
                .add(TwigsBlocks.ORANGE_SILT_POT.get())
                .add(TwigsBlocks.MAGENTA_SILT_POT.get())
                .add(TwigsBlocks.LIGHT_BLUE_SILT_POT.get())
                .add(TwigsBlocks.YELLOW_SILT_POT.get())
                .add(TwigsBlocks.LIME_SILT_POT.get())
                .add(TwigsBlocks.PINK_SILT_POT.get())
                .add(TwigsBlocks.GRAY_SILT_POT.get())
                .add(TwigsBlocks.LIGHT_GRAY_SILT_POT.get())
                .add(TwigsBlocks.CYAN_SILT_POT.get())
                .add(TwigsBlocks.PURPLE_SILT_POT.get())
                .add(TwigsBlocks.BLUE_SILT_POT.get())
                .add(TwigsBlocks.BROWN_SILT_POT.get())
                .add(TwigsBlocks.GREEN_SILT_POT.get())
                .add(TwigsBlocks.RED_SILT_POT.get())
                .add(TwigsBlocks.BLACK_SILT_POT.get());

        tag(TwigsTags.TABLES_BLOCK)
                .add(TwigsBlocks.OAK_TABLE.get())
                .add(TwigsBlocks.SPRUCE_TABLE.get())
                .add(TwigsBlocks.BIRCH_TABLE.get())
                .add(TwigsBlocks.JUNGLE_TABLE.get())
                .add(TwigsBlocks.DARK_OAK_TABLE.get())
                .add(TwigsBlocks.ACACIA_TABLE.get())
                .add(TwigsBlocks.CHERRY_TABLE.get())
                .add(TwigsBlocks.MANGROVE_TABLE.get())
                .add(TwigsBlocks.BAMBOO_TABLE.get())
                .add(TwigsBlocks.CRIMSON_TABLE.get())
                .add(TwigsBlocks.WARPED_TABLE.get());
    }

}
