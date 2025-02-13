package com.hyerodrimm.mobbedstatus;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static final Potion BEE_MOBBED_POTION =
            Registry.register(
                    Registries.POTION,
                    Identifier.of(MobbedStatus.MOD_ID, "bee_mobbed_potion"),
                    new Potion("bee_mobbed_potion",
                            new StatusEffectInstance(
                                    ModStatusEffects.BEE_MOBBED_STATUS_EFFECT,
                                    3600,
                                    0)));
    public static void registerPotions(){
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(
                    // Input potion.
                    Potions.INFESTED,
                    // Ingredient
                    Items.HONEYCOMB,
                    // Output potion.
                    Registries.POTION.getEntry(BEE_MOBBED_POTION)
            );
        });
    }
}