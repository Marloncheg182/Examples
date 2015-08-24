package Multithreading.CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Oleg Romanenchuk on 8/18/2015.
 */
public class NetworkHealthChecker extends BaseHealthChecker {


    public NetworkHealthChecker(CountDownLatch latch) {
        super(latch, "Network Service");
    }

    @Override
    public void verifyService() {
        System.out.println("Checking " + this.getServiceName());
        try {
            Thread.sleep(7000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(this.getServiceName() + " is UP");
    }
}
