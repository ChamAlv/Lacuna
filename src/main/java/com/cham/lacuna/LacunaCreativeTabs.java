package com.cham.lacuna;

import com.cham.lacuna.blocks.LacunaBlocks;
import com.cham.lacuna.items.LacunaItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class LacunaCreativeTabs {
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "lacuna" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Lacuna.MODID);

    // Creates a creative tab with the id "lacuna:lacuna_tab"
    public static final Supplier<CreativeModeTab> LACUNA_TAB = CREATIVE_MODE_TABS.register("lacuna_tab",
    () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(LacunaItems.CACA_FLAKE.get())) //Selects an item icon for the tab
            .title(Component.translatable("creativetab.lacuna.lacuna_tab")) //Sets the name of the tab (in the resources folder)
            .displayItems((itemDisplayParameters, output) -> { //Adds items into the tab
                output.accept(LacunaItems.CACA_FLAKE);
                //output.accept(LacunaItems.NINJA_SPAWN_EGG.get());
                output.accept(LacunaBlocks.CACA_BLOCK);
                output.accept(LacunaBlocks.CACA_ORE.get());
                output.accept(LacunaBlocks.CACA_DEEPSLATE_ORE.get());
            }
            //.withTabsBefore(CreativeModeTabs.COMBAT) Places the creative tab after the Minecraft Combat tab
            ).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
