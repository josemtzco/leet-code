package com.josemtz.arrays;

public class CellsWithOddValuesInAMatrix {

    public static void main(String[] args) {
        int[][] indices = new int[][]{{0, 1}, {1, 1}};

        int oddCells = oddCells(3, 2, indices);
        System.out.println(oddCells);
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[n][m];

        for (int row = 0; row < indices.length; row++) {
            int incrementRow = indices[row][0];
            int incrementColumns = indices[row][1];

            incrementRows(incrementRow, matrix);
            incrementColumns(incrementColumns, matrix);
        }
        return countOddCells(matrix);
    }

    private static int countOddCells(int[][] matrix) {
        int oddNumbers = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] % 2 != 0) {
                    oddNumbers += 1;
                }
            }
        }
        return oddNumbers;
    }

    //increment row
    static void incrementRows(int row, int[][] matrix) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] += 1;
        }
    }


    //increment columns
    static void incrementColumns(int column, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] += 1;
        }
    }

}
