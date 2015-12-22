package Strings.StrinTokenizer;

import java.util.StringTokenizer;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class StringTokenizerWithSpecifiedDelimiter {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("Java-Examples", "-");

        while(st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        System.out.println();

        // Method 2. using nextToken() with the specified delimiter
        StringTokenizer st2 = new StringTokenizer("Java-Examples");

        //iterate through tokens
        while(st2.hasMoreTokens()) {
            System.out.println(st2.nextToken("-"));
        }

    }
}
