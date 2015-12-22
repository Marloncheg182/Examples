package Cryptography.ListAvailableEncryptionDecryptionAlgorithms;

import java.security.Provider;
import java.security.Security;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by O1e6 <NsN> on 11/24/2015.
 */
public class ListAvailableEncryptionDecryptionAlgorithms {
    public static void main(String[] args) {
        Provider[] providers = Security.getProviders();
        for (int i = 0; i < providers.length; i++) {
            Set<Object> keys = providers[i].keySet();
            for (Iterator<Object> it = keys.iterator(); it.hasNext(); it.next()) {
                String key = it.next().toString();
                key = key.split(" ")[0];
                if (key.startsWith("Alg.Alias.")) {
                    key = key.substring(10);
                }
                int index = key.indexOf('.');

                String serviceType = key.substring(0, index);
                Set<String> algorithms = getAlgorithms(serviceType);
                for (Iterator<String> iter = algorithms.iterator(); iter.hasNext(); iter.next()) {
                    System.out.println("t" + iter.next());
                }
            }
        }


    }

    private static Set<String> getAlgorithms(String serviceType) {
        Set<String> algorithms = new TreeSet<String>();
        Provider[] providers = Security.getProviders();
        for (int i = 0; i < providers.length; i++) {
            Set<Object> keys = providers[i].keySet();

            for (Iterator<Object> it = keys.iterator(); it.hasNext(); it.next()){
                String key = it.next().toString();
                key = key.split(" ")[0];
                if (key.startsWith(serviceType+ ".")){
                    algorithms.add(key.substring(serviceType.length()+ 1));
                }
                else if (key.startsWith("Alg.Alias." + serviceType+".")){
                    algorithms.add(key.substring(serviceType.length()+11));
                }
            }
        }
        return algorithms;

    }
}
