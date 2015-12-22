package Array.Arrrays;

import java.util.Arrays;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class JavaUtilArraysMoreMethodsExample {
    public static void main(String[] args) {
        // Base array for the example. It contains 9 elements.
        int[] baseArray = { 2, 4, 3, 7, 21, 9, 98, 76, 74 };

        // Sorts the specified range of the array into ascending order.
        System.out.printf("Unsorted baseArray: %s\n", Arrays.toString(baseArray));

        Arrays.sort(baseArray, 1, 6);

        System.out.printf("Sorted baseArray: %s\n\n", Arrays.toString(baseArray));

        // Assigns the specified int value to each element of the
        // specified range of the specified array of ints.
        int[] fillArray = new int[10];

        System.out.printf("fillArray (before): %s\n", Arrays.toString(fillArray));

        Arrays.fill(fillArray, 1, 7, 3);

        System.out.printf("fillArray (after): %s", Arrays.toString(fillArray));
    }
}
