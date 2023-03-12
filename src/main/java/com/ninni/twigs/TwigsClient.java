package com.ninni.twigs;

import com.ninni.twigs.registry.TwigsBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

@Environment(EnvType.CLIENT)
public class TwigsClient implements ClientModInitializer {


	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
				TwigsBlocks.AZALEA_FLOWERS,
				TwigsBlocks.TWIG,
				TwigsBlocks.PEBBLE,
				TwigsBlocks.POTTED_AZALEA_FLOWERS,
				TwigsBlocks.COMPACTED_DRIPSTONE
		);
	}
}
