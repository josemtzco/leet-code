package com.josemtz.arrays;

import java.util.Arrays;

public class FindNumberWithEvenDigits {

    public static void main(String[] args) {
        int[] nums = new int[]{12, 345, 2, 6, 7896};
        int numsOfEvenNumber = findEvenNum(nums);
        System.out.println(numsOfEvenNumber);
    }

    public static int findEvenNum(int[] nums) {
        int oddNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            if(countDigit(nums[i]) % 2 == 0){
                oddNumbers++;
            }
        }
        return oddNumbers;
    }

    public static int countDigit(long n) {
        long modulo = n / 10;
        if (modulo == 0)
            return 1;
        return 1 + countDigit(modulo);
    }
}
