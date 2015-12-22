package Net.Socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class CreateClientSocket {
    public static void main(String[] args) {
        // Creating a socket
        try {
            InetAddress ia = InetAddress.getByName("mywebsite.com");
            int port = 9090;
            Socket socket = new Socket(ia, port);

            System.out.println("Socket connected...");

            // Read text from Socket
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str;
            while ((str = reader.readLine())!= null){
                System.out.println(str);
            }
            reader.close();

            // Write text to Socket
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write("Simple request to be written");
            writer.flush();
            writer.close();


        }catch (UnknownHostException uhe){
            System.out.println("Host not found: " + uhe.getMessage());
        }catch (IOException ioe){
            System.out.println("Exception in I/O process: " + ioe.getMessage());
        }
    }
}
