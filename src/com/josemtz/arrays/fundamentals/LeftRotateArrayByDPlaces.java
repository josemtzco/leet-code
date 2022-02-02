package com.josemtz.arrays.fundamentals;

import java.util.Arrays;

public class LeftRotateArrayByDPlaces {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 4;

        reverse(arr, k, arr.length-1);
        reverse(arr, k, k-1);
        reverse(arr, k, arr.length-1);


        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
