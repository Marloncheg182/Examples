package Util.Collections.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class TailSetTreeSet {
    public static void main(String[] args) {

        // Create a TreeSet and populate it with elements
        TreeSet treeSet = new TreeSet();
        treeSet.add("element_1");
        treeSet.add("element_3");
        treeSet.add("element_2");
        treeSet.add("element_4");
        treeSet.add("element_5");


        SortedSet tailSet = treeSet.tailSet("element_3");
        System.out.println("tailSet Contains : " + tailSet);
    }
}
