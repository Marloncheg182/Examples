package Concurrency.ExecutorService;

/**
 * Created by O1e6 <NsN> on 11/19/2015.
 */
public class MyThread implements Runnable {
    private String myName;
    private int count;
    private final long timeSleep;

    MyThread(String name, int newCount, long newTimeSleep) {
        this.myName = name;
        this.count = newCount;
        this.timeSleep = newTimeSleep;
    }


    @Override
    public void run() {
        //TODO Auto-generated method
        int sum = 0;
        for (int i = 1; i <= this.count; i++) {
            sum = sum + i;
        }
        System.out.println(myName + " thread has sum = " + sum + " and is going to sleep for " + timeSleep);
        try {
            Thread.sleep(this.timeSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

