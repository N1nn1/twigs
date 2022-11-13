package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import static com.ninni.twigs.Twigs.TAB;

@SuppressWarnings("unused")
public class TwigsItems {
    public static final Item lAMP = register("lamp", new BlockItem(TwigsBlocks.LAMP, new FabricItemSettings().group(TAB)));
    public static final Item SOUL_LAMP = register("soul_lamp", new BlockItem(TwigsBlocks.SOUL_LAMP, new FabricItemSettings().group(TAB)));
    public static final Item CRIMSON_SHROOMLAMP = register("crimson_shroomlamp", new BlockItem(TwigsBlocks.CRIMSON_SHROOMLAMP, new FabricItemSettings().group(TAB)));
    public static final Item WARPED_SHROOMLAMP = register("warped_shroomlamp", new BlockItem(TwigsBlocks.WARPED_SHROOMLAMP, new FabricItemSettings().group(TAB)));

    private static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(Twigs.MOD_ID, id), item);
    }
}
