package Multithreading.ThreadDaemon;

/**
 * Created by O1e6 <NsN> on 12/3/2015.
 */
class MyThreadDaemon implements Runnable {
    Thread thread;

    MyThreadDaemon() {
        thread = new Thread(this);
        thread.setDaemon(true);
        thread.start();
    }

    public boolean isDaemon() {
        return thread.isDaemon();
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(".");
                Thread.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class DaemonThreadExample {
    public static void main(String[] args) throws InterruptedException {
        MyThreadDaemon myThreadDaemon = new MyThreadDaemon();
        if (myThreadDaemon.isDaemon()){
            System.out.println("Daemon thread.");
        }
        Thread.sleep(10000);
        System.out.println("nMain thread ending.");
    }
}