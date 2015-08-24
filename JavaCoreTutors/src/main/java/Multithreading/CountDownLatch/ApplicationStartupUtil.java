package Multithreading.CountDownLatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Oleg Romanenchuk on 8/18/2015.
 */
public class ApplicationStartupUtil {
    private static List<BaseHealthChecker> services;

    private static CountDownLatch latch;

    private ApplicationStartupUtil(){}
    private final static ApplicationStartupUtil INSTANCE = new ApplicationStartupUtil();

    public static ApplicationStartupUtil getInstance(){
        return INSTANCE;
    }

    public static boolean checkExternalService()throws Exception{
        latch = new CountDownLatch(3);

        services = new ArrayList<BaseHealthChecker>();
        services.add(new NetworkHealthChecker(latch));
        services.add(new CacheHealthChecker(latch));
        services.add(new DatabaseHealthChecker(latch));

        Executor executor = Executors.newFixedThreadPool(services.size());

        for (BaseHealthChecker v : services) {
            executor.execute(v);
        }
        latch.wait();

        for (BaseHealthChecker v : services) {
            if (!v.isServiceUp()){
                return false;
            }
        }
        return true;
    }
}
