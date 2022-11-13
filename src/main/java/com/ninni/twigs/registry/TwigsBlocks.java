package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.block.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;

import java.util.function.ToIntFunction;

public class TwigsBlocks {

    //lamps
    public static final Block LAMP = register("lamp", new LampBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(4.5F).sounds(TwigsSoundTypes.LAMP).luminance(createLampLightLevel())));
    public static final Block SOUL_LAMP = register("soul_lamp", new LampBlock(FabricBlockSettings.copyOf(TwigsBlocks.LAMP)));
    public static final Block CRIMSON_SHROOMLAMP = register("crimson_shroomlamp", new Block(FabricBlockSettings.of(Material.NETHER_WOOD).strength(3.5F).sounds(TwigsSoundTypes.SHROOMLAMP).luminance(15)));
    public static final Block WARPED_SHROOMLAMP = register("warped_shroomlamp", new Block(FabricBlockSettings.copyOf(CRIMSON_SHROOMLAMP)));


    private static ToIntFunction<BlockState> createLampLightLevel() {
        return (state) -> (Boolean)state.getValue(BlockStateProperties.LIT) ? 15 : 0;
    }

    private static Block register(String id, Block block) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(Twigs.MOD_ID, id), block);
    }
}
