package com.ninni.twigs;

import com.google.common.reflect.Reflection;
import com.ninni.twigs.entity.Pebble;
import com.ninni.twigs.registry.TwigsBiomeModifier;
import com.ninni.twigs.registry.TwigsBlockEntityType;
import com.ninni.twigs.registry.TwigsBlocks;
import com.ninni.twigs.registry.TwigsCreativeModeTab;
import com.ninni.twigs.registry.TwigsEntityTypes;
import com.ninni.twigs.registry.TwigsFeatures;
import com.ninni.twigs.registry.TwigsItems;
import com.ninni.twigs.registry.TwigsLootTableAdditions;
import com.ninni.twigs.registry.TwigsParticleTypes;
import com.ninni.twigs.registry.TwigsSoundEvents;
import com.ninni.twigs.registry.TwigsStructurePieceTypes;
import com.ninni.twigs.registry.TwigsStructureTypes;
import com.ninni.twigs.stat.TwigsStats;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.Util;
import net.minecraft.core.Position;
import net.minecraft.core.dispenser.AbstractProjectileDispenseBehavior;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DispenserBlock;

import java.util.LinkedHashMap;
import java.util.List;

public class Twigs implements ModInitializer {
	public static final String MOD_ID = "twigs";

	@Override
	public void onInitialize() {
		TwigsBiomeModifier.init();
		Reflection.initialize(
				TwigsEntityTypes.class,
				TwigsParticleTypes.class,
				TwigsItems.class,
				TwigsFeatures.class,
				TwigsCreativeModeTab.class,
				TwigsLootTableAdditions.class,
				TwigsBlocks.class,
				TwigsStats.class,
				TwigsBlockEntityType.class,
				TwigsSoundEvents.class,
				TwigsStructureTypes.class,
				TwigsStructurePieceTypes.class
		);

		DispenserBlock.registerBehavior(TwigsItems.PEBBLE, new AbstractProjectileDispenseBehavior() {
			@Override
			protected Projectile getProjectile(Level world, Position position, ItemStack stack) {
				return Util.make(new Pebble(world, position.x(), position.y(), position.z()), entity -> entity.setItem(stack));
			}
		});

		Util.make(new LinkedHashMap<Block, Block>(), pairs -> {
			pairs.put(TwigsBlocks.COPPER_PILLAR, TwigsBlocks.WAXED_COPPER_PILLAR);
			pairs.put(TwigsBlocks.EXPOSED_COPPER_PILLAR, TwigsBlocks.WAXED_EXPOSED_COPPER_PILLAR);
			pairs.put(TwigsBlocks.WEATHERED_COPPER_PILLAR, TwigsBlocks.WAXED_WEATHERED_COPPER_PILLAR);
			pairs.put(TwigsBlocks.OXIDIZED_COPPER_PILLAR, TwigsBlocks.WAXED_OXIDIZED_COPPER_PILLAR);

			pairs.forEach(OxidizableBlocksRegistry::registerWaxableBlockPair);

			List<Block> unwaxed = List.copyOf(pairs.keySet());
			for (int i = 0, l = unwaxed.size(); i < l - 1; i++) {
				OxidizableBlocksRegistry.registerOxidizableBlockPair(unwaxed.get(i), unwaxed.get(i + 1));
			}
		});
	}
}
