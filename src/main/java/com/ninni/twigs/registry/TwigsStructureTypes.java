package com.ninni.twigs.registry;

import com.mojang.serialization.Codec;
import com.ninni.twigs.Twigs;
import com.ninni.twigs.world.gen.structures.ObeliskStructure;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;

public class TwigsStructureTypes {

    public static final StructureType<ObeliskStructure> OBELISK = register("obelisk", ObeliskStructure.CODEC);

    private static <S extends Structure> StructureType<S> register(String string, Codec<S> codec) {
        return Registry.register(BuiltInRegistries.STRUCTURE_TYPE, new ResourceLocation(Twigs.MOD_ID, string), () -> codec);
    }

}
