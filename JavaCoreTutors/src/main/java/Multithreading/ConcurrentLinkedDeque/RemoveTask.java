package Multithreading.ConcurrentLinkedDeque;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class RemoveTask implements Runnable {

    private ConcurrentLinkedDeque<String> list;

    public RemoveTask(ConcurrentLinkedDeque<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++){
            list.pollFirst();
            list.pollLast();
        }
    }
}
