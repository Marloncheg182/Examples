package Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class GetIPAddressAndHostnameFromLocalMachine {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            byte[] addr = inetAddress.getAddress();

            String ipAddr = "";
            for (int i = 0; i < addr.length; i++) {
                if (i > 0) {
                    ipAddr += ".";
                }
                ipAddr += addr[i] & 0xFF;
            }
            String hostname = inetAddress.getHostName();
            System.out.println("IP Address: " + ipAddr);
            System.out.println("Hostname: " + hostname);
        }
        catch (UnknownHostException ue){
            System.out.println("Host not found: " + ue.getMessage());
        }
    }
}
