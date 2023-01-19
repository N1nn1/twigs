package com.ninni.twigs.data;

import com.ninni.twigs.registry.TwigsConfiguredFeatures;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("UnstableApiUsage")
public class TwigsConfiguredFeatureProvider extends FabricDynamicRegistryProvider {

    public TwigsConfiguredFeatureProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries) {
        add(registries, entries, TwigsConfiguredFeatures.ORE_RHYOLITE);
        add(registries, entries, TwigsConfiguredFeatures.ORE_SCHIST);
        add(registries, entries, TwigsConfiguredFeatures.ORE_BLOODSTONE);
        add(registries, entries, TwigsConfiguredFeatures.SILT_STRIP);
        add(registries, entries, TwigsConfiguredFeatures.AZALEA_FLOWERS);
    }

    private void add(HolderLookup.Provider registries, Entries entries, ResourceKey<ConfiguredFeature<?, ?>> resourceKey) {
        final HolderLookup.RegistryLookup<ConfiguredFeature<?, ?>> configuredFeatureRegistryLookup = registries.lookupOrThrow(Registries.CONFIGURED_FEATURE);

        entries.add(resourceKey, configuredFeatureRegistryLookup.getOrThrow(resourceKey).value());
    }

    @Override
    public String getName() {
        return "worldgen/configured_feature";
    }
}
