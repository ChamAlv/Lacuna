package com.cham.lacuna.datagen;

import com.cham.lacuna.Lacuna;
import com.cham.lacuna.blocks.LacunaBlocks;
import com.cham.lacuna.items.LacunaItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class LacunaRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public LacunaRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> CACA_SMELTABLES = List.of(
                LacunaBlocks.CACA_ORE.get(),
                LacunaBlocks.CACA_DEEPSLATE_ORE.get()
        );

        oreSmelting(recipeOutput, CACA_SMELTABLES, RecipeCategory.MISC, LacunaItems.CACA_FLAKE.get(), 0.25f, 200, "example_material_id");
        oreBlasting(recipeOutput, CACA_SMELTABLES, RecipeCategory.MISC, LacunaItems.CACA_FLAKE.get(), 0.25f, 200, "example_material_id");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, LacunaBlocks.CACA_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', LacunaItems.CACA_FLAKE.get())
                .unlockedBy(getHasName(LacunaItems.CACA_FLAKE.get()), has(LacunaItems.CACA_FLAKE.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, LacunaItems.CACA_FLAKE.get(), 9)
                .requires(LacunaBlocks.CACA_BLOCK.get())
                .unlockedBy(getHasName(LacunaBlocks.CACA_BLOCK.get()), has(LacunaBlocks.CACA_BLOCK.get()))
                .save(recipeOutput);
        /*
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, LacunaItems.NINJA_SPAWN_EGG.get())
                .pattern("OOO")
                .pattern("OXO")
                .pattern("OOO")
                .define('O', Blocks.BLACK_WOOL.asItem())
                .define('X', LacunaBlocks.CACA_BLOCK.get())
                .unlockedBy(getHasName(LacunaBlocks.CACA_BLOCK.get()), has(LacunaBlocks.CACA_BLOCK.get()))
                .save(recipeOutput);

         */
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                      List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime,
                                                                      String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer, factory)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, Lacuna.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
