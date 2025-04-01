package com.silviaFerrari.strategy.sort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> n1 = Arrays.asList(5, 3, 2, 8, 1);
        List<Integer> n2 = Arrays.asList(5, 3, 2, 8, 1);

        // creating a new sorter with bubble sort implementation
        Sorter sorter = new Sorter(new BubbleSort());

        sorter.sortNumbers(n1);
        System.out.println(Arrays.toString(n1.toArray()));

        // switching to quick sort implementation
        sorter.setStrategy(new QuickSort());

        sorter.sortNumbers(n2);
        System.out.println(Arrays.toString(n2.toArray()));
    }
}