package com.ninni.twigs;

import com.google.common.reflect.Reflection;
import com.ninni.twigs.client.particle.TwigsParticleType;
import com.ninni.twigs.entity.Pebble;
import com.ninni.twigs.registry.*;
import com.ninni.twigs.stat.TwigsStats;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.Util;
import net.minecraft.core.Position;
import net.minecraft.core.dispenser.AbstractProjectileDispenseBehavior;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;

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
	}
}
