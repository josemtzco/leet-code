package com.josemtz.arrays; /**
 * Let's get jiggy with arrays!
 *
 * EXPLANATION:
 *
 * 1) The coding exercise consist on two main things
 *      - Of given arrays, remove duplicates on both
 *      - Print the arrays in three different ways:
 *          1. Original collection
 *          2. Collection with duplicates removed
 *          3. Collection with duplicates removed and sorted
 *
 * 2) Output MUST be similar to example below
 *
 * 3) You cannot erase anything that's already part of the exercise (main class, main method, helper method)
 *
 * 4) No restrictions on the amount/names of private methods you can create within the class, as long as names are descriptive or JDoc is included
 *
 */

import java.util.*;

public class Main {

    /**
     * Main, executable method
     * THIS METHOD SHOULD PRINT ALL EXPECTED OUTPUT
     * @param   args
     */
    public static void main(String args[]) {
        List<Integer> arrOne = new ArrayList<>(Arrays.asList(2, 5, 5, 55, 69, 666, 666, 2019, 42, 21, 9, 2, 69, 5));
        List<String> arrTwo = new ArrayList<>(Arrays.asList("John", "Tina", "Tom", "Jonah", "Laura", "Tina", "Bob", "Bob", "Robert", "John", "Tina", "Tom", "Mike"));
        System.out.println("Let's begin...");

        // 1. print array as is
        System.out.println( "Print array as is" + arrOne.toString());
        System.out.println( "Print array as is" + arrTwo.toString());

        //2. print array
        List<Integer> arrOneRemovedDuplicates = removeDuplicates(arrOne);
        System.out.println("Removed duplicated for arrOne : " + arrOneRemovedDuplicates.toString());
        List<String> arrTwoRemovedDuplicates = removeDuplicates(arrTwo);
        System.out.println("Removed duplicated for arrTwo : " + arrTwoRemovedDuplicates.toString());


        //3. print array sorted
        Collections.sort(arrOneRemovedDuplicates);
        System.out.println("Sorted arrOne removed duplicates" + arrOneRemovedDuplicates);


        Collections.sort(arrTwoRemovedDuplicates);
        System.out.println("Sorted arrtwo removed duplicates" + arrTwoRemovedDuplicates);
    }


    /**
     * Helper method to remove duplicates
     *  - MUST NOT MODIFY METHOD SIGNATURE!
     * @param   list    The list where duplicates will be removed
     * @return          The list without duplicates
     */
    private static <T>List<T> removeDuplicates(List<T> list) {
        ArrayList<T> removedDuplicates = new ArrayList<>();
        list.stream().distinct().forEachOrdered(removedDuplicates::add);
        return removedDuplicates;
    }


}

/**
 * EXPECTED OUTPUT WHEN MAIN IS EXECUTED:
 * =======================================
 * 1) Original collection: [2, 5, 5, 55, 69, 666, 666, 2019, 42, 21, 9, 2, 69, 5]
 * 2) Duplicates removed from collection: [2, 5, 55, 69, 666, 2019, 42, 21, 9]
 * 3) Duplicates removed from collection and sorted: [2, 5, 9, 21, 42, 55, 69, 666, 2019]
 * - - - - - - - - - - - - - - - - - - - - (or any text separator)
 * 4) Original collection: [John, Tina, Tom, Jonah, Laura, Tina, Bob, Bob, Robert, John, Tina, Tom, Mike]
 * 5) Duplicates removed from collection: [John, Tina, Tom, Jonah, Laura, Bob, Robert, Mike]
 * 6) Duplicates removed from collection and sorted: [Bob, John, Jonah, Laura, Mike, Robert, Tina, Tom]
 */




