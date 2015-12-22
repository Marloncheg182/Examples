package Util.Collections.LinkedList;

import java.util.LinkedList;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class RemoveElementLinkedList {
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
     * boolean remove(Object obj) removes the first occurrence of the specified
     * element from the LinkedList and returns true if LinkedList contained the specified
     * element, false otherwise
     */
        boolean removed = linkedList.remove("element_3");
        System.out.println("element_3 removed from LinkedList : " + removed);
        System.out.println("LinkedList elements : " + linkedList);
    }
}
