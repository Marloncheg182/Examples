package Multithreading.Multithreading;

/**
 * Created by 1 on 10.11.2015.
 */
public class RunnableThreadCreation implements Runnable {
    public void run() {
        try {
            System.out.println("Runnable thread : " + Thread.currentThread().getName());
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableThreadCreation());
        Thread t2 = new Thread(new RunnableThreadCreation());

        t1.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        t2.start();
    }
}
