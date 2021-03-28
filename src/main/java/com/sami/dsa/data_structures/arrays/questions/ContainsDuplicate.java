package com.sami.dsa.data_structures.arrays.questions;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> tmp = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (tmp.contains(nums[i])) {
                return true;
            }

            tmp.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        System.out.println(containsDuplicate.containsDuplicate(nums));

    }
}
