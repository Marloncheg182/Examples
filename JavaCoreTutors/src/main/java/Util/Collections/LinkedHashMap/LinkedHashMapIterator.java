package Util.Collections.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class LinkedHashMapIterator {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();

        linkedHashMap.put("key_1","value_1");

        linkedHashMap.put("key_2","value_2");

        linkedHashMap.put("key_3","value_3");

        Set entrySet = linkedHashMap.entrySet();

        Iterator it = entrySet.iterator();

        System.out.println("LinkedHashMap entries : ");
        while (it.hasNext())
            System.out.println(it.next());
    }
}
