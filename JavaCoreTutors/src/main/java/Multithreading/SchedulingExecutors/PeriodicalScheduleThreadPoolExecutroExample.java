package Multithreading.SchedulingExecutors;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class PeriodicalScheduleThreadPoolExecutroExample {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        Task task = new Task("Demo Task 1");
        System.out.println("The time is : " + new Date());
        try {
            TimeUnit.MILLISECONDS.sleep(20000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
