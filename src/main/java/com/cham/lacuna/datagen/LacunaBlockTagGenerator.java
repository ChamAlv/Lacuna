package com.cham.lacuna.datagen;

import com.cham.lacuna.Lacuna;
import com.cham.lacuna.blocks.LacunaBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class LacunaBlockTagGenerator extends BlockTagsProvider {
    public LacunaBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Lacuna.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        //this.tag(ModTags.Blocks.EXAMPLE_TAG).add(ModBlocks.EXAMPLE_BLOCK.get()).addTag(Tags.Blocks.EXAMPLE_TAG);
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                LacunaBlocks.CACA_ORE.get(),
                LacunaBlocks.CACA_BLOCK.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                LacunaBlocks.CACA_ORE.get(),
                LacunaBlocks.CACA_BLOCK.get());

    }
}
