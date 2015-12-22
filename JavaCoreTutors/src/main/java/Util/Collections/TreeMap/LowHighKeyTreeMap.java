package Util.Collections.TreeMap;

import java.util.TreeMap;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class LowHighKeyTreeMap {
    public static void main(String[] args) {

        // Create a TreeMap and populate it with elements
        TreeMap treeMap = new TreeMap();
        treeMap.put("key_1","element_1");
        treeMap.put("key_3","element_3");
        treeMap.put("key_2","element_2");
        treeMap.put("key_4","element_4");
        treeMap.put("key_5","element_5");

        // Object firstKey() returns the lowest key in the TreeMap
        System.out.println("Lowest key in TreeMap is : "  + treeMap.firstKey());

        // Object lastKey() returns the highest key in the TreeMap
        System.out.println("Highest key in TreeMap is : " + treeMap.lastKey());

    }
}
