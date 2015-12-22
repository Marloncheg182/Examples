package Util.Collections.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class TreeSetIteratorExample {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("element_1");
        treeSet.add("element_2");
        treeSet.add("element_3");

        Iterator it = treeSet.iterator();

        System.out.println("Elements in TreeSet :");
        while (it.hasNext())
            System.out.println(it.next());
    }
}
