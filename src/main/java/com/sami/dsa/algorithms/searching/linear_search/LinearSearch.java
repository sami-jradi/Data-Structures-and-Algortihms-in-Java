package com.sami.dsa.algorithms.searching.linear_search;

public class LinearSearch {

    public int linearSearch(int[] arr, int key) {
        // if key found return it's index, else return -1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();

        int[] arr = {12, 45, 69, 78, 89, 54};

        int answer = ls.linearSearch(arr, 69);
        System.out.println(answer);
    }

}
