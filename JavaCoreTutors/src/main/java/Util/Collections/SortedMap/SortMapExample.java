package Util.Collections.SortedMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Oleg Romanenchuk on 9/22/2015.
 */
public class SortMapExample {
    public static void main(String[] args) {
        Map<Integer, String> unsortMap = new HashMap<Integer, String>();
        unsortMap.put(10, "Oleg");
        unsortMap.put(5, "Vitalik");
        unsortMap.put(6, "Marya");
        unsortMap.put(20, "Kiril");
        unsortMap.put(1, "Erik");
        unsortMap.put(7, "Slava");
        unsortMap.put(8, "Kolya");
        unsortMap.put(99, "Max");
        unsortMap.put(50, "Pirs");
        unsortMap.put(2, "Fom");
        unsortMap.put(9, "Roman");

        System.out.println(" Unsorted Map .....");
        printMap(unsortMap);

        System.out.println("\nSorted asc Map");
        Map<Integer, String> ascSortedMap = new TreeMap<Integer, String>();
        ascSortedMap.putAll(unsortMap);
        printMap(ascSortedMap);

//        System.out.println("\nSorted desc Map");
//        Map<Integer, String> desSortedMap = new TreeMap<Integer, String>(
//                new Comparator() {
//                    @Override
//                    public int compare(Integer o1, Integer o2) {
//                        return o2.compareTo(o1);
//                    }
//                });
//        desSortedMap.putAll(unsortMap);
//        printMap(desSortedMap);
    }

    public static void printMap(Map<Integer, String> map){
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + "Value : " + entry.getValue());
        }
    }
}
