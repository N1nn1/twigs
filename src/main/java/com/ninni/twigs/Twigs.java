package com.ninni.twigs;

import com.ninni.twigs.events.MiscEvents;
import com.ninni.twigs.registry.TwigsBlockEntityType;
import com.ninni.twigs.registry.TwigsBlocks;
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

	public void onInitialize() {
//		Util.make(new LinkedHashMap<Block, Block>(), pairs -> {
//			pairs.put(TwigsBlocks.COPPER_PILLAR.get(), TwigsBlocks.WAXED_COPPER_PILLAR.get());
//			pairs.put(TwigsBlocks.EXPOSED_COPPER_PILLAR.get(), TwigsBlocks.WAXED_EXPOSED_COPPER_PILLAR.get());
//			pairs.put(TwigsBlocks.WEATHERED_COPPER_PILLAR.get(), TwigsBlocks.WAXED_WEATHERED_COPPER_PILLAR.get());
//			pairs.put(TwigsBlocks.OXIDIZED_COPPER_PILLAR.get(), TwigsBlocks.WAXED_OXIDIZED_COPPER_PILLAR.get());
//
//			pairs.forEach(OxidizableBlocksRegistry::registerWaxableBlockPair);
//
//			List<Block> unwaxed = List.copyOf(pairs.keySet());
//			for (int i = 0, l = unwaxed.size(); i < l - 1; i++) {
//				OxidizableBlocksRegistry.registerOxidizableBlockPair(unwaxed.get(i), unwaxed.get(i + 1));
//			}
//		});
	}
}
