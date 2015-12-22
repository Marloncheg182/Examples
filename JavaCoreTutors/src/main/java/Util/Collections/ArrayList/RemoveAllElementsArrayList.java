package Util.Collections.ArrayList;

import java.util.ArrayList;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class RemoveAllElementsArrayList {
    public static void main(String[] args) {

        // Create an ArrayList and populate it with elements
        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_2");
        arrayList.add("element_3");

        System.out.println("ArrayList size before removing elements : " + arrayList.size());

        // ArrayList clear() operation removes all elements
        arrayList.clear();

        System.out.println("ArrayList size after removing elements : " + arrayList.size());

    }
}
