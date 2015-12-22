package Util.WorkQueue;


import java.util.LinkedList;

/**
 * Created by O1e6 <NsN> on 12/4/2015.
 */
public class CoordinationExampe {
    public static void main(String[] args) {
        WorkerQueue workerQueue = new WorkerQueue();
        int threads = 2;
        Worker[]workth = new Worker[threads];
        for (int i = 0; i < workth.length; i++){
            workth[i] = new Worker(workerQueue);
            workth[i].start();
        }
        for (int i = 0; i < 100; i++){
            workerQueue.addWork(i);
        }
    }
}
class WorkerQueue {
    LinkedList<Object> q = new LinkedList<Object>();
    public synchronized void addWork(Object obj){
        q.addLast(obj);
        notify();
    }
    public synchronized Object getWork()throws InterruptedException{
        while (q.isEmpty()){
            wait();
        }
        return q.removeFirst();
    }
}
class Worker extends Thread {
    WorkerQueue q;

    Worker(WorkerQueue q) {
        this.q = q;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Object o = q.getWork();
                if (o == null) {
                    break;
                }
                System.out.println(o);
            }
        } catch (InterruptedException ex) {

        }
    }
}