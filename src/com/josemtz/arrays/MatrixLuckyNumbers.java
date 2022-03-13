package com.josemtz.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MatrixLuckyNumbers {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {12, 25, 22, 24},
                {9, 7, 6, 8},
                {11, 19, 18, 14},
        };

        System.out.println(luckyNumbers(matrix));

    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        // 1, 2, 3
        // 4, 5, 6
        // 7, 8, 9

        List<Integer> luckyNumbers = new ArrayList<>();
        int minRow = Integer.MAX_VALUE;
        int maxColumn = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] < minRow) {
                    minRow = matrix[row][column];
                }

                if (matrix[column][row] > maxColumn) {
                    maxColumn = matrix[column][row];
                }
            }
            if(minRow == maxColumn){
                luckyNumbers.add(minRow);
            }
        }

        return luckyNumbers;
    }

}
