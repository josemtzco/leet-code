package com.josemtz.arrays;

import java.util.Arrays;

public class TransposeMartrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] transposedMatrix = transpose(matrix);

        assert transposedMatrix != null;
        for(int[] arrays : transposedMatrix){
            System.out.println(Arrays.toString(arrays));
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int tRows = matrix.length;
        int tCol = matrix[0].length;

        int[][] tMatrix = new int[tCol][tRows];

        for(int row = 0; row < matrix.length ; row++){
            for(int col = 0; col < matrix[row].length ; col++){
                tMatrix[col][row] = matrix[row][col];
            }
        }

        return tMatrix;
    }
}
