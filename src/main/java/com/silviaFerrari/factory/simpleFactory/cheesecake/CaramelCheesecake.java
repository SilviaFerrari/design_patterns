package com.silviaFerrari.factory.simpleFactory.cheesecake;

public class CaramelCheesecake extends Cheesecake {
    @Override
    public void prepare() {
        System.out.println("Preparing caramel cheesecake...");
    }

    @Override
    public void bake() {
        System.out.println("Baking caramel cheesecake...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting caramel cheesecake...");
    }

    @Override
    public void box() {
        System.out.println("Packing caramel cheesecake...");
    }
}