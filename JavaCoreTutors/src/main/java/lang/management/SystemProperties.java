package lang.management;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Map;
import java.util.Set;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class SystemProperties {
    public static void main(String[] args) {
        RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
        Map<String, String> properties = bean.getSystemProperties();
        Set<String> keys = properties.keySet();
        for (String key : keys) {
            String value = properties.get(key);
            System.out.println("Property[" + key + "] = " + value);
        }
    }
}
