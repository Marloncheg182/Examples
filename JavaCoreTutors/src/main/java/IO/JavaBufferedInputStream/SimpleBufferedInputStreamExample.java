package IO.JavaBufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class SimpleBufferedInputStreamExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:/file.txt"));
            while (in.available()>0){
                sb.append((char)in.read());
            }
            System.out.println("read this:");
            System.out.println(sb.toString());
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
