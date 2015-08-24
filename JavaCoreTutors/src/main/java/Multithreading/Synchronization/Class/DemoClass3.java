package Multithreading.Synchronization.Class;

public class DemoClass3{
    private final static Object lock = new Object();
    public void method(){
        synchronized (lock)
        {

        }
    }
}
