package com.ninni.twigs.data.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class TwigsLootTableProvider extends LootTableProvider {
    public TwigsLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, Set.of(), List.of(new SubProviderEntry(TwigsChestLootSubProvider::new, LootContextParamSets.CHEST), new SubProviderEntry(TwigsBlockLootSubProvider::new, LootContextParamSets.BLOCK)), lookupProvider);
    }

    @Override
    protected void validate(Registry<LootTable> registry, ValidationContext context, ProblemReporter reporter) {
        registry.forEach(table -> table.validate(context));
    }
}
