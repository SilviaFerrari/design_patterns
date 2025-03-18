package com.silviaFerrari.strategy.drive;

public class Main {
    public static void main(String[] args) {
        Vehicle limousine = new LuxuryVehicle(new LuxuryDrive());
        limousine.drive();

        Vehicle audi = new SportsVehicle(new SportsDrive());
        audi.drive();

        Vehicle captur = new StandardVehicle(new StandardDrive());
        captur.drive();
    }
}
