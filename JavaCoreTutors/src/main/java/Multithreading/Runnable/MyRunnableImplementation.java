package Multithreading.Runnable;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class MyRunnableImplementation implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName()+
                    "\twith Runnable: MyRunnableImplementation runs..." + i);
        }
    }
}
