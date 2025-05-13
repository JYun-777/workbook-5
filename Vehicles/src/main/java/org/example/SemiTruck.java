package org.example;

public class SemiTruck extends Vehicle{

    private boolean trailerAttached = false;

    public boolean isTrailerAttached() {
        return trailerAttached;
    }

    public void setTrailerAttached(boolean trailerAttached) {
        this.trailerAttached = trailerAttached;
    }
}
