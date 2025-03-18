package com.silviaFerrari.observer.market;

public interface StockObserver {
    void update(String stockSymbol, double stockPrice);
}
