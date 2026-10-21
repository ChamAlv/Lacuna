package com.cham.lacuna.datagen.loot;

import com.cham.lacuna.entities.LacunaEntities;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraftforge.registries.RegistryObject;

import java.util.stream.Stream;

public class LacunaEntityLootTables extends EntityLootSubProvider {
    protected LacunaEntityLootTables() {
            super(FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        //this.add(ModEntities.NINJA.get(), );

    }

    @Override
    protected Stream<EntityType<?>> getKnownEntityTypes() {
        return LacunaEntities.ENTITY_TYPES.getEntries().stream().map(RegistryObject::get);
    }
}
