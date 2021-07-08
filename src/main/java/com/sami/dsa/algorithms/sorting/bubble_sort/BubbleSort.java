package com.sami.dsa.algorithms.sorting.bubble_sort;

import java.util.Arrays;

public class BubbleSort {

    public void bubbleSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap numbers
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();

        int[] array = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        System.out.println(Arrays.toString(array));

        bs.bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }
}
