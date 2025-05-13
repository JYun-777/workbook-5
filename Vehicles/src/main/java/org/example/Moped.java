package org.example;

public class Moped extends Vehicle{


    private float tilt = 0;
    private boolean hasStorage;

    public float getTilt() {
        return tilt;
    }

    public void setTilt(float tilt) {
        this.tilt = tilt;
    }

    public boolean isHasStorage() {
        return hasStorage;
    }

    public void setHasStorage(boolean hasStorage) {
        this.hasStorage = hasStorage;
    }
}
