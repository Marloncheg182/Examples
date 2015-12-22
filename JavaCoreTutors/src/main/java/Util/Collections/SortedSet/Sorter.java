package Util.Collections.SortedSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Oleg Romanenchuk on 9/22/2015.
 */
public class Sorter {
    public static void main(String[] args) {

        // TreeSet is an implementation of SortedSet
        SortedSet set = new TreeSet();

        set.add(new Example("Ashraf", 60));
        set.add(new Example("Sara", 50));
        set.add(new Example("Mohamed", 10));
        set.add(new Example("Esraa", 20));
        set.add(new Example("Bahaa", 40));
        set.add(new Example("Dalia", 30));

        // Iterating over the employees in the set
        System.out.println("Set after sorting:");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            // Get employee name and age
            Example epm = (Example) it.next();
            System.out.println("Employee " + epm.getName() + ", his age: " + epm.getAge());
        }

        // Test comparator(), comparator will be null as we are using the Comparable interface
        System.out.println("Employee Set Comparator: " + set.comparator());

        // Test first()
        System.out.println("First Employee: " + set.first());

        // Test last()
        System.out.println("Last Employee: " + set.last());

        // Test headSet()
        System.out.println("headSet() result:");
        SortedSet headSet = set.headSet(new Example("Dalia", 30));
        // Iterating over the employees in the headSet
        Iterator headSetIt = headSet.iterator();
        while (headSetIt.hasNext()) {
            // Get employee name and age
            Example epm = (Example) headSetIt.next();
            System.out.println("Employee " + epm.getName() + " his age: " + epm.getAge());
        }

        // Test subSet()
        System.out.println("subSet() result:");
        SortedSet subSet = set.subSet(new Example("Mohamed", 10), new Example("Sara", 50));
        // Iterating over the employees in the subSet
        Iterator subSetIt = subSet.iterator();
        while (subSetIt.hasNext()) {
            // Get employee name and age
            Example epm = (Example) subSetIt.next();
            System.out.println("Employee " + epm.getName() + " his age: " + epm.getAge());
        }

        // Test tailSet()
        System.out.println("tailSet() result:");
        SortedSet tailSet = set.tailSet(new Example("Bahaa", 40));
        // Iterating over the employees in the tailSet
        Iterator tailSetIt = tailSet.iterator();
        while (tailSetIt.hasNext()) {
            // Get employee name and age
            Example epm = (Example) tailSetIt.next();
            System.out.println("Employee " + epm.getName() + " his age: " + epm.getAge());
        }

    }

}
