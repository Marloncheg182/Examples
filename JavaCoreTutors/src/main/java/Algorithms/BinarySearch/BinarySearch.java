package Algorithms.BinarySearch;

/**
 * Created by Oleg Romanenchuk on 8/20/2015.
 */
public class BinarySearch {

   public static int binarySerach(int[] sortedArray, int elementToBeSearched){
       int first = 0;
          int last = sortedArray.length-1;
       while (first < last){
           int mid = (first + last)/2;
           if (elementToBeSearched < sortedArray[mid]){
               last = mid;
           }else if (elementToBeSearched > sortedArray[mid]){
               first = mid + 1;
           }else {
               return mid;
           }
       }
       return -1;
   }

    public static void main(String[] args) {
        int[]sortedArray  = {12,56,74,96,112,114,123,567};
        int indexOfElementToBeSearched = binarySerach(sortedArray, 74);
        System.out.println("Index of 74 in array is: " + indexOfElementToBeSearched);

        int indexOfElementToBeSearchedNotFound = binarySerach(sortedArray,7);
        System.out.println("Index of 7 in array is: " + indexOfElementToBeSearchedNotFound);
    }
}
