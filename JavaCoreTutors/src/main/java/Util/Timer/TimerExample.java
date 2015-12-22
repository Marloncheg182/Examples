package Util.Timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class TimerExample {
    private String healthStatus = "GREEN";

    public static void main(String[] args) {

        TimerExample example = new TimerExample();
        example.setHealthStatus("GREEN");

        Timer timer = new Timer("JCG Timer Example");

        TimerTask taskToExecute = new TimerTaskSendHeartBeat(example);
        timer.scheduleAtFixedRate(taskToExecute, 1000, 10000);

        TimerTask setHeartBeatStatus = new TimerTaskSendHeartBeat(example);
        timer.schedule(setHeartBeatStatus, 30000);

        try {
            Thread.sleep(60000);
        }catch (InterruptedException e){}
        System.out.println("Cancelling Timer Cleanly after 60 seconds");
        timer.cancel();
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
}
