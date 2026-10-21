package com.cham.lacuna.events;


import com.cham.lacuna.Lacuna;
import com.cham.lacuna.entities.LacunaEntities;
import com.cham.lacuna.entities.custom.NinjaEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Lacuna.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class LacunaEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(LacunaEntities.NINJA.get(), NinjaEntity.CreateAttributes().build());
    }
}
