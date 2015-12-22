package IO.FileReaderExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by 1 on 10.11.2015.
 */
public class FileReaderExample {
    private static final String OUTPUT_FILE = "C:\\Testfile.txt";

    public static void main(String[] args) {
        char[] chars = new char[100];
        char[] chars2 = new char[100];

        try(FileReader fileReader = new FileReader(new File(OUTPUT_FILE)))
        {

            int r = fileReader.read();
            System.out.println("Read byte " + r);

            int charsRead = fileReader.read(chars);
            System.out.println("Read bytes " + charsRead);
            System.out.println(Arrays.toString(chars));

            int charsRead2 = fileReader.read(chars2);
            System.out.println("Read bytes " + charsRead2);
            System.out.println(Arrays.toString(chars2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
