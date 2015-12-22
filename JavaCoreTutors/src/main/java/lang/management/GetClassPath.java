package lang.management;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class GetClassPath {
    public static void main(String[] args) {
        RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
        System.out.println("The class path is " + bean.getClassPath());
    }
}
