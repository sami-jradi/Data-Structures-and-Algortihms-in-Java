package com.sami.dsa.dynamic_programming.dynamic_fibonacci;

import java.util.HashMap;

public class DynamicFibonacci {

    static HashMap<Integer, Integer> cache = new HashMap<>();

    public int fibonacciDynamic(int n) {

        if (cache.containsKey(n)) {
            return cache.get(n);

        } else {

            if (n < 2) {
                return n;

            } else {

                cache.put(n, fibonacciDynamic(n - 1) + fibonacciDynamic(n - 2));
                return cache.get(n);
            }
        }
    }

    public static void main(String[] args) {
        DynamicFibonacci df = new DynamicFibonacci();

        System.out.println(df.fibonacciDynamic(10));
    }
}
