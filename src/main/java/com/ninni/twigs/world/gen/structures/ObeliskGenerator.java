package com.ninni.twigs.world.gen.structures;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.registry.TwigsLootTables;
import com.ninni.twigs.registry.TwigsStructurePieceTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.TemplateStructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;

public class ObeliskGenerator {
    private static final ResourceLocation OBELISK = new ResourceLocation(Twigs.MOD_ID, "bloodstone_obelisk/bloodstone_obelisk");

    public static void addPieces(StructureTemplateManager manager, BlockPos pos, Rotation rotation, StructurePiecesBuilder holder) {
        holder.addPiece(new ObeliskGenerator.Piece(manager, OBELISK, pos, rotation));
    }

    public static class Piece extends TemplateStructurePiece {
        public static final String ROTATION_KEY = "Rotation";

        public Piece(StructureTemplateManager manager, ResourceLocation id, BlockPos pos, Rotation rotation) {
            super(TwigsStructurePieceTypes.BLOODSTONE_OBELISK, 0, manager, id, id.toString(), createPlacementData(rotation), pos);
        }

        public Piece(StructureTemplateManager manager, CompoundTag nbt) {
            super(TwigsStructurePieceTypes.BLOODSTONE_OBELISK, nbt, manager, id -> createPlacementData(Rotation.valueOf(nbt.getString(ROTATION_KEY))));
        }

        private static StructurePlaceSettings createPlacementData(Rotation rotation) {
            return new StructurePlaceSettings().setRotation(rotation).addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR);
        }

        @Override
        protected void addAdditionalSaveData(StructurePieceSerializationContext structurePieceSerializationContext, CompoundTag compoundTag) {
            super.addAdditionalSaveData(structurePieceSerializationContext, compoundTag);
            compoundTag.putString(ROTATION_KEY, this.placeSettings.getRotation().name());
        }

        @Override
        public void postProcess(WorldGenLevel world, StructureManager structureAccessor, ChunkGenerator chunkGenerator, RandomSource random, BoundingBox chunkBox, ChunkPos chunkPos, BlockPos pivot) {
            if (world.getBlockState(this.templatePosition.below()).is(BlockTags.NYLIUM) || (world.getBlockState(this.templatePosition.below()).is(Blocks.NETHERRACK) && world.isEmptyBlock(this.templatePosition))) {
                this.templatePosition = this.templatePosition.below();
            }
            super.postProcess(world, structureAccessor, chunkGenerator, random, chunkBox, chunkPos, pivot);
        }

        @Override
        protected void handleDataMarker(String metadata, BlockPos pos, ServerLevelAccessor world, RandomSource random, BoundingBox boundingBox) {
            if (metadata.startsWith("CHEST")) {
                Rotation rotation = this.placeSettings.getRotation();
                this.createChest(world, boundingBox, random, pos, TwigsLootTables.BLOODSTONE_OBELISK_CHEST, Blocks.CHEST.defaultBlockState().setValue(ChestBlock.FACING, rotation.rotate(
                        switch (metadata) {
                            default -> Direction.NORTH;
                            case "ChestEast" -> Direction.EAST;
                            case "ChestSouth" -> Direction.SOUTH;
                            case "ChestWest" -> Direction.WEST;
                        }
                )));
            }
        }
    }

}
