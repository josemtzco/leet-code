package com.josemtz.arrays;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddArrayToFormInteger {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 0, 0};
        List<Integer> answer = addToArrayForm(nums, 34);
        System.out.println("Answer : " + answer.toString());
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) {

            int n = num[i];
            int sum = n + k;
            int rem = sum % 10;
            ans.add(0, rem);
            k = sum / 10;

        }

        while (k > 0) {
            ans.add(0, k % 10);
            k /= 10;
        }
        return ans;
    }
}
