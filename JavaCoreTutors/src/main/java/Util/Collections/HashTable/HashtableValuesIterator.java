package Util.Collections.HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class HashtableValuesIterator {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("key_1","value_1");
        hashtable.put("key_2","value_2");
        hashtable.put("key_3","value_3");
        System.out.println("Hashtable contains : " + hashtable);

        Enumeration values = hashtable.elements();
        System.out.println("Hashtable values : ");
        while (values.hasMoreElements())
            System.out.println(values.nextElement());
    }
}
