package Algorithms.Quicksort;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class QuicksortStringExample {
    private static String []a;
    public static void main(String[] args) {
        // Get an String array
        a = new String[]{"X","E","C","A"};

        // prints the given array
        printArray();

        // sort the array
        sort();

        System.out.println("");

        //prints the sorted array
        printArray();

    }

    // This method sort an array internally and internally calls quickSort
    public static void sort(){
        int left = 0;
        int right = a.length-1;

        quickSort(left, right);
    }

    // This method is used to sort the array using quicksort algorithm.
    // It takes left and the right end of the array as two cursors
    private static void quickSort(int left,int right){

        // If both cursor scanned the complete array quicksort exits
        if(left >= right)
            return;

        // Pivot using median of 3 approach
        String pivot = getMedian(left, right);
        int partition = partition(left, right, pivot);

        // Recursively, calls the quicksort with the different left and right parameters of the sub-array
        quickSort(0, partition-1);
        quickSort(partition+1, right);
    }

    // This method is used to partition the given array and returns the integer which points to the sorted pivot index
    private static int partition(int left,int right,String pivot){
        int leftCursor = left-1;
        int rightCursor = right;
        while(leftCursor < rightCursor){
            while(((Comparable<String>)a[++leftCursor]).compareTo(pivot) < 0);
            while(rightCursor > 0 && ((Comparable<String>)a[--rightCursor]).compareTo(pivot) > 0);
            if(leftCursor >= rightCursor){
                break;
            }else{
                swap(leftCursor, rightCursor);
            }
        }
        swap(leftCursor, right);
        return leftCursor;
    }

    public static String getMedian(int left,int right){
        int center = (left+right)/2;

        if(((Comparable<String>)a[left]).compareTo(a[center]) > 0)
            swap(left,center);

        if(((Comparable<String>)a[left]).compareTo(a[right]) > 0)
            swap(left, right);

        if(((Comparable<String>)a[center]).compareTo(a[right]) > 0)
            swap(center, right);

        swap(center, right);
        return a[right];
    }

    // This method is used to swap the values between the two given index
    public static void swap(int left,int right){
        String temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    public static void printArray(){
        for(String i : a){
            System.out.print(i+" ");
        }
    }
}
