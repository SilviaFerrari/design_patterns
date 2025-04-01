package com.silviaFerrari.strategy.drive;

// concrete strategy
public class SportsDrive implements Drive {
    @Override
    public void drive() {
        System.out.println("Sports drive mode is on!");
    }
}