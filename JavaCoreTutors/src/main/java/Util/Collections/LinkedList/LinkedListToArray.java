package Util.Collections.LinkedList;

import java.util.LinkedList;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class LinkedListToArray {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("element_1");
        linkedList.add("element_2");
        linkedList.add("element_3");
        linkedList.add("element_4");
        linkedList.add("element_5");

        Object[] objArray = linkedList.toArray();
        System.out.println("Elements in Array :");
        for (int i =0; i < objArray.length; i++)
            System.out.println(objArray[i]);
    }
}
