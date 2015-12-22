package Net.Url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class ReadTextFromURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://google.com");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            while ((str = reader.readLine())!= null){
                System.out.println(str);
            }
            reader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            System.out.println("Error while Inputting/Outputting data " + ioe.getMessage());
        }
    }
}
