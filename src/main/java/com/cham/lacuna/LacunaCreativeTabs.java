package com.cham.lacuna;

import com.cham.lacuna.blocks.LacunaBlocks;
import com.cham.lacuna.items.LacunaItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class LacunaCreativeTabs {
    // Creates a Deferred Register to hold CreativeModeTabs which will all be registered under the "lacuna" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Lacuna.MODID);

    // Creates a creative tab with the id "lacuna:lacuna_tab"
    public static final RegistryObject<CreativeModeTab> LACUNA_TAB = CREATIVE_MODE_TABS.register("lacuna_tab",
    () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(LacunaItems.CACA_FLAKE.get())) //Selects an item icon for the tab
            .title(Component.translatable("creativetab.lacuna_tab")) //Sets the name of the tab (in the resources folder)
            .displayItems((pParameters, pOutput) -> { //Adds items into the tab
                pOutput.accept(LacunaItems.CACA_FLAKE.get());
                pOutput.accept(LacunaBlocks.CACA_BLOCK.get());
                pOutput.accept(LacunaBlocks.CACA_ORE.get());
            }
            //.withTabsBefore(CreativeModeTabs.COMBAT) Places the creative tab after the Minecraft Combat tab
            ).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
