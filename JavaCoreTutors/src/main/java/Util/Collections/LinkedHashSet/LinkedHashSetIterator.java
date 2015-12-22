package Util.Collections.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class LinkedHashSetIterator {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("element_1");
        linkedHashSet.add("element_2");
        linkedHashSet.add("element_3");

        // To get the Iterator use the iterator() operation
        Iterator it = linkedHashSet.iterator();

        System.out.println("Elements in LinkedHashSet :");
        while(it.hasNext())

            System.out.println(it.next());

    }
}
