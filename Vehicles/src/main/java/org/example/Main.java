package org.example;

public class Main {
    public static void main(String[] args) {

        HoverCraft newHC = new HoverCraft();
        newHC.setColor("blue");
        newHC.setAcceleration(30);
        newHC.setMaxSpeed(90);
        newHC.setFuelCapacity(50);
        System.out.println(newHC.getFuelCapacity());

        SemiTruck bigHog = new SemiTruck();
        bigHog.setWeight(1000f);
        System.out.println(bigHog.getWeight());
        System.out.println(bigHog.isTrailerAttached());

        Moped scoot = new Moped();
        System.out.println(scoot.getTilt());
    }
}