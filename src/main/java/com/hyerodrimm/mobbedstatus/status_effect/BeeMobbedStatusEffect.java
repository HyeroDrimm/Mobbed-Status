package com.hyerodrimm.mobbedstatus.status_effect;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.network.packet.s2c.custom.DebugBeeCustomPayload;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.random.Random;

import java.util.function.ToIntFunction;

public class BeeMobbedStatusEffect extends MobbedStatusEffectGeneric{
    public BeeMobbedStatusEffect(StatusEffectCategory category, int color, float mobChance, ToIntFunction<Random> mobCountFunction) {
        super(category, color, mobChance, mobCountFunction);
        this.mobType = EntityType.BEE;
        this.mobHurtSound = SoundEvents.ENTITY_BEE_HURT;
    }

    @Override
    protected LivingEntity spawnMob(ServerWorld world, LivingEntity entity, double x, double y, double z) {
        LivingEntity mobEntity = super.spawnMob(world, entity,x,y,z);
        BeeEntity beeEntity = (BeeEntity) mobEntity;
        beeEntity.setAngryAt(entity.getUuid());
        beeEntity.chooseRandomAngerTime();
        return mobEntity;
    }
}
