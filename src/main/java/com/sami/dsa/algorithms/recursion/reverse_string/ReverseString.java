package com.sami.dsa.algorithms.recursion.reverse_string;

public class ReverseString {

    public String reverseIterative(String input) {

        char[] chars = input.toCharArray();
        char[] reversed = new char[input.length()];

        int n = input.length() - 1;

        for (int i = n; i >= 0; i--) {

            reversed[n - i] = chars[i];
        }

        return new String(reversed);
    }

    public String reverseRecursive(String input) {

        if (input.equals("")) {
            return "";
        }

        return reverseRecursive(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();

        System.out.println(reverseString.reverseIterative("algorithms"));

        System.out.println(reverseString.reverseRecursive("sami"));
    }
}
