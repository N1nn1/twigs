package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.world.gen.structures.ObeliskGenerator;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;

public class TwigsStructurePieceTypes {
    public static final StructurePieceType BLOODSTONE_OBELISK = register("bloodstone_obelisk", ObeliskGenerator.Piece::new);

    private static StructurePieceType register(String id, StructurePieceType type) {
        return Registry.register(BuiltInRegistries.STRUCTURE_PIECE, ResourceLocation.fromNamespaceAndPath(Twigs.MOD_ID, id), type);
    }

    private static StructurePieceType register(String id, StructurePieceType.StructureTemplateType type) {
        return register(id, (StructurePieceType) type);
    }

}
