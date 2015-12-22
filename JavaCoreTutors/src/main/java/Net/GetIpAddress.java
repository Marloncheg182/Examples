package Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class GetIpAddress {
    public static void main(String[] args) throws UnknownHostException{
        // print the IP Address of your machine (inside your local network)
        System.out.println(InetAddress.getLocalHost().getHostAddress());

        // print the IP Address of a web site
        System.out.println(InetAddress.getByName("www.facebook.com"));

        // print all the IP Addresses that are assigned to certain domain
        InetAddress[] inetAddresses = InetAddress.getAllByName("www.google.com");
        for (InetAddress ipAddress : inetAddresses) {
            System.out.println(ipAddress);
        }
    }
}
