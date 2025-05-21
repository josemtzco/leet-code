package com.josemtz.arrays.linearsearch;

public class SumOfTwoNumer {
    /**
     * Given an array of integers nums and an integer target, return indices of the
     * two numbers in the array
     * such that they add up to target. You may assume that each input would have
     * exactly one solution,
     * and you may not use the same element twice.
     */
    public int[] twoSum(int[] nums, int target) {
        // Edge case - if array is null or has less than 2 elements
        if (nums == null || nums.length < 2) {
            return new int[] {};
        }

        // Check each pair of numbers
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        // No solution found
        return new int[] {};
    }

    public static void main(String[] args) {
        SumOfTwoNumer solution = new SumOfTwoNumer();

        // Test case
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
