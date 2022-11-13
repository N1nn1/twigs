package com.ninni.twigs.registry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;

public interface TwigsSoundTypes {

    SoundType LAMP = new SoundType(
            1.0F, 1.0F,

            TwigsSoundEvents.LAMP_BREAK,
            SoundEvents.LANTERN_STEP,
            TwigsSoundEvents.LAMP_PLACE,
            SoundEvents.LANTERN_HIT,
            TwigsSoundEvents.LAMP_FALL
    );
}
