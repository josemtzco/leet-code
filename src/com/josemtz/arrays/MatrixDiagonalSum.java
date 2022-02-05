package com.josemtz.arrays;

public class MatrixDiagonalSum {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {1, 2, 3,},
                {4, 5, 6,},
                {7, 8, 9},

        };

        int sum = diagonalSum(matrix);
        System.out.println(sum);

    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int matrixLength = mat.length;

        //edge case
        if (matrixLength == 1) {
            return sum = mat[0][0];
        }

        // is it odd ?
        int oddPos;
        if (matrixLength % 2 != 0) {
            oddPos = matrixLength / 2;
        } else {
            oddPos = -1;
        }

        //Traverse Primary
        int row = 0;
        int column = 0;
        while (row < matrixLength) {
            sum = sum + mat[row++][column++];
        }

        //traverse secondary
        int secRow = matrixLength-1;
        int secColumn = 0;

        while (secRow >= 0) {
            if (secRow == oddPos && secColumn == oddPos) {
                secRow--;
                secColumn++;
                continue;
            }
            sum = sum + mat[secRow--][secColumn++];
        }
        return sum;
    }

}
