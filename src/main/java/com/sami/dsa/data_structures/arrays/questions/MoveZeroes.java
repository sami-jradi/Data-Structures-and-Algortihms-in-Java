package com.sami.dsa.data_structures.arrays.questions;

/*
Given an integer array nums,
move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 */

import java.util.Arrays;

public class MoveZeroes {

    public void moveAllZeroes(int[] nums) {
        int n = nums.length;

        int i = 0;
        int j = 0;

        // fill nums array with non-zeroes
        while (i < n) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }

        // next stepp is to append the zeroes to the end of the array
        while (j < n) {
            nums[j] = 0;
            j++;
        }

    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveAllZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
