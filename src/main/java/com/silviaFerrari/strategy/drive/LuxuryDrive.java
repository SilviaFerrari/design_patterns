package com.silviaFerrari.strategy.drive;

// concrete strategy
public class LuxuryDrive implements Drive {
    @Override
    public void drive() {
        System.out.println("Luxury drive mode is on!");
    }
}
