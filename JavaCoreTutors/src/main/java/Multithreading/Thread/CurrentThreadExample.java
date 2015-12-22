package Multithreading.Thread;

/**
 * Created by O1e6 <NsN> on 12/17/2015.
 */
public class CurrentThreadExample {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Thread: " + thread);
        System.out.println("Thread Id: " + thread.getId());
        System.out.println("Thread Name: " + thread.getName());
        System.out.println("Thread Group: " + thread.getThreadGroup());
        System.out.println("Thread Priority: " + thread.getPriority());
    }
}
