package Util.Collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class HashMapIterator {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("key_1","value_1");
        hashMap.put("key_2","value_2");
        hashMap.put("key_3","value_3");

        Set entrySet = hashMap.entrySet();
        Iterator it = entrySet.iterator();

        System.out.println("HashMap entries : ");
        while(it.hasNext())

            System.out.println(it.next());
    }
}
