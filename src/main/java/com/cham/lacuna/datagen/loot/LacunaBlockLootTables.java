package com.cham.lacuna.datagen.loot;

import com.cham.lacuna.blocks.LacunaBlocks;
import com.cham.lacuna.items.LacunaItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class LacunaBlockLootTables extends BlockLootSubProvider {
    public LacunaBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(LacunaBlocks.CACA_BLOCK.get());

        this.add(LacunaBlocks.CACA_ORE.get(),
         block -> createOreDrop(LacunaBlocks.CACA_ORE.get(), LacunaItems.CACA_FLAKE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return LacunaBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
