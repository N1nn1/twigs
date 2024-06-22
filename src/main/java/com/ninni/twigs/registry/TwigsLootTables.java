package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;

public class TwigsLootTables {
    public static final ResourceKey<LootTable> BLOODSTONE_OBELISK_CHEST = create("chests/bloodstone_obelisk");
    public static final ResourceKey<LootTable> PEBBLE_INJECTION = create("injection/pebble");

    private static ResourceKey<LootTable> create(String id) {
        return ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(Twigs.MOD_ID, id));
    }
}
