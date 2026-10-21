package com.cham.lacuna.entities.client;

import com.cham.lacuna.Lacuna;
import com.cham.lacuna.entities.custom.NinjaEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class NinjaRenderer extends MobRenderer<NinjaEntity, NinjaModel<NinjaEntity>> {
    public NinjaRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new NinjaModel<>(pContext.bakeLayer(LacunaModelLayers.NINJA_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(NinjaEntity pEntity) {
        return new ResourceLocation(Lacuna.MODID, "textures/entities/ninja.png");
    }

    @Override
    public void render(NinjaEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        /*
        if(pEntity.isBaby()){
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }
         */

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
