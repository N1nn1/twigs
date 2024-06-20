package com.ninni.twigs.block.entity;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.registry.TwigsBlockEntityType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.DispenserMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SiltPotBlockEntity extends RandomizableContainerBlockEntity {
    private NonNullList<ItemStack> inventory = NonNullList.withSize(9, ItemStack.EMPTY);


    protected SiltPotBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    public SiltPotBlockEntity(BlockPos pos, BlockState state) {
        this(TwigsBlockEntityType.SILT_POT, pos, state);
    }

    @Override
    public int getContainerSize() {
        return 9;
    }

    @Override
    public void loadAdditional(CompoundTag nbt, HolderLookup.Provider provider) {
        super.loadAdditional(nbt, provider);
        this.inventory = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        if (!this.tryLoadLootTable(nbt)) {
            ContainerHelper.loadAllItems(nbt, this.inventory, provider);
        }
    }

    @Override
    protected void saveAdditional(CompoundTag nbt, HolderLookup.Provider provider ) {
        super.saveAdditional(nbt, provider);
        if (!this.tryLoadLootTable(nbt)) {
            ContainerHelper.saveAllItems(nbt, this.inventory, provider);
        }
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> nonNullList) {
        this.inventory = nonNullList;
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("container." + Twigs.MOD_ID + ".silt_pot");
    }

    @Override
    protected AbstractContainerMenu createMenu(int i, Inventory inventory) {
        return new DispenserMenu(i, inventory, this);
    }
}
