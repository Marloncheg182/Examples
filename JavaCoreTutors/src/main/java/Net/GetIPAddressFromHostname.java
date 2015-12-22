package Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class GetIPAddressFromHostname {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("mywebsite.com");
            byte[] addr = inetAddress.getAddress();
            String ipAddr = "";
            for (int i =0; i < addr.length; i++){
                if (i > 0){
                    ipAddr += ".";
                }
                ipAddr += addr[i] & 0xFF;
            }
            System.out.println("IP Address: " + ipAddr);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
