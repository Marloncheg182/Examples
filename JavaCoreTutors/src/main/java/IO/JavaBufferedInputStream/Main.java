package IO.JavaBufferedInputStream;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class Main {
    public static void main(String[] args) {
        try {
            HttpClient client = new HttpClient("http://httpbin.org");
            String myIp = client.get("/ip");
            System.out.println(myIp);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
