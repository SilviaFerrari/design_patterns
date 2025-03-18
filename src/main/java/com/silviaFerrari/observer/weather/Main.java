package com.silviaFerrari.observer.weather;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Create two displays and register them as observers
        WeatherDisplay display1 = new WeatherDisplay("0001");
        WeatherDisplay display2 = new WeatherDisplay("0002");

        // creating now observers
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        // simulate changes in weather data
        weatherStation.setMeasurements(25.5f, 65.0f);
        weatherStation.setMeasurements(27.3f, 70.0f);

        // removing observers
        weatherStation.removeObserver(display1);
        weatherStation.removeObserver(display2);
    }
}
