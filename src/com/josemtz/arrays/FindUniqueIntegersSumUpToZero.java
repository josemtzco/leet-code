package com.josemtz.arrays;

import java.util.Arrays;

public class FindUniqueIntegersSumUpToZero {

    public static void main(String[] args) {
        int n = 999;

        System.out.println(Arrays.toString(sumZero(n)));
    }


    static int[] sumZero(int n) {
        if (n == 1) {
            return new int[]{0};
        }
        if(n == 2 ){
            return new int[]{-1, 1};
        }

        int[] output = new int[n];
        int currentSum = 0;
        if (n % 2 != 0) {
            output[0] = 0;

            for (int i = 1; i < output.length - 1; i++) {
                output[i] = i;
                currentSum += i;
            }
            output[output.length - 1] = (currentSum * -1);

            return output;
        }else{
            for (int i = 0; i < output.length - 1; i++) {
                output[i] = i;
                currentSum += i;
            }
            output[output.length - 1] = (currentSum * -1);
            return output;
        }
    }

}
