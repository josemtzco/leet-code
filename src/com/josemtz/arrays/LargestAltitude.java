package com.josemtz.arrays;

public class LargestAltitude {

    public static void main(String[] args) {
        int[] gain = new int[]{52,-91,72};
        int maxAltitute = largestAltitude(gain);
        System.out.println(maxAltitute);
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}
