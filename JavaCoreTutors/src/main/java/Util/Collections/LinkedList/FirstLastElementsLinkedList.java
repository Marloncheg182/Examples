package Util.Collections.LinkedList;

import java.util.LinkedList;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class FirstLastElementsLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("element_1");
        linkedList.add("element_2");
        linkedList.add("element_3");
        linkedList.add("element_4");
        linkedList.add("element_5");
        linkedList.getFirst();
        linkedList.getLast();
    }
}
