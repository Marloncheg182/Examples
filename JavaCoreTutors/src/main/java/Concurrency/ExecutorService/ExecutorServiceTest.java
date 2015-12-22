package Concurrency.ExecutorService;

import java.util.concurrent.*;

/**
 * Created by O1e6 <NsN> on 11/19/2015.
 */
public class ExecutorServiceTest {
    private static Future taskTwo = null;
    private static Future taskThree = null;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Runnable taskOne = new MyThread("TaskOne", 2, 100);
        service.execute(taskOne);
        for (int i = 0; i < 2; i++) {
            if ((taskTwo == null) || (taskTwo.isDone()) || (taskTwo.isCancelled())) {
                taskTwo = service.submit(new MyThread("TaskTwo", 4, 200));
            }
            if ((taskThree == null) || (taskThree.isDone()) || (taskThree.isCancelled())) {
                taskThree = service.submit(new MyThread("TaskThree", 5, 100));
            }

            if (taskTwo.get() == null) {
                System.out.println(i + 1 + ") TaskTwo terminated successfully");
            } else {
                taskTwo.cancel(true);
            }
            if (taskThree.get() == null) {
                System.out.println(i + 1 + ") TaskThree terminated successfully");
            } else {
                taskThree.cancel(true);
            }
        }
        service.shutdown();
        System.out.println("----------------");
        service.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("All tasks are finished!");
    }
}
