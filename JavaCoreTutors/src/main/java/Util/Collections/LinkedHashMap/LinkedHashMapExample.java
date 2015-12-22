package Util.Collections.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Oleg Romanenchuk on 9/24/2015.
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {

        Map<String, Double> linkedHashMap = new LinkedHashMap<String, Double>();
        linkedHashMap.put("Apple", new Double(91.98));
        linkedHashMap.put("Sony", new Double(16.76));
        linkedHashMap.put("Dell", new Double(30.47));
        linkedHashMap.put("HP", new Double(33.91));
        linkedHashMap.put("IBM", new Double(181.71));

        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);

        System.out.println("\nValues of map after iterating over it : ");
        for (String key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }

        // Getting the value for a particular key
        System.out.println("\nThe current share price of HP is : "
                + linkedHashMap.get("HP"));

        // Getting the size of the LinkedHashMap
        System.out
                .println("\nThe size of the LinkedHashMap is : " + linkedHashMap.size());

        // Checking whether the LinkedHashMap is empty
        System.out.println("\nIs LinkedHashMap empty? : " + linkedHashMap.isEmpty());

        //Checking whether Map contains a particular key or value
        System.out.println("\nLinkedHashMap contains Sony as key? : " + linkedHashMap.containsKey("Sony"));
        System.out.println("LinkedHashMap contains 999.0 as value? : " + linkedHashMap.containsValue(999.0));

        // Removing a particular value
        System.out.println("\nRemove entry for Dell : " + linkedHashMap.remove("Dell"));
        System.out.println("Content of LinkedHashMap removing Dell: " + linkedHashMap);

        // Clearing the LinkedHashMap
        linkedHashMap.clear();
        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
    }
    }
