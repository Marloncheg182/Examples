package Net;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class SendCookieWithHTTPRequest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.google.com:80");
        URLConnection connection = url.openConnection();

        connection.setRequestProperty("Cookie", "name1=value1; name2=value2");
        connection.connect();
    }
}
