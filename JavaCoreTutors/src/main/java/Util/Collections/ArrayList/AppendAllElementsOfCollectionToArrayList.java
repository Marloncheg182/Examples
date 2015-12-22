package Util.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class AppendAllElementsOfCollectionToArrayList {
    public static void main(String[] args) {

        // Create an ArrayList and populate it with elements
        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_2");
        arrayList.add("element_3");

        // Create another Collection e.g. Vector object and populate it with elements
        Vector vector = new Vector();
        vector.add("vector_element_1");
        vector.add("vector_element_2");

        // Append all elements of Vector to ArrayList using the addAll(Collection) operation
        arrayList.addAll(vector);

        System.out.println("Elements in ArrayList :");

        for(int i=0; i < arrayList.size(); i++)

            System.out.println(arrayList.get(i));

    }
}
