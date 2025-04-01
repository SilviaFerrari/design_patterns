package com.silviaFerrari.factory.simpleFactory.cheesecake;

public class OreoCheesecake extends Cheesecake {
    @Override
    public void prepare() {
        System.out.println("Preparing oreo cheesecake...");
    }

    @Override
    public void bake() {
        System.out.println("Baking oreo cheesecake...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting oreo cheesecake...");
    }

    @Override
    public void box() {
        System.out.println("Packing oreo cheesecake...");
    }
}
