package Util.Collections.HashMap;

import java.util.*;

/**
 * Created by O1e6 <NsN> on 11/19/2015.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        HashMap<String, ArrayList<String>> multiMap = new HashMap<>();

        hashMap.put("USA", new Integer(1));
        hashMap.put("UK", new Integer(2));
        hashMap.put("China", new Integer(3));

        System.out.println("Simple HashMap: Key 'UK' has value = " + hashMap.get("UK"));
        System.out.println("Simple HashMap contains value '1' - " + hashMap.containsValue(1));
        System.out.println("Simple HashMap contains key 'Greece' - "
                + hashMap.containsKey("Greece"));

        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();
        listTwo.add("Pink");
        listTwo.add("Purple");

        multiMap.put("B color ", listOne);
        multiMap.put("P color ", listTwo);

        Set<Map.Entry<String, ArrayList<String>>> setMap = multiMap.entrySet();
        Iterator<Map.Entry<String, ArrayList<String>>>iteratorMap = setMap.iterator();
        while (iteratorMap.hasNext()){
            Map.Entry<String, ArrayList<String>> entry = (Map.Entry<String, ArrayList<String>>) iteratorMap.next();
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = '" + key + " has values: " + values);
        }




    }
}
