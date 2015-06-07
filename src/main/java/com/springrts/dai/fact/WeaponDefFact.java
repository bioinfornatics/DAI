package com.springrts.dai.fact;


public final class WeaponDefFact implements IWeaponDefFact {

    private final int weaponDefId;

    private final String name;

    private final String type;

    private final String description;

    private final String fileName;

    private final String gegTag;

    private final float range;

    private final float heightMod;

    private final float accuracy;

    private final float sprayAngle;

    private final float movingAccuracy;

    private final float tarMoveError;

    private final float leadLimit;

    private final float leadBonus;

    private final float predictBoost;

    private final int numDamaypes;

    private final float areaOfEffect;

    private final boolean isNoSelfDamage;

    private final float fireStarter;

    private final float edgeEffectiveness;

    private final float size;

    private final float sizeGrowth;

    private final float collisionSize;

    private final int salvoSize;

    private final float salvoDelay;

    private final float reload;

    private final float beamTime;

    private final boolean isBeamBurst;

    private final boolean isWaterBounce;

    private final boolean isGroundBounce;

    private final float bounceRebound;

    private final float bounceSlip;

    private final int numBounce;

    private final float maxAngle;

    private final float upTime;

    private final int flightTime;

    private final float metalCost;

    private final float energyCost;

    private final int projectilesPerShot;

    private final boolean isTurret;

    private final boolean isOnlyForward;

    private final boolean isFixedLauncher;

    private final boolean isWaterWeapon;

    private final boolean isFireSubmersed;

    private final boolean isSubMissile;

    private final boolean isTracks;

    private final boolean isDropped;

    private final boolean isParalyzer;

    private final boolean isImpactOnly;

    private final boolean isNoAutoTar;

    private final boolean isManualFire;

    private final int interceptor;

    private final int tarable;

    private final boolean isStockpileable;

    private final float coverageRange;

    private final float stockpileTime;

    private final float intensity;

    private final float thickness;

    private final float laserFlareSize;

    private final float coreThickness;

    private final float duration;

    private final int lodDistance;

    private final float falloffRate;

    private final int graphicsType;

    private final boolean isSoundTrigger;

    private final boolean isSelfExplode;

    private final boolean isGravityAffected;

    private final int highTrajectory;

    private final float MyGravity;

    private final boolean isNoExplode;

    private final float startVelocity;

    private final float weaponAcceleration;

    private final float turnRate;

    private final float maxVelocity;

    private final float projectileSpeed;

    private final float explosionSpeed;

    private final int onlyTarCategory;

    private final float wobble;

    private final float dance;

    private final float trajectoryHeight;

    private final boolean isLargeBeamLaser;

    private final boolean isShield;

    private final boolean isShieldRepulser;

    private final boolean isSmartShield;

    private final boolean isExteriorShield;

    private final boolean isVisibleShield;

    private final boolean isVisibleShieldRepulse;

    private final int visibleShieldHitFrames;

    private final int interceptedByShieldType;

    private final boolean isAvoidFriendly;

    private final boolean isAvoidFeature;

    private final boolean isAvoidNeutral;

    private final float tarBorder;

    private final float minIntensity;

    private final float heightBoostFactor;

    private final float proximityPriority;

    private final int collisionFlags;

    private final boolean isSweepFire;

    private final boolean isAbleToAttackGround;

    private final float dynDamageExp;

    private final float dynDamageMin;

    private final float dynDamageRange;

    private final boolean isDynDamageInverted;

    public WeaponDefFact(final int weaponDefId, final String name, final String type, final String description, final String fileName, final String gegTag, final float range, final float heightMod, final float accuracy, final float sprayAngle, final float movingAccuracy, final float tarMoveError, final float leadLimit, final float leadBonus, final float predictBoost, final int numDamaypes, final float areaOfEffect, final boolean isNoSelfDamage, final float fireStarter, final float edgeEffectiveness, final float size, final float sizeGrowth, final float collisionSize, final int salvoSize, final float salvoDelay, final float reload, final float beamTime, final boolean isBeamBurst, final boolean isWaterBounce, final boolean isGroundBounce, final float bounceRebound, final float bounceSlip, final int numBounce, final float maxAngle, final float upTime, final int flightTime, final float metalCost, final float energyCost, final int projectilesPerShot, final boolean isTurret, final boolean isOnlyForward, final boolean isFixedLauncher, final boolean isWaterWeapon, final boolean isFireSubmersed, final boolean isSubMissile, final boolean isTracks, final boolean isDropped, final boolean isParalyzer, final boolean isImpactOnly, final boolean isNoAutoTar, final boolean isManualFire, final int interceptor, final int tarable, final boolean isStockpileable, final float coverageRange, final float stockpileTime, final float intensity, final float thickness, final float laserFlareSize, final float coreThickness, final float duration, final int lodDistance, final float falloffRate, final int graphicsType, final boolean isSoundTrigger, final boolean isSelfExplode, final boolean isGravityAffected, final int highTrajectory, final float myGravity, final boolean isNoExplode, final float startVelocity, final float weaponAcceleration, final float turnRate, final float maxVelocity, final float projectileSpeed, final float explosionSpeed, final int onlyTarCategory, final float wobble, final float dance, final float trajectoryHeight, final boolean isLargeBeamLaser, final boolean isShield, final boolean isShieldRepulser, final boolean isSmartShield, final boolean isExteriorShield, final boolean isVisibleShield, final boolean isVisibleShieldRepulse, final int visibleShieldHitFrames, final int interceptedByShieldType, final boolean isAvoidFriendly, final boolean isAvoidFeature, final boolean isAvoidNeutral, final float tarBorder, final float minIntensity, final float heightBoostFactor, final float proximityPriority, final int collisionFlags, final boolean isSweepFire, final boolean isAbleToAttackGround, final float dynDamageExp, final float dynDamageMin, final float dynDamageRange, final boolean isDynDamageInverted) {
        this.weaponDefId = weaponDefId;
        this.name = name;
        this.type = type;
        this.description = description;
        this.fileName = fileName;
        this.gegTag = gegTag;
        this.range = range;
        this.heightMod = heightMod;
        this.accuracy = accuracy;
        this.sprayAngle = sprayAngle;
        this.movingAccuracy = movingAccuracy;
        this.tarMoveError = tarMoveError;
        this.leadLimit = leadLimit;
        this.leadBonus = leadBonus;
        this.predictBoost = predictBoost;
        this.numDamaypes = numDamaypes;
        this.areaOfEffect = areaOfEffect;
        this.isNoSelfDamage = isNoSelfDamage;
        this.fireStarter = fireStarter;
        this.edgeEffectiveness = edgeEffectiveness;
        this.size = size;
        this.sizeGrowth = sizeGrowth;
        this.collisionSize = collisionSize;
        this.salvoSize = salvoSize;
        this.salvoDelay = salvoDelay;
        this.reload = reload;
        this.beamTime = beamTime;
        this.isBeamBurst = isBeamBurst;
        this.isWaterBounce = isWaterBounce;
        this.isGroundBounce = isGroundBounce;
        this.bounceRebound = bounceRebound;
        this.bounceSlip = bounceSlip;
        this.numBounce = numBounce;
        this.maxAngle = maxAngle;
        this.upTime = upTime;
        this.flightTime = flightTime;
        this.metalCost = metalCost;
        this.energyCost = energyCost;
        this.projectilesPerShot = projectilesPerShot;
        this.isTurret = isTurret;
        this.isOnlyForward = isOnlyForward;
        this.isFixedLauncher = isFixedLauncher;
        this.isWaterWeapon = isWaterWeapon;
        this.isFireSubmersed = isFireSubmersed;
        this.isSubMissile = isSubMissile;
        this.isTracks = isTracks;
        this.isDropped = isDropped;
        this.isParalyzer = isParalyzer;
        this.isImpactOnly = isImpactOnly;
        this.isNoAutoTar = isNoAutoTar;
        this.isManualFire = isManualFire;
        this.interceptor = interceptor;
        this.tarable = tarable;
        this.isStockpileable = isStockpileable;
        this.coverageRange = coverageRange;
        this.stockpileTime = stockpileTime;
        this.intensity = intensity;
        this.thickness = thickness;
        this.laserFlareSize = laserFlareSize;
        this.coreThickness = coreThickness;
        this.duration = duration;
        this.lodDistance = lodDistance;
        this.falloffRate = falloffRate;
        this.graphicsType = graphicsType;
        this.isSoundTrigger = isSoundTrigger;
        this.isSelfExplode = isSelfExplode;
        this.isGravityAffected = isGravityAffected;
        this.highTrajectory = highTrajectory;
        MyGravity = myGravity;
        this.isNoExplode = isNoExplode;
        this.startVelocity = startVelocity;
        this.weaponAcceleration = weaponAcceleration;
        this.turnRate = turnRate;
        this.maxVelocity = maxVelocity;
        this.projectileSpeed = projectileSpeed;
        this.explosionSpeed = explosionSpeed;
        this.onlyTarCategory = onlyTarCategory;
        this.wobble = wobble;
        this.dance = dance;
        this.trajectoryHeight = trajectoryHeight;
        this.isLargeBeamLaser = isLargeBeamLaser;
        this.isShield = isShield;
        this.isShieldRepulser = isShieldRepulser;
        this.isSmartShield = isSmartShield;
        this.isExteriorShield = isExteriorShield;
        this.isVisibleShield = isVisibleShield;
        this.isVisibleShieldRepulse = isVisibleShieldRepulse;
        this.visibleShieldHitFrames = visibleShieldHitFrames;
        this.interceptedByShieldType = interceptedByShieldType;
        this.isAvoidFriendly = isAvoidFriendly;
        this.isAvoidFeature = isAvoidFeature;
        this.isAvoidNeutral = isAvoidNeutral;
        this.tarBorder = tarBorder;
        this.minIntensity = minIntensity;
        this.heightBoostFactor = heightBoostFactor;
        this.proximityPriority = proximityPriority;
        this.collisionFlags = collisionFlags;
        this.isSweepFire = isSweepFire;
        this.isAbleToAttackGround = isAbleToAttackGround;
        this.dynDamageExp = dynDamageExp;
        this.dynDamageMin = dynDamageMin;
        this.dynDamageRange = dynDamageRange;
        this.isDynDamageInverted = isDynDamageInverted;
    }

    @Override
    public int getWeaponDefId() {
        return weaponDefId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getFileName() {
        return fileName;
    }

    @Override
    public String getGegTag() {
        return gegTag;
    }

    @Override
    public float getRange() {
        return range;
    }

    @Override
    public float getHeightMod() {
        return heightMod;
    }

    @Override
    public float getAccuracy() {
        return accuracy;
    }

    @Override
    public float getSprayAngle() {
        return sprayAngle;
    }

    @Override
    public float getMovingAccuracy() {
        return movingAccuracy;
    }

    @Override
    public float getTarMoveError() {
        return tarMoveError;
    }

    @Override
    public float getLeadLimit() {
        return leadLimit;
    }

    @Override
    public float getLeadBonus() {
        return leadBonus;
    }

    @Override
    public float getPredictBoost() {
        return predictBoost;
    }

    @Override
    public int getNumDamaypes() {
        return numDamaypes;
    }

    @Override
    public float getAreaOfEffect() {
        return areaOfEffect;
    }

    @Override
    public boolean isNoSelfDamage() {
        return isNoSelfDamage;
    }

    @Override
    public float getFireStarter() {
        return fireStarter;
    }

    @Override
    public float getEdgeEffectiveness() {
        return edgeEffectiveness;
    }

    @Override
    public float getSize() {
        return size;
    }

    @Override
    public float getSizeGrowth() {
        return sizeGrowth;
    }

    @Override
    public float getCollisionSize() {
        return collisionSize;
    }

    @Override
    public int getSalvoSize() {
        return salvoSize;
    }

    @Override
    public float getSalvoDelay() {
        return salvoDelay;
    }

    @Override
    public float getReload() {
        return reload;
    }

    @Override
    public float getBeamTime() {
        return beamTime;
    }

    @Override
    public boolean isBeamBurst() {
        return isBeamBurst;
    }

    @Override
    public boolean isWaterBounce() {
        return isWaterBounce;
    }

    @Override
    public boolean isGroundBounce() {
        return isGroundBounce;
    }

    @Override
    public float getBounceRebound() {
        return bounceRebound;
    }

    @Override
    public float getBounceSlip() {
        return bounceSlip;
    }

    @Override
    public int getNumBounce() {
        return numBounce;
    }

    @Override
    public float getMaxAngle() {
        return maxAngle;
    }

    @Override
    public float getUpTime() {
        return upTime;
    }

    @Override
    public int getFlightTime() {
        return flightTime;
    }

    @Override
    public float getMetalCost() {
        return metalCost;
    }

    @Override
    public float getEnergyCost() {
        return energyCost;
    }

    @Override
    public int getProjectilesPerShot() {
        return projectilesPerShot;
    }

    @Override
    public boolean isTurret() {
        return isTurret;
    }

    @Override
    public boolean isOnlyForward() {
        return isOnlyForward;
    }

    @Override
    public boolean isFixedLauncher() {
        return isFixedLauncher;
    }

    @Override
    public boolean isWaterWeapon() {
        return isWaterWeapon;
    }

    @Override
    public boolean isFireSubmersed() {
        return isFireSubmersed;
    }

    @Override
    public boolean isSubMissile() {
        return isSubMissile;
    }

    @Override
    public boolean isTracks() {
        return isTracks;
    }

    @Override
    public boolean isDropped() {
        return isDropped;
    }

    @Override
    public boolean isParalyzer() {
        return isParalyzer;
    }

    @Override
    public boolean isImpactOnly() {
        return isImpactOnly;
    }

    @Override
    public boolean isNoAutoTar() {
        return isNoAutoTar;
    }

    @Override
    public boolean isManualFire() {
        return isManualFire;
    }

    @Override
    public int getInterceptor() {
        return interceptor;
    }

    @Override
    public int getTarable() {
        return tarable;
    }

    @Override
    public boolean isStockpileable() {
        return isStockpileable;
    }

    @Override
    public float getCoverageRange() {
        return coverageRange;
    }

    @Override
    public float getStockpileTime() {
        return stockpileTime;
    }

    @Override
    public float getIntensity() {
        return intensity;
    }

    @Override
    public float getThickness() {
        return thickness;
    }

    @Override
    public float getLaserFlareSize() {
        return laserFlareSize;
    }

    @Override
    public float getCoreThickness() {
        return coreThickness;
    }

    @Override
    public float getDuration() {
        return duration;
    }

    @Override
    public int getLodDistance() {
        return lodDistance;
    }

    @Override
    public float getFalloffRate() {
        return falloffRate;
    }

    @Override
    public int getGraphicsType() {
        return graphicsType;
    }

    @Override
    public boolean isSoundTrigger() {
        return isSoundTrigger;
    }

    @Override
    public boolean isSelfExplode() {
        return isSelfExplode;
    }

    @Override
    public boolean isGravityAffected() {
        return isGravityAffected;
    }

    @Override
    public int getHighTrajectory() {
        return highTrajectory;
    }

    @Override
    public float getMyGravity() {
        return MyGravity;
    }

    @Override
    public boolean isNoExplode() {
        return isNoExplode;
    }

    @Override
    public float getStartVelocity() {
        return startVelocity;
    }

    @Override
    public float getWeaponAcceleration() {
        return weaponAcceleration;
    }

    @Override
    public float getTurnRate() {
        return turnRate;
    }

    @Override
    public float getMaxVelocity() {
        return maxVelocity;
    }

    @Override
    public float getProjectileSpeed() {
        return projectileSpeed;
    }

    @Override
    public float getExplosionSpeed() {
        return explosionSpeed;
    }

    @Override
    public int getOnlyTarCategory() {
        return onlyTarCategory;
    }

    @Override
    public float getWobble() {
        return wobble;
    }

    @Override
    public float getDance() {
        return dance;
    }

    @Override
    public float getTrajectoryHeight() {
        return trajectoryHeight;
    }

    @Override
    public boolean isLargeBeamLaser() {
        return isLargeBeamLaser;
    }

    @Override
    public boolean isShield() {
        return isShield;
    }

    @Override
    public boolean isShieldRepulser() {
        return isShieldRepulser;
    }

    @Override
    public boolean isSmartShield() {
        return isSmartShield;
    }

    @Override
    public boolean isExteriorShield() {
        return isExteriorShield;
    }

    @Override
    public boolean isVisibleShield() {
        return isVisibleShield;
    }

    @Override
    public boolean isVisibleShieldRepulse() {
        return isVisibleShieldRepulse;
    }

    @Override
    public int getVisibleShieldHitFrames() {
        return visibleShieldHitFrames;
    }

    @Override
    public int getInterceptedByShieldType() {
        return interceptedByShieldType;
    }

    @Override
    public boolean isAvoidFriendly() {
        return isAvoidFriendly;
    }

    @Override
    public boolean isAvoidFeature() {
        return isAvoidFeature;
    }

    @Override
    public boolean isAvoidNeutral() {
        return isAvoidNeutral;
    }

    @Override
    public float getTarBorder() {
        return tarBorder;
    }

    @Override
    public float getMinIntensity() {
        return minIntensity;
    }

    @Override
    public float getHeightBoostFactor() {
        return heightBoostFactor;
    }

    @Override
    public float getProximityPriority() {
        return proximityPriority;
    }

    @Override
    public int getCollisionFlags() {
        return collisionFlags;
    }

    @Override
    public boolean isSweepFire() {
        return isSweepFire;
    }

    @Override
    public boolean isAbleToAttackGround() {
        return isAbleToAttackGround;
    }

    @Override
    public float getDynDamageExp() {
        return dynDamageExp;
    }

    @Override
    public float getDynDamageMin() {
        return dynDamageMin;
    }

    @Override
    public float getDynDamageRange() {
        return dynDamageRange;
    }

    @Override
    public boolean isDynDamageInverted() {
        return isDynDamageInverted;
    }
}
