package com.cham.lacuna.datagen;

import com.cham.lacuna.Lacuna;
import com.cham.lacuna.blocks.LacunaBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class LacunaBlockStateProvider extends BlockStateProvider {
    public LacunaBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Lacuna.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(LacunaBlocks.CACA_BLOCK);

        blockWithItem(LacunaBlocks.CACA_ORE);
        blockWithItem(LacunaBlocks.CACA_DEEPSLATE_ORE);

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
