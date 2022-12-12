package com.ninni.twigs;

import com.google.common.reflect.Reflection;
import com.ninni.twigs.registry.*;
import com.ninni.twigs.stat.TwigsStats;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

import static com.ninni.twigs.registry.TwigsBlocks.SILT;

public class Twigs implements ModInitializer {
	public static final String MOD_ID = "twigs";
	public static final CreativeModeTab TAB = FabricItemGroupBuilder.build(new ResourceLocation(MOD_ID, "item_group"), () -> new ItemStack(TwigsItems.TWIGS));
	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	@SuppressWarnings("UnstableApiUsage")
	public void onInitialize() {
		Reflection.initialize(
				TwigsItems.class,
				TwigsBlocks.class,
				TwigsStats.class,
				TwigsBlockEntityType.class,
				TwigsSoundEvents.class
		);

		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "nether_silt_patch"), NETHER_SILT_PATCH_CONFIGURED_FEATURE);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(MOD_ID, "nether_silt_patch"), NETHER_SILT_PATCH_PLACED_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(MOD_ID, "nether_silt_patch")));
	}

	private static final ConfiguredFeature<?, ?> NETHER_SILT_PATCH_CONFIGURED_FEATURE = new ConfiguredFeature<> (Feature.ORE, new OreConfiguration(OreFeatures.NETHERRACK, SILT.defaultBlockState(),33));
	public static PlacedFeature NETHER_SILT_PATCH_PLACED_FEATURE = new PlacedFeature(Holder.direct(NETHER_SILT_PATCH_CONFIGURED_FEATURE), Arrays.asList(CountPlacement.of(1), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(64))));
}
