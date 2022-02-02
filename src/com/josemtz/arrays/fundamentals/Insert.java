package com.josemtz.arrays.fundamentals;

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int inputValue = 12;
        int position = 1;

        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = inputValue;

        System.out.println(Arrays.toString(arr));

    }
}
