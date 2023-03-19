package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.SoundType;

public interface    TwigsSoundEvents {

    SoundEvent LAMP_ON = register("block.lamp.on");
    SoundEvent LAMP_OFF = register("block.lamp.off");
    SoundEvent ENTITY_PEBBLE_THROW = register("entity.pebble.throw");

    SoundType ROCKY_DIRT = register("rocky_dirt", 1, 1);
    SoundType BASALT_BRICKS = register("basalt_bricks", 0.75F, 1);
    SoundType LAMP = register("lamp", 1, 0.7F);
    SoundType SHROOMLAMP = register("shroomlamp", 1.5F, 1);
    SoundType SILT = register("silt", 1, 1);
    SoundType PACKED_SILT = register("packed_silt", 1, 1);
    SoundType SILT_POT = register("silt_pot", 1, 1);
    SoundType SILT_POT_FILLED = register("silt_pot_filled", 1, 1);
    SoundType SILT_SHINGLES = register("silt_shingles", 1, 1);
    SoundType GRAVEL_BRICKS = register("gravel_bricks", 1, 1);
    //Change this to custom sound
    SoundType PETRIFIED_LICHEN = SoundType.DEEPSLATE;
    SoundType BAMBOO_LEAVES = SoundType.AZALEA_LEAVES;


    private static SoundType register(String name, float volume, float pitch) {
        return new SoundType(volume, pitch, register("block." + name + ".break"), register("block." + name + ".step"), register("block." + name + ".place"), register("block." + name + ".hit"), register("block." + name + ".fall"));
    }

    private static SoundEvent register(String name) {
        ResourceLocation id = new ResourceLocation(Twigs.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }
}
