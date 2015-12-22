package Net.Url;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URLEncoder;
import java.net.UnknownHostException;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class SendHTTPPOSTRequestWithSocket {
    public static void main(String[] args) {
        try {
            String params = URLEncoder.encode("param1", "UTF-8") + "=" + URLEncoder.encode("value1", "UTF-8");
            params += "&" + URLEncoder.encode("param2", "UTF-8") + "=" + URLEncoder.encode("value2", "UTF-8");
            String hostname = "mysite.com";
            int port = 9090;

            InetAddress addr = InetAddress.getByName(hostname);
            Socket socket = new Socket(addr, port);
            String path = "/myapp";

            // Send headers
            BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            wr.write("POST " + path + " HTTP/1.Orn");
            wr.write("Content-Length: " + params.length() + "rn");
            wr.write("Content-Type: application/x-www-form-urlencodedrn");
            wr.write("rn");

            // Send parameters
            wr.write(params);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            while ((line = rd.readLine())!=null){
                System.out.println(line);
            }
            wr.close();
            rd.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
