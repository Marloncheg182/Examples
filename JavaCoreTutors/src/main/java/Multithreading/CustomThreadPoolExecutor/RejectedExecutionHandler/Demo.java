package Multithreading.CustomThreadPoolExecutor.RejectedExecutionHandler;

/**
 * Created by Oleg Romanenchuk on 8/18/2015.
 */
public class Demo implements Runnable{
    private String name = null;

    public Demo(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void run() {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Executing : " + name);
    }
}
