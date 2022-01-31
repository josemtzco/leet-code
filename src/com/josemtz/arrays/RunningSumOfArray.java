package com.josemtz.arrays;

import java.util.Arrays;

public class RunningSumOfArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] runningSum(int[] nums) {
        //edge case
        if(nums == null){
            return new int[]{0};
        }

        //edge case
        if(nums.length < 1){
            return  nums;
        }

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }

        return nums;
    }

}
