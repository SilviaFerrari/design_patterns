package com.silviaFerrari.strategy.sort;

import java.util.List;
import java.util.Collections;

public class QuickSort implements SortingStrategy{
    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Using quick sort...");
        if (numbers == null || numbers.size() <= 1) {
            return;
        }
        quickSort(numbers, 0, numbers.size() - 1);
    }

    private void quickSort(List<Integer> numbers, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(numbers, low, high);
            quickSort(numbers, low, pivotIndex - 1);
            quickSort(numbers, pivotIndex + 1, high);
        }
    }

    private int partition(List<Integer> numbers, int low, int high) {
        int pivot = numbers.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (numbers.get(j) <= pivot) {
                i++;
                Collections.swap(numbers, i, j);
            }
        }
        Collections.swap(numbers, i + 1, high);
        return i + 1;
    }
}
