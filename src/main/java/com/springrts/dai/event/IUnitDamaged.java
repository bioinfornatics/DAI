package com.springrts.dai.event;

import com.springrts.dai.fact.IUnitFact;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.WeaponDef;

public interface IUnitDamaged {
    IUnitFact getUnit();

    IUnitFact getAttacker();

    float getDamage();

    AIFloat3 getDir();

    WeaponDef getWeaponDef();

    boolean isParalyzer();
}
