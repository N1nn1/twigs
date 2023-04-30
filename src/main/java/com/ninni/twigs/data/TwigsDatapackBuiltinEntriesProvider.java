package com.ninni.twigs.data;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.registry.TwigsBiomeModifier;
import com.ninni.twigs.registry.TwigsConfiguredFeatures;
import com.ninni.twigs.registry.TwigsPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class TwigsDatapackBuiltinEntriesProvider extends DatapackBuiltinEntriesProvider {
    private static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, TwigsConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, TwigsPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, TwigsBiomeModifier::bootstrap);

    public TwigsDatapackBuiltinEntriesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Twigs.MOD_ID));
    }

}
