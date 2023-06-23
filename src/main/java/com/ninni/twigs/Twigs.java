package com.ninni.twigs;

import com.ninni.twigs.events.MiscEvents;
import com.ninni.twigs.registry.TwigsBlockEntityType;
import com.ninni.twigs.registry.TwigsBlocks;
import com.ninni.twigs.registry.TwigsCreativeModeTabs;
import com.ninni.twigs.registry.TwigsEntityTypes;
import com.ninni.twigs.registry.TwigsFeatures;
import com.ninni.twigs.registry.TwigsItems;
import com.ninni.twigs.registry.TwigsLootModifiers;
import com.ninni.twigs.registry.TwigsParticleTypes;
import com.ninni.twigs.registry.TwigsSoundEvents;
import com.ninni.twigs.registry.TwigsStructurePieceTypes;
import com.ninni.twigs.registry.TwigsStructureTypes;
import com.ninni.twigs.registry.TwigsVanillaIntegration;
import com.ninni.twigs.stat.TwigsStats;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Twigs.MOD_ID)
public class Twigs {
	public static final String MOD_ID = "twigs";

	public Twigs() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		IEventBus eventBus = MinecraftForge.EVENT_BUS;

		TwigsBlocks.BLOCKS.register(modEventBus);
		TwigsBlockEntityType.BLOCK_ENTITY_TYPES.register(modEventBus);
		TwigsCreativeModeTabs.CREATIVE_MODE_TABS.register(modEventBus);
		TwigsEntityTypes.ENTITY_TYPES.register(modEventBus);
		TwigsFeatures.FEATURES.register(modEventBus);
		TwigsItems.ITEMS.register(modEventBus);
		TwigsLootModifiers.LOOT_MODIFIERS.register(modEventBus);
		TwigsParticleTypes.PARTICLE_TYPES.register(modEventBus);
		TwigsSoundEvents.SOUND_EVENTS.register(modEventBus);

		modEventBus.addListener(this::commonSetup);
		eventBus.register(this);
		eventBus.register(new MiscEvents());
	}

	private void commonSetup(final FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TwigsVanillaIntegration.init();
			TwigsStats.init();
			TwigsStructureTypes.init();
			TwigsStructurePieceTypes.init();
		});
	}

}
