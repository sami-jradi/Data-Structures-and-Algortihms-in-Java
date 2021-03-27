package com.sami.dsa.data_structures.arrays.questions;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */


import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] getTwoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] getTwoSum2(int[] nums, int target) {

        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            } else {
                numMap.put(nums[i], i);
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 11, 7, 15};
        int target = 9;

        TwoSum twoSum = new TwoSum();

        System.out.println(Arrays.toString(twoSum.getTwoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum.getTwoSum2(nums, target)));
    }
}


