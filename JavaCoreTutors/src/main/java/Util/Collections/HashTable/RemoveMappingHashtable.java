package Util.Collections.HashTable;

import java.util.Hashtable;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class RemoveMappingHashtable {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("key_1","value_1");
        hashtable.put("key_2","value_2");
        hashtable.put("key_3","value_3");
        System.out.println("Hashtable contains : " + hashtable);

        Object value = hashtable.remove("key_2");
        System.out.println("After removing value : " + value);
    }
}
