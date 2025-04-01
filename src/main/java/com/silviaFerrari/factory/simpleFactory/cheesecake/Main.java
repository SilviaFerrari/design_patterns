package com.silviaFerrari.factory.simpleFactory.cheesecake;

public class Main {
    public static void main(String[] args) {
        CheesecakeFactory factory = new CheesecakeFactory();
        CheesecakeStore store = new CheesecakeStore(factory);

        store.orderCake("caramel");
        store.orderCake("chocolate");
        store.orderCake("oreo");
    }
}