package IO.BufferedReaderExample;

import java.io.*;
import java.util.Arrays;

/**
 * Created by 1 on 10.11.2015.
 */
public class BufferedReaderExample {
    private static final String OUTPUT_FILE = "C:\\Testfile.txt";

    public static void main(String[] args) {
        String str ="";
        char[] chars = new char[100];
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(OUTPUT_FILE)),4096)){

            reader.read(chars);
            System.out.println(Arrays.toString(chars));

            Arrays.fill(chars, ' ');
            reader.read(chars,7,20);
            System.out.println(Arrays.toString(chars));
            while ((str = reader.readLine())!= null){
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
