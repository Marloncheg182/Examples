package Multithreading.Thread;

import java.util.Date;

/**
 * Created by O1e6 <NsN> on 12/17/2015.
 */
public class SleepThreadExample {
    public static void main(String[] args) {
        try {

            for (int i = 0; i < 5; i++) {
                System.out.println(i + " " + new Date());
                Thread.sleep(1000);
            }

        }
        catch (InterruptedException ie) {
            System.out.println("Thread interrupted!" + ie);
        }
    }
}
