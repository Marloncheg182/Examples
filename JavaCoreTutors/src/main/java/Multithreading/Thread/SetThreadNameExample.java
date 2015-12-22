package Multithreading.Thread;

/**
 * Created by O1e6 <NsN> on 12/17/2015.
 */
public class SetThreadNameExample {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Thread Name (before): " + thread.getName());
        thread.setName("My Thread Name");
        System.out.println("Thread Name (after): " + thread.getName());
    }
}
