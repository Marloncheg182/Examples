package Util.Collections.TreeMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class TreeMapIterator {
    public static void main(String[] args) {

        // Create a TreeMap and populate it with elements
        TreeMap treeMap = new TreeMap();
        treeMap.put("key_1","element_1");
        treeMap.put("key_2","element_2");
        treeMap.put("key_3","element_3");

        // Get a set of all the entries (key - value pairs) contained in the TreeMap
        Collection entrySet = treeMap.entrySet();

        // Obtain an Iterator for the entries Set
        Iterator it = entrySet.iterator();

        // Iterate through TreeMap entries
        System.out.println("TreeMap entries : ");
        while(it.hasNext())

            System.out.println(it.next());
    }
}
