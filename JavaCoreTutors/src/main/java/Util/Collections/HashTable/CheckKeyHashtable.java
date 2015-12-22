package Util.Collections.HashTable;

import java.util.Hashtable;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class CheckKeyHashtable {
    public static void main(String[] args) {

        // Create a Hashtable and populate it with elements
        Hashtable hashtable = new Hashtable();
        hashtable.put("key_1","value_1");
        hashtable.put("key_2","value_2");
        hashtable.put("key_3","value_3");

        // boolean containsKey(Object key) returns true if the Hashtable contains the key, otherwise false.
        boolean exists = hashtable.containsKey("key_2");
        System.out.println("key_2 exists in Hashtable ? : " + exists);

    }
}
