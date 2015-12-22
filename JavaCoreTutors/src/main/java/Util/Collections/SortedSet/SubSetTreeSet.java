package Util.Collections.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SubSetTreeSet {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("element_1");
        treeSet.add("element_3");
        treeSet.add("element_2");
        treeSet.add("element_4");
        treeSet.add("element_5");

        SortedSet sortedSet = treeSet.subSet("element_2", "element_5");
        System.out.println("SortedSet Contains : " + sortedSet);

        boolean result = sortedSet.remove("element_3");
        System.out.println("element_3 is removed from sub set : " + result);
        System.out.println("Element in TreeSet : " + treeSet);
    }
}
