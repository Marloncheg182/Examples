package IO.InputStreamToString;

import java.io.*;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class InputStreamToStringExample {
    public static void main(String[] args) {
        InputStream is = new ByteArrayInputStream("simple content".getBytes());

        String testing = getStringFromInputStream(is);

        System.out.println(testing);
        System.out.println("Done");
    }

    //convert InputStream to String
    private static String getStringFromInputStream(InputStream is) {

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) ;
            sb.append(line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();
    }
}
