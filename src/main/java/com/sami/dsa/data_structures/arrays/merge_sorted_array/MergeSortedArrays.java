package com.sami.dsa.data_structures.arrays.merge_sorted_array;

import java.util.Arrays;

public class MergeSortedArrays {

    public int[] mergeSortedArrays(int[] array1, int[] array2) {

        int[] mergedArray = new int[array1.length + array2.length];

        int k = 0;

        for (int i : array1) {
            mergedArray[k] = i;
            k++;
        }

        for (int j : array2) {
            mergedArray[k] = j;
            k++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {

        int[] array1 = {0, 3, 4, 31};
        int[] array2 = {4, 6, 30};

        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

        System.out.println(Arrays.toString(mergeSortedArrays
                .mergeSortedArrays(array1, array2)));
    }
}
