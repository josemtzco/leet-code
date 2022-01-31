package com.josemtz.arrays;

/**
 * Given an integer array nums of length n,
 * you want to create an array ans of length 2n
 * where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * <p>
 * Specifically, ans is the concatenation of two nums arrays.
 * <p>
 * Return the array ans.
 *
 *
 */
public class ConcatenationOfArray {
    /**
     * Input: nums = [1,2,1]
     * Output: [1,2,1,1,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
     * - ans = [1,2,1,1,2,1]
     *
     * @param args
     */

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1};

        int[] ans = getConcatenation(nums);

    }

    static public int[] getConcatenation(int[] nums) {

        //EC. Empty
        if (nums == null) {
            return new int[0];
        }

        //Ec. 1 value.
        if (nums.length < 2) {
            return new int[]{nums[0], nums[0]};
        }

        //Normal
        int[] ans = new int[nums.length * 2];
        int halfArr = (ans.length / 2);

        for (int i = 0; i < halfArr; i++) {
            ans[i] = nums[i];
            ans[i+halfArr] = nums[i];
        }
        return ans;
    }
}
