package com.josemtz.arrays;

import java.util.Arrays;

public class NumberAreSmallerThanTheCurrent {

    public static void main(String[] args) {
        int[] nums = new int[]{8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int ansIndex = 0;
        int amountOfSmallerNumbers = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(j != i && nums[j] < nums[i]){
                    amountOfSmallerNumbers++;
                }
            }
            ans[ansIndex++] = amountOfSmallerNumbers;
            amountOfSmallerNumbers = 0;
        }

        return ans;
    }
}
