package com.cham.lacuna.entities.client;// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.cham.lacuna.entities.animations.LacunaAnimationsDefinitions;
import com.cham.lacuna.entities.custom.NinjaEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class NinjaModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart Ninja;
	private final ModelPart UpperBody;
	private final ModelPart Arms;
	private final ModelPart RightArm;
	private final ModelPart RightForearm;
	private final ModelPart RightShoulder;
	private final ModelPart LeftArm;
	private final ModelPart LeftForearm;
	private final ModelPart LeftShoulder;
	private final ModelPart Torso;
	private final ModelPart LowerBody;
	private final ModelPart RightLeg;
	private final ModelPart RightCalf;
	private final ModelPart RightThigh;
	private final ModelPart LeftLeg;
	private final ModelPart LeftThigh;
	private final ModelPart LeftCalf;
	private final ModelPart Head;

	public NinjaModel(ModelPart root) {
		this.Ninja = root.getChild("Ninja");
		this.UpperBody = this.Ninja.getChild("UpperBody");
		this.Arms = this.UpperBody.getChild("Arms");
		this.RightArm = this.Arms.getChild("RightArm");
		this.RightForearm = this.RightArm.getChild("RightForearm");
		this.RightShoulder = this.RightArm.getChild("RightShoulder");
		this.LeftArm = this.Arms.getChild("LeftArm");
		this.LeftForearm = this.LeftArm.getChild("LeftForearm");
		this.LeftShoulder = this.LeftArm.getChild("LeftShoulder");
		this.Torso = this.UpperBody.getChild("Torso");
		this.LowerBody = this.Ninja.getChild("LowerBody");
		this.RightLeg = this.LowerBody.getChild("RightLeg");
		this.RightCalf = this.RightLeg.getChild("RightCalf");
		this.RightThigh = this.RightLeg.getChild("RightThigh");
		this.LeftLeg = this.LowerBody.getChild("LeftLeg");
		this.LeftThigh = this.LeftLeg.getChild("LeftThigh");
		this.LeftCalf = this.LeftLeg.getChild("LeftCalf");
		this.Head = this.Ninja.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Ninja = partdefinition.addOrReplaceChild("Ninja", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition UpperBody = Ninja.addOrReplaceChild("UpperBody", CubeListBuilder.create(), PartPose.offset(0.0F, -18.125F, 1.0F));

		PartDefinition Arms = UpperBody.addOrReplaceChild("Arms", CubeListBuilder.create(), PartPose.offset(0.0F, -0.125F, 0.0F));

		PartDefinition RightArm = Arms.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition RightForearm = RightArm.addOrReplaceChild("RightForearm", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, -3.5F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.75F, 0.0F));

		PartDefinition RightShoulder = RightArm.addOrReplaceChild("RightShoulder", CubeListBuilder.create().texOffs(40, 11).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.25F, 0.0F));

		PartDefinition LeftArm = Arms.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(6.0F, 0.0F, 0.0F));

		PartDefinition LeftForearm = LeftArm.addOrReplaceChild("LeftForearm", CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, -3.5F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.75F, 0.0F));

		PartDefinition LeftShoulder = LeftArm.addOrReplaceChild("LeftShoulder", CubeListBuilder.create().texOffs(40, 21).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.25F, 0.0F));

		PartDefinition Torso = UpperBody.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.125F, 0.0F));

		PartDefinition LowerBody = Ninja.addOrReplaceChild("LowerBody", CubeListBuilder.create(), PartPose.offset(0.0F, -6.25F, 1.0F));

		PartDefinition RightLeg = LowerBody.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 0.0F, 0.0F));

		PartDefinition RightCalf = RightLeg.addOrReplaceChild("RightCalf", CubeListBuilder.create().texOffs(24, 16).addBox(-4.0F, -7.0F, -1.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 6.25F, -1.0F));

		PartDefinition RightThigh = RightLeg.addOrReplaceChild("RightThigh", CubeListBuilder.create().texOffs(32, 38).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.25F, 0.0F));

		PartDefinition LeftLeg = LowerBody.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition LeftThigh = LeftLeg.addOrReplaceChild("LeftThigh", CubeListBuilder.create().texOffs(16, 38).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.25F, 0.0F));

		PartDefinition LeftCalf = LeftLeg.addOrReplaceChild("LeftCalf", CubeListBuilder.create().texOffs(24, 27).addBox(0.0F, -7.0F, -1.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 6.25F, -1.0F));

		PartDefinition Head = Ninja.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -28.0F, 1.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);

        this.animateWalk(LacunaAnimationsDefinitions.NINJA_WALK, limbSwing, limbSwingAmount, 2f, .25f);
        this.animate(((NinjaEntity) entity).idleAnimationState, LacunaAnimationsDefinitions.NINJA_IDLE, ageInTicks, 1f);
        this.animate(((NinjaEntity) entity).attackAnimationState, LacunaAnimationsDefinitions.NINJA_ATTACK, ageInTicks, 1f);

    }

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Ninja.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

    @Override
    public ModelPart root() {
        return Ninja;
    }
}