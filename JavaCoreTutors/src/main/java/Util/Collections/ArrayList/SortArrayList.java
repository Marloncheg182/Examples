package Util.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class SortArrayList {
    public static void main(String[] args) {

        // Create an ArrayList and populate it with elements
        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_3");
        arrayList.add("element_5");
        arrayList.add("element_2");
        arrayList.add("element_4");

        // ArrayList implementation maintains the insertion order for its elements
        System.out.println("Elements in ArrayList prior sorting :");
        for(int i=0; i < arrayList.size(); i++)

            System.out.println(arrayList.get(i));

        // Using Collection.sort static operation we can sort ArrayList elements in ascending order
        Collections.sort(arrayList);

        System.out.println("Elements in ArrayList after sorting :");
        for(int i=0; i < arrayList.size(); i++)

            System.out.println(arrayList.get(i));

    }
}
