package com.hyerodrimm.mobbedstatus.status_effect;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.random.Random;

import java.util.function.ToIntFunction;

public class SquidMobbedStatusEffect extends MobbedStatusEffectGeneric{
    public SquidMobbedStatusEffect(StatusEffectCategory category, int color, float mobChance, ToIntFunction<Random> mobCountFunction) {
        super(category, color, mobChance, mobCountFunction);
        this.mobType = EntityType.SQUID;
        this.mobHurtSound = SoundEvents.ENTITY_SQUID_HURT;
    }
}
