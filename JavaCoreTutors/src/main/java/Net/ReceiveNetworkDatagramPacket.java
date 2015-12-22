package Net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class ReceiveNetworkDatagramPacket {
    public static void main(String[] args) {
        try {
            byte[]buf = new byte[256];
            DatagramSocket socket = new DatagramSocket();
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);

            System.out.println("Packet length: " + packet.getLength());
            System.out.println("Data: " + buf);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
