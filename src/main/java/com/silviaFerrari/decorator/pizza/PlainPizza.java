package com.silviaFerrari.decorator.pizza;

// concrete component
public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getPrice() {
        return 5.00;
    }
}