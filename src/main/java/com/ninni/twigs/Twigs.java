package com.ninni.twigs;

import com.google.common.reflect.Reflection;
import com.ninni.twigs.registry.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Twigs implements ModInitializer {
	public static final String MOD_ID = "twigs";
	public static final CreativeModeTab TAB = FabricItemGroupBuilder.build(new ResourceLocation(MOD_ID, "item_group"), () -> new ItemStack(Items.STICK));
	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	@SuppressWarnings("UnstableApiUsage")
	public void onInitialize() {
		Reflection.initialize(
				TwigsItems.class,
				TwigsBlocks.class,
				TwigsSoundEvents.class
		);
	}
}
