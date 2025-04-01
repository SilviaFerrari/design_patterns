package com.silviaFerrari.factory.simpleFactory.cheesecake;

public class CheesecakeFactory {
    public Cheesecake createCake(String type) {
        Cheesecake cake = null;

        if (type.equals("caramel")) {
            cake = new CaramelCheesecake();
        } else if (type.equals("chocolate")) {
            cake = new ChocolateCheesecake();
        } else if (type.equals("oreo")) {
            cake = new OreoCheesecake();
        }
        return cake;
    }
}