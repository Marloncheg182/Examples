package Multithreading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Oleg Romanenchuk on 8/18/2015.
 */
public class DemoExecutorUsage {
    private static ExecutorService executor = null;
    private static volatile Future taskOneResults = null;
    private static volatile Future taskTwoResults = null;
    private static volatile Future taskThreeResults = null;

    public static void main(String[] args) {
        executor = Executors.newFixedThreadPool(2);
        while (true) {
            try {
                checkTasks();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.err.println("Caught exception: " + e.getMessage());
            }
        }
    }

    private static void checkTasks() throws Exception {
        if (taskOneResults == null
                || taskOneResults.isDone()
                || taskOneResults.isCancelled()) {
            taskOneResults = executor.submit(new TestOne());
        }
        if (taskTwoResults == null
                || taskTwoResults.isDone()
                || taskTwoResults.isCancelled()) {
            taskTwoResults = executor.submit(new TestTwo());
        }
        if (taskThreeResults == null
                || taskThreeResults.isDone()
                || taskThreeResults.isCancelled()) {
            taskThreeResults = executor.submit(new TestThree());
        }
    }
}

class TestOne implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Executing task one");
            try {
                Thread.sleep(2000);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }
}

class TestTwo implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Executing task two");
            try {
                Thread.sleep(2000);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }
}

class TestThree implements Runnable {
    public void run() {
        System.out.println("Executing Task Three");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}