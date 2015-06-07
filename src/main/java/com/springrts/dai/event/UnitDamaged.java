package com.springrts.dai.event;

import com.springrts.dai.fact.IUnitFact;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.WeaponDef;

public class UnitDamaged implements IUnitDamaged {
    private final IUnitFact unit;
    private final IUnitFact attacker;
    private final float     damage;
    private final AIFloat3  dir;
    private final WeaponDef weaponDef;
    private final boolean   paralyzer;

    public UnitDamaged(final IUnitFact unit, final IUnitFact attacker, final float damage, final AIFloat3 dir, final WeaponDef weaponDef,final  boolean paralyzer) {
        this.unit       = unit;
        this.attacker   = attacker;
        this.damage     = damage;
        this.dir        = dir;
        this.weaponDef  = weaponDef;
        this.paralyzer  = paralyzer;
    }

    @Override
    public IUnitFact getUnit() {
        return unit;
    }

    @Override
    public IUnitFact getAttacker() {
        return attacker;
    }

    @Override
    public float getDamage() {
        return damage;
    }

    @Override
    public AIFloat3 getDir() {
        return dir;
    }

    @Override
    public WeaponDef getWeaponDef() {
        return weaponDef;
    }

    @Override
    public boolean isParalyzer() {
        return paralyzer;
    }
}
