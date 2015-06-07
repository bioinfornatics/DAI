package com.springrts.dai.event;

import com.springrts.dai.fact.IUnitFact;
import com.springrts.ai.oo.clb.WeaponDef;

public interface IWeaponFired {
    IUnitFact getUnit();

    WeaponDef getWeaponDef();
}
