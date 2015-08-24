package IO.StringToInputStream;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class StringToInputStreamExample {
    public static void main(String[] args) throws IOException {
        String str = "This is a String input stream Testing";

        //convert String into InputStream
        InputStream is = new ByteArrayInputStream(str.getBytes());

        //red it with BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
