package Multithreading.Creation;

/**
 * Created by O1e6 <NsN> on 12/17/2015.
 */
public class ThreadWithRunnableExample implements Runnable{
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadWithRunnableExample(), "Child Thread");
        t.start();
        for (int i = 0; i < 2; i++){
            System.out.println("Main thread : " + i);
            try {
                Thread.sleep(100);
            }catch (InterruptedException ie){
                System.out.println("Main Thread interrupted" + ie);
            }
        }
        System.out.println("Main thread finished!");
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {

            System.out.println("Child Thread : " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                System.out.println("Child thread interrupted! " + ie);
            }
        }

        System.out.println("Child thread finished!");
    }
}
