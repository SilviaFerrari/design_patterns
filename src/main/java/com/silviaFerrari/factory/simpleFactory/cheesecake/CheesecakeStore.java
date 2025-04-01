package com.silviaFerrari.factory.simpleFactory.cheesecake;

public class CheesecakeStore {
    CheesecakeFactory factory;
    public CheesecakeStore(CheesecakeFactory factory) {
        this.factory = factory;
    }
    public Cheesecake orderCake(String type) {
        Cheesecake cake;
        cake = factory.createCake(type);
        cake.prepare();
        cake.bake();
        cake.cut();
        cake.box();
        return cake;
    }
}