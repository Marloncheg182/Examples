package Cryptography.ListAvailableCryptographicServices;

import java.security.Provider;
import java.security.Security;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by O1e6 <NsN> on 11/25/2015.
 */
public class ListAvailableCryptographicServices {
    public static void main(String[] args) {
        Set<String> serviceTypes = new TreeSet<String>();
        Provider[]providers = Security.getProviders();
        for (int i = 0; i < providers.length; i++){
            Set<Object> keys = providers[i].keySet();
            for (Iterator<Object> it = keys.iterator(); it.hasNext();){
                String key = it.next().toString();
                key = key.split(" ")[0];
                if (key.startsWith("Alg.Alias.")){
                    key = key.substring(10);
                }
                int index = key.indexOf('.');
                serviceTypes.add(key.substring(0, index));

            }
        }
        for (Iterator<String> it = serviceTypes.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
}
