package Util.Collections.HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class HashtableEntriesIterator {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("key_1","value_1");
        hashtable.put("key_2","value_2");
        hashtable.put("key_3","value_3");

        Set entrySet = hashtable.entrySet();

        Iterator it = entrySet.iterator();
        System.out.println("HashTable entries : ");
        while (it.hasNext())
            System.out.println(it.next());
    }
}
