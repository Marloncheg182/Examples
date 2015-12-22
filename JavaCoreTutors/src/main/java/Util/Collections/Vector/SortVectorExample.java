package Util.Collections.Vector;

import java.util.Collections;
import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SortVectorExample {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_3");
        vector.add("element_5");
        vector.add("element_2");
        vector.add("element_4");

        System.out.println("Elements in Vector prior sorting :");
        for(int i=0; i < vector.size(); i++)

            System.out.println(vector.get(i));

        // Using Collection.sort static operation we can sort Vector elements in ascending order
        Collections.sort(vector);

        System.out.println("Elements in Vector after sorting :");
        for(int i=0; i < vector.size(); i++)

            System.out.println(vector.get(i));

    }
}
