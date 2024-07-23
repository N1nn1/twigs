package com.ninni.twigs.data;

import com.ninni.twigs.TwigsProperties;
import com.ninni.twigs.block.SiltPotBlock;
import com.ninni.twigs.registry.TwigsBlocks;
import com.ninni.twigs.registry.TwigsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.concurrent.CompletableFuture;

public class TwigsBlockLootTableProvider extends FabricBlockLootTableProvider {
    protected TwigsBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for (Block block : TwigsDataGenerator.getModBlocks()) {
            switch (block) {
                case SlabBlock slabBlock -> add(slabBlock, this::createSlabItemTable);
                case SiltPotBlock siltPotBlock -> add(siltPotBlock, this::createNameableBlockEntityTable);
                case MultifaceBlock multifaceBlock -> add(multifaceBlock, this::createCustomMultifaceBlockDrops);
                default -> dropSelf(block);
            }
        }

        dropPottedContents(TwigsBlocks.POTTED_AZALEA_FLOWERS);
        add(TwigsBlocks.SILT, (block) -> createSingleItemTableWithSilkTouch(block, TwigsItems.SILT_BALL, ConstantValue.exactly(4)));


        add(TwigsBlocks.BAMBOO_LEAVES, (block) -> LootTable.lootTable()
                .withPool(LootPool.lootPool().when(LootItemEntityPropertyCondition.entityPresent(LootContext.EntityTarget.THIS))
                        .add(LootItem.lootTableItem(TwigsBlocks.BAMBOO_LEAVES)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2)).when(getLeafState(block, 2)))
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3)).when(getLeafState(block, 3)))
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4)).when(getLeafState(block, 4)))
                        )
                )
        );
    }

    private LootItemBlockStatePropertyCondition.Builder getLeafState(Block block, int layer) {
        return LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(TwigsProperties.LAYERS_1_4, layer));
    }

    public LootTable.Builder createCustomMultifaceBlockDrops(Block block) {
        return LootTable.lootTable().withPool(LootPool.lootPool().add(
                        this.applyExplosionDecay(block,
                                LootItem.lootTableItem(block).apply(Direction.values(), direction -> SetItemCountFunction.setCount(ConstantValue.exactly(1.0f), true).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(MultifaceBlock.getFaceProperty(direction), true))))).apply(SetItemCountFunction.setCount(ConstantValue.exactly(-1.0f), true)
                        )
                )
        );
    }
}
