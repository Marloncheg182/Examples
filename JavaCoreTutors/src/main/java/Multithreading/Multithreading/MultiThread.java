package Multithreading.Multithreading;

/**
 * Created by 1 on 10.11.2015.
 */

class MultiThreadingTutorial extends Thread{
    public void run(){
        System.out.println("Runnable" + this.currentThread().getName());
        System.out.println("Runnable" + this.currentThread().getPriority());
    }
}
public class MultiThread {
    public static void main(String[] args) {
        MultiThreadingTutorial multiThread1 = new MultiThreadingTutorial();
        multiThread1.setName("First Thread");
        multiThread1.setPriority(Thread.MIN_PRIORITY);

        MultiThreadingTutorial multiThread2 = new MultiThreadingTutorial();
        multiThread2.setName("Second Thread");
        multiThread2.setPriority(Thread.MAX_PRIORITY);

        MultiThreadingTutorial multiThread3 = new MultiThreadingTutorial();
        multiThread3.setName("Third");
        multiThread3.setPriority(Thread.NORM_PRIORITY);

        multiThread1.start();
        multiThread2.start();
        multiThread3.start();
    }

}
