package Multithreading.DeamonThreadExit;

/**
 * Created by O1e6 <NsN> on 12/4/2015.
 */
public class DaemonThreadExit {
    public static void main(String[] args) {
        Thread t = new MyDaemonThread();
        t.setDaemon(true);
        t.start();
    }

    static class MyDaemonThread extends Thread {
        MyDaemonThread(){

        }

        @Override
        public void run() {
            boolean isDaemon = isDaemon();
            System.out.println("isDaemon: " + isDaemon);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                ex.getMessage();
            }
        }
    }
}
