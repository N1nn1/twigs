package com.ninni.twigs.world.gen.structures;

import com.mojang.serialization.Codec;
import com.ninni.twigs.registry.TwigsStructureTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.NoiseColumn;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;

import java.util.Optional;

public class ObeliskStructure extends Structure {
    public static final Codec<ObeliskStructure> CODEC = ObeliskStructure.simpleCodec(ObeliskStructure::new);

    public ObeliskStructure(StructureSettings structureSettings) {
        super(structureSettings);
    }

    @Override
    protected Optional<GenerationStub> findGenerationPoint(GenerationContext generationContext) {
        if (!ObeliskStructure.canGenerate(generationContext, generationContext.chunkPos().getMiddleBlockPosition(0))) {
            return Optional.empty();
        }
        return ObeliskStructure.onTopOfChunkCenter(generationContext, Heightmap.Types.WORLD_SURFACE_WG, collector -> this.addPieces(collector, generationContext));
    }

    public static boolean canGenerate(GenerationContext context, BlockPos blockPos) {
        boolean flag = false;
        int range = 5;
        for (int x = -range; x <= range; x++) {
            for (int z = -range; z <= range; z++) {
                BlockPos structurePos = blockPos.offset(x, 0, z);
                NoiseColumn verticalBlockSample = context.chunkGenerator().getBaseColumn(structurePos.getX(), structurePos.getZ(), context.heightAccessor(), context.randomState());
                for (int y = 127; y > context.chunkGenerator().getSeaLevel(); y--) {
                    if (verticalBlockSample.getBlock(y - 1).canOcclude() && verticalBlockSample.getBlock(y).isAir() && verticalBlockSample.getBlock(y + 14).isAir()) {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public void addPieces(StructurePiecesBuilder collector, GenerationContext context) {
        ChunkPos chunkPos = context.chunkPos();
        WorldgenRandom random = context.random();
        BlockPos pos = new BlockPos(chunkPos.getMinBlockX(), this.getHeight(random), chunkPos.getMinBlockZ());
        ObeliskGenerator.addPieces(context.structureTemplateManager(), pos, Rotation.getRandom(random), collector);
    }

    private int getHeight(WorldgenRandom random) {
        return random.nextInt(60) + 40;
    }

    @Override
    public StructureType<?> type() {
        return TwigsStructureTypes.OBELISK;
    }
}
