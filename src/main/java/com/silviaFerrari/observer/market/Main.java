package com.silviaFerrari.observer.market;

public class Main {
    public static void main(String[] args) {
        // creating concrete subject
        StockMarket stockMarket = new StockMarket();

        // creating concrete observer
        StockObserver investor1 = new Investor("Alice");
        StockObserver investor2 = new Investor("Bob");

        // adding new observer to the subject
        stockMarket.registerObserver(investor1);
        stockMarket.registerObserver(investor2);

        // making some changes
        stockMarket.setStockPrice("INFY", 1250.0); // Both investors receive updates
        stockMarket.setStockPrice("TCS", 2500.0); // Both investors receive updates

        // removing the first observer
        stockMarket.removeObserver(investor1);

        // making some changes
        stockMarket.setStockPrice("WIPRO", 700.0); // Only investor2 receives the update
    }
}
