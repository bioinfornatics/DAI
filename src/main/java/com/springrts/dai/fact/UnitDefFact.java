package com.springrts.dai.fact;

import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

import java.util.List;
import java.util.Map;

public final class UnitDefFact implements IUnitDefFact {

    private final int unitDefId;

    private final float height;

    private final float radius;

    private final String name;

    private final String humanName;

    private final String fileName;

    private final int aiHint;

    private final int cobId;

    private final int techLevel;

    private final String gaia;

    private final float metalUpkeep;

    private final float energyUpkeep;

    private final float metalMake;

    private final float energyMake;

    private final float makesMetal;

    private final float makesEnergy;

    private final float metalCost;

    private final float energyCost;

    private final float extractsMetal;

    private final float extractsEnergy;

    private final float metalExtractorRange;

    private final float energyExtractorRange;

    private final float windResourceGenerator;

    private final float tidalResourceGenerator;

    private final float metalStorage;

    private final float energyStorage;
    private final boolean isSquareMetalExtractor;

    private final boolean isSquareEnergyExtractor;

    private final float buildTime;

    private final float autoHeal;

    private final float idleAutoHeal;

    private final int idleTime;

    private final float power;

    private final float health;

    private final int category;

    private final float speed;

    private final float turnRate;

    private final boolean isTurnInPlace;

    private final float turnInPlaceDistance;

    private final float turnInPlaceSpeedLimit;

    private final boolean isUpright;

    private final boolean isCollide;

    private final float losRadius;

    private final float airLosRadius;

    private final float losHeight;

    private final int radarRadius;

    private final int sonarRadius;

    private final int jammerRadius;

    private final int sonarJamRadius;

    private final int seismicRadius;

    private final float seismicSignature;

    private final boolean isStealth;

    private final boolean isSonarStealth;

    private final boolean isBuildRange3D;
    private final float buildDistance;

    private final float buildSpeed;

    private final float reclaimSpeed;

    private final float repairSpeed;

    private final float maxRepairSpeed;

    private final float resurrectSpeed;

    private final float captureSpeed;

    private final float terraformSpeed;

    private final float mass;

    private final boolean isPushResistant;

    private final boolean isStrafeToAttack;

    private final float minCollisionSpeed;

    private final float slideTolerance;

    private final float maxSlope;

    private final float maxHeightDif;

    private final float minWaterDepth;

    private final float waterline;

    private final float maxWaterDepth;

    private final float armoredMultiple;

    private final int armorType;

    private final float maxWeaponRange;

    private final String type;

    private final String tooltip;

    private final String wreckName;

    private final WeaponDef deathExplosion;

    private final WeaponDef selfDExplosion;

    private final String categoryString;

    private final boolean isAbleToSelfD;
    private final int selfDCountdown;

    private final boolean isAbleToSubmerge;

    private final boolean isAbleToFly;

    private final boolean isAbleToMove;

    private final boolean isAbleToHover;

    private final boolean isFloater;

    private final boolean isBuilder;

    private final boolean isActivateWhenBuilt;

    private final boolean isOnOffable;

    private final boolean isFullHealthFactory;

    private final boolean isFactoryHeadingTakeoff;

    private final boolean isReclaimable;

    private final boolean isCapturable;

    private final boolean isAbleToRestore;

    private final boolean isAbleToRepair;

    private final boolean isAbleToSelfRepair;

    private final boolean isAbleToReclaim;

    private final boolean isAbleToAttack;

    private final boolean isAbleToPatrol;

    private final boolean isAbleToFight;

    private final boolean isAbleToGuard;

    private final boolean isAbleToAssist;

    private final boolean isAssistable;

    private final boolean isAbleToRepeat;

    private final boolean isAbleToFireControl;

    private final int fireState;

    private final int moveState;

    private final float wingDrag;
    private final float wingAngle;

    private final float drag;

    private final float frontToSpeed;

    private final float speedToFront;

    private final float myGravity;

    private final float maxBank;

    private final float maxPitch;

    private final float turnRadius;

    private final float wantedHeight;

    private final float verticalSpeed;

    private final boolean isAbleToCrash;

    private final boolean isHoverAttack;

    private final boolean isAirStrafe;

    private final float dlHoverFactor;

    private final float maxAcceleration;

    private final float maxDeceleration;

    private final float maxAileron;

    private final float maxElevator;

    private final float maxRudder;

    private final Short[][] yardMap;

    private final int xSize;

    private final int zSize;

    private final int buildAngle;

    private final float loadingRadius;

    private final float unloadSpread;

    private final int transportCapacity;

    private final int transportSize;

    private final int minTransportSize;
    private final boolean isAirBase;

    private final boolean isFirePlatform;

    private final float transportMass;

    private final float minTransportMass;

    private final boolean isHoldSteady;

    private final boolean isReleaseHeld;

    private final boolean isNotTransportable;

    private final boolean isTransportByEnemy;

    private final int transportUnloadMethod;

    private final float fallSpeed;

    private final float unitFallSpeed;

    private final boolean isAbleToCloak;

    private final boolean isStartCloaked;

    private final float cloakCost;

    private final float cloakCostMoving;

    private final float decloakDistance;

    private final boolean isDecloakSpherical;

    private final boolean isDecloakOnFire;

    private final boolean isAbleToKamikaze;

    private final float kamikazeDist;

    private final boolean isTaringFacility;

    private final boolean canManualFire;

    private final boolean isNeedGeo;

    private final boolean isFeature;

    private final boolean isHideDamage;

    private final boolean isCommander;

    private final boolean isShowPlayerName;

    private final boolean isAbleToResurrect;
    private final boolean isAbleToCapture;

    private final int highTrajectoryType;

    private final int noChaseCategory;

    private final boolean isLeaveTracks;

    private final float trackWidth;

    private final float trackOffset;

    private final float trackStrength;

    private final float trackStretch;

    private final int trackType;

    private final boolean isAbleToDropFlare;

    private final float flareReloadTime;

    private final float flareEfficiency;

    private final float flareDelay;

    private final AIFloat3 flareDropVector;

    private final int flareTime;

    private final int flareSalvoSize;

    private final int flareSalvoDelay;

    private final boolean isAbleToLoopbackAttack;

    private final boolean isLevelGround;

    private final boolean isUseBuildingGroundDecal;

    private final int buildingDecalType;

    private final int buildingDecalSizeX;

    private final int buildingDecalSizeY;

    private final float buildingDecalDecaySpeed;

    private final float maxFuel;

    private final float refuelTime;

    private final float minAirBasePower;

    private final int maxThisUnit;
    private final UnitDef decoyDef;

    private final boolean isDontLand;

    private final WeaponDef shieldDef;

    private final WeaponDef stockpileDef;

    private final List<UnitDef> buildOptions;

    private final Map<String, String> customParams;

    private final List<WeaponMount> weaponMounts;

    private final MoveData moveData;

    private final FlankingBonus flankingBonus;

    public UnitDefFact( final int unitDefId, final float height, final float radius, final String name,
                        final String humanName, final String fileName, final int aiHint, final int cobId,
                        final int techLevel, final String gaia, final float metalUpkeep, final float energyUpkeep, final float metalMake, final float energyMake,
                        final float makesMetal, final float makesEnergy, final float metalCost, final float energyCost, final float extractsMetal, final float extractsEnergy,
                        final float metalExtractorRange, final float energyExtractorRange, final float windResourceGenerator,
                        final float tidalResourceGenerator, final float metalStorage, final float energyStorage, final boolean isSquareMetalExtractor, final boolean isSquareEnergyExtractor,
                        final float buildTime, final float autoHeal, final float idleAutoHeal, final int idleTime,
                        final float power, final float health, final int category, final float speed,
                        final float turnRate, final boolean isTurnInPlace, final float turnInPlaceDistance,
                        final float turnInPlaceSpeedLimit, final boolean isUpright, final boolean isCollide,
                        final float losRadius, final float airLosRadius, final float losHeight, final int radarRadius,
                        final int sonarRadius, final int jammerRadius, final int sonarJamRadius, final int seismicRadius,
                        final float seismicSignature, final boolean isStealth, final boolean isSonarStealth,
                        final boolean isBuildRange3D, final float buildDistance, final float buildSpeed,
                        final float reclaimSpeed, final float repairSpeed, final float maxRepairSpeed,
                        final float resurrectSpeed, final float captureSpeed, final float terraformSpeed,
                        final float mass, final boolean isPushResistant, final boolean isStrafeToAttack,
                        final float minCollisionSpeed, final float slideTolerance, final float maxSlope,
                        final float maxHeightDif, final float minWaterDepth, final float waterline,
                        final float maxWaterDepth, final float armoredMultiple, final int armorType,
                        final float maxWeaponRange, final String type, final String tooltip, final String wreckName,
                        final WeaponDef deathExplosion, final WeaponDef selfDExplosion, final String categoryString,
                        final boolean isAbleToSelfD, final int selfDCountdown, final boolean isAbleToSubmerge,
                        final boolean isAbleToFly, final boolean isAbleToMove, final boolean isAbleToHover,
                        final boolean isFloater, final boolean isBuilder, final boolean isActivateWhenBuilt,
                        final boolean isOnOffable, final boolean isFullHealthFactory,
                        final boolean isFactoryHeadingTakeoff, final boolean isReclaimable, final boolean isCapturable,
                        final boolean isAbleToRestore, final boolean isAbleToRepair, final boolean isAbleToSelfRepair,
                        final boolean isAbleToReclaim, final boolean isAbleToAttack, final boolean isAbleToPatrol,
                        final boolean isAbleToFight, final boolean isAbleToGuard, final boolean isAbleToAssist,
                        final boolean isAssistable, final boolean isAbleToRepeat, final boolean isAbleToFireControl,
                        final int fireState, final int moveState, final float wingDrag, final float wingAngle,
                        final float drag, final float frontToSpeed, final float speedToFront, final float myGravity,
                        final float maxBank, final float maxPitch, final float turnRadius, final float wantedHeight,
                        final float verticalSpeed, final boolean isAbleToCrash, final boolean isHoverAttack,
                        final boolean isAirStrafe, final float dlHoverFactor, final float maxAcceleration,
                        final float maxDeceleration, final float maxAileron, final float maxElevator,                        final float maxRudder, final Short[][] yardMap, final int xSize, final int zSize,
                        final int buildAngle, final float loadingRadius, final float unloadSpread,
                        final int transportCapacity, final int transportSize, final int minTransportSize,
                        final boolean isAirBase, final boolean isFirePlatform, final float transportMass,
                        final float minTransportMass, final boolean isHoldSteady, final boolean isReleaseHeld,
                        final boolean isNotTransportable, final boolean isTransportByEnemy,
                        final int transportUnloadMethod, final float fallSpeed, final float unitFallSpeed,
                        final boolean isAbleToCloak, final boolean isStartCloaked, final float cloakCost,
                        final float cloakCostMoving, final float decloakDistance, final boolean isDecloakSpherical,
                        final boolean isDecloakOnFire, final boolean isAbleToKamikaze, final float kamikazeDist,
                        final boolean isTaringFacility, final boolean canManualFire, final boolean isNeedGeo,
                        final boolean isFeature, final boolean isHideDamage, final boolean isCommander,
                        final boolean isShowPlayerName, final boolean isAbleToResurrect, final boolean isAbleToCapture,
                        final int highTrajectoryType, final int noChaseCategory, final boolean isLeaveTracks,
                        final float trackWidth, final float trackOffset, final float trackStrength,
                        final float trackStretch, final int trackType, final boolean isAbleToDropFlare,
                        final float flareReloadTime, final float flareEfficiency, final float flareDelay,
                        final AIFloat3 flareDropVector, final int flareTime, final int flareSalvoSize,
                        final int flareSalvoDelay, final boolean isAbleToLoopbackAttack, final boolean isLevelGround,
                        final boolean isUseBuildingGroundDecal, final int buildingDecalType, final int buildingDecalSizeX,
                        final int buildingDecalSizeY, final float buildingDecalDecaySpeed, final float maxFuel,
                        final float refuelTime, final float minAirBasePower, final int maxThisUnit, final UnitDef decoyDef,
                        final boolean isDontLand, final WeaponDef shieldDef, final WeaponDef stockpileDef,
                        final List<UnitDef> buildOptions, final Map<String, String> customParams,
                        final List<WeaponMount> weaponMounts, final MoveData moveData, final FlankingBonus flankingBonus) {
        this.unitDefId = unitDefId;
        this.height = height;
        this.radius = radius;
        this.name = name;
        this.humanName = humanName;
        this.fileName = fileName;
        this.aiHint = aiHint;
        this.cobId = cobId;
        this.techLevel = techLevel;
        this.gaia = gaia;
        this.metalUpkeep = metalUpkeep;
        this.energyUpkeep = energyUpkeep;
        this.metalMake = metalMake;
        this.energyMake = energyMake;
        this.makesMetal = makesMetal;
        this.makesEnergy = makesEnergy;
        this.metalCost = metalCost;
        this.energyCost = energyCost;
        this.extractsMetal = extractsMetal;
        this.extractsEnergy = extractsEnergy;
        this.metalExtractorRange = metalExtractorRange;
        this.energyExtractorRange = energyExtractorRange;
        this.windResourceGenerator = windResourceGenerator;
        this.tidalResourceGenerator = tidalResourceGenerator;
        this.metalStorage = metalStorage;
        this.energyStorage = energyStorage;
        this.isSquareMetalExtractor = isSquareMetalExtractor;
        this.isSquareEnergyExtractor = isSquareEnergyExtractor;
        this.buildTime = buildTime;
        this.autoHeal = autoHeal;
        this.idleAutoHeal = idleAutoHeal;        this.idleTime = idleTime;
        this.power = power;
        this.health = health;
        this.category = category;
        this.speed = speed;
        this.turnRate = turnRate;
        this.isTurnInPlace = isTurnInPlace;
        this.turnInPlaceDistance = turnInPlaceDistance;
        this.turnInPlaceSpeedLimit = turnInPlaceSpeedLimit;
        this.isUpright = isUpright;
        this.isCollide = isCollide;
        this.losRadius = losRadius;
        this.airLosRadius = airLosRadius;
        this.losHeight = losHeight;
        this.radarRadius = radarRadius;
        this.sonarRadius = sonarRadius;
        this.jammerRadius = jammerRadius;
        this.sonarJamRadius = sonarJamRadius;
        this.seismicRadius = seismicRadius;
        this.seismicSignature = seismicSignature;
        this.isStealth = isStealth;
        this.isSonarStealth = isSonarStealth;
        this.isBuildRange3D = isBuildRange3D;
        this.buildDistance = buildDistance;
        this.buildSpeed = buildSpeed;
        this.reclaimSpeed = reclaimSpeed;
        this.repairSpeed = repairSpeed;
        this.maxRepairSpeed = maxRepairSpeed;
        this.resurrectSpeed = resurrectSpeed;
        this.captureSpeed = captureSpeed;
        this.terraformSpeed = terraformSpeed;
        this.mass = mass;
        this.isPushResistant = isPushResistant;
        this.isStrafeToAttack = isStrafeToAttack;
        this.minCollisionSpeed = minCollisionSpeed;
        this.slideTolerance = slideTolerance;
        this.maxSlope = maxSlope;
        this.maxHeightDif = maxHeightDif;
        this.minWaterDepth = minWaterDepth;
        this.waterline = waterline;
        this.maxWaterDepth = maxWaterDepth;
        this.armoredMultiple = armoredMultiple;
        this.armorType = armorType;
        this.maxWeaponRange = maxWeaponRange;
        this.type = type;
        this.tooltip = tooltip;
        this.wreckName = wreckName;
        this.deathExplosion = deathExplosion;
        this.selfDExplosion = selfDExplosion;
        this.categoryString = categoryString;
        this.isAbleToSelfD = isAbleToSelfD;
        this.selfDCountdown = selfDCountdown;
        this.isAbleToSubmerge = isAbleToSubmerge;
        this.isAbleToFly = isAbleToFly;
        this.isAbleToMove = isAbleToMove;
        this.isAbleToHover = isAbleToHover;        this.isFloater = isFloater;
        this.isBuilder = isBuilder;
        this.isActivateWhenBuilt = isActivateWhenBuilt;
        this.isOnOffable = isOnOffable;
        this.isFullHealthFactory = isFullHealthFactory;
        this.isFactoryHeadingTakeoff = isFactoryHeadingTakeoff;
        this.isReclaimable = isReclaimable;
        this.isCapturable = isCapturable;
        this.isAbleToRestore = isAbleToRestore;
        this.isAbleToRepair = isAbleToRepair;
        this.isAbleToSelfRepair = isAbleToSelfRepair;
        this.isAbleToReclaim = isAbleToReclaim;
        this.isAbleToAttack = isAbleToAttack;
        this.isAbleToPatrol = isAbleToPatrol;
        this.isAbleToFight = isAbleToFight;
        this.isAbleToGuard = isAbleToGuard;
        this.isAbleToAssist = isAbleToAssist;
        this.isAssistable = isAssistable;
        this.isAbleToRepeat = isAbleToRepeat;
        this.isAbleToFireControl = isAbleToFireControl;
        this.fireState = fireState;
        this.moveState = moveState;
        this.wingDrag = wingDrag;
        this.wingAngle = wingAngle;
        this.drag = drag;
        this.frontToSpeed = frontToSpeed;
        this.speedToFront = speedToFront;
        this.myGravity = myGravity;
        this.maxBank = maxBank;
        this.maxPitch = maxPitch;
        this.turnRadius = turnRadius;
        this.wantedHeight = wantedHeight;
        this.verticalSpeed = verticalSpeed;
        this.isAbleToCrash = isAbleToCrash;
        this.isHoverAttack = isHoverAttack;
        this.isAirStrafe = isAirStrafe;
        this.dlHoverFactor = dlHoverFactor;
        this.maxAcceleration = maxAcceleration;
        this.maxDeceleration = maxDeceleration;
        this.maxAileron = maxAileron;
        this.maxElevator = maxElevator;
        this.maxRudder = maxRudder;
        this.yardMap = yardMap;
        this.xSize = xSize;
        this.zSize = zSize;
        this.buildAngle = buildAngle;
        this.loadingRadius = loadingRadius;
        this.unloadSpread = unloadSpread;
        this.transportCapacity = transportCapacity;
        this.transportSize = transportSize;
        this.minTransportSize = minTransportSize;
        this.isAirBase = isAirBase;
        this.isFirePlatform = isFirePlatform;
        this.transportMass = transportMass;
        this.minTransportMass = minTransportMass;        this.isHoldSteady = isHoldSteady;
        this.isReleaseHeld = isReleaseHeld;
        this.isNotTransportable = isNotTransportable;
        this.isTransportByEnemy = isTransportByEnemy;
        this.transportUnloadMethod = transportUnloadMethod;
        this.fallSpeed = fallSpeed;
        this.unitFallSpeed = unitFallSpeed;
        this.isAbleToCloak = isAbleToCloak;
        this.isStartCloaked = isStartCloaked;
        this.cloakCost = cloakCost;
        this.cloakCostMoving = cloakCostMoving;
        this.decloakDistance = decloakDistance;
        this.isDecloakSpherical = isDecloakSpherical;
        this.isDecloakOnFire = isDecloakOnFire;
        this.isAbleToKamikaze = isAbleToKamikaze;
        this.kamikazeDist = kamikazeDist;
        this.isTaringFacility = isTaringFacility;
        this.canManualFire = canManualFire;
        this.isNeedGeo = isNeedGeo;
        this.isFeature = isFeature;
        this.isHideDamage = isHideDamage;
        this.isCommander = isCommander;
        this.isShowPlayerName = isShowPlayerName;
        this.isAbleToResurrect = isAbleToResurrect;
        this.isAbleToCapture = isAbleToCapture;
        this.highTrajectoryType = highTrajectoryType;
        this.noChaseCategory = noChaseCategory;
        this.isLeaveTracks = isLeaveTracks;
        this.trackWidth = trackWidth;
        this.trackOffset = trackOffset;
        this.trackStrength = trackStrength;
        this.trackStretch = trackStretch;
        this.trackType = trackType;
        this.isAbleToDropFlare = isAbleToDropFlare;
        this.flareReloadTime = flareReloadTime;
        this.flareEfficiency = flareEfficiency;
        this.flareDelay = flareDelay;
        this.flareDropVector = flareDropVector;
        this.flareTime = flareTime;
        this.flareSalvoSize = flareSalvoSize;
        this.flareSalvoDelay = flareSalvoDelay;
        this.isAbleToLoopbackAttack = isAbleToLoopbackAttack;
        this.isLevelGround = isLevelGround;
        this.isUseBuildingGroundDecal = isUseBuildingGroundDecal;
        this.buildingDecalType = buildingDecalType;
        this.buildingDecalSizeX = buildingDecalSizeX;
        this.buildingDecalSizeY = buildingDecalSizeY;
        this.buildingDecalDecaySpeed = buildingDecalDecaySpeed;
        this.maxFuel = maxFuel;
        this.refuelTime = refuelTime;
        this.minAirBasePower = minAirBasePower;
        this.maxThisUnit = maxThisUnit;
        this.decoyDef = decoyDef;
        this.isDontLand = isDontLand;
        this.shieldDef = shieldDef;
        this.stockpileDef = stockpileDef;
        this.buildOptions = buildOptions;        this.customParams = customParams;
        this.weaponMounts = weaponMounts;
        this.moveData = moveData;
        this.flankingBonus = flankingBonus;
    }

    @Override
    public int getUnitDefId() {
        return unitDefId;
    }

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public float getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getHumanName() {
        return humanName;
    }

    @Override
    public String getFileName() {
        return fileName;
    }

    @Override
    public int getAiHint() {
        return aiHint;
    }

    @Override
    public int getCobId() {
        return cobId;
    }

    @Override
    public int getTechLevel() {
        return techLevel;
    }

    @Override
    public String getGaia() {
        return gaia;
    }
    @Override
    public float getMetalUpkeep() {
        return metalUpkeep;
    }

    @Override
    public float getEnergyUpkeep() {
        return energyUpkeep;
    }

    @Override
    public float getMetalMake() {
        return metalMake;
    }

    @Override
    public float getEnergyMake() {
        return energyMake;
    }

    @Override
    public float getMakesMetal() {
        return makesMetal;
    }

    @Override
    public float getMakesEnergy() {
        return makesEnergy;
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
    public float getExtractsMetal() {
        return extractsMetal;
    }

    @Override
    public float getExtractsEnergy() {
        return extractsEnergy;
    }

    @Override
    public float getMetalExtractorRange() {
        return metalExtractorRange;
    }
    @Override
    public float getEnergyExtractorRange() {
        return energyExtractorRange;
    }

    @Override
    public float getWindResourceGenerator() {
        return windResourceGenerator;
    }

    @Override
    public float getTidalResourceGenerator() {
        return tidalResourceGenerator;
    }

    @Override
    public float getMetalStorage() {
        return metalStorage;
    }

    @Override
    public float getEnergyStorage() {
        return energyStorage;
    }

    @Override
    public boolean isSquareMetalExtractor() {
        return isSquareMetalExtractor;
    }

    @Override
    public boolean isSquareEnergyExtractor() {
        return isSquareEnergyExtractor;
    }

    @Override
    public float getBuildTime() {
        return buildTime;
    }

    @Override
    public float getAutoHeal() {
        return autoHeal;
    }

    @Override
    public float getIdleAutoHeal() {
        return idleAutoHeal;
    }

    @Override
    public int getIdleTime() {
        return idleTime;
    }

    @Override
    public float getPower() {        return power;
    }

    @Override
    public float getHealth() {
        return health;
    }

    @Override
    public int getCategory() {
        return category;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getTurnRate() {
        return turnRate;
    }

    @Override
    public boolean isTurnInPlace() {
        return isTurnInPlace;
    }

    @Override
    public float getTurnInPlaceDistance() {
        return turnInPlaceDistance;
    }

    @Override
    public float getTurnInPlaceSpeedLimit() {
        return turnInPlaceSpeedLimit;
    }

    @Override
    public boolean isUpright() {
        return isUpright;
    }

    @Override
    public boolean isCollide() {
        return isCollide;
    }

    @Override
    public float getLosRadius() {
        return losRadius;
    }

    @Override
    public float getAirLosRadius() {
        return airLosRadius;
    }

    @Override
    public float getLosHeight() {
        return losHeight;
    }

    @Override
    public int getRadarRadius() {
        return radarRadius;
    }

    @Override
    public int getSonarRadius() {
        return sonarRadius;
    }

    @Override
    public int getJammerRadius() {
        return jammerRadius;
    }

    @Override
    public int getSonarJamRadius() {
        return sonarJamRadius;
    }

    @Override
    public int getSeismicRadius() {
        return seismicRadius;
    }

    @Override
    public float getSeismicSignature() {
        return seismicSignature;
    }

    @Override
    public boolean isStealth() {
        return isStealth;
    }

    @Override
    public boolean isSonarStealth() {
        return isSonarStealth;
    }

    @Override
    public boolean isBuildRange3D() {
        return isBuildRange3D;
    }

    @Override
    public float getBuildDistance() {
        return buildDistance;
    }
    @Override
    public float getBuildSpeed() {
        return buildSpeed;
    }

    @Override
    public float getReclaimSpeed() {
        return reclaimSpeed;
    }

    @Override
    public float getRepairSpeed() {
        return repairSpeed;
    }

    @Override
    public float getMaxRepairSpeed() {
        return maxRepairSpeed;
    }

    @Override
    public float getResurrectSpeed() {
        return resurrectSpeed;
    }

    @Override
    public float getCaptureSpeed() {
        return captureSpeed;
    }

    @Override
    public float getTerraformSpeed() {
        return terraformSpeed;
    }

    @Override
    public float getMass() {
        return mass;
    }

    @Override
    public boolean isPushResistant() {
        return isPushResistant;
    }

    @Override
    public boolean isStrafeToAttack() {
        return isStrafeToAttack;
    }

    @Override
    public float getMinCollisionSpeed() {
        return minCollisionSpeed;
    }
    @Override
    public float getSlideTolerance() {
        return slideTolerance;
    }

    @Override
    public float getMaxSlope() {
        return maxSlope;
    }

    @Override
    public float getMaxHeightDif() {
        return maxHeightDif;
    }

    @Override
    public float getMinWaterDepth() {
        return minWaterDepth;
    }

    @Override
    public float getWaterline() {
        return waterline;
    }

    @Override
    public float getMaxWaterDepth() {
        return maxWaterDepth;
    }

    @Override
    public float getArmoredMultiple() {
        return armoredMultiple;
    }

    @Override
    public int getArmorType() {
        return armorType;
    }

    @Override
    public float getMaxWeaponRange() {
        return maxWeaponRange;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getTooltip() {
        return tooltip;
    }
    @Override
    public String getWreckName() {
        return wreckName;
    }

    @Override
    public WeaponDef getDeathExplosion() {
        return deathExplosion;
    }

    @Override
    public WeaponDef getSelfDExplosion() {
        return selfDExplosion;
    }

    @Override
    public String getCategoryString() {
        return categoryString;
    }

    @Override
    public boolean isAbleToSelfD() {
        return isAbleToSelfD;
    }

    @Override
    public int getSelfDCountdown() {
        return selfDCountdown;
    }

    @Override
    public boolean isAbleToSubmerge() {
        return isAbleToSubmerge;
    }

    @Override
    public boolean isAbleToFly() {
        return isAbleToFly;
    }

    @Override
    public boolean isAbleToMove() {
        return isAbleToMove;
    }

    @Override
    public boolean isAbleToHover() {
        return isAbleToHover;
    }

    @Override
    public boolean isFloater() {
        return isFloater;
    }

    @Override
    public boolean isBuilder() {        return isBuilder;
    }

    @Override
    public boolean isActivateWhenBuilt() {
        return isActivateWhenBuilt;
    }

    @Override
    public boolean isOnOffable() {
        return isOnOffable;
    }

    @Override
    public boolean isFullHealthFactory() {
        return isFullHealthFactory;
    }

    @Override
    public boolean isFactoryHeadingTakeoff() {
        return isFactoryHeadingTakeoff;
    }

    @Override
    public boolean isReclaimable() {
        return isReclaimable;
    }

    @Override
    public boolean isCapturable() {
        return isCapturable;
    }

    @Override
    public boolean isAbleToRestore() {
        return isAbleToRestore;
    }

    @Override
    public boolean isAbleToRepair() {
        return isAbleToRepair;
    }

    @Override
    public boolean isAbleToSelfRepair() {
        return isAbleToSelfRepair;
    }

    @Override
    public boolean isAbleToReclaim() {
        return isAbleToReclaim;
    }

    @Override
    public boolean isAbleToAttack() {
        return isAbleToAttack;    }

    @Override
    public boolean isAbleToPatrol() {
        return isAbleToPatrol;
    }

    @Override
    public boolean isAbleToFight() {
        return isAbleToFight;
    }

    @Override
    public boolean isAbleToGuard() {
        return isAbleToGuard;
    }

    @Override
    public boolean isAbleToAssist() {
        return isAbleToAssist;
    }

    @Override
    public boolean isAssistable() {
        return isAssistable;
    }

    @Override
    public boolean isAbleToRepeat() {
        return isAbleToRepeat;
    }

    @Override
    public boolean isAbleToFireControl() {
        return isAbleToFireControl;
    }

    @Override
    public int getFireState() {
        return fireState;
    }

    @Override
    public int getMoveState() {
        return moveState;
    }

    @Override
    public float getWingDrag() {
        return wingDrag;
    }

    @Override
    public float getWingAngle() {
        return wingAngle;
    }
    @Override
    public float getDrag() {
        return drag;
    }

    @Override
    public float getFrontToSpeed() {
        return frontToSpeed;
    }

    @Override
    public float getSpeedToFront() {
        return speedToFront;
    }

    @Override
    public float getMyGravity() {
        return myGravity;
    }

    @Override
    public float getMaxBank() {
        return maxBank;
    }

    @Override
    public float getMaxPitch() {
        return maxPitch;
    }

    @Override
    public float getTurnRadius() {
        return turnRadius;
    }

    @Override
    public float getWantedHeight() {
        return wantedHeight;
    }

    @Override
    public float getVerticalSpeed() {
        return verticalSpeed;
    }

    @Override
    public boolean isAbleToCrash() {
        return isAbleToCrash;
    }

    @Override
    public boolean isHoverAttack() {
        return isHoverAttack;
    }
    @Override
    public boolean isAirStrafe() {
        return isAirStrafe;
    }

    @Override
    public float getDlHoverFactor() {
        return dlHoverFactor;
    }

    @Override
    public float getMaxAcceleration() {
        return maxAcceleration;
    }

    @Override
    public float getMaxDeceleration() {
        return maxDeceleration;
    }

    @Override
    public float getMaxAileron() {
        return maxAileron;
    }

    @Override
    public float getMaxElevator() {
        return maxElevator;
    }

    @Override
    public float getMaxRudder() {
        return maxRudder;
    }

    @Override
    public Short[][] getYardMap() {
        return yardMap;
    }

    @Override
    public int getxSize() {
        return xSize;
    }

    @Override
    public int getzSize() {
        return zSize;
    }

    @Override
    public int getBuildAngle() {
        return buildAngle;
    }
    @Override
    public float getLoadingRadius() {
        return loadingRadius;
    }

    @Override
    public float getUnloadSpread() {
        return unloadSpread;
    }

    @Override
    public int getTransportCapacity() {
        return transportCapacity;
    }

    @Override
    public int getTransportSize() {
        return transportSize;
    }

    @Override
    public int getMinTransportSize() {
        return minTransportSize;
    }

    @Override
    public boolean isAirBase() {
        return isAirBase;
    }

    @Override
    public boolean isFirePlatform() {
        return isFirePlatform;
    }

    @Override
    public float getTransportMass() {
        return transportMass;
    }

    @Override
    public float getMinTransportMass() {
        return minTransportMass;
    }

    @Override
    public boolean isHoldSteady() {
        return isHoldSteady;
    }

    @Override
    public boolean isReleaseHeld() {
        return isReleaseHeld;
    }
    @Override
    public boolean isNotTransportable() {
        return isNotTransportable;
    }

    @Override
    public boolean isTransportByEnemy() {
        return isTransportByEnemy;
    }

    @Override
    public int getTransportUnloadMethod() {
        return transportUnloadMethod;
    }

    @Override
    public float getFallSpeed() {
        return fallSpeed;
    }

    @Override
    public float getUnitFallSpeed() {
        return unitFallSpeed;
    }

    @Override
    public boolean isAbleToCloak() {
        return isAbleToCloak;
    }

    @Override
    public boolean isStartCloaked() {
        return isStartCloaked;
    }

    @Override
    public float getCloakCost() {
        return cloakCost;
    }

    @Override
    public float getCloakCostMoving() {
        return cloakCostMoving;
    }

    @Override
    public float getDecloakDistance() {
        return decloakDistance;
    }

    @Override
    public boolean isDecloakSpherical() {
        return isDecloakSpherical;
    }
    @Override
    public boolean isDecloakOnFire() {
        return isDecloakOnFire;
    }

    @Override
    public boolean isAbleToKamikaze() {
        return isAbleToKamikaze;
    }

    @Override
    public float getKamikazeDist() {
        return kamikazeDist;
    }

    @Override
    public boolean isTaringFacility() {
        return isTaringFacility;
    }

    @Override
    public boolean isCanManualFire() {
        return canManualFire;
    }

    @Override
    public boolean isNeedGeo() {
        return isNeedGeo;
    }

    @Override
    public boolean isFeature() {
        return isFeature;
    }

    @Override
    public boolean isHideDamage() {
        return isHideDamage;
    }

    @Override
    public boolean isCommander() {
        return isCommander;
    }

    @Override
    public boolean isShowPlayerName() {
        return isShowPlayerName;
    }

    @Override
    public boolean isAbleToResurrect() {
        return isAbleToResurrect;
    }

    @Override
    public boolean isAbleToCapture() {
        return isAbleToCapture;
    }
    @Override
    public int getHighTrajectoryType() {
        return highTrajectoryType;
    }

    @Override
    public int getNoChaseCategory() {
        return noChaseCategory;
    }

    @Override
    public boolean isLeaveTracks() {
        return isLeaveTracks;
    }

    @Override
    public float getTrackWidth() {
        return trackWidth;
    }

    @Override
    public float getTrackOffset() {
        return trackOffset;
    }

    @Override
    public float getTrackStrength() {
        return trackStrength;
    }

    @Override
    public float getTrackStretch() {
        return trackStretch;
    }

    @Override
    public int getTrackType() {
        return trackType;
    }

    @Override
    public boolean isAbleToDropFlare() {
        return isAbleToDropFlare;
    }

    @Override
    public float getFlareReloadTime() {
        return flareReloadTime;
    }

    @Override
    public float getFlareEfficiency() {
        return flareEfficiency;
    }
    @Override
    public float getFlareDelay() {
        return flareDelay;
    }

    @Override
    public AIFloat3 getFlareDropVector() {
        return flareDropVector;
    }

    @Override
    public int getFlareTime() {
        return flareTime;
    }

    @Override
    public int getFlareSalvoSize() {
        return flareSalvoSize;
    }

    @Override
    public int getFlareSalvoDelay() {
        return flareSalvoDelay;
    }

    @Override
    public boolean isAbleToLoopbackAttack() {
        return isAbleToLoopbackAttack;
    }

    @Override
    public boolean isLevelGround() {
        return isLevelGround;
    }

    @Override
    public boolean isUseBuildingGroundDecal() {
        return isUseBuildingGroundDecal;
    }

    @Override
    public int getBuildingDecalType() {
        return buildingDecalType;
    }

    @Override
    public int getBuildingDecalSizeX() {
        return buildingDecalSizeX;
    }

    @Override
    public int getBuildingDecalSizeY() {
        return buildingDecalSizeY;
    }
    @Override
    public float getBuildingDecalDecaySpeed() {
        return buildingDecalDecaySpeed;
    }

    @Override
    public float getMaxFuel() {
        return maxFuel;
    }

    @Override
    public float getRefuelTime() {
        return refuelTime;
    }

    @Override
    public float getMinAirBasePower() {
        return minAirBasePower;
    }

    @Override
    public int getMaxThisUnit() {
        return maxThisUnit;
    }

    @Override
    public UnitDef getDecoyDef() {
        return decoyDef;
    }

    @Override
    public boolean isDontLand() {
        return isDontLand;
    }

    @Override
    public WeaponDef getShieldDef() {
        return shieldDef;
    }

    @Override
    public WeaponDef getStockpileDef() {
        return stockpileDef;
    }

    @Override
    public List<UnitDef> getBuildOptions() {
        return buildOptions;
    }

    @Override
    public Map<String, String> getCustomParams() {
        return customParams;
    }
    @Override
    public List<WeaponMount> getWeaponMounts() {
        return weaponMounts;
    }

    @Override
    public MoveData getMoveData() {
        return moveData;
    }

    @Override
    public FlankingBonus getFlankingBonus() {
        return flankingBonus;
    }
}






























