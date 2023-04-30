package com.ninni.twigs.registry;

import net.minecraft.world.level.block.ComposterBlock;

public class TwigsVanillaIntegration {

    public static void init() {
        ComposterBlock.COMPOSTABLES.put(TwigsItems.BAMBOO_LEAVES.get(), 0.3F);
    }

}
