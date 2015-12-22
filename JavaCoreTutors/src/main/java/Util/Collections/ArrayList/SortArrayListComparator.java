package Util.Collections.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class SortArrayListComparator {
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

        Comparator comparator = Collections.reverseOrder();
        Collections.sort(vector,comparator);

        System.out.println("Elements in Vector after sorting :");
        for(int i=0; i < vector.size(); i++)

            System.out.println(vector.get(i));
    }
}
