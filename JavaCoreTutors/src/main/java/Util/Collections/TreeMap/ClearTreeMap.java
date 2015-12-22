package Util.Collections.TreeMap;

import java.util.TreeMap;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class ClearTreeMap {
    public static void main(String[] args) {

        // Create a TreeMap and populate it with elements
        TreeMap treeMap = new TreeMap();
        treeMap.put("key_1","element_1");
        treeMap.put("key_2","element_2");
        treeMap.put("key_3","element_3");

        System.out.println("TreeMap contains : " + treeMap);

        // void clear method() removes all mappings of TreeMap class
        treeMap.clear();

        System.out.println("TreeMap contains : " + treeMap);

    }
}
