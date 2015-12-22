package Util.Collections.LinkedList;

import java.util.LinkedList;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class RemoveFirstLastElementLinkedList {
    public static void main(String[] args) {

        // Create a LinkedList and populate it with elements
        LinkedList linkedList = new LinkedList();
        linkedList.add("element_1");
        linkedList.add("element_2");
        linkedList.add("element_3");
        linkedList.add("element_4");
        linkedList.add("element_5");

        System.out.println("LinkedList contains : " + linkedList);

    /*
     * Object removeFirst() operation removes and returns the first
     * element of LinkedList. Subsequent elements are shifted the to
     * the left
     */
        Object firstElement = linkedList.removeFirst();
        System.out.println(firstElement + " has been removed from LinkedList");
        System.out.println("LinkedList contains : " + linkedList);

     /*

* Object removeLast() operation removes and returns the last element

* of LinkedList

*/

        Object lastElement = linkedList.removeLast();

        System.out.println(lastElement + " has been removed from LinkedList");

        System.out.println("LinkedList contains : " + linkedList);
    }
}
