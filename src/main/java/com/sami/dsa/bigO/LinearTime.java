package com.sami.dsa.bigO;

public class LinearTime {

    public static void main(String[] args) {

        String[] nemo = {"Nemo"};
        String[] array = {"Sami", "Jradi", "Nemo", "Sami", "Sami", "Sami"};

        findNemo(array); // bigO notation of O(n) --> Linear time

    }

    public static void findNemo(String[] array) {

        long startTime = System.currentTimeMillis();

        for (String s : array) {
            System.out.println("Running");
            if (s.equals("Nemo")) {
                System.out.println("Found Nemo!");
                break;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time elapsed to run the program is: " + (endTime - startTime) + " milliseconds");
    }

}
