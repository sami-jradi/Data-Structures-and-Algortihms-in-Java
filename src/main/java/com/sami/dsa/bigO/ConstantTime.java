package com.sami.dsa.bigO;

public class ConstantTime {

    public static void main(String[] args) {

        int[] boxes = {0, 1, 2, 3, 4, 5};
        logFirstTwoBoxes(boxes); // O(2)

    }

    public static void logFirstTwoBoxes(int[] boxes) {
        System.out.println(boxes[0]); // O(1)
        System.out.println(boxes[1]); // O(1)
    }
}
