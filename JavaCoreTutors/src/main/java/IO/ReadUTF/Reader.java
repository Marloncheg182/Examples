package IO.ReadUTF;

import java.io.*;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class Reader {
    public static void main(String[] args) {
        try {
            File dir = new File("c:\\temp\\test.txt");

            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(dir), "UTF-8"));

            String str;

            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
