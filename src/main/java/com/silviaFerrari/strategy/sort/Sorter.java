package com.silviaFerrari.strategy.sort;

import java.util.List;

// context
public class Sorter {
    SortingStrategy strategy;

    public Sorter(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    /* allows us to change the implementation of the strategy
    without having to create a new instance of the class */
    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortNumbers(List<Integer> numbers) {
        strategy.sort(numbers);
    }
}