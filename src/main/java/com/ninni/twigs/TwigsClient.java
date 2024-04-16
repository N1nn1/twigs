package com.ninni.twigs;

import com.ninni.twigs.client.particle.TwigsBreakingItemParticle;
import com.ninni.twigs.registry.TwigsBlocks;
import com.ninni.twigs.registry.TwigsEntityTypes;
import com.ninni.twigs.registry.TwigsItems;
import com.ninni.twigs.registry.TwigsParticleTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.resources.ResourceLocation;

@SuppressWarnings("deprecation")
@Environment(EnvType.CLIENT)
public class TwigsClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
				TwigsBlocks.BRICK_TRAIL,
				TwigsBlocks.SILT_BRICK_TRAIL,
				TwigsBlocks.AZALEA_FLOWERS,
				TwigsBlocks.PETRIFIED_LICHEN,
				TwigsBlocks.TWIG,
				TwigsBlocks.PEBBLE,
				TwigsBlocks.POTTED_AZALEA_FLOWERS,
				TwigsBlocks.PAPER_LANTERN,
				TwigsBlocks.ALLIUM_PAPER_LANTERN,
				TwigsBlocks.BLUE_ORCHID_PAPER_LANTERN,
				TwigsBlocks.CRIMSON_ROOTS_PAPER_LANTERN,
				TwigsBlocks.DANDELION_PAPER_LANTERN,
				TwigsBlocks.TORCHFLOWER_PAPER_LANTERN,
				TwigsBlocks.COMPACTED_DRIPSTONE,
				TwigsBlocks.BAMBOO_LEAVES,
				TwigsBlocks.BAMBOO_THATCH,
				TwigsBlocks.BAMBOO_THATCH_SLAB
		);

		FabricModelPredicateProviderRegistry.register(TwigsItems.BRONZED_SEASHELL, new ResourceLocation("playing"), (itemStack, clientWorld, livingEntity, var) -> {
			if (livingEntity == null) return 0.0F;

			return livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack ? 1.0F : 0.0F;
		});

		ParticleFactoryRegistry.getInstance().register(TwigsParticleTypes.ITEM_PEBBLE, new TwigsBreakingItemParticle.Provider());
		EntityRendererRegistry.register(TwigsEntityTypes.PEBBLE, ThrownItemRenderer::new);
	}
}
