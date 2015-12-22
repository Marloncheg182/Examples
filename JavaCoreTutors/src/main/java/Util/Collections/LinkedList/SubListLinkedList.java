package Util.Collections.LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SubListLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("element_1");
        linkedList.add("element_2");
        linkedList.add("element_3");
        linkedList.add("element_4");
        linkedList.add("element_5");

        List subList = linkedList.subList(1,3);
        System.out.println("sub list contains " + subList);

        boolean removed = subList.remove("element_2");
        System.out.println("element_2 removed from subList");
        System.out.println("New Linked List : " + linkedList);

    }
}
