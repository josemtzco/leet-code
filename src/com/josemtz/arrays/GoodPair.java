package com.josemtz.arrays;

import java.util.HashMap;

/**
 * Given an array of integers nums, return the number of good pairs.
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */
public class GoodPair {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1, 1, 3};
        int ans = numIdenticalPairs(nums);

    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> handShake = new HashMap<>();

        int  ans = 0;

        for(int num: nums){
            int shakeCount = handShake.getOrDefault(num, 0);
            ans += shakeCount;
            handShake.put(num, shakeCount+1);
        }

        return ans;
    }

}
