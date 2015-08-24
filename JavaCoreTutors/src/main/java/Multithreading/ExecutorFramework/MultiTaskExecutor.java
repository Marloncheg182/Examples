package Multithreading.ExecutorFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by Oleg Romanenchuk on 8/18/2015.
 */
public class MultiTaskExecutor {
    public static void main(String[] args) {
        BlockingQueue<Runnable> worksQueue = new ArrayBlockingQueue<Runnable>(10);
        RejectedExecutionHandler rejectionHandler = new RejectedExecutionHandelerImpl();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 3, 10, TimeUnit.SECONDS, worksQueue, rejectionHandler);

        executor.prestartAllCoreThreads();
        List<Runnable> taskGroup = new ArrayList<Runnable>();
        taskGroup.add(new TestOne());
        taskGroup.add(new TestTwo());
        taskGroup.add(new TestThree());

        worksQueue.add(new MultiRunnable(taskGroup));
    }
}
    class RejectedExecutionHandelerImpl implements RejectedExecutionHandler {
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println(r.toString() + " : I've been rejected ! ");
        }
    }

