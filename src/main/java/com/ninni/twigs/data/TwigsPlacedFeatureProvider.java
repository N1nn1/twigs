package com.ninni.twigs.data;

import com.ninni.twigs.registry.TwigsPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("UnstableApiUsage")
public class TwigsPlacedFeatureProvider extends FabricDynamicRegistryProvider {

    public TwigsPlacedFeatureProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries) {
        add(registries, entries, TwigsPlacedFeatures.ORE_RHYOLITE);
        add(registries, entries, TwigsPlacedFeatures.ORE_BLOODSTONE);
        add(registries, entries, TwigsPlacedFeatures.ORE_SCHIST_UPPER);
        add(registries, entries, TwigsPlacedFeatures.ORE_SCHIST_LOWER);
        add(registries, entries, TwigsPlacedFeatures.SILT_STRIP);
        add(registries, entries, TwigsPlacedFeatures.AZALEA_FLOWERS);
    }

    private void add(HolderLookup.Provider registries, Entries entries, ResourceKey<PlacedFeature> resourceKey) {
        final HolderLookup.RegistryLookup<PlacedFeature> placedFeatureRegistryLookup = registries.lookupOrThrow(Registries.PLACED_FEATURE);

        entries.add(resourceKey, placedFeatureRegistryLookup.getOrThrow(resourceKey).value());
    }

    @Override
    public String getName() {
        return "worldgen/placed_feature";
    }
}
