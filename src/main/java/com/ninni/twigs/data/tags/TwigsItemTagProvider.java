package com.ninni.twigs.data.tags;

import com.ninni.twigs.TwigsTags;
import com.ninni.twigs.registry.TwigsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class TwigsItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public TwigsItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture, @Nullable FabricTagProvider.BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        copyBlockTags();
        getOrCreateTagBuilder(TwigsTags.PACKED_SILT_FULL_BLOCKS)
                .add(TwigsItems.PACKED_SILT)
                .add(TwigsItems.WHITE_PACKED_SILT)
                .add(TwigsItems.ORANGE_PACKED_SILT)
                .add(TwigsItems.MAGENTA_PACKED_SILT)
                .add(TwigsItems.LIGHT_BLUE_PACKED_SILT)
                .add(TwigsItems.YELLOW_PACKED_SILT)
                .add(TwigsItems.LIME_PACKED_SILT)
                .add(TwigsItems.PINK_PACKED_SILT)
                .add(TwigsItems.GRAY_PACKED_SILT)
                .add(TwigsItems.LIGHT_GRAY_PACKED_SILT)
                .add(TwigsItems.CYAN_PACKED_SILT)
                .add(TwigsItems.PURPLE_PACKED_SILT)
                .add(TwigsItems.BLUE_PACKED_SILT)
                .add(TwigsItems.BROWN_PACKED_SILT)
                .add(TwigsItems.GREEN_PACKED_SILT)
                .add(TwigsItems.RED_PACKED_SILT)
                .add(TwigsItems.BLACK_PACKED_SILT);

        getOrCreateTagBuilder(TwigsTags.SEASHELLS)
                .add(TwigsItems.BRONZED_SEASHELL)
                .add(TwigsItems.OPALINE_SEASHELL)
                .add(TwigsItems.ROSEATE_SEASHELL)
                .add(TwigsItems.TANGERINE_SEASHELL);
    }

    private void copyBlockTags() {
        // vanilla tags
        copy(BlockTags.PIGLIN_REPELLENTS, ItemTags.PIGLIN_REPELLENTS);
        copy(BlockTags.SMALL_FLOWERS, ItemTags.SMALL_FLOWERS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.WALLS, ItemTags.WALLS);

        // mod tags
        copy(TwigsTags.BLOODSTONE_BLOCK, TwigsTags.BLOODSTONE_ITEM);
        copy(TwigsTags.PACKED_SILT_BLOCK, TwigsTags.PACKED_SILT_ITEM);
        copy(TwigsTags.RHYOLITE_BLOCK, TwigsTags.RHYOLITE_ITEM);
        copy(TwigsTags.SCHIST_BLOCK, TwigsTags.SCHIST_ITEM);
        copy(TwigsTags.SILT_POTS_BLOCK, TwigsTags.SILT_POTS_ITEM);
        copy(TwigsTags.TABLES_BLOCK, TwigsTags.TABLES_ITEM);
    }
}
