package IO.BufferedReaderExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by 1 on 10.11.2015.
 */
public class ExampleSecond {
    private static final String OUTPUT_FILE = "C:\\Testfile.txt";

    public static void main(String[] args) {
        String str = "";
        char[] chars = new char[1000];
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(OUTPUT_FILE)), 4096)) {
            while ((reader.read(chars))!= -1){
                String chunk = new String(chars);
                System.out.println(chunk);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}