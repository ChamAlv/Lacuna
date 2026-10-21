package com.cham.lacuna.datagen;

import com.cham.lacuna.Lacuna;
import com.cham.lacuna.blocks.LacunaBlocks;
import com.cham.lacuna.items.LacunaItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class LacunaRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> CACA_SMELTABLES = List.of(LacunaBlocks.CACA_ORE.get());

    public LacunaRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, CACA_SMELTABLES, RecipeCategory.MISC, LacunaItems.CACA_FLAKE.get(), 0.25f, 200, "example_material_id");
        oreBlasting(pWriter, CACA_SMELTABLES, RecipeCategory.MISC, LacunaItems.CACA_FLAKE.get(), 0.25f, 200, "example_material_id");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, LacunaBlocks.CACA_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', LacunaItems.CACA_FLAKE.get())
                .unlockedBy(getHasName(LacunaItems.CACA_FLAKE.get()), has(LacunaItems.CACA_FLAKE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, LacunaItems.CACA_FLAKE.get(), 9)
                .requires(LacunaBlocks.CACA_BLOCK.get())
                .unlockedBy(getHasName(LacunaBlocks.CACA_BLOCK.get()), has(LacunaBlocks.CACA_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, LacunaItems.NINJA_SPAWN_EGG.get())
                .pattern("OOO")
                .pattern("OXO")
                .pattern("OOO")
                .define('O', Blocks.BLACK_WOOL.asItem())
                .define('X', LacunaBlocks.CACA_BLOCK.get())
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, Lacuna.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
