package com.josemtz.arrays;

import java.util.Arrays;

public class MatrixCanBeObtainedByRotation {


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 0, 0, 0}
        };

        int[][] target = {
                {0, 0, 0, 1},
                {0, 0, 1, 1},
                {0, 0, 1, 1},
                {0, 0, 0, 1},
        };

        System.out.println(findRotation(matrix, target));
    }


    static boolean findRotation(int[][] mat, int[][] target) {
        if (compareMatrix(mat, target)) {
            System.out.println("No Rotation needed.");
            return true;
        }

        int rotationAllowed = 1;
        while (rotationAllowed < 4) {
            rotateMatrix(mat);
            if (compareMatrix(mat, target)) {
                System.out.println("Took # rotation to be the same : " + rotationAllowed);
                return true;
            }
            rotationAllowed++;
        }

        return false;
    }

    private static boolean compareMatrix(int[][] mat, int[][] target) {
        for (int row = 0; row < mat.length; row++) {
            for (int column = 0; column < mat[0].length; column++) {
                if (mat[row][column] != target[row][column]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void rotateMatrix(int[][] mat) {
        // transpose mat
        for (int row = 0; row < mat.length; row++) {
            for (int column = row; column < mat[0].length; column++) {
                transposeMatrixValues(mat, row, column);
            }
        }

        // reverse values
        for (int[] row : mat) {
            reverseArray(row);
        }

        System.out.println("Transposed Matrix by 90 degrees");
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
        //compare matrix to matrix
    }

    private static void reverseArray(int[] row) {
        int sz = row.length;
        int i = 0;
        int j = sz - 1;

        while (i < j) {
            swap(row, i, j);
            i++;
            j--;
        }

    }

    private static void swap(int[] row, int i, int j) {
        int tempValue = row[i];
        row[i] = row[j];
        row[j] = tempValue;
    }

    private static void transposeMatrixValues(int[][] mat, int row, int column) {
        int tempValue = mat[row][column];
        mat[row][column] = mat[column][row];
        mat[column][row] = tempValue;
    }


}
