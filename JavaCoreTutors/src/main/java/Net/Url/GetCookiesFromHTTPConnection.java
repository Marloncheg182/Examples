package Net.Url;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class GetCookiesFromHTTPConnection {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.google.com:9090");
        URLConnection connection = url.openConnection();
        Map<String, List<String>> headerFields = connection.getHeaderFields();
        Set<String> headerFiledsSet = headerFields.keySet();
        Iterator<String> headerFieldsIterator = headerFiledsSet.iterator();
        while (headerFieldsIterator.hasNext()){
            String headerFieldKey = headerFieldsIterator.next();
            if ("Set-Cookie".equalsIgnoreCase(headerFieldKey)){
                List<String> headerFieldValue = headerFields.get(headerFieldKey);
                for (String headerValue : headerFieldValue) {
                    System.out.println("Cookie Found...");
                    String[] fields = headerValue.split(";s*");
                    String cookieValue = fields[0];
                    String expires = null;
                    String path = null;
                    String domain = null;
                    boolean secure = false;

                    for (int j = 1; j < fields.length; j++){
                        if ("secure".equalsIgnoreCase(fields[j])){
                            secure = true;
                        }
                        else if (fields[j].indexOf('=')>0){
                            String[]f = fields[j].split("=");
                            if ("epires".equalsIgnoreCase(f[0])){
                                expires = f[1];
                            }
                            else if ("domain".equalsIgnoreCase(f[0])){
                                domain = f[1];
                            }
                            else if ("path".equalsIgnoreCase(f[0])){
                                path = f[1];
                            }
                        }
                    }
                    System.out.println("cookieValue:" + cookieValue);
                    System.out.println("expires:" + expires);
                    System.out.println("path:" + path);
                    System.out.println("domain:" + domain);
                    System.out.println("secure:" + secure);

                    System.out.println("*****************************************");
                }
            }

        }

    }
}
