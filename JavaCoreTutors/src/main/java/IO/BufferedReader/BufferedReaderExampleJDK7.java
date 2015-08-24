package IO.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class BufferedReaderExampleJDK7 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\testing.txt")))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine())!= null){
                System.out.println(sCurrentLine);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
