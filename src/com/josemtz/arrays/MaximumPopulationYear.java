package com.josemtz.arrays;

public class MaximumPopulationYear {

    public static void main(String[] args) {
        int[][] logs = new int[][]{
                {1950, 1961},
                {1960, 1971},
                {1970, 1981}
        };

        int maxPop = maximumPopulation(logs);
        System.out.println(maxPop);

    }

    public static int maximumPopulation(int[][] logs) {
        int[] years = new int[100];
        //iterate over logs to store values in array of years
        for (int[] log : logs) {
            years[log[0] - 1950] += 1;
            years[log[1] - 1950] -= 1;
        }

        int maxPopulation = years[0];
        int maxYear = 1950;

        for (int i = 1; i < years.length; i++) {
            years[i] = years[i]  + years[i - 1]; // generating prefix sum

            if (years[i] > maxPopulation) {
                maxPopulation = years[i];
                maxYear = i + 1950;
            }
        }

        return maxYear;
    }
}
