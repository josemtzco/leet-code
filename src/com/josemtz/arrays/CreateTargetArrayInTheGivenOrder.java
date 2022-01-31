package com.josemtz.arrays;

import java.util.Arrays;

public class CreateTargetArrayInTheGivenOrder {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 4};
        int[] index = new int[]{0, 4, 1, 3, 2};

        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));

    }

    // edge cases
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        Arrays.fill(target, -1);

        //insert value to index
        for (int i = 0; i < nums.length; i++) {
            //If index is -1 means no value has been place meaning you can place a value there.
            if (target[index[i]] == -1) {
                target[index[i]] = nums[i];
            }else{
                //if value is not -1 means there is already one value there,
                // and we have to rotate all of them to the right to make space. so we can put ours in there.

            }

        }

        return target;

    }
}
