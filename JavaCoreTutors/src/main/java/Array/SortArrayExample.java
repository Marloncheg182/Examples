package Array;

import java.util.Arrays;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SortArrayExample {
    public static void main(String[] args) {

    /*

Please note that the same API applies to any type of arrays e.g.

byte[], char[], double[], float[], long[], short[]
    */

        // Create int array
        int intArray[] = {1,4,3,5,2};

        System.out.print("Array prior sorting :");
        for(int i=0; i < intArray.length ; i++)

            System.out.print("  "  + intArray[i]);

    /*
     Arrays.sort() method sorts an array in ascending order based on quicksort
     algorithm. We can fully sort an array by using Arrays.sort(array) operation
     or we can partially sort an array by using Arrays.sort(array, startIndex, endIndex)
     operation where startIndex is inclusive and endIndex is exclusive
    */
        Arrays.sort(intArray);

        System.out.print("nArray after full sort :");
        for(int i=0; i < intArray.length ; i++)

            System.out.print("  "  + intArray[i]);

    }
}
