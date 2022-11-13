package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class TwigsSoundEvents {

    public static final SoundEvent LAMP_BREAK = register("block.lamp.break");
    public static final SoundEvent LAMP_PLACE = register("block.lamp.place");
    public static final SoundEvent LAMP_FALL = register("block.lamp.fall");
    public static final SoundEvent LAMP_ON = register("block.lamp.on");
    public static final SoundEvent LAMP_OFF = register("block.lamp.off");

    private static SoundEvent register(String name) {
        ResourceLocation id = new ResourceLocation(Twigs.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
