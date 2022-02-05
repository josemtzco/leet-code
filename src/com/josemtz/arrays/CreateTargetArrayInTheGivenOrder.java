package com.josemtz.arrays;

import java.util.Arrays;

public class CreateTargetArrayInTheGivenOrder {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 4};
        int[] index = new int[]{0, 1, 2, 2, 1};

        //expected Output: [0,4,1,3,2]

        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));

    }

    // edge cases
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] results = new int[nums.length];
        Arrays.fill(results, -1);

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            int targetIndex = index[i];
            //rotate to right by one base on fetched index.
            if (results[targetIndex] == -1) {
                results[targetIndex] = currentValue;
            } else {
                for (int j = nums.length - 1; j > targetIndex; j--) {
                    results[j] = results[j-1];
                }
                results[targetIndex] = currentValue;
            }
        }
        return results;
    }
}
