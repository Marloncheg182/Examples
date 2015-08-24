package Multithreading.Synchronization.Object;

public class DemoClass3{
    private final Object lock = new Object();
    public void demoMethod(){
        synchronized (lock)
        {
            //safe
        }
    }
}
