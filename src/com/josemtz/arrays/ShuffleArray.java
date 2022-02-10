package com.josemtz.arrays;

import java.util.Arrays;

public class ShuffleArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 11, 12, 13, 14};
        int n = nums.length / 2;

        int[] ans = shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = nums.clone();

        int ansIndex = 0;
        for (int i = 0; i < n; i++) {
            ans[ansIndex] = nums[i];
            ans[ansIndex + 1] = nums[i + n];
            ansIndex = 2 + ansIndex;
        }
        return ans;
    }
}
