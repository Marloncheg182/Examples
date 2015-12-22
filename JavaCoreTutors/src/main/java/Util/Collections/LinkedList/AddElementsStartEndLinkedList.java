package Util.Collections.LinkedList;

import java.util.LinkedList;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class AddElementsStartEndLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("element_1");
        linkedList.add("element_2");
        linkedList.add("element_3");
        linkedList.add("element_4");
        linkedList.add("element_5");

        System.out.println("LinkedList contains : " + linkedList);
        linkedList.addFirst("element_0");
        System.out.println("Inserted element_0 at the beginning of the list, LinkedList contains :" + linkedList);
        linkedList.addLast("element_6");
        System.out.println("Appended element_6 at the end of the list, LinkedList contains :" + linkedList);
    }
}
