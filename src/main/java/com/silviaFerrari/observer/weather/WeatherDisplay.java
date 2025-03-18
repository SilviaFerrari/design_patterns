package com.silviaFerrari.observer.weather;

import java.util.Observable;

public class WeatherDisplay implements Observer {
    private String id;
    private float temperature;
    private float humidity;

    public WeatherDisplay(String id) {
        this.id = id;
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("UPDATE on display " + id + "! Current conditions: " + temperature + "C degrees and " + humidity + "% humidity");
    }
}
