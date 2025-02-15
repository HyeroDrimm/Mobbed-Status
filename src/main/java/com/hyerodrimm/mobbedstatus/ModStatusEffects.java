package com.hyerodrimm.mobbedstatus;

import com.hyerodrimm.mobbedstatus.status_effect.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

import static com.hyerodrimm.mobbedstatus.MobbedStatus.MOD_ID;

public class ModStatusEffects {

    public static final RegistryEntry<StatusEffect> BEE_MOBBED_STATUS_EFFECT;
    public static final RegistryEntry<StatusEffect> RAVAGER_MOBBED_STATUS_EFFECT;
    public static final RegistryEntry<StatusEffect> CREEPER_MOBBED_STATUS_EFFECT;
    public static final RegistryEntry<StatusEffect> GOAT_MOBBED_STATUS_EFFECT;
    public static final RegistryEntry<StatusEffect> LLAMA_MOBBED_STATUS_EFFECT;
    public static final RegistryEntry<StatusEffect> RABBIT_MOBBED_STATUS_EFFECT;
    public static final RegistryEntry<StatusEffect> SQUID_MOBBED_STATUS_EFFECT;
    public static final RegistryEntry<StatusEffect> VEX_MOBBED_STATUS_EFFECT;
    public static final RegistryEntry<StatusEffect> WITHER_MOBBED_STATUS_EFFECT;

    static {
        BEE_MOBBED_STATUS_EFFECT = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MOD_ID, "bee-mobbed-status-effect"), new BeeMobbedStatusEffect(StatusEffectCategory.NEUTRAL, -10496, 0.1f, r->r.nextBetween(1,3)));
        RAVAGER_MOBBED_STATUS_EFFECT = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MOD_ID, "ravager-mobbed-status-effect"), new RavagerMobbedStatusEffect(StatusEffectCategory.HARMFUL, -6901843, 0.1f, r->r.nextBetween(1,1)));
        CREEPER_MOBBED_STATUS_EFFECT = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MOD_ID, "creeper-mobbed-status-effect"), new CreeperMobbedStatusEffect(StatusEffectCategory.HARMFUL, -16718336, 0.1f, r->r.nextBetween(1,2)));
        GOAT_MOBBED_STATUS_EFFECT = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MOD_ID, "goat-mobbed-status-effect"), new GoatMobbedStatusEffect(StatusEffectCategory.NEUTRAL, -789774, 0.1f, r->r.nextBetween(1,2)));
        LLAMA_MOBBED_STATUS_EFFECT = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MOD_ID, "llama-mobbed-status-effect"), new LlamaMobbedStatusEffect(StatusEffectCategory.NEUTRAL, -3380, 0.1f, r->r.nextBetween(1,2)));
        RABBIT_MOBBED_STATUS_EFFECT = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MOD_ID, "rabbit-mobbed-status-effect"), new RabbitMobbedStatusEffect(StatusEffectCategory.NEUTRAL, -3380, 0.1f, r->r.nextBetween(1,4)));
        SQUID_MOBBED_STATUS_EFFECT = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MOD_ID, "squid-mobbed-status-effect"), new SquidMobbedStatusEffect(StatusEffectCategory.NEUTRAL, -16777114, 0.1f, r->r.nextBetween(1,4)));
        VEX_MOBBED_STATUS_EFFECT = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MOD_ID, "vex-mobbed-status-effect"), new VexMobbedStatusEffect(StatusEffectCategory.HARMFUL, -6689793, 0.1f, r->r.nextBetween(1,3)));
        WITHER_MOBBED_STATUS_EFFECT = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MOD_ID, "wither-mobbed-status-effect"), new WitherMobbedStatusEffect(StatusEffectCategory.HARMFUL, -16777216, 0.1f, r->r.nextBetween(1,1)));

    }
}
