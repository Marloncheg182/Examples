package Util.Collections.HashTable;

import java.util.Hashtable;
import java.util.Set;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class HashtableKeysCollection {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("key_1","value_1");
        hashtable.put("key_2","value_2");
        hashtable.put("key_3","value_3");
        hashtable.put("key_4","value_4");
        hashtable.put("key_5","value_5");


        Set keySet = hashtable.keySet();
        System.out.println("keySet contains : " + keySet);

        keySet.remove("key_2");

        System.out.println("after removing : " + keySet + " hashtable contains : " + hashtable);
    }
}
