package com.ninni.twigs.util;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.ninni.twigs.registry.TwigsItems;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

public class TwigLootModifier extends LootModifier {
    public static final Codec<TwigLootModifier> CODEC = RecordCodecBuilder.create(inst -> codecStart(inst).apply(inst, TwigLootModifier::new));

    public TwigLootModifier(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        BlockState state = context.getParamOrNull(LootContextParams.BLOCK_STATE);
        int number = 0;
        if (state != null && state.getBlock() instanceof LeavesBlock) {
            for (ItemStack stack : generatedLoot) {
                if (stack.is(Items.STICK)) {
                    number += stack.getCount();
                }
            }
            generatedLoot.removeIf(itemStack -> itemStack.is(Items.STICK));
            generatedLoot.add(new ItemStack(TwigsItems.TWIG.get(), number));
        }
        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }
}
