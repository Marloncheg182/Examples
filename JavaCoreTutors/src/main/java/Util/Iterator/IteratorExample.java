package Util.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        System.out.println("Iterator using while loop: ");
        Iterator it1 = list.iterator();
        while (it1.hasNext()) {
            System.out.println("Next element: " + it1.next());
        }

        System.out.println("Iterator using for loop");
        for (Iterator it2 = list.iterator(); it2.hasNext(); ) {
            System.out.println("Next element: " + it2.next());
        }

        System.out.println("ListIterator using while loop");
        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.println("Next element:  " + lit.next());
        }

        System.out.println("ListIterator backward iteration");
        lit = list.listIterator(list.size());
        while (lit.hasPrevious()) {
            System.out.println("Previous element: " + lit.previous());
        }

        lit.next();
        lit.add("One more element");
        System.out.println("Modified list after the insertion of the new element");
        System.out.println("Index of next element: " + lit.nextIndex());
        System.out.println("Index of previous element: " + lit.previousIndex());

        for (lit = list.listIterator(); lit.hasNext(); ) {
            System.out.println("Next element " + lit.next());
        }

        lit.previous();
        lit.remove();

        System.out.println("Modified list after the removal of an element");
        for (lit = list.listIterator(); lit.hasNext(); ) {
            System.out.println("Next element: " + lit.next());
        }
    }
}
