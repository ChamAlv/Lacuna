package com.cham.lacuna.blocks;

import com.cham.lacuna.Lacuna;
import com.cham.lacuna.items.LacunaItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class LacunaBlocks {

    // Create a Deferred Register to hold Blocks which will all be registered under the "lacuna" namespace
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Lacuna.MODID);

    //Creates a new Block with the id "lacuna:caca_block", and it has the properties of an Iron Block
    public static final DeferredBlock<Block> CACA_BLOCK = registerBlock("caca_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

    //Creates a new DropExperienceBlock with the id "lacuna:caca_ore"
    public static final DeferredBlock<Block> CACA_ORE = registerBlock("caca_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of().
                    strength(3f).
                    requiresCorrectToolForDrops().
                    sound(SoundType.BASALT)));
    public static final DeferredBlock<Block> CACA_DEEPSLATE_ORE = registerBlock("caca_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.of().
                    strength(4f).
                    requiresCorrectToolForDrops().
                    sound(SoundType.DEEPSLATE)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        LacunaItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
