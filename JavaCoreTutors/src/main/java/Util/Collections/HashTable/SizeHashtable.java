package Util.Collections.HashTable;

import java.util.Hashtable;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SizeHashtable {
    public static void main(String[] args) {

        // Create a Hashtable and populate it with elements
        Hashtable hashtable = new Hashtable();
        hashtable.put("key_1","value_1");
        hashtable.put("key_2","value_2");
        hashtable.put("key_3","value_3");

        // int size() operation returns the number of key value pairs stored in Hashtable
        System.out.println("Size of Hashtable : " + hashtable.size());

    }
}
