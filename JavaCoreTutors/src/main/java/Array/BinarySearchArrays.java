package Array;

import java.util.Arrays;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class BinarySearchArrays {
    public static void main(String[] args) {

    /*

Please note that the same API applies to any type of arrays e.g.

byte[], char[], double[], float[], long[], short[]
    */

        // Create int array
        int intArray[] = {1,4,3,5,2};

    /*

int binarySearch(int[] b, int value) operation searches the provided array for

the specified value using the binary search algorithm. Beware the source array

must be sorted before it can be searched using this method. The method returns

the index of the search key, if it is contained in the array; otherwise,

(-(insertion point) - 1). The insertion point is defined as the point at which

the key would be inserted into the array
    */
        Arrays.sort(intArray);

        // We search for a value that exists in the array (value 2)
        int searchIndex1 = Arrays.binarySearch(intArray,2);
        System.out.println("Value 2 found at index : " + searchIndex1);

        // We search for a value that does not exist in the array (value 6)
        int searchIndex2 = Arrays.binarySearch(intArray, 6);
        System.out.println("Value 6 should be inserted at index : " + (-(searchIndex2) - 1));

    }
}
