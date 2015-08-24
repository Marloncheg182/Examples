package Multithreading.ExecutorFramework;

import java.util.List;

/**
 * Created by Oleg Romanenchuk on 8/18/2015.
 */
public class MultiRunnable implements Runnable {
    private final List<Runnable> runnables;

    public MultiRunnable(List<Runnable> runnables) {
        this.runnables = runnables;
    }

    public void run() {
        for (Runnable runnable : runnables) {
            new Thread(runnable).start();
        }
    }
}
