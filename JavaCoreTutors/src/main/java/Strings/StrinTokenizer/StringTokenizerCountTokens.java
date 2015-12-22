package Strings.StrinTokenizer;

import java.util.StringTokenizer;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class StringTokenizerCountTokens {
    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer("Java Code Geeks - Java Examples");

        System.out.println("Remaining Tokens: " + tokenizer.countTokens());

        // loop through tokens
        while (tokenizer.hasMoreTokens()) {
            System.out.println("Token:" + tokenizer.nextToken());
            System.out.println("Remaining Tokens: " + tokenizer.countTokens());
        }
    }
}
