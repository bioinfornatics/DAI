package com.springrts.dai;

import com.springrts.dai.event.*;
import com.springrts.dai.fact.*;
import com.springrts.dai.resource.ResourceManager;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.OOAI;
import com.springrts.ai.oo.clb.*;
import org.kie.api.runtime.rule.EntryPoint;

import java.util.Arrays;
import java.util.List;


public class DAI extends OOAI {

    private int                             skirmishAIId;
    private OOAICallback                    callback;
    private ResourceManager                 resourceManager;
    private GameSession                     gameSession;
    private int                             teamId;
    private int                             allyTeams;

    private static IUnitFact buildUnitFact(final Unit unit ){
        return new UnitFact(    unit.getUnitId(),       unit.getTeam(),         unit.getAllyTeam(),
                unit.getStockpile(),    unit.getStockpile(),    unit.getGroup(),
                unit.getMaxSpeed(),     unit.getSpeed(),        unit.getMaxRange(),
                unit.getMaxHealth(),    unit.getHealth(),       unit.isActivated(),
                unit.isBeingBuilt(),    unit.isCloaked(),       unit.isParalyzed(), unit.isNeutral(),
                unit.getDef().getUnitDefId() );
    }


    private  static IUnitDefFact buildUnitDefFact(final UnitDef def, final Resource metal, final Resource energy){
        final Short[][] yardmap = new Short[def.getXSize()][def.getZSize()];
        for( Short index = 0; index < def.getXSize(); index++) def.getYardMap(index).toArray(yardmap[index]);

        return new UnitDefFact(
                def.getUnitDefId(),                     def.getHeight(),
                def.getRadius(),                        def.getName(),
                def.getHumanName(),                     def.getFileName(),
                def.getAiHint(),                        def.getCobId(),
                def.getTechLevel(),                     def.getGaia(),
                def.getUpkeep( metal ),                 def.getUpkeep( energy ),
                def.getResourceMake( metal ),           def.getResourceMake( energy ),
                def.getMakesResource( metal ),          def.getMakesResource( energy ),
                def.getCost( metal ),                   def.getCost( energy ),
                def.getExtractsResource( metal ),       def.getExtractsResource( energy ),
                def.getResourceExtractorRange( metal ), def.getResourceExtractorRange( energy ),
                def.getWindResourceGenerator( energy ), def.getTidalResourceGenerator( energy ),
                def.getStorage( metal ),                def.getStorage( energy ),
                def.isSquareResourceExtractor( metal ), def.isSquareResourceExtractor( energy ),
                def.getBuildTime(),                     def.getAutoHeal(),
                def.getIdleAutoHeal(),                  def.getIdleTime(),
                def.getPower(),                         def.getHealth(),
                def.getCategory(),                      def.getSpeed(),
                def.getTurnRate(),                      def.isTurnInPlace(),
                def.getTurnInPlaceDistance(),
                def.getTurnInPlaceSpeedLimit(),         def.isUpright(),
                def.isCollide(),
                def.getLosRadius(),                     def.getAirLosRadius(),                def.getLosHeight(),                     def.getRadarRadius(),
                def.getSonarRadius(),                   def.getJammerRadius(),
                def.getSonarJamRadius(),                def.getSeismicRadius(),
                def.getSeismicSignature(),              def.isStealth(),
                def.isSonarStealth(),
                def.isBuildRange3D(),                   def.getBuildDistance(),
                def.getBuildSpeed(),
                def.getReclaimSpeed(),                  def.getRepairSpeed(),
                def.getMaxRepairSpeed(),
                def.getResurrectSpeed(),                def.getCaptureSpeed(),
                def.getTerraformSpeed(),
                def.getMass(),                          def.isPushResistant(),
                def.isStrafeToAttack(),
                def.getMinCollisionSpeed(),             def.getSlideTolerance(),
                def.getMaxSlope(),
                def.getMaxHeightDif(),                  def.getMinWaterDepth(),
                def.getWaterline(),
                def.getMaxWaterDepth(),                 def.getArmoredMultiple(),
                def.getArmorType(),
                def.getMaxWeaponRange(),                def.getType(),
                def.getTooltip(),                       def.getWreckName(),
                def.getDeathExplosion(),                def.getSelfDExplosion(),
                def.getCategoryString(),
                def.isAbleToSelfD(),                    def.getSelfDCountdown(),
                def.isAbleToSubmerge(),
                def.isAbleToFly(),                      def.isAbleToMove(),
                def.isAbleToHover(),
                def.isFloater(),                        def.isBuilder(),
                def.isActivateWhenBuilt(),
                def.isOnOffable(),                      def.isFullHealthFactory(),
                def.isFactoryHeadingTakeoff(),          def.isReclaimable(),
                def.isCapturable(),
                def.isAbleToRestore(),                  def.isAbleToRepair(),
                def.isAbleToSelfRepair(),
                def.isAbleToReclaim(),                  def.isAbleToAttack(),
                def.isAbleToPatrol(),
                def.isAbleToFight(),                    def.isAbleToGuard(),
                def.isAbleToAssist(),
                def.isAssistable(),                     def.isAbleToRepeat(),
                def.isAbleToFireControl(),
                def.getFireState(),                     def.getMoveState(),
                def.getWingDrag(),                      def.getWingAngle(),
                def.getDrag(),                          def.getFrontToSpeed(),
                def.getSpeedToFront(),                  def.getMyGravity(),
                def.getMaxBank(),                       def.getMaxPitch(),
                def.getTurnRadius(),                    def.getWantedHeight(),
                def.getVerticalSpeed(),                 def.isAbleToCrash(),
                def.isHoverAttack(),
                def.isAirStrafe(),                      def.getDlHoverFactor(),
                def.getMaxAcceleration(),
                def.getMaxDeceleration(),               def.getMaxAileron(),
                def.getMaxElevator(),
                def.getMaxRudder(),                     yardmap,
                def.getXSize(),                         def.getZSize(),
                def.getBuildAngle(),                    def.getLoadingRadius(),
                def.getUnloadSpread(),                def.getTransportCapacity(),             def.getTransportSize(),
                def.getMinTransportSize(),
                def.isAirBase(),                        def.isFirePlatform(),
                def.getTransportMass(),
                def.getMinTransportMass(),              def.isHoldSteady(),
                def.isReleaseHeld(),
                def.isNotTransportable(),               def.isTransportByEnemy(),
                def.getTransportUnloadMethod(),         def.getFallSpeed(),
                def.getUnitFallSpeed(),
                def.isAbleToCloak(),                    def.isStartCloaked(),
                def.getCloakCost(),
                def.getCloakCostMoving(),               def.getDecloakDistance(),
                def.isDecloakSpherical(),
                def.isDecloakOnFire(),                  def.isAbleToKamikaze(),
                def.getKamikazeDist(),
                def.isTargetingFacility(),              def.canManualFire(),
                def.isNeedGeo(),
                def.isFeature(),                        def.isHideDamage(),
                def.isCommander(),
                def.isShowPlayerName(),                 def.isAbleToResurrect(),
                def.isAbleToCapture(),
                def.getHighTrajectoryType(),            def.getNoChaseCategory(),
                def.isLeaveTracks(),
                def.getTrackWidth(),                    def.getTrackOffset(),
                def.getTrackStrength(),
                def.getTrackStretch(),                  def.getTrackType(),
                def.isAbleToDropFlare(),
                def.getFlareReloadTime(),               def.getFlareEfficiency(),
                def.getFlareDelay(),
                def.getFlareDropVector(),               def.getFlareTime(),
                def.getFlareSalvoSize(),
                def.getFlareSalvoDelay(),               def.isAbleToLoopbackAttack(),
                def.isLevelGround(),
                def.isUseBuildingGroundDecal(),         def.getBuildingDecalType(),
                def.getBuildingDecalSizeX(),
                def.getBuildingDecalSizeY(),            def.getBuildingDecalDecaySpeed(),
                def.getMaxFuel(),
                def.getRefuelTime(),                    def.getMinAirBasePower(),
                def.getMaxThisUnit(),                   def.getDecoyDef(),
                def.isDontLand(),                       def.getShieldDef(),
                def.getStockpileDef(),
                def.getBuildOptions(),                  def.getCustomParams(),
                def.getWeaponMounts(),                  def.getMoveData(),
                def.getFlankingBonus()
                                );
    }


    private  static IWeaponDefFact buildWeaponDefFact(final WeaponDef weaponDef, final Resource metal, final Resource energy) {

        return new WeaponDefFact(   weaponDef.getWeaponDefId(),             weaponDef.getName(),                    weaponDef.getType(),
                                    weaponDef.getDescription(),             weaponDef.getFileName(),                weaponDef.getCegTag(),
                                    weaponDef.getRange(),                   weaponDef.getHeightMod(),               weaponDef.getAccuracy(),
                                    weaponDef.getSprayAngle(),              weaponDef.getMovingAccuracy(),          weaponDef.getTargetMoveError(),
                                    weaponDef.getLeadLimit(),               weaponDef.getLeadBonus(),               weaponDef.getPredictBoost(),
                                    weaponDef.getNumDamageTypes(),          weaponDef.getAreaOfEffect(),            weaponDef.isNoSelfDamage(),                                    weaponDef.getFireStarter(),             weaponDef.getEdgeEffectiveness(),       weaponDef.getSize(),
                                    weaponDef.getSizeGrowth(),              weaponDef.getCollisionSize(),           weaponDef.getSalvoSize(),
                                    weaponDef.getSalvoDelay(),              weaponDef.getReload(),                  weaponDef.getBeamTime(),
                                    weaponDef.isBeamBurst(),                weaponDef.isWaterBounce(),              weaponDef.isGroundBounce(),
                                    weaponDef.getBounceRebound(),           weaponDef.getBounceSlip(),              weaponDef.getNumBounce(),
                                    weaponDef.getMaxAngle(),                weaponDef.getUpTime(),                  weaponDef.getFlightTime(),
                                    weaponDef.getCost(metal),             weaponDef.getCost(energy),            weaponDef.getProjectilesPerShot(),
                                    weaponDef.isTurret(),                   weaponDef.isOnlyForward(),              weaponDef.isFixedLauncher(),
                                    weaponDef.isWaterWeapon(),              weaponDef.isFireSubmersed(),            weaponDef.isSubMissile(),
                                    weaponDef.isTracks(),                   weaponDef.isDropped(),                  weaponDef.isParalyzer(),
                                    weaponDef.isImpactOnly(),               weaponDef.isNoAutoTarget(),             weaponDef.isManualFire(),
                                    weaponDef.getInterceptor(),             weaponDef.getTargetable(),              weaponDef.isStockpileable(),
                                    weaponDef.getCoverageRange(),           weaponDef.getStockpileTime(),           weaponDef.getIntensity(),
                                    weaponDef.getThickness(),               weaponDef.getLaserFlareSize(),          weaponDef.getCoreThickness(),
                                    weaponDef.getDuration(),                weaponDef.getLodDistance(),             weaponDef.getFalloffRate(),
                                    weaponDef.getGraphicsType(),            weaponDef.isSoundTrigger(),             weaponDef.isSelfExplode(),
                                    weaponDef.isGravityAffected(),          weaponDef.getHighTrajectory(),          weaponDef.getMyGravity(),
                                    weaponDef.isNoExplode(),                weaponDef.getStartVelocity(),           weaponDef.getWeaponAcceleration(),
                                    weaponDef.getTurnRate(),                weaponDef.getMaxVelocity(),             weaponDef.getProjectileSpeed(),
                                    weaponDef.getExplosionSpeed(),          weaponDef.getOnlyTargetCategory(),      weaponDef.getWobble(),
                                    weaponDef.getDance(),                   weaponDef.getTrajectoryHeight(),        weaponDef.isLargeBeamLaser(),
                                    weaponDef.isShield(),                   weaponDef.isShieldRepulser(),           weaponDef.isSmartShield(),
                                    weaponDef.isExteriorShield(),           weaponDef.isVisibleShield(),            weaponDef.isVisibleShieldRepulse(),
                                    weaponDef.getVisibleShieldHitFrames(),  weaponDef.getInterceptedByShieldType(), weaponDef.isAvoidFriendly(),
                                    weaponDef.isAvoidFeature(),             weaponDef.isAvoidNeutral(),             weaponDef.getTargetBorder(),
                                    weaponDef.getMinIntensity(),            weaponDef.getHeightBoostFactor(),       weaponDef.getProximityPriority(),
                                    weaponDef.getCollisionFlags(),          weaponDef.isSweepFire(),                weaponDef.isAbleToAttackGround(),
                                    weaponDef.getDynDamageExp(),            weaponDef.getDynDamageMin(),            weaponDef.getDynDamageRange(),
                                    weaponDef.isDynDamageInverted());
    }


    private static IShieldFact buildShieldFact( final Shield shield, final Resource metal, final Resource energy ) {

        return new ShieldFact(  shield.getWeaponDefId(),    shield.getResourceUse( metal ), shield.getResourceUse( energy),
                                shield.getRadius(),         shield.getMaxSpeed(),           shield.getPowerRegen(),
                                shield.getInterceptType() );
    }


    private static IDamageFact buildDamageFact( final Damage damage ){

        return new DamageFact(  damage.getWeaponDefId(),    damage.getParalyzeDamageTime(), damage.getImpulseFactor(),
                                damage.getImpulseBoost(),   damage.getCraterMult(),         damage.getTypes() );
    }


    private static IWeaponMountFact buildWeaponMountFact( final WeaponMount weaponMount ){
        return new WeaponMountFact( weaponMount.getUnitDefId(), weaponMount.getWeaponMountId(),     weaponMount.getName(),
                                    weaponMount.getFuelUsage(), weaponMount.getBadTargetCategory(), weaponMount.getOnlyTargetCategory());
    }


    private static List<Object> getWeaponShieldDamageFact( final WeaponDef weaponDef, final Resource metal, final Resource energy ){
        final Object[] results = {
                                    buildWeaponDefFact(weaponDef, metal, energy),
                                    buildShieldFact(weaponDef.getShield(), metal, energy),
                                    buildDamageFact( weaponDef.getDamage() )
                                 };
        return Arrays.asList(results);
    }


    public DAI() {
        super();
    }


    @Override
    public int init( final int skirmishAIId, final OOAICallback callback) {
        int error           = 0;
        this.skirmishAIId   = skirmishAIId;
        this.callback       = callback;
        this.gameSession    = gameSession.getInstance();
        this.resourceManager= new ResourceManager( skirmishAIId, callback );
        this.teamId         = callback.getSkirmishAI().getTeamId();
        this.allyTeams      = callback.getGame().getMyAllyTeam();
        gameSession.insert( new AIPlayer( teamId, allyTeams, skirmishAIId ) );

        callback.getUnitDefs()
                .stream()
                //.parallelStream()
                .forEach((unitDef) -> gameSession.insert(buildUnitDefFact(unitDef, callback.getResourceByName("Metal"), callback.getResourceByName("Energy"))));

        callback.getWeaponDefs()
                .stream()
                //.parallelStream()
                .forEach((weaponDef)    -> getWeaponShieldDamageFact(weaponDef, callback.getResourceByName("Metal"), callback.getResourceByName("Energy"))
                        .forEach((obj)  -> gameSession.insert(obj)));

        callback.getUnitDefs()
                .stream()
                //.parallelStream()
                .filter((weaponDef)     -> weaponDef.getWeaponMounts().size() > 0)
                .forEach((weaponDef)    -> weaponDef.getWeaponMounts()
                        .parallelStream()
                        .forEach((weaponMount) -> gameSession.insert(buildWeaponMountFact(weaponMount)) ) );

        return error;
    }

    @Override
    public int release( final int reason ) {
        int error = 0;        return error;
    }

    @Override
    public int update( final int frame ) {
        int error = 0;
        if (frame % 300 == 0) {
            gameSession.halt( );
            this.allyTeams = callback.getGame().getMyAllyTeam();
            EntryPoint  entryPoint = gameSession.getEntryPoint( "update" );
            entryPoint.insert( new AIPlayer( teamId, allyTeams, skirmishAIId ) );
            entryPoint.insert( resourceManager.getResources() );
        }
        return error;
    }

    @Override
    public int message( final int player, final String message ) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "message" );
        entryPoint.insert( new Message( player, message ) );
        return error;
    }

    @Override
    public int luaMessage( final String inData ) {
        int error = 0;
        return error;
    }

    @Override
    public int unitCreated( final Unit unit, final Unit builder ) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "unitCreated" );
        entryPoint.insert( new UnitCreated( buildUnitFact(unit), buildUnitFact(builder)) );
        entryPoint.insert( new Vector3D( unit.getPos().x, unit.getPos().y, unit.getPos().z, unit.getUnitId() ) );
        entryPoint.insert( unit );
        return error;
    }

    @Override
    public int unitFinished( final Unit unit ) {
        int         error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint("unitFinished");
        entryPoint.insert( buildUnitFact( unit ) );
        entryPoint.insert( new Vector3D( unit.getPos().x, unit.getPos().y, unit.getPos().z, unit.getUnitId() ) );
        entryPoint.insert( unit );
        return error;
    }

    @Override
    public int unitIdle( final Unit unit ) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "unitIdle" );
        entryPoint.insert( buildUnitFact( unit ) );
        entryPoint.insert( new Vector3D( unit.getPos().x, unit.getPos().y, unit.getPos().z, unit.getUnitId() ) );        return error;
    }

    @Override
    public int unitMoveFailed( final Unit unit ) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "unitMoveFailed" );
        entryPoint.insert( buildUnitFact(unit) );
        entryPoint.insert( new Vector3D( unit.getPos().x, unit.getPos().y, unit.getPos().z, unit.getUnitId() ) );
        return error;
    }

    @Override
    public int unitDamaged( final Unit unit,  final Unit attacker, final  float damage, final  AIFloat3 dir, final  WeaponDef weaponDef, final  boolean paralyzer) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "unitDamaged" );
        entryPoint.insert( new UnitDamaged( buildUnitFact(unit), buildUnitFact(attacker), damage, dir, weaponDef, paralyzer) );
        entryPoint.insert( new Vector3D( unit.getPos().x, unit.getPos().y, unit.getPos().z, unit.getUnitId() ) );
        return error;
    }

    @Override
    public int unitDestroyed( final Unit unit, final Unit attacker) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "unitDestroyed" );
        entryPoint.insert( new UnitDestroyed( buildUnitFact(unit),  buildUnitFact(attacker) ) );
        entryPoint.insert( new Vector3D( unit.getPos().x, unit.getPos().y, unit.getPos().z, unit.getUnitId() ) );
        return error;
    }

    @Override
    public int unitGiven( final Unit unit, final int oldTeamId, final int newTeamId) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint("unitGiven");
        entryPoint.insert( new UnitGiven( buildUnitFact(unit), oldTeamId, newTeamId) );
        entryPoint.insert( new Vector3D( unit.getPos().x, unit.getPos().y, unit.getPos().z, unit.getUnitId() ) );
        return error;
    }

    @Override
    public int unitCaptured( final Unit unit, final int oldTeamId, final int newTeamId) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "unitCaptured" );
        entryPoint.insert( new UnitCaptured( buildUnitFact(unit), oldTeamId, newTeamId) );
        entryPoint.insert( new Vector3D( unit.getPos().x, unit.getPos().y, unit.getPos().z, unit.getUnitId() ) );
        return error;
    }

    @Override    public int enemyCreated( final Unit enemy) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "enemyCreated" );
        entryPoint.insert( buildUnitFact(enemy) );
        entryPoint.insert( new Vector3D( enemy.getPos().x, enemy.getPos().y, enemy.getPos().z, enemy.getUnitId() ) );
        entryPoint.insert( enemy );
        return error;
    }

    @Override
    public int enemyFinished( final Unit enemy ) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "enemyFinished" );
        entryPoint.insert( buildUnitFact(enemy) );
        entryPoint.insert( new Vector3D( enemy.getPos().x, enemy.getPos().y, enemy.getPos().z, enemy.getUnitId() ) );
        return error;
    }

    @Override
    public int enemyEnterLOS( final Unit enemy) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "enemyEnterLOS" );
        entryPoint.insert( buildUnitFact(enemy) );
        entryPoint.insert( new Vector3D( enemy.getPos().x, enemy.getPos().y, enemy.getPos().z, enemy.getUnitId() ) );
        return error;
    }

    @Override
    public int enemyLeaveLOS( final Unit enemy) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "enemyLeaveLOS" );
        entryPoint.insert( buildUnitFact(enemy) );
        return error;
    }

    @Override
    public int enemyEnterRadar( final Unit enemy) {
        EntryPoint  entryPoint = gameSession.getEntryPoint( "enemyEnterRadar" );
        entryPoint.insert( buildUnitFact(enemy) );
        entryPoint.insert( new Vector3D( enemy.getPos().x, enemy.getPos().y, enemy.getPos().z, enemy.getUnitId() ) );
        int error = 0;
        return error;
    }

    @Override
    public int enemyLeaveRadar( final Unit enemy) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "enemyLeaveRadar" );
        entryPoint.insert( buildUnitFact(enemy) );
        entryPoint.insert( new Vector3D( enemy.getPos().x, enemy.getPos().y, enemy.getPos().z, enemy.getUnitId() ) );
        return error;
    }

    @Override
    public int enemyDamaged( final Unit enemy, final Unit attacker, final float damage, final AIFloat3 dir, final WeaponDef weaponDef, final boolean paralyzer) {
        int error = 0;        EntryPoint  entryPoint = gameSession.getEntryPoint( "enemyDamaged" );
        entryPoint.insert( new UnitDamaged( buildUnitFact(enemy), buildUnitFact(attacker), damage, dir, weaponDef, paralyzer)  );
        entryPoint.insert( new Vector3D( enemy.getPos().x, enemy.getPos().y, enemy.getPos().z, enemy.getUnitId() ) );
        return error;
    }

    @Override
    public int enemyDestroyed( final Unit enemy, final Unit attacker) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "enemyDestroyed" );
        entryPoint.insert( new UnitDestroyed( buildUnitFact(enemy), buildUnitFact(attacker)) );
        entryPoint.insert( new Vector3D( enemy.getPos().x, enemy.getPos().y, enemy.getPos().z, enemy.getUnitId() ) );
        return error;
    }

    @Override
    public int weaponFired( final Unit unit, final WeaponDef weaponDef) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "weaponFired" );
        entryPoint.insert( new WeaponFired( buildUnitFact(unit), weaponDef ) );
        entryPoint.insert( new Vector3D( unit.getPos().x, unit.getPos().y, unit.getPos().z, unit.getUnitId() ) );
        return error;
    }

    @Override
    public int playerCommand( final List<Unit> units, final int commandTopicId, final int playerId) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "playerCommand" );
        entryPoint.insert( new PlayerCommand( units, commandTopicId, playerId) );
        return error;
    }

    @Override
    public int commandFinished( final Unit unit, final int commandId, final int commandTopicId) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "commandFinished" );
        entryPoint.insert( new CommandFinished( buildUnitFact(unit), commandId, commandTopicId) );
        return error;
    }

    @Override
    public int seismicPing( final AIFloat3 pos, final float strength) {
        int error = 0;
        EntryPoint  entryPoint = gameSession.getEntryPoint( "seismicPing" );
        entryPoint.insert( new SeismicPing( pos,strength ) );
        return error;
    }

    @Override
    public int load( final String file) {
        int error = 0;
        // TODO
        return error;
    }

    @Override    public int save( final String file) {
        int error = 0;
        // TODO
        return error;
    }
}









