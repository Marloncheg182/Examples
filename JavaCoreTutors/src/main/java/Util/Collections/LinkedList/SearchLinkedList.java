package Util.Collections.LinkedList;

import java.util.LinkedList;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SearchLinkedList {
    public static void main(String[] args) {

        // Create a LinkedList and populate it with elements
        LinkedList linkedList = new LinkedList();
        linkedList.add("element_1");
        linkedList.add("element_2");
        linkedList.add("element_3");
        linkedList.add("element_1");

    /*

boolean contains(Object element) operation returns true

if the LinkedList contains the specified object, false otherwise.
    */
        boolean found = linkedList.contains("element_2");
        System.out.println("Found element_2 : " + found);

    /*

int indexOf(Object element) operation returns the index of the

first occurance of the specified element in LinkedList or -1 if

the specific element is not found. To get the index of the last

occurance of the specified element in LinkedList use the

int lastIndexOf(Object element) operation instead.
    */
        int index = linkedList.indexOf("element_3");
        System.out.println("Found element_3 : " + (index == -1?false:true) + ", in position : " + index);

        int lastIndex = linkedList.lastIndexOf("element_1");
        System.out.println("Found element_1 : " + (lastIndex == -1?false:true) + ", in position : " + lastIndex);
    }
}
