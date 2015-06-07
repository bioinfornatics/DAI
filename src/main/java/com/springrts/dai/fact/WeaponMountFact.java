package com.springrts.dai.fact;

public final class WeaponMountFact implements IWeaponMountFact {
    private final int unitDefId;
    private final int weaponMountId;
    private final String name;
    private final float fuelUsage;
    private final int badTargetCategory;
    private final int onlyTargetCategory;

    public WeaponMountFact(final int unitDefId, final int weaponMountId, final String name, final float fuelUsage, final int badTargetCategory, final int onlyTargetCategory) {
        this.unitDefId = unitDefId;
        this.weaponMountId = weaponMountId;
        this.name = name;
        this.fuelUsage = fuelUsage;
        this.badTargetCategory = badTargetCategory;
        this.onlyTargetCategory = onlyTargetCategory;
    }

    @Override
    public int getUnitDefId() {
        return unitDefId;
    }

    @Override
    public int getWeaponMountId() {
        return weaponMountId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getFuelUsage() {
        return fuelUsage;
    }

    @Override
    public int getBadTargetCategory() {
        return badTargetCategory;
    }

    @Override
    public int getOnlyTargetCategory() {
        return onlyTargetCategory;
    }
}
