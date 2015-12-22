package Util.Collections.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by O1e6 <NsN> on 12/17/2015.
 */
public class BoundedWorkQueue {
    public static void main(String[] args) throws InterruptedException {
        int size = 10;
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(size);
        int thread_c = 2;
        Worker[] workers = new Worker[thread_c];
        for (int i = 0; i < workers.length; i++){
            workers[i] = new Worker(blockingQueue);
            workers[i].start();
        }
        for (int i = 0; i < 100; i++){
            blockingQueue.put(i);
        }
    }

}
class Worker extends Thread {
    BlockingQueue<Integer> val;

    Worker(BlockingQueue<Integer> bque) {
        this.val = bque;
    }

    @Override
    public void run() {
        try {

            while (true) {
                Integer i = val.take();
                if (i == null) {
                    break;
                }
                System.out.println(i);
            }
        } catch (InterruptedException ex) {
        }
    }
}