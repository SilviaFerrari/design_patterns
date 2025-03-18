package com.silviaFerrari.observer.market;

public interface MarketSubject {
    public void registerObserver(StockObserver observer);
    public void removeObserver(StockObserver observer);
    public void notifyObservers(String stockSymbol, double stockPrice);
}
