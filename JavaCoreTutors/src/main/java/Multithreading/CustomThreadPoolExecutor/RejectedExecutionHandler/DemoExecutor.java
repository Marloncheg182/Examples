package Multithreading.CustomThreadPoolExecutor.RejectedExecutionHandler;

import java.util.concurrent.*;

/**
 * Created by Oleg Romanenchuk on 8/18/2015.
 */
public class DemoExecutor {
    public static void main(String[] args) {
        Integer threadCounter = 0;
        BlockingQueue<Runnable>blockingQueue = new ArrayBlockingQueue<Runnable>(50);
        CustomThreadPoopExecutor executor = new CustomThreadPoopExecutor(10, 20, 5000, TimeUnit.MILLISECONDS, blockingQueue);
        executor.setRejectedExecutionHandler(new RejectedExecutionHandler() {
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                System.out.println("DemoTask Rejected : " + ((Demo) r).getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Lets add another time : " + ((Demo) r).getName());
                executor.execute(r);
            }
        });
        executor.prestartAllCoreThreads();
        while (true)
        {
            threadCounter++;
            executor.execute(new Demo(threadCounter.toString()));
            if (threadCounter == 1000)
                break;
        }
    }
}
