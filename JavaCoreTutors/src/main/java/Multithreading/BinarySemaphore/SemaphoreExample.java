package Multithreading.BinarySemaphore;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class SemaphoreExample {
    public static void main(String[] args)
    {
        PrinterQueue printerQueue = new PrinterQueue();
        Thread thread[] = new Thread[10];
        for (int i = 0; i < 10; i++)
        {
            thread[i] = new Thread(new PrinterJob(printerQueue), "Thread " + i);
        }
        for (int i = 0; i < 10; i++)
        {
            thread[i].start();
        }
    }
}