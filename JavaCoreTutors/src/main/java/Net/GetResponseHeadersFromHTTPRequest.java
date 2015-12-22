package Net;

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
public class GetResponseHeadersFromHTTPRequest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.google.com:80");
        URLConnection connection = url.openConnection();
        Map<String, List<String>> headerFields = connection.getHeaderFields();
        Set<String> hearerFieldsSet = headerFields.keySet();
        Iterator<String> hearerFieldsIter = hearerFieldsSet.iterator();
        while (hearerFieldsIter.hasNext()){
            String headerFieldKey = hearerFieldsIter.next();
            List<String> headerFieldValue = headerFields.get(headerFieldKey);
            StringBuilder sb = new StringBuilder();
            for (String value : headerFieldValue) {
                sb.append(value);
                sb.append("");
            }
            System.out.println(headerFieldKey + "=" + sb.toString());
        }

    }
}
