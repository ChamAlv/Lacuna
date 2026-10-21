package com.cham.lacuna.datagen;

import com.cham.lacuna.Lacuna;
import com.cham.lacuna.items.LacunaItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class LacunaItemModelProvider extends ItemModelProvider {
    public LacunaItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Lacuna.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(LacunaItems.CACA_FLAKE);

        withExistingParent(LacunaItems.NINJA_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Lacuna.MODID, "item/" + item.getId().getPath()));
    }
}
