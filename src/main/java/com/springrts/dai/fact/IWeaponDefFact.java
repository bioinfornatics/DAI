package com.springrts.dai.fact;

public interface IWeaponDefFact {
    int getWeaponDefId();

    String getName();

    String getType();

    String getDescription();

    String getFileName();

    String getGegTag();

    float getRange();

    float getHeightMod();

    float getAccuracy();

    float getSprayAngle();

    float getMovingAccuracy();

    float getTarMoveError();

    float getLeadLimit();

    float getLeadBonus();

    float getPredictBoost();

    int getNumDamaypes();

    float getAreaOfEffect();

    boolean isNoSelfDamage();

    float getFireStarter();

    float getEdgeEffectiveness();

    float getSize();

    float getSizeGrowth();

    float getCollisionSize();

    int getSalvoSize();

    float getSalvoDelay();

    float getReload();

    float getBeamTime();

    boolean isBeamBurst();

    boolean isWaterBounce();

    boolean isGroundBounce();

    float getBounceRebound();

    float getBounceSlip();

    int getNumBounce();

    float getMaxAngle();

    float getUpTime();

    int getFlightTime();

    float getMetalCost();

    float getEnergyCost();

    int getProjectilesPerShot();

    boolean isTurret();

    boolean isOnlyForward();

    boolean isFixedLauncher();

    boolean isWaterWeapon();

    boolean isFireSubmersed();

    boolean isSubMissile();

    boolean isTracks();

    boolean isDropped();

    boolean isParalyzer();

    boolean isImpactOnly();

    boolean isNoAutoTar();

    boolean isManualFire();

    int getInterceptor();

    int getTarable();

    boolean isStockpileable();

    float getCoverageRange();

    float getStockpileTime();

    float getIntensity();

    float getThickness();

    float getLaserFlareSize();

    float getCoreThickness();

    float getDuration();

    int getLodDistance();

    float getFalloffRate();

    int getGraphicsType();

    boolean isSoundTrigger();

    boolean isSelfExplode();

    boolean isGravityAffected();

    int getHighTrajectory();

    float getMyGravity();

    boolean isNoExplode();

    float getStartVelocity();

    float getWeaponAcceleration();

    float getTurnRate();

    float getMaxVelocity();

    float getProjectileSpeed();

    float getExplosionSpeed();

    int getOnlyTarCategory();

    float getWobble();

    float getDance();

    float getTrajectoryHeight();

    boolean isLargeBeamLaser();

    boolean isShield();

    boolean isShieldRepulser();

    boolean isSmartShield();

    boolean isExteriorShield();

    boolean isVisibleShield();

    boolean isVisibleShieldRepulse();

    int getVisibleShieldHitFrames();

    int getInterceptedByShieldType();

    boolean isAvoidFriendly();

    boolean isAvoidFeature();

    boolean isAvoidNeutral();

    float getTarBorder();

    float getMinIntensity();

    float getHeightBoostFactor();

    float getProximityPriority();

    int getCollisionFlags();

    boolean isSweepFire();

    boolean isAbleToAttackGround();

    float getDynDamageExp();

    float getDynDamageMin();

    float getDynDamageRange();

    boolean isDynDamageInverted();
}

