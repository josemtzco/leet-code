package com.josemtz.arrays;

public class FlipImage {

    public static void main(String[] args) {
        int[][] image = new int[][]{
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        flipImage(image);
        for(int row = 0; row< image.length; row++){
            for(int column = 0; column < image[row].length; column++){
                System.out.print(image[row][column] + ", ");
            }
            System.out.println("");
        }

    }

    static void flipImage(int[][] image) {

        for (int row = 0; row < image.length; row++) {
            reverse(image, row);
        }

        for(int row = 0; row< image.length; row++){
            for(int column = 0; column < image[row].length; column++){
                image[row][column] = invertNum(image[row][column]);
            }
        }

    }

    static void reverse(int[][] image, int row) {
        int start = 0;
        int end = image[row].length-1;

        while(start < end){
            int temp = image[row][start];
            image[row][start] = image[row][end];
            image[row][end] = temp;
            start++;
            end--;
        }
    }


    static int invertNum(int num) {
        if (num == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
