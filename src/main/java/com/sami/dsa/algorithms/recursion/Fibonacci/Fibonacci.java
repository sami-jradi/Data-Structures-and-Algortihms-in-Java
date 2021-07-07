package com.sami.dsa.algorithms.recursion.Fibonacci;

// Given a number N return the index value of the Fibonacci sequence,
// where the sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...

// the pattern of the sequence is that each value is the sum of the
// 2 previous values, that means that for N=5 → 2+3

import java.util.ArrayList;

public class Fibonacci {

    public int fibonacciRecursive(int n) { // O(2^N)

        if (n < 2) {
            return n;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public int fibonacciIterative(int n) { // O(n)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        for (int i = 2; i <= n; i++) {
            list.add(list.get(i - 2) + list.get(i - 1));
        }

        return list.get(n);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        System.out.println(fibonacci.fibonacciRecursive(8));

        System.out.println(fibonacci.fibonacciIterative(8));
    }
}
