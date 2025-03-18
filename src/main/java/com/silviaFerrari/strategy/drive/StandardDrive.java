package com.silviaFerrari.strategy;

public class StandardDrive implements Drive{
    @Override
    public void drive() {
        System.out.println("Standard drive mode is on!");
    }
}