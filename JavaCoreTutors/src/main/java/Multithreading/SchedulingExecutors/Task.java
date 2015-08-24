package Multithreading.SchedulingExecutors;

import java.util.Date;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class Task  implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run() {
        try {
            System.out.println("Doing a task during : " + name + " - Time - " + new Date());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
