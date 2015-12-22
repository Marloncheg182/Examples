package lang.System;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class ArrayCopyExample {
    private final static int TOTAL_ELEMENTS = 10;

    public static void main(String[] args) {
        int[] src = new int[TOTAL_ELEMENTS];

        // Populate the array with some elements.
        for(int i = 0; i < TOTAL_ELEMENTS; ++i)
            src[i] = i + 1;

        // Print the elements.
        System.out.print("Source array: ");
        for(int i = 0; i < TOTAL_ELEMENTS; ++i)
            System.out.print(src[i] + " ");
        System.out.println();

        // Copy the array to the destination.
        int dst_size = src.length / 2;
        int[] dst = new int[dst_size];
        System.arraycopy(src, 0, dst, 0, dst_size);

        // Print the elements.
        System.out.print("Destination array: ");
        for(int i = 0; i < dst_size; ++i)
            System.out.print(dst[i] + " ");
        System.out.println();
    }
}