package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class TwigsSoundEvents {

    public static final SoundEvent SHROOMLAMP_BREAK = register("block.shroomlamp.break");
    public static final SoundEvent SHROOMLAMP_PLACE = register("block.shroomlamp.place");
    public static final SoundEvent SHROOMLAMP_FALL = register("block.shroomlamp.fall");

    public static final SoundEvent LAMP_BREAK = register("block.lamp.break");
    public static final SoundEvent LAMP_PLACE = register("block.lamp.place");
    public static final SoundEvent LAMP_FALL = register("block.lamp.fall");
    public static final SoundEvent LAMP_ON = register("block.lamp.on");
    public static final SoundEvent LAMP_OFF = register("block.lamp.off");

    public static final SoundEvent BASALT_BRICKS_BREAK = register("block.basalt_bricks.break");
    public static final SoundEvent BASALT_BRICKS_PLACE = register("block.basalt_bricks.place");
    public static final SoundEvent BASALT_BRICKS_FALL = register("block.basalt_bricks.fall");
    public static final SoundEvent BASALT_BRICKS_STEP = register("block.basalt_bricks.step");
    public static final SoundEvent BASALT_BRICKS_HIT = register("block.basalt_bricks.hit");

    public static final SoundEvent ROCKY_DIRT_BREAK = register("block.rocky_dirt.break");
    public static final SoundEvent ROCKY_DIRT_PLACE = register("block.rocky_dirt.place");
    public static final SoundEvent ROCKY_DIRT_FALL = register("block.rocky_dirt.fall");
    public static final SoundEvent ROCKY_DIRT_STEP = register("block.rocky_dirt.step");
    public static final SoundEvent ROCKY_DIRT_HIT = register("block.rocky_dirt.hit");

    private static SoundEvent register(String name) {
        ResourceLocation id = new ResourceLocation(Twigs.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
