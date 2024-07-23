package com.ninni.twigs.data.tags;

import com.ninni.twigs.TwigsTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.entity.EntityType;

import java.util.concurrent.CompletableFuture;

public class TwigsEntityTypeTagProvider extends FabricTagProvider.EntityTypeTagProvider {

    public TwigsEntityTypeTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        getOrCreateTagBuilder(TwigsTags.BAMBOO_LEAVES_SLOW_IMMUNE)
                .add(EntityType.PANDA, EntityType.BEE, EntityType.PARROT, EntityType.OCELOT);
    }
}
