package Util.Collections.TreeSet;

import java.util.TreeSet;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class TreeSetSizeExample {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("element_1");
        treeSet.add("element_2");
        treeSet.add("element_3");

        System.out.println("Size pf TreeSet : " + treeSet.size());
        treeSet.remove("element_2");
        System.out.println("Size of TreeSet : " + treeSet.size());
    }
}
