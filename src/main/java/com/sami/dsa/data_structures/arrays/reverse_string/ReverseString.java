package com.sami.dsa.data_structures.arrays.reverse_string;

public class ReverseString {

    public String reverseString(String string) {
        char[] array = string.toCharArray();
        String newString = "";
        for (int i = 0; i < array.length; i++) {
            char c = array[(array.length - 1) - i];
            newString = newString + c;
        }

        return newString;
    }

    public String reverseString2(String string) {
        String newString = "";

        for (int i = 0; i < string.length(); i++) {
            newString += string.charAt((string.length() - 1) - i);
        }

        return newString;
    }

    public String reverseString3(String string) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            newString.append(string.charAt((string.length() - 1) - i));
        }

        return newString.toString();
    }

    public static void main(String[] args) {

        String string = "apple";

        ReverseString reverseString = new ReverseString();

        System.out.println(reverseString.reverseString(string));
        System.out.println(reverseString.reverseString2(string));
        System.out.println(reverseString.reverseString3(string));

    }
}
