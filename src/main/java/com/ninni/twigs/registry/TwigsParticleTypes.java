package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TwigsParticleTypes {

    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Twigs.MOD_ID);

    public static final RegistryObject<SimpleParticleType> ITEM_PEBBLE = PARTICLE_TYPES.register("item_pebble", () -> new SimpleParticleType(false));

}
