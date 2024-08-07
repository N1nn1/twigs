package com.ninni.twigs.data.tags;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.TwigsTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class TwigsEntityTypeTagProvider extends EntityTypeTagsProvider {
    public TwigsEntityTypeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Twigs.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        tag(TwigsTags.BAMBOO_LEAVES_SLOW_IMMUNE)
                .add(EntityType.PANDA, EntityType.BEE, EntityType.PARROT, EntityType.OCELOT);
    }
}
