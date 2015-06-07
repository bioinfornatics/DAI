package com.springrts.dai.fact;

import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

import java.util.List;
import java.util.Map;

/**
 * Created by jmercier on 26/10/14.
 */
public interface IUnitDefFact {
    int getUnitDefId();

    float getHeight();

    float getRadius();

    String getName();

    String getHumanName();

    String getFileName();

    int getAiHint();

    int getCobId();

    int getTechLevel();

    String getGaia();

    float getMetalUpkeep();

    float getEnergyUpkeep();

    float getMetalMake();

    float getEnergyMake();

    float getMakesMetal();

    float getMakesEnergy();

    float getMetalCost();

    float getEnergyCost();

    float getExtractsMetal();

    float getExtractsEnergy();

    float getMetalExtractorRange();

    float getEnergyExtractorRange();

    float getWindResourceGenerator();

    float getTidalResourceGenerator();

    float getMetalStorage();

    float getEnergyStorage();

    boolean isSquareMetalExtractor();

    boolean isSquareEnergyExtractor();

    float getBuildTime();

    float getAutoHeal();

    float getIdleAutoHeal();

    int getIdleTime();

    float getPower();

    float getHealth();

    int getCategory();

    float getSpeed();

    float getTurnRate();

    boolean isTurnInPlace();

    float getTurnInPlaceDistance();

    float getTurnInPlaceSpeedLimit();

    boolean isUpright();

    boolean isCollide();

    float getLosRadius();

    float getAirLosRadius();

    float getLosHeight();

    int getRadarRadius();

    int getSonarRadius();

    int getJammerRadius();

    int getSonarJamRadius();

    int getSeismicRadius();

    float getSeismicSignature();

    boolean isStealth();

    boolean isSonarStealth();

    boolean isBuildRange3D();

    float getBuildDistance();

    float getBuildSpeed();

    float getReclaimSpeed();

    float getRepairSpeed();

    float getMaxRepairSpeed();

    float getResurrectSpeed();

    float getCaptureSpeed();

    float getTerraformSpeed();

    float getMass();

    boolean isPushResistant();

    boolean isStrafeToAttack();

    float getMinCollisionSpeed();

    float getSlideTolerance();

    float getMaxSlope();

    float getMaxHeightDif();

    float getMinWaterDepth();

    float getWaterline();

    float getMaxWaterDepth();

    float getArmoredMultiple();

    int getArmorType();

    float getMaxWeaponRange();

    String getType();

    String getTooltip();

    String getWreckName();

    WeaponDef getDeathExplosion();

    WeaponDef getSelfDExplosion();

    String getCategoryString();

    boolean isAbleToSelfD();

    int getSelfDCountdown();

    boolean isAbleToSubmerge();

    boolean isAbleToFly();

    boolean isAbleToMove();

    boolean isAbleToHover();

    boolean isFloater();

    boolean isBuilder();

    boolean isActivateWhenBuilt();

    boolean isOnOffable();

    boolean isFullHealthFactory();

    boolean isFactoryHeadingTakeoff();

    boolean isReclaimable();

    boolean isCapturable();

    boolean isAbleToRestore();

    boolean isAbleToRepair();

    boolean isAbleToSelfRepair();

    boolean isAbleToReclaim();

    boolean isAbleToAttack();

    boolean isAbleToPatrol();

    boolean isAbleToFight();

    boolean isAbleToGuard();

    boolean isAbleToAssist();

    boolean isAssistable();

    boolean isAbleToRepeat();

    boolean isAbleToFireControl();

    int getFireState();

    int getMoveState();

    float getWingDrag();

    float getWingAngle();

    float getDrag();

    float getFrontToSpeed();

    float getSpeedToFront();

    float getMyGravity();

    float getMaxBank();

    float getMaxPitch();

    float getTurnRadius();

    float getWantedHeight();

    float getVerticalSpeed();

    boolean isAbleToCrash();

    boolean isHoverAttack();

    boolean isAirStrafe();

    float getDlHoverFactor();

    float getMaxAcceleration();

    float getMaxDeceleration();

    float getMaxAileron();

    float getMaxElevator();

    float getMaxRudder();

    Short[][] getYardMap();

    int getxSize();

    int getzSize();

    int getBuildAngle();

    float getLoadingRadius();

    float getUnloadSpread();

    int getTransportCapacity();

    int getTransportSize();

    int getMinTransportSize();

    boolean isAirBase();

    boolean isFirePlatform();

    float getTransportMass();

    float getMinTransportMass();

    boolean isHoldSteady();

    boolean isReleaseHeld();

    boolean isNotTransportable();

    boolean isTransportByEnemy();

    int getTransportUnloadMethod();

    float getFallSpeed();

    float getUnitFallSpeed();

    boolean isAbleToCloak();

    boolean isStartCloaked();

    float getCloakCost();

    float getCloakCostMoving();

    float getDecloakDistance();

    boolean isDecloakSpherical();

    boolean isDecloakOnFire();

    boolean isAbleToKamikaze();

    float getKamikazeDist();

    boolean isTaringFacility();

    boolean isCanManualFire();

    boolean isNeedGeo();

    boolean isFeature();

    boolean isHideDamage();

    boolean isCommander();

    boolean isShowPlayerName();

    boolean isAbleToResurrect();

    boolean isAbleToCapture();

    int getHighTrajectoryType();

    int getNoChaseCategory();

    boolean isLeaveTracks();

    float getTrackWidth();

    float getTrackOffset();

    float getTrackStrength();

    float getTrackStretch();

    int getTrackType();

    boolean isAbleToDropFlare();

    float getFlareReloadTime();

    float getFlareEfficiency();

    float getFlareDelay();

    AIFloat3 getFlareDropVector();

    int getFlareTime();

    int getFlareSalvoSize();

    int getFlareSalvoDelay();

    boolean isAbleToLoopbackAttack();

    boolean isLevelGround();

    boolean isUseBuildingGroundDecal();

    int getBuildingDecalType();

    int getBuildingDecalSizeX();

    int getBuildingDecalSizeY();

    float getBuildingDecalDecaySpeed();

    float getMaxFuel();

    float getRefuelTime();

    float getMinAirBasePower();

    int getMaxThisUnit();

    UnitDef getDecoyDef();

    boolean isDontLand();

    WeaponDef getShieldDef();

    WeaponDef getStockpileDef();

    List<UnitDef> getBuildOptions();

    Map<String, String> getCustomParams();

    List<WeaponMount> getWeaponMounts();

    MoveData getMoveData();

    FlankingBonus getFlankingBonus();
}
