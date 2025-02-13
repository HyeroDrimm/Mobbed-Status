package com.hyerodrimm.mobbedstatus.status_effect;

import java.util.function.ToIntFunction;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import org.joml.Vector3f;

class MobbedStatusEffectGeneric extends StatusEffect {
    private final float mobChance;
    private final ToIntFunction<Random> mobCountFunction;
    protected EntityType mobType;
    protected SoundEvent mobHurtSound;

    protected MobbedStatusEffectGeneric(StatusEffectCategory category, int color, float mobChance, ToIntFunction<Random> mobCountFunction) {
        super(category, color, ParticleTypes.EFFECT);
        this.mobChance = mobChance;
        this.mobCountFunction = mobCountFunction;
    }

    public void onEntityDamage(ServerWorld world, LivingEntity entity, int amplifier, DamageSource source, float amount) {
        if (entity.getRandom().nextFloat() <= this.mobChance) {
            int i = this.mobCountFunction.applyAsInt(entity.getRandom());

            for(int j = 0; j < i; ++j) {
                this.spawnMob(world, entity, entity.getX(), entity.getY() + (double)entity.getHeight() / 2.0, entity.getZ());
            }
        }
    }

    protected LivingEntity spawnMob(ServerWorld world, LivingEntity entity, double x, double y, double z) {
        LivingEntity mobEntity = (LivingEntity)mobType.create(world, SpawnReason.TRIGGERED);
        if (mobEntity != null) {
            Random random = entity.getRandom();
            float f = 1.5707964F;
            float g = MathHelper.nextBetween(random, -1.5707964F, 1.5707964F);
            Vector3f vector3f = entity.getRotationVector().toVector3f().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY(g);
            mobEntity.refreshPositionAndAngles(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
            mobEntity.setVelocity(new Vec3d(vector3f));
            world.spawnEntity(mobEntity);
            mobEntity.playSoundIfNotSilent(mobHurtSound);
        }
        return mobEntity;
    }
}
