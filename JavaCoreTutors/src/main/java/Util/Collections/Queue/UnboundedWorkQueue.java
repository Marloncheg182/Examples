package Util.Collections.Queue;

import java.util.LinkedList;

/**
 * Created by O1e6 <NsN> on 12/17/2015.
 */
public class UnboundedWorkQueue {
    public static void main(String[] args) {
        WorkQueue workQueue = new WorkQueue();
        int numthreads = 2;
        Worker[] workers = new Worker[numthreads];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker(workQueue);
            workers[i].start();
        }
        for (int i = 0; i < 100; i++) {
            workQueue.addWork(i);
        }
    }

    static class WorkQueue {
        LinkedList<Object> workQueue = new LinkedList<>();

        public synchronized void addWork(Object o) {
            workQueue.addLast(o);
            notify();
        }

        public synchronized Object getWork() throws InterruptedException {
            while (workQueue.isEmpty()) {
                wait();
            }
            return workQueue.removeFirst();
        }
    }

    static class Worker extends Thread {
        WorkQueue queue;

        Worker(WorkQueue queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    Object x = queue.getWork();
                    if (x == null) {
                        break;
                    }
                    System.out.println(x);
                }
            } catch (InterruptedException ex) {
            }
        }
    }
}
