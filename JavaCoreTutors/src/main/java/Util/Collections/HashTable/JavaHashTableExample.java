package Util.Collections.HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by Oleg Romanenchuk on 9/24/2015.
 */
public class JavaHashTableExample {
    public static void main(String[] args) {
        Hashtable balance = new Hashtable();

        Enumeration names;
        String name;
        double bal;

        balance.put("Oleg Romanenchuk", 212.12);
        balance.put("Vitalik Romanenchuk", 21231.21);
        balance.put("Marya Romanenchuk", 1231.22);

        names = balance.keys();

        while (names.hasMoreElements()){
            name = (String) names.nextElement();
            System.out.printf("%s: %2f\n", name, balance.get(name));
        }
        System.out.println();

        bal = (double) balance.get("Oleg Romanenchuk");
        balance.put("Oleg Romanenchuk", bal + 1000);

        System.out.printf("Oleg Romanenchuk's new balance: %.2f",
                balance.get("Oleg Romanenchuk"));
    }
}
