package lang.management;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Date;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class JVMStartTime {
    public static void main(String[] args) {
        RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
        long startTime = bean.getStartTime();

        Date startDate = new Date(startTime);

        System.out.println("Start Time = " + startTime);
        System.out.println("Start Date = " + startDate);
    }
}
