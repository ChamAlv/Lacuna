package com.cham.lacuna.events;


import com.cham.lacuna.Lacuna;
import com.cham.lacuna.entities.LacunaEntities;
import com.cham.lacuna.entities.client.LacunaModelLayers;
import com.cham.lacuna.entities.client.NinjaModel;
import com.cham.lacuna.entities.client.NinjaRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Lacuna.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LacunaEventBusClientEvents {

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){

        //Registers the Ninja entity layer
        event.registerLayerDefinition(
                LacunaModelLayers.NINJA_LAYER,
                NinjaModel::createBodyLayer
        );

    }

    @SubscribeEvent
    public static void registerRenderer(
            EntityRenderersEvent.RegisterRenderers event) {

        //Registers the Ninja entity renderer
        event.registerEntityRenderer(
                LacunaEntities.NINJA.get(),
                NinjaRenderer::new
        );

    }

}
