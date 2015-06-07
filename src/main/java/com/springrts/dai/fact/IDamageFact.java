package com.springrts.dai.fact;

import java.util.List;


public interface IDamageFact {
    int getWeaponDefId();

    int getParalyzeDamageTime();

    float getImpulseFactor();

    float getImpulseBoost();

    float getCraterMult();

    List<Float> getTypes();
}
