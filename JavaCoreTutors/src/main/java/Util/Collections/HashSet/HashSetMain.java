package Util.Collections.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Oleg Romanenchuk on 9/22/2015.
 */
public class HashSetMain {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("String 1");
        set.add("String 2");
        set.add("String 3");
        set.add("String 4");
        set.add("String 5");

        System.out.println(set);

        System.out.println("Number of elements in the HashSet: " + set.size());

        if (set.contains("String 10"))
            System.out.println("String 10 found!");
        else
            System.out.println("String 10 not found!");
        if (set.contains("String 3"))   // exists
            System.out.println("String 3 found!");
        else
            System.out.println("String 3 not found!");

        // We can get an iterator and manipulate all the objects
        // that are contained in the HashSet.
        Iterator setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println("Iterated: " + setIterator.next());
        }

        // We can remove elements from the set.
        set.remove("String 1");
        set.remove("String 2");
        System.out.println(set);

        // We can remove everything from the set and empty it,
        // using the clear method. We can also check if it is empty or not.
        set.clear();
        System.out.println("Is HashSet empty after clear(): " + set.isEmpty());
    }
}
