package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.entity.Pebble;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Twigs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TwigsEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Twigs.MOD_ID);

    public static final RegistryObject<EntityType<Pebble>> PEBBLE = ENTITY_TYPES.register("pebble", () -> EntityType.Builder.<Pebble>of(Pebble::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(ResourceLocation.fromNamespaceAndPath(Twigs.MOD_ID, "pebble").toString()));

}
