package IO.JavaBufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class SimpleBufferedOutputStreamExample {
    public static void main(String[] args) {
        try {
            BufferedOutputStream stream = new BufferedOutputStream(
                    new FileOutputStream("textfile.txt"));
            stream.write("Hello, World!".getBytes());
            stream.write(System.lineSeparator().getBytes());
            stream.write("I am writting into a file using BufferedOutputStream".getBytes());
            stream.write(System.lineSeparator().getBytes());
            stream.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
