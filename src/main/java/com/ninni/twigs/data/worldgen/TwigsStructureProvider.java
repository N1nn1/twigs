package com.ninni.twigs.data.worldgen;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.ninni.twigs.TwigsTags;
import com.ninni.twigs.world.gen.structures.ObeliskStructure;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.Pools;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.TerrainAdjustment;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadStructurePlacement;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;

import static com.ninni.twigs.Twigs.MOD_ID;

public interface TwigsStructureProvider {
    // (ender) this one will be bad I'm sorry
    ResourceLocation OBELISK = ResourceLocation.fromNamespaceAndPath(MOD_ID, "bloodstone_obelisk");
    ResourceKey<Structure> BLOODSTONE_OBELISK_STRUCTURE = ResourceKey.create(Registries.STRUCTURE, OBELISK);
    ResourceKey<StructureSet> BLOODSTONE_OBELISK_SET = ResourceKey.create(Registries.STRUCTURE_SET, OBELISK);
    ResourceKey<StructureTemplatePool> BLOODSTONE_OBELISK_TEMPLATE_POOL = ResourceKey.create(Registries.TEMPLATE_POOL, OBELISK);

    // (ender) forge u really suck for this one
    ResourceKey<StructureProcessorList> EMPTY = ResourceKey.create(Registries.PROCESSOR_LIST, ResourceLocation.withDefaultNamespace("empty"));

    static void bootstrapTemplatePools(BootstrapContext<StructureTemplatePool> context) {
        var pools = context.lookup(Registries.TEMPLATE_POOL);
        var processors = context.lookup(Registries.PROCESSOR_LIST);
        context.register(BLOODSTONE_OBELISK_TEMPLATE_POOL,
                new StructureTemplatePool(
                        pools.getOrThrow(Pools.EMPTY),
                        ImmutableList.of(Pair.of(StructurePoolElement.single("twigs:bloodstone_obelisk", processors.getOrThrow(EMPTY)), 1)),
                        StructureTemplatePool.Projection.RIGID
                )
        );
    }

    static void bootstrapStructureSets(BootstrapContext<StructureSet> context) {
        var structures = context.lookup(Registries.STRUCTURE);
        context.register(BLOODSTONE_OBELISK_SET,
                new StructureSet(
                        structures.getOrThrow(BLOODSTONE_OBELISK_STRUCTURE),
                        new RandomSpreadStructurePlacement(20, 4, RandomSpreadType.LINEAR, 4206914)
                )
        );
    }

    static void bootstrapStructures(BootstrapContext<Structure> context) {
        var biomes = context.lookup(Registries.BIOME);
        context.register(
                BLOODSTONE_OBELISK_STRUCTURE,
                new ObeliskStructure(
                        new Structure.StructureSettings.Builder(biomes.getOrThrow(TwigsTags.HAS_STRUCTURE_BLOODSTONE_OBELISK))
                                .terrainAdapation(TerrainAdjustment.BEARD_THIN)
                                .generationStep(GenerationStep.Decoration.SURFACE_STRUCTURES)
                                .build()
                )
        );
    }
}
