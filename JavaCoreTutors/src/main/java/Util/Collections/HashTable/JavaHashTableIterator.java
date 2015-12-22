package Util.Collections.HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Oleg Romanenchuk on 9/24/2015.
 */
public class JavaHashTableIterator {
    public static void main(String[] args) {
        Hashtable balance = new Hashtable();

        String name;
        double bal;

        balance.put("Oleg Romanenchuk", 212.12);
        balance.put("Vitalik Romanenchuk", 21231.21);
        balance.put("Marya Romanenchuk", 1231.22);

        Set keys = balance.keySet();

        Iterator iterator = keys.iterator();

        while (iterator.hasNext()){
            name = (String) iterator.next();
            System.out.printf("%s: %.2f\n", name, balance.get(name));
        }
    }
}
