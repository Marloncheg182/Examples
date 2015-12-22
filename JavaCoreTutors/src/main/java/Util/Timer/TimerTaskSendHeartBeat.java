package Util.Timer;



import java.util.Calendar;
import java.util.TimerTask;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class TimerTaskSendHeartBeat extends TimerTask {

    TimerExample healthStatusHolder = null;

    public TimerTaskSendHeartBeat(TimerExample healthStatusHolder){
        this.healthStatusHolder = healthStatusHolder;
    }

    HeartBeatMessage message = null;
    @Override
    public void run() {
        message = new HeartBeatMessage(
                this.healthStatusHolder.getHealthStatus(), Calendar.getInstance().getTimeInMillis(), -1);

        System.out.println("Sending HeartBeat Message");

        // Send the message to Monitoring Dashboard
        System.out.println(message);

        System.out.println("HeartBeat Message Sent");


    }

    class HeartBeatMessage {
        private String status;
        private long heartBeatTime;
        private int errorCode;


        public HeartBeatMessage(String status, long heartBeatTime, int errorCode) {
            this.status = status;
            this.heartBeatTime = heartBeatTime;
            this.errorCode = errorCode;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public long getHeartBeatTime() {
            return heartBeatTime;
        }

        public void setHeartBeatTime(long heartBeatTime) {
            this.heartBeatTime = heartBeatTime;
        }

        public int getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(int errorCode) {
            this.errorCode = errorCode;
        }

        @Override
        public String toString() {
            return "HeartBeatMessage{" +
                    "status='" + status + '\'' +
                    ", heartBeatTime=" + heartBeatTime +
                    ", errorCode=" + errorCode +
                    '}';
        }
    }

}
