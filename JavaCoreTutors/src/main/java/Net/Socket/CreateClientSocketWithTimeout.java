package Net.Socket;

import java.io.IOException;
import java.net.*;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class CreateClientSocketWithTimeout {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("myweb.com");
            int port = 9090;

            // Creating a socket address
            SocketAddress socketAddress = new InetSocketAddress(address, port);

            Socket socket = new Socket();
            int timeout = 1000;

            socket.connect(socketAddress,timeout);
            System.out.println("Connected to socket " + socket);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
