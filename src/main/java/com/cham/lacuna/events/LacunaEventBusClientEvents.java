package com.cham.lacuna.events;


import com.cham.lacuna.Lacuna;
import com.cham.lacuna.entities.client.LacunaModelLayers;
import com.cham.lacuna.entities.client.NinjaModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Lacuna.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LacunaEventBusClientEvents {

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(LacunaModelLayers.NINJA_LAYER, NinjaModel::createBodyLayer);
    }
}
