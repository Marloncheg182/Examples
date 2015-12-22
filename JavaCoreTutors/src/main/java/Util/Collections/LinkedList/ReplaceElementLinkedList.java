package Util.Collections.LinkedList;

import java.util.LinkedList;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class ReplaceElementLinkedList {
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
     * Object set(int index, Object element) method replaces the element
     * found at the specified index in the LinkedList with the one provided
     * and returns the replaced element
     */
        linkedList.set(3, "element_6");
        System.out.println("LinkedList contains : " + linkedList);
    }
}
