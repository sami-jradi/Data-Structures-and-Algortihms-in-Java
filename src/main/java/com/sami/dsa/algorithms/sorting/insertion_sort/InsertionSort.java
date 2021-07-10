package com.sami.dsa.algorithms.sorting.insertion_sort;

import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] array) {

        int length = array.length;

        for (int i = 0; i < length; i++) {

            int smallest = i;

            for (int j = i; j < length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }

            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;

        }

    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();

        int[] array = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        System.out.println(Arrays.toString(array));

        is.insertionSort(array);

        System.out.println(Arrays.toString(array));
    }
}
