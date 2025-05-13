package org.example;

public class Car extends Vehicle{

    private boolean isElectric;
    private boolean hasSunroof;

    public Car(String color, int fuelCapacity, float maxSpeed, float acceleration, float turnRate, int numberOfPassengers, int cargoCapacity, float traction, float durability, float height, float weight, boolean hasSunroof, boolean isElectric) {
        super(color, fuelCapacity, maxSpeed, acceleration, turnRate, numberOfPassengers, cargoCapacity, traction, durability, height, weight);
        this.hasSunroof = hasSunroof;
        this.isElectric = isElectric;
    }
}
