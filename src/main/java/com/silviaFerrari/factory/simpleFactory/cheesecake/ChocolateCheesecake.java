package com.silviaFerrari.factory.simpleFactory.cheesecake;

public class ChocolateCheesecake extends Cheesecake {
    @Override
    public void prepare() {
        System.out.println("Preparing chocolate cheesecake...");
    }

    @Override
    public void bake() {
        System.out.println("Baking chocolate cheesecake...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting chocolate cheesecake...");
    }

    @Override
    public void box() {
        System.out.println("Packing chocolate cheesecake...");
    }
}
