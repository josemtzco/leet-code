package com.josemtz.arrays;

public class RichestCustomerWealth {

    public static void main(String[] args) {

        int[][] accounts = new int[][]{
                {1, 5},
                {7, 3},
                {3, 5}
        };

        int totalWealth = maximumWealth(accounts);
        System.out.println("Max Wealth : " + totalWealth);
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            int currentWealth = 0;
            for (int column = 0; column < accounts[row].length; column++) {
                currentWealth = currentWealth + accounts[row][column];
            }
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }

        return maxWealth;
    }
}
