package Algorithms.Mergesort;

/**
 * Created by Oleg Romanenchuk on 9/24/2015.
 */
public class MergeSortExample {
    private static int[]a;

    public static void main(String[] args) {
        a = getArray();
        printArray(a);
        sort();
        System.out.println();
        printArray(a);
    }

    private static void sort() {
        int[]tempArray = new int[a.length];
        mergeSort(tempArray, 0, a.length - 1);
    }

    private static void mergeSort(int[] tempArray, int lowerIndex, int upperIndex) {
        if (lowerIndex == upperIndex){
            return;
        }else {
            int mid = (lowerIndex+upperIndex)/2;
            mergeSort(tempArray,lowerIndex,mid);
            mergeSort(tempArray,mid+1, upperIndex);
            merge(tempArray,lowerIndex,mid+1,upperIndex);
        }
    }

    private static void merge(int[] tempArray, int lowerIndexCursor, int higherIndex, int upperIndex) {
        int tempIndex = 0;
        int lowerIndex = lowerIndexCursor;
        int midIndex = higherIndex-1;
        int totalItems = upperIndex-lowerIndex+1;
        while (lowerIndex <= midIndex && higherIndex <=upperIndex){
            if (a[lowerIndex]< a[higherIndex]){
                tempArray[tempIndex++] = a[lowerIndex++];
            }else {
                tempArray[tempIndex++] = a[higherIndex++];
            }
        }

        while (lowerIndex <= midIndex){
            tempArray[tempIndex++] = a[lowerIndex++];
        }
        while (higherIndex <= upperIndex){
            tempArray[tempIndex++] = a[higherIndex++];
        }

        for(int i=0;i<totalItems;i++){
            a[lowerIndexCursor+i] = tempArray[i];
        }
    }

    public static void printArray(int []array){
        for(int i : array){
            System.out.print(i+" ");
        }
    }

    public static int[] getArray(){
        int size=10;
        int []array = new int[size];
        int item = 0;
        for(int i=0;i<size;i++){
            item = (int)(Math.random()*100);
            array[i] = item;
        }
        return array;
    }
}
