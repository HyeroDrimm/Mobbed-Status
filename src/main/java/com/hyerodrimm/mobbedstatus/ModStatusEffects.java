package com.hyerodrimm.mobbedstatus;

import com.hyerodrimm.mobbedstatus.status_effect.BeeMobbedStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Colors;
import net.minecraft.util.Identifier;

import static com.hyerodrimm.mobbedstatus.MobbedStatus.MOD_ID;

public class ModStatusEffects {

    public static final RegistryEntry<StatusEffect> BEE_MOBBED_STATUS_EFFECT;

    static {
        BEE_MOBBED_STATUS_EFFECT = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MOD_ID, "bee-mobbed-status-effect"), new BeeMobbedStatusEffect(StatusEffectCategory.NEUTRAL, -10496, 0.1f, r->r.nextBetween(1,3)));
    }
}
