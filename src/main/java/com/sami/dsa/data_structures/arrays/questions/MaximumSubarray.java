package com.sami.dsa.data_structures.arrays.questions;

/*
Given an integer array nums,
 find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 */


public class MaximumSubarray {

    // using Kadane's algorithm O(n)
    public int findMaxSubarray(int[] nums) {

        int n = nums.length;
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 0; i < n; i++) {

            if (maxEndingHere + nums[i] < nums[i]) {
                maxEndingHere = nums[i];
            } else {
                maxEndingHere += nums[i];
            }

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }

        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println(maximumSubarray.findMaxSubarray(nums));
    }
}
