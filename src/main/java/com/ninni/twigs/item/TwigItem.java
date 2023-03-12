package com.ninni.twigs.item;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;

public class TwigItem extends BlockItem {

    public TwigItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext useOnContext) {
        Player player = useOnContext.getPlayer();
        if (player != null && useOnContext.isSecondaryUseActive()) {
            ItemStack mainHandItem = player.getMainHandItem();
            ItemStack offHandItem = player.getOffhandItem();
            if (offHandItem.sameItem(mainHandItem)) {
                InteractionResult action = Items.FLINT_AND_STEEL.useOn(useOnContext);
                if (action.consumesAction()) {
                    if (!player.getAbilities().instabuild) {
                        mainHandItem.shrink(1);
                        offHandItem.shrink(1);
                    }
                    return action;
                }
            }
        }
        return super.useOn(useOnContext);
    }
}
