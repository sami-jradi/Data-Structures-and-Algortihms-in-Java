package com.sami.dsa.dynamic_programming.memoization;

import java.util.HashMap;

public class Memoization {

    public int addTo80(int n) {
        System.out.println("long time");
        return n + 80;
    }

    static HashMap<Integer, Integer> cache = new HashMap<>();

    public int memoizedAddTo80(int n) {
        // once cached it won't have to add everytime the finction is called

        if (!cache.containsKey(n)) {
            System.out.println("long time");
            cache.put(n, n + 80);
        }

        return cache.get(n);
    }

    public static void main(String[] args) {
        Memoization memoization = new Memoization();

//        System.out.println(memoization.addTo80(5));

        System.out.println(memoization.memoizedAddTo80(5));
        System.out.println(memoization.memoizedAddTo80(5));
        System.out.println(memoization.memoizedAddTo80(5));
    }
}
