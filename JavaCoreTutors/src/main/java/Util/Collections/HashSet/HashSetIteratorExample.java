package Util.Collections.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class HashSetIteratorExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("element_1");
        hashSet.add("element_2");
        hashSet.add("element_3");
        Iterator it = hashSet.iterator();
        System.out.println("Elements in HashSet :");
        while(it.hasNext())

            System.out.println(it.next());
    }
}
