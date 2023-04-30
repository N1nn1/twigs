package com.ninni.twigs.stat;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.StatFormatter;
import static net.minecraft.stats.Stats.CUSTOM;

public interface TwigsStats {

    static void init() {
    }

    ResourceLocation OPEN_SILT_POT = register("open_silt_pot", StatFormatter.DEFAULT);

    private static ResourceLocation register(String id, StatFormatter formatter) {
        ResourceLocation rl = new ResourceLocation(id);
        Registry.register(BuiltInRegistries.CUSTOM_STAT, id, rl);
        CUSTOM.get(rl, formatter);
        return rl;
    }
}
