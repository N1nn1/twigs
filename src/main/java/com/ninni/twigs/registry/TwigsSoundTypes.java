package com.ninni.twigs.registry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;

public interface TwigsSoundTypes {

    SoundType LAMP = new SoundType(
            1.0F, 0.7F,

            TwigsSoundEvents.LAMP_BREAK,
            SoundEvents.LANTERN_STEP,
            TwigsSoundEvents.LAMP_PLACE,
            SoundEvents.LANTERN_HIT,
            TwigsSoundEvents.LAMP_FALL
    );

    SoundType SHROOMLAMP = new SoundType(
            1.5F, 1.0F,

            TwigsSoundEvents.SHROOMLAMP_BREAK,
            //TODO in 1.19.2 add nether wood step sounds
            SoundEvents.WOOD_STEP,
            TwigsSoundEvents.SHROOMLAMP_PLACE,
            SoundEvents.SHROOMLIGHT_HIT,
            TwigsSoundEvents.SHROOMLAMP_FALL
    );

    SoundType BASALT_BRICKS = new SoundType(
            1.0F, 0.75F,

            TwigsSoundEvents.BASALT_BRICKS_BREAK,
            TwigsSoundEvents.BASALT_BRICKS_STEP,
            TwigsSoundEvents.BASALT_BRICKS_PLACE,
            TwigsSoundEvents.BASALT_BRICKS_HIT,
            TwigsSoundEvents.BASALT_BRICKS_FALL
    );
}
