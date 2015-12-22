package Util.Collections.LinkedList;

import java.util.LinkedList;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class RemoveElementIndexLinkedList {
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
     * Object remove(int index) method removes and returns the element from
     * the specified index shifting subsequent elements to the left
     */
        Object removedElement = linkedList.remove(3);
        System.out.println(removedElement + " has been removed from LinkedList");
        System.out.println("LinkedList contains : " + linkedList);
    }
}
