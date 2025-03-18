package com.silviaFerrari.strategy.drive;
/*
* CONTEXT
* definisce la strategy interface e continee
* tutte le funzionalità di base di un veicolo
*/
public abstract class Vehicle {
    Drive driveMode;

    public Vehicle(Drive driveMode) {
        this.driveMode = driveMode;
    }

    public void drive() {
        driveMode.drive();
    }
}