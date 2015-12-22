package Strings.StringBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by O1e6 <NsN> on 11/18/2015.
 */
public class StringBuilderClass {
    final static String filename = "C:\\fileTest.txt";

    public static void main(String[] args) {

        //StringBuilder with 16 empty elements
        StringBuilder sb = new StringBuilder();
        sb.append("Hello!");
        System.out.println("sb appends a string: " + sb);

        // append a character
        char c = '!';
        sb.append(c);
        System.out.println("sb after insert: " + sb);

        //StringBuilder with a initialize capacity
        StringBuilder sbnew = new StringBuilder();
        sbnew.append(123456789);
        System.out.println("sb with length " + sbnew.length() + " and capacity " + sbnew.capacity() +
                " appends an int: " + sbnew);

        // delete 234
        sbnew.delete(1, 4);
        System.out.println("sb after deleting: " + sb);

        // read from a file and append into a StringBuilder every new line
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            StringBuilder sbFile = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                // append the line of the file
                sbFile.append(line);
                // separate the line with a '@'
                sbFile.append('@');

                // read the next line of the file
                line = br.readLine();
            }
                // this string contains the character sequence
                String readFile = sbFile.toString();
                br.close();
                System.out.println("from file: " + readFile);


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
