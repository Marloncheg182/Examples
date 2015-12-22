package Util.Collections.HashTable;

import java.util.Collection;
import java.util.Hashtable;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class HashtableValuesCollection {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("key_1","value_1");
        hashtable.put("key_2","value_2");
        hashtable.put("key_3","value_3");
        hashtable.put("key_4","value_4");
        hashtable.put("key_5","value_5");

        Collection values = hashtable.values();
        System.out.println("values contains : " + values);
        values.remove("value_2");
        System.out.println("after removing : " + values + " hshtable : " + hashtable);
    }
}
