package com.sami.dsa.algorithms.sorting.quick_sort;

import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] array, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {

        int pivot = array[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {

            if (array[j] <= pivot) {

                i++;

                // swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        QuickSort qs = new QuickSort();

        int[] array = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        System.out.println(Arrays.toString(array));

        qs.quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array ---> " + Arrays.toString(array));
    }
}
