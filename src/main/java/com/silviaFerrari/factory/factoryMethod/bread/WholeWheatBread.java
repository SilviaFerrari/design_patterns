package com.silviaFerrari.factory.factoryMethod.bread;

public class WholeWheatBread implements Bread {
    @Override
    public void prepare() {
        System.out.println("Preparing whole wheat bread...");
    }

    @Override
    public void bake() {
        System.out.println("Baking whole wheat bread...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting whole wheat bread...");
    }

    @Override
    public void box() {
        System.out.println("Packing whole wheat bread...");
    }
}
