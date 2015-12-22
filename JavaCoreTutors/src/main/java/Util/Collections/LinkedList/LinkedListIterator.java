package Util.Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class LinkedListIterator {
    public static void main(String[] args) {

        // Create a LinkedList and populate it with elements
        LinkedList linkedList = new LinkedList();
        linkedList.add("element_1");
        linkedList.add("element_2");
        linkedList.add("element_3");
        linkedList.add("element_4");
        linkedList.add("element_5");

        // The Iterator object is obtained using iterator() method
        Iterator it = linkedList.iterator();

        // To iterate through the elements of the collection we can use hasNext() and next() methods of Iterator
        System.out.println("LinkedList elements :");
        while(it.hasNext())

            System.out.println(it.next());
    }
}
