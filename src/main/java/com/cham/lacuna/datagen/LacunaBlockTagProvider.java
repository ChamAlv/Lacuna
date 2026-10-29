package com.cham.lacuna.datagen;

import com.cham.lacuna.Lacuna;
import com.cham.lacuna.blocks.LacunaBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class LacunaBlockTagProvider extends BlockTagsProvider {
    public LacunaBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Lacuna.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //this.tag(ModTags.Blocks.EXAMPLE_TAG).add(ModBlocks.EXAMPLE_BLOCK.get()).addTag(Tags.Blocks.EXAMPLE_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).add(
                LacunaBlocks.CACA_ORE.get(),
                LacunaBlocks.CACA_DEEPSLATE_ORE.get(),
                LacunaBlocks.CACA_BLOCK.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                LacunaBlocks.CACA_ORE.get(),
                LacunaBlocks.CACA_DEEPSLATE_ORE.get(),
                LacunaBlocks.CACA_BLOCK.get());

    }
}
