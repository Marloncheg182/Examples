package Util.Collections.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by 1 on 10.11.2015.
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        ListIterator lit = list.listIterator();
        System.out.println("Initial list: ");

        while (lit.hasNext()){
            System.out.println(lit.next() + " ");
        }

        System.out.println("Check if list contains the element Four : " + list.contains("Four"));
        System.out.println("The position of element One is : " + list.indexOf("One"));
        System.out.println("Get the third element : " + list.get(2));

        int size = list.size();
        System.out.println("The size of list is " + size);

        System.out.println("Iterate list in reverse order: ");
        lit = list.listIterator(size);
        while (lit.hasPrevious()){
            System.out.println(lit.previous() + " ");
        }
        list.remove("Three");
        list.removeFirst();
        list.removeLast();
        System.out.println("Update");
        lit = list.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next() + " ");
        }


    }
}
