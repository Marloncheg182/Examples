package Util.Collections.TreeMap;

import java.util.TreeMap;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SizeTreeMap {
    public static void main(String[] args) {

        // Create a TreeMap and populate it with elements
        TreeMap treeMap = new TreeMap();
        treeMap.put("key_1","element_1");
        treeMap.put("key_3","element_3");
        treeMap.put("key_2","element_2");
        treeMap.put("key_4","element_4");
        treeMap.put("key_5","element_5");

        // int size() operation returns the number of key value pairs stored in TreeMap
        System.out.println("Size of TreeMap : " + treeMap.size());
    }
}
