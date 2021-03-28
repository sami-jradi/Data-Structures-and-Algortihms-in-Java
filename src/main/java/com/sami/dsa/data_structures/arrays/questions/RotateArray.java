package com.sami.dsa.data_structures.arrays.questions;

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.
 */

import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        int start = n - k;
        int[] tmp = new int[start];

        for (int i = 0; i < start; i++) {

            tmp[i] = nums[i];

            if (i + start < n) {
                nums[i] = nums[i + start];
            }
        }

        for (int j = k; j < n; j++) {

            nums[j] = tmp[j - k];
        }
    }

    public void rotate2(int[] nums, int k) {

        int[] tmp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            tmp[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = tmp[i];
        }

    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate2(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}
