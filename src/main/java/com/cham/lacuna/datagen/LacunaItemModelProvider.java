package com.cham.lacuna.datagen;

import com.cham.lacuna.Lacuna;
import com.cham.lacuna.items.LacunaItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class LacunaItemModelProvider extends ItemModelProvider {
    public LacunaItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Lacuna.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(LacunaItems.CACA_FLAKE.get());

        //withExistingParent(LacunaItems.NINJA_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }
}
