package Net.Url;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class ConvertBetweenURLAndURI {
    public static void main(String[] args) {
        URI uri = null;
        URL url = null;

        // Create URI

        try {
            uri = new URI("http://www.google.com");
            System.out.println("URI created : " + uri);
        }catch (URISyntaxException urise){
            System.out.println("Invalid URI " + urise.getMessage());
        }
        // Convert URI to URL
        try {
            url = uri.toURL();
            System.out.println("URL converted" + url);

        } catch (MalformedURLException murle) {
            System.out.println("Error while converting " + murle);
        }
        // Create URL
        try {
            url = new URL("http://www.google.com/home");
            System.out.println("URL created : " + url);
        }catch (MalformedURLException murlex){
            System.out.println("Invalid URL " + murlex.getMessage());
        }
        // Convert URL to URI
        try {
            uri = url.toURI();
            System.out.println("URI converted " + uri);
        }catch (URISyntaxException urie) {
            System.out.println("Error while converting " + urie.getMessage());
        }
    }
}
