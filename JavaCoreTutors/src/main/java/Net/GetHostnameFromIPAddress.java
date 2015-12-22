package Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class GetHostnameFromIPAddress {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("220.240.35.22");

            String hostname = inetAddress.getHostName();
            String canonicalHostname = inetAddress.getCanonicalHostName();
            System.out.println("Hostname: " + hostname);
            System.out.println("Canonical Hostname: " + canonicalHostname);
        } catch (UnknownHostException e) {
            System.out.println("Hos not found: " + e.getMessage());
        }
    }
}
