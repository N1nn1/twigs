package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TwigsCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Twigs.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TWIG = CREATIVE_MODE_TABS.register("twig", () -> CreativeModeTab.builder()
            .icon(TwigsItems.TWIGS.get()::getDefaultInstance)
            .title(Component.translatable("twigs.item_group"))
            .displayItems((featureFlagSet, output) -> {
                output.accept(TwigsItems.AZALEA_FLOWERS.get());
                output.accept(TwigsItems.TWIG.get());
                output.accept(TwigsItems.PEBBLE.get());
                output.accept(TwigsItems.BRONZED_SEASHELL.get());
                output.accept(TwigsItems.OPALINE_SEASHELL.get());
                output.accept(TwigsItems.ROSEATE_SEASHELL.get());
                output.accept(TwigsItems.TANGERINE_SEASHELL.get());

                output.accept(TwigsItems.BAMBOO_LEAVES.get());
                output.accept(TwigsItems.BAMBOO_THATCH.get());
                output.accept(TwigsItems.BAMBOO_THATCH_SLAB.get());
                output.accept(TwigsItems.BAMBOO_MAT.get());

                //paper lanterns
                output.accept(TwigsItems.PAPER_LANTERN.get());
                output.accept(TwigsItems.ALLIUM_PAPER_LANTERN.get());
                output.accept(TwigsItems.BLUE_ORCHID_PAPER_LANTERN.get());
                output.accept(TwigsItems.CRIMSON_ROOTS_PAPER_LANTERN.get());
                output.accept(TwigsItems.DANDELION_PAPER_LANTERN.get());
                output.accept(TwigsItems.TORCHFLOWER_PAPER_LANTERN.get());

                //lamps
                output.accept(TwigsItems.LAMP.get());
                output.accept(TwigsItems.SOUL_LAMP.get());
                output.accept(TwigsItems.CRIMSON_SHROOMLAMP.get());
                output.accept(TwigsItems.WARPED_SHROOMLAMP.get());

                //tables
                output.accept(TwigsItems.OAK_TABLE.get());
                output.accept(TwigsItems.SPRUCE_TABLE.get());
                output.accept(TwigsItems.BIRCH_TABLE.get());
                output.accept(TwigsItems.JUNGLE_TABLE.get());
                output.accept(TwigsItems.ACACIA_TABLE.get());
                output.accept(TwigsItems.DARK_OAK_TABLE.get());
                output.accept(TwigsItems.MANGROVE_TABLE.get());
                output.accept(TwigsItems.CHERRY_TABLE.get());
                output.accept(TwigsItems.BAMBOO_TABLE.get());
                output.accept(TwigsItems.CRIMSON_TABLE.get());
                output.accept(TwigsItems.WARPED_TABLE.get());

                //basalt blocks
                output.accept(TwigsItems.POLISHED_BASALT_BRICKS.get());
                output.accept(TwigsItems.CHISELED_SMOOTH_BASALT_BRICKS.get());
                output.accept(TwigsItems.SMOOTH_BASALT_BRICKS.get());
                output.accept(TwigsItems.SMOOTH_BASALT_BRICK_STAIRS.get());
                output.accept(TwigsItems.SMOOTH_BASALT_BRICK_SLAB.get());
                output.accept(TwigsItems.SMOOTH_BASALT_BRICK_WALL.get());

                //bricks
                output.accept(TwigsItems.CRACKED_BRICKS.get());
                output.accept(TwigsItems.MIXED_BRICKS.get());
                output.accept(TwigsItems.CHISELED_BRICKS.get());
                output.accept(TwigsItems.MOSSY_BRICKS.get());
                output.accept(TwigsItems.MOSSY_BRICK_STAIRS.get());
                output.accept(TwigsItems.MOSSY_BRICK_SLAB.get());
                output.accept(TwigsItems.MOSSY_BRICK_WALL.get());

                //gravel bricks
                output.accept(TwigsItems.GRAVEL_BRICKS.get());
                output.accept(TwigsItems.GRAVEL_BRICK_STAIRS.get());
                output.accept(TwigsItems.GRAVEL_BRICK_SLAB.get());
                output.accept(TwigsItems.GRAVEL_BRICK_WALL.get());

                //smooth stone bricks
                output.accept(TwigsItems.SMOOTH_STONE_BRICKS.get());
                output.accept(TwigsItems.SMOOTH_STONE_BRICK_STAIRS.get());
                output.accept(TwigsItems.SMOOTH_STONE_BRICK_SLAB.get());
                output.accept(TwigsItems.SMOOTH_STONE_BRICK_WALL.get());

                //columns
                output.accept(TwigsItems.QUARTZ_COLUMN.get());
                output.accept(TwigsItems.STONE_COLUMN.get());
                output.accept(TwigsItems.DEEPSLATE_COLUMN.get());
                output.accept(TwigsItems.BLACKSTONE_COLUMN.get());

                //copper pillars
                output.accept(TwigsItems.COPPER_PILLAR.get());
                output.accept(TwigsItems.EXPOSED_COPPER_PILLAR.get());
                output.accept(TwigsItems.WEATHERED_COPPER_PILLAR.get());
                output.accept(TwigsItems.OXIDIZED_COPPER_PILLAR.get());
                output.accept(TwigsItems.WAXED_COPPER_PILLAR.get());
                output.accept(TwigsItems.WAXED_EXPOSED_COPPER_PILLAR.get());
                output.accept(TwigsItems.WAXED_WEATHERED_COPPER_PILLAR.get());
                output.accept(TwigsItems.WAXED_OXIDIZED_COPPER_PILLAR.get());

                //amethyst blocks
                output.accept(TwigsItems.POLISHED_AMETHYST.get());
                output.accept(TwigsItems.CUT_AMETHYST.get());

                //misc
                output.accept(TwigsItems.PETRIFIED_LICHEN.get());
                output.accept(TwigsItems.COMPACTED_DRIPSTONE.get());
                output.accept(TwigsItems.ROCKY_DIRT.get());

                //cobblestone bricks
                output.accept(TwigsItems.COBBLESTONE_BRICKS.get());
                output.accept(TwigsItems.COBBLESTONE_BRICK_STAIRS.get());
                output.accept(TwigsItems.COBBLESTONE_BRICK_SLAB.get());
                output.accept(TwigsItems.COBBLESTONE_BRICK_WALL.get());
                output.accept(TwigsItems.CRACKED_COBBLESTONE_BRICKS.get());
                output.accept(TwigsItems.MOSSY_COBBLESTONE_BRICKS.get());
                output.accept(TwigsItems.MOSSY_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(TwigsItems.MOSSY_COBBLESTONE_BRICK_SLAB.get());
                output.accept(TwigsItems.MOSSY_COBBLESTONE_BRICK_WALL.get());

                //decorated blackstone bricks
                output.accept(TwigsItems.TWISTING_POLISHED_BLACKSTONE_BRICKS.get());
                output.accept(TwigsItems.TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS.get());
                output.accept(TwigsItems.TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB.get());
                output.accept(TwigsItems.TWISTING_POLISHED_BLACKSTONE_BRICK_WALL.get());
                output.accept(TwigsItems.WEEPING_POLISHED_BLACKSTONE_BRICKS.get());
                output.accept(TwigsItems.WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS.get());
                output.accept(TwigsItems.WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB.get());
                output.accept(TwigsItems.WEEPING_POLISHED_BLACKSTONE_BRICK_WALL.get());

                //tuff blocks
                output.accept(TwigsItems.TUFF_STAIRS.get());
                output.accept(TwigsItems.TUFF_SLAB.get());
                output.accept(TwigsItems.TUFF_WALL.get());
                output.accept(TwigsItems.POLISHED_TUFF.get());
                output.accept(TwigsItems.POLISHED_TUFF_STAIRS.get());
                output.accept(TwigsItems.POLISHED_TUFF_SLAB.get());
                output.accept(TwigsItems.POLISHED_TUFF_BRICKS.get());
                output.accept(TwigsItems.CRACKED_POLISHED_TUFF_BRICKS.get());
                output.accept(TwigsItems.POLISHED_TUFF_BRICK_STAIRS.get());
                output.accept(TwigsItems.POLISHED_TUFF_BRICK_SLAB.get());
                output.accept(TwigsItems.POLISHED_TUFF_BRICK_WALL.get());

                //calcite blocks
                output.accept(TwigsItems.CALCITE_STAIRS.get());
                output.accept(TwigsItems.CALCITE_SLAB.get());
                output.accept(TwigsItems.CALCITE_WALL.get());
                output.accept(TwigsItems.POLISHED_CALCITE.get());
                output.accept(TwigsItems.POLISHED_CALCITE_STAIRS.get());
                output.accept(TwigsItems.POLISHED_CALCITE_SLAB.get());
                output.accept(TwigsItems.POLISHED_CALCITE_BRICKS.get());
                output.accept(TwigsItems.CRACKED_POLISHED_CALCITE_BRICKS.get());
                output.accept(TwigsItems.POLISHED_CALCITE_BRICK_STAIRS.get());
                output.accept(TwigsItems.POLISHED_CALCITE_BRICK_SLAB.get());
                output.accept(TwigsItems.POLISHED_CALCITE_BRICK_WALL.get());

                //schist blocks
                output.accept(TwigsItems.SCHIST.get());
                output.accept(TwigsItems.SCHIST_STAIRS.get());
                output.accept(TwigsItems.SCHIST_SLAB.get());
                output.accept(TwigsItems.SCHIST_WALL.get());
                output.accept(TwigsItems.POLISHED_SCHIST.get());
                output.accept(TwigsItems.POLISHED_SCHIST_STAIRS.get());
                output.accept(TwigsItems.POLISHED_SCHIST_SLAB.get());
                output.accept(TwigsItems.POLISHED_SCHIST_BRICKS.get());
                output.accept(TwigsItems.CRACKED_POLISHED_SCHIST_BRICKS.get());
                output.accept(TwigsItems.POLISHED_SCHIST_BRICK_STAIRS.get());
                output.accept(TwigsItems.POLISHED_SCHIST_BRICK_SLAB.get());
                output.accept(TwigsItems.POLISHED_SCHIST_BRICK_WALL.get());

                //rhyolite blocks
                output.accept(TwigsItems.RHYOLITE.get());
                output.accept(TwigsItems.RHYOLITE_STAIRS.get());
                output.accept(TwigsItems.RHYOLITE_SLAB.get());
                output.accept(TwigsItems.RHYOLITE_WALL.get());
                output.accept(TwigsItems.POLISHED_RHYOLITE.get());
                output.accept(TwigsItems.POLISHED_RHYOLITE_STAIRS.get());
                output.accept(TwigsItems.POLISHED_RHYOLITE_SLAB.get());
                output.accept(TwigsItems.POLISHED_RHYOLITE_BRICKS.get());
                output.accept(TwigsItems.CRACKED_POLISHED_RHYOLITE_BRICKS.get());
                output.accept(TwigsItems.POLISHED_RHYOLITE_BRICK_STAIRS.get());
                output.accept(TwigsItems.POLISHED_RHYOLITE_BRICK_SLAB.get());
                output.accept(TwigsItems.POLISHED_RHYOLITE_BRICK_WALL.get());

                //bloodstone blocks
                output.accept(TwigsItems.BLOODSTONE.get());
                output.accept(TwigsItems.BLOODSTONE_STAIRS.get());
                output.accept(TwigsItems.BLOODSTONE_SLAB.get());
                output.accept(TwigsItems.BLOODSTONE_WALL.get());
                output.accept(TwigsItems.POLISHED_BLOODSTONE.get());
                output.accept(TwigsItems.POLISHED_BLOODSTONE_STAIRS.get());
                output.accept(TwigsItems.POLISHED_BLOODSTONE_SLAB.get());
                output.accept(TwigsItems.POLISHED_BLOODSTONE_BRICKS.get());
                output.accept(TwigsItems.CRACKED_POLISHED_BLOODSTONE_BRICKS.get());
                output.accept(TwigsItems.POLISHED_BLOODSTONE_BRICK_STAIRS.get());
                output.accept(TwigsItems.POLISHED_BLOODSTONE_BRICK_SLAB.get());
                output.accept(TwigsItems.POLISHED_BLOODSTONE_BRICK_WALL.get());

                //silt blocks
                output.accept(TwigsItems.SILT.get());
                output.accept(TwigsItems.SILT_BALL.get());
                output.accept(TwigsItems.SILT_BRICK.get());
                output.accept(TwigsItems.SILT_BRICKS.get());
                output.accept(TwigsItems.CRACKED_SILT_BRICKS.get());
                output.accept(TwigsItems.SILT_BRICK_STAIRS.get());
                output.accept(TwigsItems.SILT_BRICK_SLAB.get());
                output.accept(TwigsItems.SILT_BRICK_WALL.get());
                output.accept(TwigsItems.CHISELED_SILT_BRICKS.get());
                output.accept(TwigsItems.MIXED_SILT_BRICKS.get());


                output.accept(TwigsItems.PACKED_SILT.get());
                output.accept(TwigsItems.SILT_POT.get());
                output.accept(TwigsItems.SILT_SHINGLES.get());
                output.accept(TwigsItems.SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.WHITE_PACKED_SILT.get());
                output.accept(TwigsItems.WHITE_SILT_POT.get());
                output.accept(TwigsItems.WHITE_SILT_SHINGLES.get());
                output.accept(TwigsItems.WHITE_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.WHITE_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.WHITE_SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.LIGHT_GRAY_PACKED_SILT.get());
                output.accept(TwigsItems.LIGHT_GRAY_SILT_POT.get());
                output.accept(TwigsItems.LIGHT_GRAY_SILT_SHINGLES.get());
                output.accept(TwigsItems.LIGHT_GRAY_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.LIGHT_GRAY_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.LIGHT_GRAY_SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.GRAY_PACKED_SILT.get());
                output.accept(TwigsItems.GRAY_SILT_POT.get());
                output.accept(TwigsItems.GRAY_SILT_SHINGLES.get());
                output.accept(TwigsItems.GRAY_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.GRAY_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.GRAY_SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.BLACK_PACKED_SILT.get());
                output.accept(TwigsItems.BLACK_SILT_POT.get());
                output.accept(TwigsItems.BLACK_SILT_SHINGLES.get());
                output.accept(TwigsItems.BLACK_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.BLACK_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.BLACK_SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.BROWN_PACKED_SILT.get());
                output.accept(TwigsItems.BROWN_SILT_POT.get());
                output.accept(TwigsItems.BROWN_SILT_SHINGLES.get());
                output.accept(TwigsItems.BROWN_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.BROWN_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.BROWN_SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.RED_PACKED_SILT.get());
                output.accept(TwigsItems.RED_SILT_POT.get());
                output.accept(TwigsItems.RED_SILT_SHINGLES.get());
                output.accept(TwigsItems.RED_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.RED_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.RED_SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.ORANGE_PACKED_SILT.get());
                output.accept(TwigsItems.ORANGE_SILT_POT.get());
                output.accept(TwigsItems.ORANGE_SILT_SHINGLES.get());
                output.accept(TwigsItems.ORANGE_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.ORANGE_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.ORANGE_SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.YELLOW_PACKED_SILT.get());
                output.accept(TwigsItems.YELLOW_SILT_POT.get());
                output.accept(TwigsItems.YELLOW_SILT_SHINGLES.get());
                output.accept(TwigsItems.YELLOW_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.YELLOW_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.YELLOW_SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.LIME_PACKED_SILT.get());
                output.accept(TwigsItems.LIME_SILT_POT.get());
                output.accept(TwigsItems.LIME_SILT_SHINGLES.get());
                output.accept(TwigsItems.LIME_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.LIME_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.LIME_SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.GREEN_PACKED_SILT.get());
                output.accept(TwigsItems.GREEN_SILT_POT.get());
                output.accept(TwigsItems.GREEN_SILT_SHINGLES.get());
                output.accept(TwigsItems.GREEN_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.GREEN_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.GREEN_SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.CYAN_PACKED_SILT.get());
                output.accept(TwigsItems.CYAN_SILT_POT.get());
                output.accept(TwigsItems.CYAN_SILT_SHINGLES.get());
                output.accept(TwigsItems.CYAN_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.CYAN_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.CYAN_SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.LIGHT_BLUE_PACKED_SILT.get());
                output.accept(TwigsItems.LIGHT_BLUE_SILT_POT.get());
                output.accept(TwigsItems.LIGHT_BLUE_SILT_SHINGLES.get());
                output.accept(TwigsItems.LIGHT_BLUE_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.LIGHT_BLUE_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.LIGHT_BLUE_SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.BLUE_PACKED_SILT.get());
                output.accept(TwigsItems.BLUE_SILT_POT.get());
                output.accept(TwigsItems.BLUE_SILT_SHINGLES.get());
                output.accept(TwigsItems.BLUE_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.BLUE_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.BLUE_SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.PURPLE_PACKED_SILT.get());
                output.accept(TwigsItems.PURPLE_SILT_POT.get());
                output.accept(TwigsItems.PURPLE_SILT_SHINGLES.get());
                output.accept(TwigsItems.PURPLE_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.PURPLE_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.PURPLE_SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.MAGENTA_PACKED_SILT.get());
                output.accept(TwigsItems.MAGENTA_SILT_POT.get());
                output.accept(TwigsItems.MAGENTA_SILT_SHINGLES.get());
                output.accept(TwigsItems.MAGENTA_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.MAGENTA_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.MAGENTA_SILT_SHINGLE_WALL.get());

                output.accept(TwigsItems.PINK_PACKED_SILT.get());
                output.accept(TwigsItems.PINK_SILT_POT.get());
                output.accept(TwigsItems.PINK_SILT_SHINGLES.get());
                output.accept(TwigsItems.PINK_SILT_SHINGLE_STAIRS.get());
                output.accept(TwigsItems.PINK_SILT_SHINGLE_SLAB.get());
                output.accept(TwigsItems.PINK_SILT_SHINGLE_WALL.get());
            })
            .build());


}
