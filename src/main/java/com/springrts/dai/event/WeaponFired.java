package com.springrts.dai.event;

import com.springrts.dai.fact.IUnitFact;
import com.springrts.ai.oo.clb.WeaponDef;

public class WeaponFired implements IWeaponFired {
    private final IUnitFact unit;
    private final WeaponDef weaponDef;

    public WeaponFired( final IUnitFact unit, final WeaponDef weaponDef) {
        this.unit       = unit;
        this.weaponDef   = weaponDef;
    }

    @Override
    public IUnitFact getUnit() {
        return unit;
    }

    @Override
    public WeaponDef getWeaponDef() {
        return weaponDef;
    }
}
