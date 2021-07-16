package com.sami.dsa.algorithms.searching.binary_search;

public class BinarySearch {

    public String binarySearch(int[] array, int key) {

        int first = 0;

        int last = array.length - 1;

        int mid = (first + last) / 2;

        while (first <= last) {

            if (array[mid] < key) {
                first = mid + 1;
            } else if (array[mid] == key) {
                return "Element found at index: " + mid;
            } else {
                last = mid - 1;
            }

            mid = (first + last) / 2;
        }
        return "Element not found!";
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        // make sure your array is sorted. Binary-Search works on sorted array.
        int[] array = {10,25,32,45,55,68};
        String result = bs.binarySearch(array,55);
        System.out.println(result);
        String result2 = bs.binarySearch(array,100);
        System.out.println(result2);
    }

}
