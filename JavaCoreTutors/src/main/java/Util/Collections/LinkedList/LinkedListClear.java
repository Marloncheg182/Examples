package Util.Collections.LinkedList;

import java.util.LinkedList;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class LinkedListClear {
    public static void main(String[] args) {

        // Create a LinkedList and populate it with elements
        LinkedList linkedList = new LinkedList();
        linkedList.add("element_1");
        linkedList.add("element_2");
        linkedList.add("element_3");
        linkedList.add("element_4");
        linkedList.add("element_5");

        System.out.println("LinkedList size before removing elements : " + linkedList.size());

        // LinkedList clear() operation removes all elements
        linkedList.clear();

        System.out.println("LinkedList size after removing elements : " + linkedList.size());
    }
}
