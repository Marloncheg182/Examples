package Multithreading.CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Oleg Romanenchuk on 8/18/2015.
 */
public abstract class BaseHealthChecker implements Runnable {
    private CountDownLatch latch;
    private String serviceName;
    private boolean serviceUp;

    public BaseHealthChecker(CountDownLatch latch, String serviceName) {
        this.latch = latch;
        this.serviceName = serviceName;
        this.serviceUp = false;
    }

    public void run() {
        try {
            verifyService();
        }catch (Throwable t){
            t.printStackTrace(System.err);
            serviceUp = false;
        }finally {
            if (latch !=null){
                latch.countDown();
            }
        }
    }

    public String getServiceName() {
        return serviceName;
    }

    public boolean isServiceUp(){
        return serviceUp;
    }
    public abstract void verifyService();
}
