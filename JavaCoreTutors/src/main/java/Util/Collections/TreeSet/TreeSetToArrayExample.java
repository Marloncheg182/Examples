package Util.Collections.TreeSet;

import java.util.TreeSet;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class TreeSetToArrayExample {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("element_1");
        treeSet.add("element_2");
        treeSet.add("element_3");

        Object[] objArray = treeSet.toArray();
        System.out.println("Elements in Array :");
        for (int i = 0; i < objArray.length; i++)
            System.out.println(objArray[i]);

    }
}
