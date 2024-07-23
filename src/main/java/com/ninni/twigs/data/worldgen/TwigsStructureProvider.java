package com.ninni.twigs.data.worldgen;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.ninni.twigs.TwigsTags;
import com.ninni.twigs.world.gen.structures.ObeliskStructure;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.Pools;
import net.minecraft.data.worldgen.ProcessorLists;
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

import java.util.concurrent.CompletableFuture;

import static com.ninni.twigs.Twigs.MOD_ID;

public class TwigsStructureProvider extends FabricDynamicRegistryProvider {

    public TwigsStructureProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries) {
        entries.addAll(registries.lookupOrThrow(Registries.STRUCTURE));
        entries.addAll(registries.lookupOrThrow(Registries.STRUCTURE_SET));
        entries.addAll(registries.lookupOrThrow(Registries.TEMPLATE_POOL));
    }

    @Override
    public String getName() {
        return "worldgen/structure";
    }

    // (ender) this one will be bad Im sorry

    static ResourceLocation OBELISK = ResourceLocation.fromNamespaceAndPath(MOD_ID, "bloodstone_obelisk");
    static ResourceKey<Structure> BLOODSTONE_OBELISK_STRUCTURE = ResourceKey.create(Registries.STRUCTURE, OBELISK);
    static ResourceKey<StructureSet> BLOODSTONE_OBELISK_SET = ResourceKey.create(Registries.STRUCTURE_SET, OBELISK);
    static ResourceKey<StructureTemplatePool> BLOODSTONE_OBELISK_TEMPLATE_POOL = ResourceKey.create(Registries.TEMPLATE_POOL, OBELISK);

    public static void bootstrapTemplatePools(BootstrapContext<StructureTemplatePool> context) {
        var pools = context.lookup(Registries.TEMPLATE_POOL);
        var processors = context.lookup(Registries.PROCESSOR_LIST);
        context.register(BLOODSTONE_OBELISK_TEMPLATE_POOL,
                new StructureTemplatePool(
                        pools.getOrThrow(Pools.EMPTY),
                        ImmutableList.of(Pair.of(StructurePoolElement.single("twigs:bloodstone_obelisk", processors.getOrThrow(ProcessorLists.EMPTY)), 1)),
                        StructureTemplatePool.Projection.RIGID
                )
        );
    }

    public static void bootstrapStructureSets(BootstrapContext<StructureSet> context) {
        var structures = context.lookup(Registries.STRUCTURE);
        context.register(BLOODSTONE_OBELISK_SET,
                new StructureSet(
                        structures.getOrThrow(BLOODSTONE_OBELISK_STRUCTURE),
                        new RandomSpreadStructurePlacement(20, 4, RandomSpreadType.LINEAR, 4206914)
                )
        );
    }

    public static void bootstrapStructures(BootstrapContext<Structure> context) {
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
