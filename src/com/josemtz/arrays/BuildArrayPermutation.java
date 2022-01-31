package com.josemtz.arrays;

import java.util.Arrays;

/**
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]]
 * for each 0 <= i < nums.length and return it.
 * <p>
 * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 */
public class BuildArrayPermutation {

    public int[] buildArray(int[] nums) {

        //check if empty
        if (nums.length < 1) {
            return nums;
        }

        //1. create new array
        int[] ans = new int[nums.length];

        //2. Iterate to get the values.
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}

