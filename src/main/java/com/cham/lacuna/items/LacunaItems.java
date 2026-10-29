package com.cham.lacuna.items;

import com.cham.lacuna.Lacuna;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class LacunaItems {
    // Create a Deferred Register to hold Items which will all be registered under the "lacuna" namespace
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Lacuna.MODID);


    // Creates a new food item with the id "lacuna:caca_flake", nutrition 1 and saturation 2
    public static final DeferredItem<Item> CACA_FLAKE = ITEMS.register("caca_flake",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible()
            .nutrition(1)
            .saturationModifier(2f)
            .build())));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
