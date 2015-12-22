package Util.Timer.TimerTask;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by O1e6 <NsN> on 11/24/2015.
 */
public class TimerTaskExample extends TimerTask {
    @Override
    public void run() {
        System.out.println("Start time:" + new Date());
        doSomeWork();
        System.out.println("End time:" + new Date());
    }

    private void doSomeWork() {
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TimerTask timerTask = new TimerTaskExample();
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10*1000);
        System.out.println("TimerTask begins! :" + new Date());
        try {
            Thread.sleep(20000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask is cancelled!");
        try {
            Thread.sleep(30000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
