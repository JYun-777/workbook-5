package org.example;

public class Vehicle {

    private String color;

    private int fuelCapacity;
    private float maxSpeed;
    private float acceleration;
    private float turnRate;

    private int numberOfPassengers;
    private int cargoCapacity;

    private float traction;
    private float durability;
    private float height;
    private float weight;


    public Vehicle(){

    }

    public Vehicle(String color, int fuelCapacity, float maxSpeed, float acceleration, float turnRate, int numberOfPassengers, int cargoCapacity, float traction, float durability, float height, float weight) {
        this.color = color;
        this.fuelCapacity = fuelCapacity;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.turnRate = turnRate;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.traction = traction;
        this.durability = durability;
        this.height = height;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public float getTurnRate() {
        return turnRate;
    }

    public void setTurnRate(float turnRate) {
        this.turnRate = turnRate;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public float getTraction() {
        return traction;
    }

    public void setTraction(float traction) {
        this.traction = traction;
    }

    public float getDurability() {
        return durability;
    }

    public void setDurability(float durability) {
        this.durability = durability;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
