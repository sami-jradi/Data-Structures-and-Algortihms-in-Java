package com.sami.dsa.bigO;

public class QuadraticTime {
    public static void main(String[] args) {

        String[] boxes = {"a", "b", "c", "d", "e", "f"};

        logAllPairsOfArray(boxes); // O(n)*O(n) = O(n^2)

    }

    public static void logAllPairsOfArray(String[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
}
