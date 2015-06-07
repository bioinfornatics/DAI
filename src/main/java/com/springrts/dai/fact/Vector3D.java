package com.springrts.dai.fact;

public final class Vector3D implements IVector3D {
    private final float x;
    private final float y;
    private final float z;
    private final int   unitId;

    public Vector3D(final float x, final float y, final float z, final int unitId) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.unitId = unitId;
    }

    @Override
    public float getZ() {
        return z;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public int getUnitId() {
        return unitId;
    }

}
