package com.silviaFerrari.strategy.sort;

import java.util.List;

// concrete strategy
public class BubbleSort implements SortingStrategy{
    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Using bubble sort...");
        for (int i = 0; i < numbers.size()-1; i++)
        {
            for(int j = 0; j < numbers.size()-i-1; j++)
            {
                if(numbers.get(j) > numbers.get(j + 1))
                {
                    int tempVar = numbers.get(j + 1);
                    numbers.set(j + 1, numbers.get(j));
                    numbers.set(j, tempVar);
                }
            }
        }
    }
}