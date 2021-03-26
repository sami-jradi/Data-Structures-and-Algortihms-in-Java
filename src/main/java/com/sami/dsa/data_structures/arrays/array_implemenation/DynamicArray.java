package com.sami.dsa.data_structures.arrays.array_implemenation;

/*
Implementation of a dynamic array structure
 */

import java.util.Arrays;

public class DynamicArray {

    // we will store our elements in this array
    private String[] array;

    private int capacity;

    private int currentLength;

    public DynamicArray() {
        this.array = new String[1];
        this.capacity = 1;
        this.currentLength = 0;
    }

    /**
     * This method is to get the element at index of an array
     *
     * @param index
     * @return element at the index
     */
    public String get(int index) {
        if (index > -1 && index < currentLength) {
            return this.array[index];
        } else {
            return "Index is out of bounds";
        }
    }

    public void push(String string) {

        // if currentLength become equal to capacity then we need to increase the capacity to add more elements
        if (currentLength == capacity) {

            // create a new array with double capacity
            String[] tempArray = new String[2 * capacity];

            // copy elements of old array to new array
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }

            // set newly created array as our new real array
            array = tempArray;

            // update the value of capacity
            capacity *= 2;
        }

        // insert the new element at the end
        array[currentLength] = string;

        // update the value of currentLength by 1
        currentLength++;
    }

    /**
     * Replaces value at given index with newly entered value
     *
     * @param index
     * @param value
     */
    public void replace(int index, String value) {

        if (index > -1 && index < currentLength) {
            array[index] = value;
        } else {
            System.err.println("Index is out of bounds!");
        }

    }

    /**
     * Removes last element
     */
    public void pop() {
        if (currentLength > 0) {
            currentLength--;
        }
    }

    /**
     * Adds a new element at the beginning of an array
     *
     * @param value
     * @return the new array with the added element at the beginning
     */
    public String[] shift(String value) {
        // create temporary array with an increased length of one
        String[] tempArray = new String[currentLength + 1];

        // assign new value to array
        tempArray[0] = value;

        // add element of our original array to the new array
        System.arraycopy(array, 0, tempArray, 1, array.length);

        this.array = tempArray;

        return this.array;
    }

    /**
     * deletes item in array at given index
     *
     * @param index
     */
    public void delete(int index) {
        if (index > -1 && index < currentLength) {
            if (index == currentLength - 1) {
                pop();
            } else {
                for (int i = index; i < currentLength; i++) {
                    if ((i + 1) < currentLength) {
                        array[i] = array[i + 1];
                    }
                }
                currentLength--;
            }
        } else {
            System.err.println("Index is out of bounds");
        }
    }

    /**
     * @return the array
     */
    public String[] getArray() {
        String[] tempArray = new String[currentLength];
        for (int i = 0; i < currentLength; i++) {
            tempArray[i] = array[i];
        }
        return tempArray;
    }

    /**
     * returns the length of array{Number of elements stored in the array}
     *
     * @return currentLength
     */
    public int getCurrentLength() {
        return currentLength;
    }

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.push("apple");
        dynamicArray.push("ball");
        dynamicArray.push("cat");
        dynamicArray.push("dog");

        dynamicArray.shift("banana");

        dynamicArray.pop();
        dynamicArray.delete(2);

        System.out.println(Arrays.toString(dynamicArray.getArray()));
        System.out.println(dynamicArray.getCurrentLength());
    }
}
