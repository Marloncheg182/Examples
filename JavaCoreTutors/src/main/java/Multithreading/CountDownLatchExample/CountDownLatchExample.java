package Multithreading.CountDownLatchExample;

import java.util.concurrent.CountDownLatch;

/**
 * Created by O1e6 <NsN> on 12/4/2015.
 */
public class CountDownLatchExample {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        new MyThread(cdl);
        try {
            cdl.await();
        }catch (InterruptedException exc) {
            System.out.println(exc);
        }
        System.out.println("Finish");
    }
}
class MyThread implements Runnable{
    CountDownLatch latch;
    MyThread(CountDownLatch cdl){
        latch = cdl;
        new Thread(this).start();
    }
    @Override
    public void run() {
for (int i = 0; i < 5; i++){
    System.out.println(i);
    latch.countDown();
}
    }
}
