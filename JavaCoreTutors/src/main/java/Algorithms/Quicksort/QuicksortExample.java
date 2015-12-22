package Algorithms.Quicksort;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class QuicksortExample {
    private static int []a;
    private static int[] array;

    public static void main(String[] args) {
        a = getArray();

        printArray();

        sort();

        System.out.println("");

        printArray();


    }

    private static void printArray() {
        for (int i : a) {
            System.out.println(i + " ");
        }
    }

    private static void sort() {
        int left = 0;
        int right = a.length-1;

        quickSort(left, right);
    }

    private static void quickSort(int left, int right) {
        if (left >= right)
            return;

        int pivot = a[right];
        int partition = partition(left, right, pivot);

        quickSort(0, partition-1);
        quickSort(partition+1, right);
    }

    private static int partition(int left, int right, int pivot) {
        int leftCursor = left-1;
        int rightCursor = right;
        while (leftCursor< rightCursor){
            while (a[++leftCursor]< pivot);
            while (rightCursor > 0 && a[--rightCursor]> pivot);
            if (leftCursor >= rightCursor){
                break;
            }else {
                swap(leftCursor, right);
            }
        }
        swap(leftCursor, right);
        return leftCursor;
    }

    private static void swap(int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }


    public static int[] getArray() {
        int size = 10;
        int[]array = new int[size];
        int item = 0;
        for (int i = 0; i < size; i++){
            item = (int)(Math.random()*100);
            array[i] = item;
        }
        return array;
    }
}
