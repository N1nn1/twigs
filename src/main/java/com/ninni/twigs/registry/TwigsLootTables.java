package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.resources.ResourceLocation;

public class TwigsLootTables {
    public static final ResourceLocation BLOODSTONE_OBELISK_CHEST = create("chests/bloodstone_obelisk");

    private static ResourceLocation create(String id) {
        return new ResourceLocation(Twigs.MOD_ID, id);
    }
}
