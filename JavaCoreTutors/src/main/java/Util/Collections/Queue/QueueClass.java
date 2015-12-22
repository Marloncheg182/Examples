package Util.Collections.Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Created by O1e6 <NsN> on 17.11.2015.
 */
public class QueueClass {
    public static void main(String[] args) {
        Queue myQueue = new LinkedList();
        myQueue.offer("Monday");
        myQueue.offer("Thursday");
        boolean flag = myQueue.offer("Wednesday");

        System.out.println("Wednesday inserted successfully? " + flag);

        try {
            myQueue.add("Thursday");
            myQueue.add("Friday");
            myQueue.add("Weekend");
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        System.out.println("Pick the head of the Queue: " + myQueue.peek());

        String head = null;
        try {
            head = (String) myQueue.remove();
            System.out.println("1) Push out " + head + " from the queue ");
            System.out.println("and the new head is now: " + myQueue.element());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

        head = (String) myQueue.poll();
        System.out.println("2) Push out " + head + " from the queue ");
        System.out.println("and the new head is now: " + myQueue.peek());

        System.out.println("Does the queue contain 'Weekend'? " + myQueue.contains("Weekend"));
        System.out.println("Does the queue contain 'Monday'? " + myQueue.contains("Monday"));

    }
}
