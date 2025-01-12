package net.somfunambulist.setup.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.somfunambulist.setup.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DOWSING_ROD.get())
                .requires(ModItems.HAZEL_SAPLING.get())
                .unlockedBy("has_hazel_sapling", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HAZEL_SAPLING.get()).build()))
                .save(pWriter);
    }
}
