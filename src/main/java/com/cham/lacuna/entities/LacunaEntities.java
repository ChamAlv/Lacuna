package com.cham.lacuna.entities;

import com.cham.lacuna.Lacuna;
import com.cham.lacuna.entities.custom.NinjaEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LacunaEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Lacuna.MODID);

    public static final RegistryObject<EntityType<NinjaEntity>> NINJA =
            ENTITY_TYPES.register("ninja", () -> EntityType.Builder.of(NinjaEntity::new, MobCategory.MONSTER)
                    .sized(1f, 1f).build("ninja"));

    public static void register(IEventBus eventbus) {
        ENTITY_TYPES.register(eventbus);
    }
}
