package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.entity.Pebble;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class TwigsEntityTypes {

    public static final EntityType<Pebble> PEBBLE = register("pebble", EntityType.Builder.<Pebble>of(Pebble::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10));

    public static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> builder) {
        ResourceLocation resourceLocation = new ResourceLocation(Twigs.MOD_ID, id);
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, resourceLocation, builder.build(resourceLocation.toString()));
    }

}
