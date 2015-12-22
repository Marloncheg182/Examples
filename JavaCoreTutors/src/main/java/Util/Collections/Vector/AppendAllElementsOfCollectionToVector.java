package Util.Collections.Vector;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class AppendAllElementsOfCollectionToVector {
    public static void main(String[] args) {

        // Create a Vector and populate it with elements
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");

        // Create another collection e.g. ArrayList and populate it with elements
        ArrayList arrayList = new ArrayList();
        arrayList.add("arrayList_element_1");
        arrayList.add("arrayList_element_2");

        // Append all elements of ArrayList to Vector using the boolean addAll(Collection c) operation
        vector.addAll(arrayList);

        System.out.println("Elements in Vector :");

        for(int i=0; i < vector.size(); i++)

            System.out.println(vector.get(i));

    }
}
