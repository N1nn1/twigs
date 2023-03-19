package com.ninni.twigs;

import com.ninni.twigs.client.particle.TwigsBreakingItemParticle;
import com.ninni.twigs.registry.TwigsBlocks;
import com.ninni.twigs.registry.TwigsEntityTypes;
import com.ninni.twigs.registry.TwigsParticleTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Environment(EnvType.CLIENT)
public class TwigsClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
				TwigsBlocks.AZALEA_FLOWERS,
				TwigsBlocks.PETRIFIED_LICHEN,
				TwigsBlocks.TWIG,
				TwigsBlocks.PEBBLE,
				TwigsBlocks.POTTED_AZALEA_FLOWERS,
				TwigsBlocks.COMPACTED_DRIPSTONE,
				TwigsBlocks.BAMBOO_LEAVES,
				TwigsBlocks.BAMBOO_THATCH,
				TwigsBlocks.BAMBOO_THATCH_SLAB
		);
		ParticleFactoryRegistry.getInstance().register(TwigsParticleTypes.ITEM_PEBBLE, new TwigsBreakingItemParticle.Provider());
		EntityRendererRegistry.register(TwigsEntityTypes.PEBBLE, ThrownItemRenderer::new);
	}
}
