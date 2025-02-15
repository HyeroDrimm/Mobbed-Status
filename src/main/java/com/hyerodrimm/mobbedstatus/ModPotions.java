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

    public static final Potion RAVAGER_MOBBED_POTION =
            Registry.register(
                    Registries.POTION,
                    Identifier.of(MobbedStatus.MOD_ID, "ravager_mobbed_potion"),
                    new Potion("ravager_mobbed_potion",
                            new StatusEffectInstance(
                                    ModStatusEffects.RAVAGER_MOBBED_STATUS_EFFECT,
                                    3600,
                                    0)));
    public static final Potion VEX_MOBBED_POTION =
            Registry.register(
                    Registries.POTION,
                    Identifier.of(MobbedStatus.MOD_ID, "vex_mobbed_potion"),
                    new Potion("vex_mobbed_potion",
                            new StatusEffectInstance(
                                    ModStatusEffects.VEX_MOBBED_STATUS_EFFECT,
                                    3600,
                                    0)));

    public static final Potion LLAMA_MOBBED_POTION =
            Registry.register(
                    Registries.POTION,
                    Identifier.of(MobbedStatus.MOD_ID, "llama_mobbed_potion"),
                    new Potion("llama_mobbed_potion",
                            new StatusEffectInstance(
                                    ModStatusEffects.LLAMA_MOBBED_STATUS_EFFECT,
                                    3600,
                                    0)));

    public static final Potion WITHER_MOBBED_POTION =
            Registry.register(
                    Registries.POTION,
                    Identifier.of(MobbedStatus.MOD_ID, "wither_mobbed_potion"),
                    new Potion("wither_mobbed_potion",
                            new StatusEffectInstance(
                                    ModStatusEffects.WITHER_MOBBED_STATUS_EFFECT,
                                    3600,
                                    0)));

    public static final Potion RABBIT_MOBBED_POTION =
            Registry.register(
                    Registries.POTION,
                    Identifier.of(MobbedStatus.MOD_ID, "rabbit_mobbed_potion"),
                    new Potion("rabbit_mobbed_potion",
                            new StatusEffectInstance(
                                    ModStatusEffects.RABBIT_MOBBED_STATUS_EFFECT,
                                    3600,
                                    0)));

    public static final Potion SQUID_MOBBED_POTION =
            Registry.register(
                    Registries.POTION,
                    Identifier.of(MobbedStatus.MOD_ID, "squid_mobbed_potion"),
                    new Potion("squid_mobbed_potion",
                            new StatusEffectInstance(
                                    ModStatusEffects.SQUID_MOBBED_STATUS_EFFECT,
                                    3600,
                                    0)));

    public static final Potion GOAT_MOBBED_POTION =
            Registry.register(
                    Registries.POTION,
                    Identifier.of(MobbedStatus.MOD_ID, "goat_mobbed_potion"),
                    new Potion("goat_mobbed_potion",
                            new StatusEffectInstance(
                                    ModStatusEffects.GOAT_MOBBED_STATUS_EFFECT,
                                    3600,
                                    0)));

    public static final Potion CREEPER_MOBBED_POTION =
            Registry.register(
                    Registries.POTION,
                    Identifier.of(MobbedStatus.MOD_ID, "creeper_mobbed_potion"),
                    new Potion("creeper_mobbed_potion",
                            new StatusEffectInstance(
                                    ModStatusEffects.CREEPER_MOBBED_STATUS_EFFECT,
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
            builder.registerPotionRecipe(
                    // Input potion.
                    Potions.INFESTED,
                    // Ingredient
                    Items.BELL,
                    // Output potion.
                    Registries.POTION.getEntry(RAVAGER_MOBBED_POTION)
            );
            builder.registerPotionRecipe(
                    // Input potion.
                    Potions.INFESTED,
                    // Ingredient
                    Items.TOTEM_OF_UNDYING,
                    // Output potion.
                    Registries.POTION.getEntry(VEX_MOBBED_POTION)
            );
            builder.registerPotionRecipe(
                    // Input potion.
                    Potions.INFESTED,
                    // Ingredient
                    Items.LEAD,
                    // Output potion.
                    Registries.POTION.getEntry(LLAMA_MOBBED_POTION)
            );
            builder.registerPotionRecipe(
                    // Input potion.
                    Potions.INFESTED,
                    // Ingredient
                    Items.NETHER_STAR,
                    // Output potion.
                    Registries.POTION.getEntry(WITHER_MOBBED_POTION)
            );
            builder.registerPotionRecipe(
                    // Input potion.
                    Potions.INFESTED,
                    // Ingredient
                    Items.RABBIT_FOOT,
                    // Output potion.
                    Registries.POTION.getEntry(RABBIT_MOBBED_POTION)
            );
            builder.registerPotionRecipe(
                    // Input potion.
                    Potions.INFESTED,
                    // Ingredient
                    Items.INK_SAC,
                    // Output potion.
                    Registries.POTION.getEntry(SQUID_MOBBED_POTION)
            );
            builder.registerPotionRecipe(
                    // Input potion.
                    Potions.INFESTED,
                    // Ingredient
                    Items.GOAT_HORN,
                    // Output potion.
                    Registries.POTION.getEntry(GOAT_MOBBED_POTION)
            );
            builder.registerPotionRecipe(
                    // Input potion.
                    Potions.INFESTED,
                    // Ingredient
                    Items.CREEPER_HEAD,
                    // Output potion.
                    Registries.POTION.getEntry(CREEPER_MOBBED_POTION)
            );
        });
    }
}