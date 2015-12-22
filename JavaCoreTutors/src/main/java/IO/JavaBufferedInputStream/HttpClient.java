package IO.JavaBufferedInputStream;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class HttpClient {
    private URL baseUrl;

    public HttpClient(String baseUrl) throws MalformedURLException{
        this.baseUrl = new URL(baseUrl);
    }

    public HttpClient(URL u) {
        this.baseUrl = u;
    }

    public String get (String route)throws IOException{
        StringBuilder sb = new StringBuilder();
        String base = this.baseUrl.getHost();
        URL u = new URL("http://" + base + route);
        URLConnection connection = u.openConnection();

        BufferedInputStream input = new BufferedInputStream(connection.getInputStream());
        while (input.available()>0){
            sb.append((char)input.read());
        }
        return sb.toString();
    }
}
