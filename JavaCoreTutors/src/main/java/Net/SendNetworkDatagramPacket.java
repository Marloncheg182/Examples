package Net;

import java.io.IOException;
import java.net.*;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class SendNetworkDatagramPacket {
    public static void main(String[] args) {
        try {
            byte[] data = { 0x1, 0x2};
            InetAddress addr = InetAddress.getByName("myhost");
            int port = 1234;

            DatagramPacket request = new DatagramPacket(data, data.length, addr, port);
            DatagramSocket socket = new DatagramSocket();
            socket.send(request);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
