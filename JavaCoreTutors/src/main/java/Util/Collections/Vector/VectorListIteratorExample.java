package Util.Collections.Vector;

import java.util.ListIterator;
import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class VectorListIteratorExample {
    public static void main(String[] args) {

        // Create a Vector and populate it with elements
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");
        vector.add("element_4");
        vector.add("element_5");

        // The ListIterator object is obtained using listIterator() method
        ListIterator it = vector.listIterator();

        // For forward iteration over the collection elements we can use hasNext() and next() methods of ListIterator
        System.out.println("Forward iteration :");
        while(it.hasNext())

            System.out.println(it.next());

        // For backward iteration over the collection elements we can use hasPrevious() and previous() methods of ListIterator
        System.out.println("Backward iteration :");
        while(it.hasPrevious())

            System.out.println(it.previous());

        // nextIndex and previousIndex return next and previous index from the current position in the list
        System.out.println("Previous Index is : " + it.previousIndex());
        System.out.println("Next Index is : " + it.nextIndex());

        // We get the next element in forward order
        System.out.println("Next element is : " + it.next());

        // nextIndex and previousIndex return next and previous index from the current position in the list
        System.out.println("Previous Index is : " + it.previousIndex());
        System.out.println("Next Index is : " + it.nextIndex());

        // Add an element just before the next element
        it.add("element_6");

        System.out.println("After inserting element_6, Vector contains : ");
        for(int i = 0; i < vector.size(); i++)

            System.out.println(vector.get(i));

        // We get the next element in forward order
        System.out.println("Next element is : " + it.next());

        // void remove() method removes the last element returned by next or previous methods
        it.remove();

        System.out.println("After removing element_2, Vector contains : ");
        for(int i = 0; i < vector.size(); i++)

            System.out.println(vector.get(i));

        // We get the next element in forward order
        System.out.println("Next element is : " + it.next());

    /*

void set(Object o) method replaces the last element returned

by next or previous methods. The set method can only be called

if neither add or remove methods are called after last call of

next or previous methods
    */
        it.set("element_7");

        System.out.println("After replacing element_3, Vector contains : ");
        for(int i = 0; i < vector.size(); i++)

            System.out.println(vector.get(i));

    }
}
