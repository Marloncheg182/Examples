package Multithreading.RestartThread;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class DemoThreadExample {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
    }
}
