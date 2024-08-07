package com.ninni.twigs.data.loot;

import com.ninni.twigs.TwigsProperties;
import com.ninni.twigs.block.BambooLeavesBlock;
import com.ninni.twigs.block.enums.SiltPotBlock;
import com.ninni.twigs.data.TwigsDataGenerator;
import com.ninni.twigs.registry.TwigsBlocks;
import com.ninni.twigs.registry.TwigsItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerPotBlock;
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
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class TwigsBlockLootSubProvider extends BlockLootSubProvider {
    public TwigsBlockLootSubProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return TwigsDataGenerator.getModBlocks();
    }

    @Override
    public void generate() {
        for (Block block : TwigsDataGenerator.getModBlocks()) {
            if (block == TwigsBlocks.SILT.get()) continue;
            switch (block) {
                case SlabBlock slabBlock -> add(slabBlock, this::createSlabItemTable);
                case SiltPotBlock siltPotBlock -> add(siltPotBlock, this::createNameableBlockEntityTable);
                case MultifaceBlock multifaceBlock -> add(multifaceBlock, this::createCustomMultifaceBlockDrops);
                case FlowerPotBlock ignored -> {
                }
                case BambooLeavesBlock ignored -> {
                }
                default -> dropSelf(block);
            }
        }

        dropPottedContents(TwigsBlocks.POTTED_AZALEA_FLOWERS.get());
        add(TwigsBlocks.SILT.get(), (block) -> createSingleItemTableWithSilkTouch(block, TwigsItems.SILT_BALL.get(), ConstantValue.exactly(4)));


        add(TwigsBlocks.BAMBOO_LEAVES.get(), (block) -> LootTable.lootTable()
                .withPool(LootPool.lootPool().when(LootItemEntityPropertyCondition.entityPresent(LootContext.EntityTarget.THIS))
                        .add(LootItem.lootTableItem(TwigsBlocks.BAMBOO_LEAVES.get())
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