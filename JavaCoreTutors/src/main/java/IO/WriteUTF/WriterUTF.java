package IO.WriteUTF;

import java.io.*;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class WriterUTF {
    public static void main(String[] args) {
        try {
            File dir = new File("c:\\temp\\test.txt");

            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dir), "UTF-8"));
            out.append("Website UTF-8").append("\r\n");
            out.append("?? UTF-8").append("\r\n");
            out.append("?????? UTF-8").append("\r\n");

            out.flush();
            out.close();

        }catch (UnsupportedEncodingException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
