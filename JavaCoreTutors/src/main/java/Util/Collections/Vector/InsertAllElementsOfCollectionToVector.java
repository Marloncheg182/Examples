package Util.Collections.Vector;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class InsertAllElementsOfCollectionToVector {
    public static void main(String[] args) {

        // Create a Vector and populate it with elements
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");

        // Create another Collection e.g. ArrayList and populate it with elements
        ArrayList arrayList = new ArrayList();
        arrayList.add("arrayList_element_1");
        arrayList.add("arrayList_element_2");

        // Insert all elements of ArrayList to Vector at index 1
        vector.addAll(1,arrayList);

        System.out.println("Elements in Vector :");
        for(int i=0; i < vector.size(); i++)

            System.out.println(vector.get(i));

    }
}
