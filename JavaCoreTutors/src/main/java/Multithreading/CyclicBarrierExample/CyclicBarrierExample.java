package Multithreading.CyclicBarrierExample;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by O1e6 <NsN> on 12/3/2015.
 */
class BarDemo{
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new BarAction());
        System.out.println("Start");
        new MyThread(cyclicBarrier, "One");
        new MyThread(cyclicBarrier, "Two");
        new MyThread(cyclicBarrier, "Three");
    }
}

class MyThread implements Runnable{
    CyclicBarrier cbar;
    String name;
    MyThread(CyclicBarrier c, String n){
        cbar = c;
        name = n;
        new Thread(this).start();
    }
    @Override
    public void run() {
        System.out.println(name);
        try {
            cbar.await();
        }catch (BrokenBarrierException exc){
            System.out.println(exc);
        }catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }
}
class BarAction implements Runnable{

    @Override
    public void run() {
        System.out.println("Barrier");
    }
}
public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3 , new BarAction());
        System.out.println("Start");
        new MyThread(cb, "One");

        new MyThread(cb, "Two");

        new MyThread(cb, "Three");


        new MyThread(cb, "X");

        new MyThread(cb, "Y");

        new MyThread(cb, "Z");
    }
}
