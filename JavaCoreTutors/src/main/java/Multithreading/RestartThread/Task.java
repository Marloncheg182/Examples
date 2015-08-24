package Multithreading.RestartThread;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println(Integer.parseInt("123"));
        System.out.println(Integer.parseInt("234"));
        System.out.println(Integer.parseInt("345"));
        System.out.println(Integer.parseInt("XYZ"));   // ClassCastException , NumberFormatException
        System.out.println(Integer.parseInt("456"));
    }
}
