package Util.Timer;

import java.util.TimerTask;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class TimerTaskUpdateHeartBeat extends TimerTask{

    TimerExample healthClass = null;

    public TimerTaskUpdateHeartBeat(TimerExample healthClass){
        this.healthClass = healthClass;
    }
    @Override
    public void run() {
        System.out.println("Task 2:: 30 seconds completed :: Updating health "
                + "status to AMBER");
        healthClass.setHealthStatus("AMBER");
    }
}
