package Net.Socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class CreateServerSocket {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9090);

            Socket socket = serverSocket.accept();
            System.out.println("Connected :  " + socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
