package Multithreading.ConcurrentLinkedDeque;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String>list = new ConcurrentLinkedDeque<>();
        Thread threads[] = new Thread[100];
        for (int i =0; i < threads.length; i++){
            AddTask task = new AddTask(list);
            threads[i] = new Thread(task);
            threads[i].start();
        }
        System.out.printf("Main: %d AddTask threads have been launched\n", threads.length);
    for (int i = 0; i <threads.length; i++){
        try {
            threads[i].join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
        System.out.printf("Main: Size of the List: %d\n", list.size());
        for (int i = 0; i < threads.length; i++){
            RemoveTask task = new RemoveTask(list);
            threads[i]= new Thread(task);
            threads[i].start();
        }
        System.out.printf("Main: %d RemoveTask threads have been launched\n", threads.length);
        for (int i = 0; i <threads.length; i++){
            try {
                threads[i].join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.printf("Main: Size of the List: %d\n", list.size());
    }
}
