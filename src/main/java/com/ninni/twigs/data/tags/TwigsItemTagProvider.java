package com.ninni.twigs.data.tags;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.TwigsTags;
import com.ninni.twigs.registry.TwigsItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class TwigsItemTagProvider extends ItemTagsProvider {
    public TwigsItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider,  CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper fileHelper) {
        super(output, provider, blockTags, Twigs.MOD_ID, fileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        copyBlockTags();
        tag(TwigsTags.PACKED_SILT_FULL_BLOCKS)
                .add(TwigsItems.PACKED_SILT.get())
                .add(TwigsItems.WHITE_PACKED_SILT.get())
                .add(TwigsItems.ORANGE_PACKED_SILT.get())
                .add(TwigsItems.MAGENTA_PACKED_SILT.get())
                .add(TwigsItems.LIGHT_BLUE_PACKED_SILT.get())
                .add(TwigsItems.YELLOW_PACKED_SILT.get())
                .add(TwigsItems.LIME_PACKED_SILT.get())
                .add(TwigsItems.PINK_PACKED_SILT.get())
                .add(TwigsItems.GRAY_PACKED_SILT.get())
                .add(TwigsItems.LIGHT_GRAY_PACKED_SILT.get())
                .add(TwigsItems.CYAN_PACKED_SILT.get())
                .add(TwigsItems.PURPLE_PACKED_SILT.get())
                .add(TwigsItems.BLUE_PACKED_SILT.get())
                .add(TwigsItems.BROWN_PACKED_SILT.get())
                .add(TwigsItems.GREEN_PACKED_SILT.get())
                .add(TwigsItems.RED_PACKED_SILT.get())
                .add(TwigsItems.BLACK_PACKED_SILT.get());

        tag(TwigsTags.SEASHELLS)
                .add(TwigsItems.BRONZED_SEASHELL.get())
                .add(TwigsItems.OPALINE_SEASHELL.get())
                .add(TwigsItems.ROSEATE_SEASHELL.get())
                .add(TwigsItems.TANGERINE_SEASHELL.get());
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
