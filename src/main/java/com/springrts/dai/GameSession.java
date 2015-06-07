package com.springrts.dai;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.EntryPoint;

import java.util.Hashtable;

public class GameSession {

    private final KieSession                    kSession;
    private final Hashtable<String,EntryPoint>  entryPoints;

    private KieSession useKieSession(final String name) {
        KieServices     ks          = KieServices.Factory.get();
        KieContainer    kContainer  = ks.getKieClasspathContainer();
        KieSession      kSession    = kContainer.newKieSession( name );
        return kSession;
    }

    private GameSession(){
        kSession    = useKieSession("DAI");

        // used only to restrict entry point from point listed below
        entryPoints = new Hashtable<String,EntryPoint>();
        entryPoints.put( "update"           , kSession.getEntryPoint( "update" ) );
        entryPoints.put( "message"          , kSession.getEntryPoint( "message" ) );
        entryPoints.put( "unitFinished"     , kSession.getEntryPoint( "unitCreated" ) );
        entryPoints.put( "unitFinished"     , kSession.getEntryPoint( "unitFinished" ) );
        entryPoints.put( "unitIdle"         , kSession.getEntryPoint( "unitIdle" ) );
        entryPoints.put( "unitMoveFailed"   , kSession.getEntryPoint( "unitMoveFailed" ) );
        entryPoints.put( "unitDamaged"      , kSession.getEntryPoint( "unitDamaged" ) );
        entryPoints.put( "unitDestroyed"    , kSession.getEntryPoint( "unitDestroyed" ) );
        entryPoints.put( "unitGiven"        , kSession.getEntryPoint( "unitGiven" ) );
        entryPoints.put( "unitCaptured"     , kSession.getEntryPoint( "unitCaptured" ) );
        entryPoints.put( "enemyCreated"     , kSession.getEntryPoint( "enemyCreated" ) );
        entryPoints.put( "enemyFinished"    , kSession.getEntryPoint( "enemyFinished" ) );
        entryPoints.put( "enemyEnterLOS"    , kSession.getEntryPoint( "enemyEnterLOS" ) );
        entryPoints.put( "enemyLeaveLOS"    , kSession.getEntryPoint( "enemyLeaveLOS" ) );
        entryPoints.put( "enemyEnterRadar"  , kSession.getEntryPoint( "enemyEnterRadar" ) );
        entryPoints.put( "enemyLeaveRadar"  , kSession.getEntryPoint( "enemyLeaveRadar" ) );
        entryPoints.put( "enemyDamaged"     , kSession.getEntryPoint( "enemyDamaged" ) );
        entryPoints.put( "enemyDestroyed"   , kSession.getEntryPoint( "enemyDestroyed" ) );
        entryPoints.put( "weaponFired"      , kSession.getEntryPoint( "weaponFired" ) );
        entryPoints.put( "playerCommand"    , kSession.getEntryPoint( "playerCommand" ) );
        entryPoints.put( "commandFinished"  , kSession.getEntryPoint( "commandFinished" ) );
        entryPoints.put( "seismicPing"      , kSession.getEntryPoint( "seismicPing" ) );

        new Thread() {
            @Override
            public void run() {
                kSession.fireUntilHalt();
            }
        }.start();
    }

    private static class SingletonHolder
    {
        private final static GameSession instance = new GameSession();
    }

    public static GameSession getInstance()
    {
        return SingletonHolder.instance;
    }

    public void halt( ){
        kSession.halt();
        kSession.dispose();
    }

    public EntryPoint getEntryPoint( final String point ){
        return entryPoints.get( point );
    }

    public void insert( final Object o ){
        kSession.insert( o );
    }
}
