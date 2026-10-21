package com.cham.lacuna.items;

import com.cham.lacuna.Lacuna;
import com.cham.lacuna.entities.LacunaEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class LacunaItems {

    // Creates a Deferred Register to hold Items which will all be registered under the "lacuna"(Lacuna.MODID) namespace
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Lacuna.MODID);

    //Creates a new Item with the id "lacuna:caca_flake"
    public static final RegistryObject<Item> CACA_FLAKE = ITEMS.register("caca_flake",
            () -> new Item(new Item.Properties()));

    //Creates a new ForgeSpawnEggItem with the id "lacuna:ninja_spawn_egg", and it spawns in one Ninja
    public static final RegistryObject<Item> NINJA_SPAWN_EGG = ITEMS.register("ninja_spawn_egg",
            () -> new ForgeSpawnEggItem(LacunaEntities.NINJA, 1, 1,
                    new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
