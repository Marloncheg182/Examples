package lang.System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class ReadLineExample {
    public static void main(String[] args)throws IOException{
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        //Read a line from the standard input.
        String inputLine = rd.readLine();

        // Reverse the string.
        StringBuilder builder = new StringBuilder(inputLine);
        builder.reverse();

        System.out.println("Input string: " + inputLine);
        System.out.println("Reversed string: " + builder.toString());
        System.err.println("Reversed string: " + builder.toString());

        // Close the stream.
        rd.close();
    }
}
