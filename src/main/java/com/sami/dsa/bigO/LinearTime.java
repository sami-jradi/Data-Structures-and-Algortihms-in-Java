package com.sami.dsa.bigO;

public class LinearTime {

    public static void main(String[] args) {

        String[] nemo = {"nemo"};
        String[] array = {"Sami", "Jradi", "Nemo"};

        findNemo(array); // bigO notation of O(n) --> Linear time

    }

    public static void findNemo(String[] array) {

        long startTime = System.currentTimeMillis();

        for (String s : array) {
            if (s.equals("nemo")) {
                System.out.println("Found Nemo!");
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time elapsed to run the program is: " + (endTime - startTime) + " milliseconds");
    }

}
