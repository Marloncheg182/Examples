package Algorithms.BubbleSort;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class BubblesortDescendingExample {
    private static int []a;
    private static int[] array;

    public static void main(String[] args) {
        a = getArray();
        printArray();
        sort();
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

        bubbleSort(left, right);
    }

    private static void bubbleSort(int left, int right) {
        for (int i = right; i > 1; i--){
            for (int j = left; j < i; j++){
                if (a[j]<a[j+1]){
                    swap(j, j+1);
                }
            }
        }
    }

    private static void swap(int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    public static int[] getArray() {
        int size = 10;
        int []array = new int[size];
        int item =0;
        for (int i=0; i < size; i++){
            item = (int)(Math.random()*1000);
            array[i] = item;
        }
        return array;
    }
}
