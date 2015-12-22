package Multithreading.Runnable;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class RunnableExampleMain {
    public static void main(String[] args) {
        MyRunnableImplementation r = new MyRunnableImplementation();

        Thread thread1 = new Thread(r, "Thread 1");
        thread1.start();

        Thread thread2 = new Thread(r, "Thread 2");
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++){
                    System.out.println(Thread.currentThread().getName()+
                            "\twith Runnable: Inner class Runnable runs..." + i);
                }
            }
        }, "Thread 3");
        thread3.start();
    }

}
