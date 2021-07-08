package com.sami.dsa.algorithms.sorting.selection_sort;

import java.util.Arrays;

public class SelectionSort {

    public void selectionSort(int[] array) {

        int length = array.length;

        for (int i = 0; i < length; i++) {

            int smallest = array[i];
            int indexOfSmallest = i;

            for (int j = i; j < length; j++) {
                if (array[j] < array[indexOfSmallest]) {
                    indexOfSmallest = j;
                }
            }

            array[i] = array[indexOfSmallest];
            array[indexOfSmallest] = smallest;
        }

    }

    public static void main(String[] args) {

        SelectionSort ss = new SelectionSort();

        int[] array = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        System.out.println(Arrays.toString(array));

        ss.selectionSort(array);

        System.out.println(Arrays.toString(array));

    }
}
