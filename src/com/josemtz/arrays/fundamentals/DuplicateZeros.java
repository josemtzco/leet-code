package com.josemtz.arrays.fundamentals;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] nums = new int[]{1,0,2,3,0,4,5,0};

        for(int i = 0; i< nums.length-1; i++){
            if(nums[i] == 0){
                for(int j = nums.length-1; j > i; j--){
                    nums[j] = nums[j-1];
                }
                nums[i+1] = nums[i++];
            }
        }
    }


}
