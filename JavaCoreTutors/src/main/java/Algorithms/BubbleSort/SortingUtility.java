package Algorithms.BubbleSort;

import java.util.Comparator;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class SortingUtility {
    public static final int ASC_ORDER = 1;
    public static final int DESC_ORDER = 2;

    private SortingUtility(){
        throw new AssertionError();
    }

    public static<T extends Comparable<T>> void sort(T []a){
        bubbleSortInAscOrder(a);
    }

    public static<T> void sort(T []a, Comparator<? super T>comparator){
        bubbleSortInAscOrder(a,comparator);
    }

    public static<T extends Comparable<T>> void sort(T []a,int order){

        if(order == ASC_ORDER){
            bubbleSortInAscOrder(a);
        }else if(order == DESC_ORDER){
            bubbleSortInDescOrder(a);
        }else{
            throw new UnsupportedOperationException("The order you specified is not supported.");
        }
    }

    public static<T> void sort(T []a,int order, Comparator<? super T>comparator){

        if(order == ASC_ORDER){
            bubbleSortInAscOrder(a,comparator);
        }else if(order == DESC_ORDER){
            bubbleSortInDescOrder(a,comparator);
        }else{
            throw new UnsupportedOperationException("The order you specified is not supported.");
        }
    }

    private static<T extends Comparable<T>> void bubbleSortInAscOrder(T []a){
        int left = 0;
        int right = a.length-1;
        // the outer loop, runs from right to left
        for(int i=right;i>1;i--){
            // the inner loops, runs from left to the right, limited by the outer loop
            for(int j=left;j<i;j++){
                // if the left item is greater than the right one, swaps
                if(((Comparable<T>)a[j]).compareTo(a[j+1]) > 0){
                    swap(a,j, j+1);
                }
            }
        }
    }

    private static<T extends Comparable<T>> void bubbleSortInDescOrder(T []a){
        int left = 0;
        int right = a.length-1;
        // the outer loop, runs from right to left
        for(int i=right;i>1;i--){
            // the inner loops, runs from left to the right, limited by the outer loop
            for(int j=left;j<i;j++){
                // if the left item is smaller than the right one, swaps
                if(((Comparable<T>)a[j]).compareTo(a[j+1]) < 0){
                    swap(a,j, j+1);
                }
            }
        }
    }

    private static<T> void bubbleSortInAscOrder(T []a,Comparator<? super T>comparator){
        int left = 0;
        int right = a.length-1;
        // the outer loop, runs from right to left
        for(int i=right;i>1;i--){
            // the inner loops, runs from left to the right, limited by the outer loop
            for(int j=left;j<i;j++){
                // if the left item is greater than the right one, swaps
                if(comparator.compare(a[j], a[j+1]) > 0){
                    swap(a,j, j+1);
                }
            }
        }

    }

    private static<T> void bubbleSortInDescOrder(T []a,Comparator<? super T>comparator){
        int left = 0;
        int right = a.length-1;
        // the outer loop, runs from right to left
        for(int i=right;i>1;i--){
            // the inner loops, runs from left to the right, limited by the outer loop
            for(int j=left;j<i;j++){
                // if the left item is smaller than the right one, swaps
                if(comparator.compare(a[j], a[j+1]) < 0){
                    swap(a,j, j+1);
                }
            }
        }
    }

    // This method is used to swap the values between the two given index
    private static void swap(Object []a, int left,int right){
        Object temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
}
