package com.josemtz.arrays.fundamentals;


import java.util.Arrays;

public class Deletion {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};

        int k = removeElement(nums, 3);
        System.out.println("Arrays out : " + Arrays.toString(nums) + "New Size: " + k);

    }


    public static int removeElement (int[] nums, int val) {
        int l = nums.length;

        for (int i=0; i<l; i++) {

            if (nums[i] == val) {
                int lengthMinusOne = nums[l - 1];
                int currentValue = nums[i];
                nums[i] = nums[l - 1];
                i--;
                l--;
            }
        }
        return l;
    }



}
