package Util.Collections.HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class HashtableKeysIterator {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("key_1","value_1");
        hashtable.put("key_2","value_2");
        hashtable.put("key_3","value_3");
        Enumeration keys = hashtable.keys();
        System.out.println("Hashtable keys : ");
        while (keys.hasMoreElements())
            System.out.println(keys.nextElement());
    }
}
