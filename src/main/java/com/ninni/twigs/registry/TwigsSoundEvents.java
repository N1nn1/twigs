package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Twigs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TwigsSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Twigs.MOD_ID);

    public static final RegistryObject<SoundEvent> ITEM_BRONZED_SEASHELL = register("item.bronzed_seashell.play");
    public static final RegistryObject<SoundEvent> LAMP_ON = register("block.lamp.on");
    public static final RegistryObject<SoundEvent> LAMP_OFF = register("block.lamp.off");
    public static final RegistryObject<SoundEvent> ENTITY_PEBBLE_THROW = register("entity.pebble.throw");

    public static final SoundType ROCKY_DIRT = register("rocky_dirt", 1, 1);
    public static final SoundType BASALT_BRICKS = register("basalt_bricks", 0.75F, 1);
    public static final SoundType LAMP = register("lamp", 1, 0.7F);
    public static final SoundType SHROOMLAMP = register("shroomlamp", 1.5F, 1);
    public static final SoundType SILT = register("silt", 1, 1);
    public static final SoundType PACKED_SILT = register("packed_silt", 1, 1);
    public static final SoundType SILT_POT = register("silt_pot", 1, 1);
    public static final SoundType SILT_POT_FILLED = register("silt_pot_filled", 1, 1);
    public static final SoundType SILT_SHINGLES = register("silt_shingles", 1, 1);
    public static final SoundType GRAVEL_BRICKS = register("gravel_bricks", 1, 1);

    //TODO Change this to custom sound
    public static final SoundType PETRIFIED_LICHEN = register("petrified_lichen", 1, 1);
    public static final SoundType BAMBOO_LEAVES = register("bamboo_leaves", 1, 1);
    public static final SoundType PAPER_LANTERN = register("paper_lantern", 1, 1);
    public static final SoundType SEASHELL = register("seashell", 1, 1);
    public static final SoundType TUFF_BRICKS = register("tuff_bricks", 1, 1);
    public static final SoundType CALCITE_BRICKS = register("calcite_bricks", 1, 1);
    public static final SoundType RHYOLITE = register("rhyolite", 1, 1);
    public static final SoundType RHYOLITE_BRICKS = register("rhyolite_bricks", 1, 1);
    public static final SoundType SCHIST = register("schist", 1, 1);
    public static final SoundType SCHIST_BRICKS = register("schist_bricks", 1, 1);
    public static final SoundType BLOODSTONE = register("bloodstone", 1, 1);
    public static final SoundType BLOODSTONE_BRICKS = register("bloodstone_bricks", 1, 1);


    private static SoundType register(String name, float volume, float pitch) {
        return new ForgeSoundType(volume, pitch, register("block." + name + ".break"), register("block." + name + ".step"), register("block." + name + ".place"), register("block." + name + ".hit"), register("block." + name + ".fall"));
    }

    private static RegistryObject<SoundEvent> register(String name) {
        ResourceLocation id = new ResourceLocation(Twigs.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }
}
