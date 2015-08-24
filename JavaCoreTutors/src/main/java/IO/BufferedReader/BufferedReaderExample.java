package IO.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class BufferedReaderExample {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader("C:\\testing.txt"));
            while ((sCurrentLine = br.readLine())!= null){
                System.out.println(sCurrentLine);
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
