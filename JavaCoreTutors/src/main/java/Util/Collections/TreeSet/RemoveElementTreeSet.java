package Util.Collections.TreeSet;

import java.util.TreeSet;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class RemoveElementTreeSet {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("element_1");
        treeSet.add("element_2");
        treeSet.add("element_3");
        System.out.println("TreeSet contents : " + treeSet);
        boolean removed = treeSet.remove("element_2");
        System.out.println("TreeSet contents after removal of element_2 : " + treeSet);
    }
}
