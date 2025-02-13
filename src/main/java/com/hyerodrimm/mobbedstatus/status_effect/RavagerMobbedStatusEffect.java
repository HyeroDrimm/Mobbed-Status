package com.hyerodrimm.mobbedstatus.status_effect;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.random.Random;

import java.util.function.ToIntFunction;

public class RavagerMobbedStatusEffect extends MobbedStatusEffectGeneric{
    public RavagerMobbedStatusEffect(StatusEffectCategory category, int color, float mobChance, ToIntFunction<Random> mobCountFunction) {
        super(category, color, mobChance, mobCountFunction);
        this.mobType = EntityType.RAVAGER;
        this.mobHurtSound = SoundEvents.ENTITY_RAVAGER_HURT;
    }
}
