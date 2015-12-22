package Util.Collections.LinkedList;

import java.util.LinkedList;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class InsertElementAtIndexLinkedList {
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
     * void add(int index , Object element) method inserts the specified element
     * at the specified index in the LinkedList. Current and subsequent elements
     * are shifted to the right
     */
        linkedList.add(3, "element_6");
        System.out.println("After inserting element_6 at index 3, LinkedList contains : " + linkedList);
    }
}
