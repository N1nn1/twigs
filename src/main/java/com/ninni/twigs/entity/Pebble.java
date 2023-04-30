package com.ninni.twigs.entity;

import com.ninni.twigs.registry.TwigsEntityTypes;
import com.ninni.twigs.registry.TwigsItems;
import com.ninni.twigs.registry.TwigsParticleTypes;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class Pebble extends ThrowableItemProjectile {

    public Pebble(EntityType<? extends ThrowableItemProjectile> entityType, Level level) {
        super(entityType, level);
    }

    public Pebble(Level level, LivingEntity livingEntity) {
        super(TwigsEntityTypes.PEBBLE.get(), livingEntity, level);
    }

    public Pebble(Level level, double x, double y, double z) {
        super(TwigsEntityTypes.PEBBLE.get(), x, y, z, level);
    }

    @Override
    protected Item getDefaultItem() {
        return TwigsItems.PEBBLE.get();
    }

    private ParticleOptions getParticle() {
        ItemStack itemStack = this.getItemRaw();
        return itemStack.isEmpty() ? TwigsParticleTypes.ITEM_PEBBLE.get() : new ItemParticleOption(ParticleTypes.ITEM, itemStack);
    }

    @Override
    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);
        if (!this.level.isClientSide) {
            if (hitResult.getType() != HitResult.Type.ENTITY) {
                ItemStack stack = this.getItem();
                RandomSource random = this.level.random;
                ItemEntity itemEntity = new ItemEntity(this.level, this.getX(), this.getY(), this.getZ(), stack.isEmpty() ? new ItemStack(this.getDefaultItem()) : stack, random.nextDouble() * 0.2D - 0.1D, this.isUnderWater() ? 0.0D : 0.2D, random.nextDouble() * 0.2D - 0.1D);
                itemEntity.setDefaultPickUpDelay();
                this.level.addFreshEntity(itemEntity);
            }
            this.level.broadcastEntityEvent(this, (byte) 3);
            this.discard();
        }
    }

    @Override
    protected void doWaterSplashEffect() {
        this.setDeltaMovement(this.getDeltaMovement().multiply(1.0D, -1 / 2.0D, 1.0D).scale(0.932D));
        super.doWaterSplashEffect();
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        entityHitResult.getEntity().hurt(this.damageSources().thrown(this, this.getOwner()), 1.0F);
    }

    @Override
    public void handleEntityEvent(byte b) {
        if (b == 3) {
            for (int i = 0; i < 8; i++) {
                this.level.addParticle(this.getParticle(), this.getX(), this.getY(), this.getZ(), 0.0, 0.0, 0.0);
            }
        }
    }
}
