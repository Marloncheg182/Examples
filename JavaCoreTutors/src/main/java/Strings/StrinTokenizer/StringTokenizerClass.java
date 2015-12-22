package Strings.StrinTokenizer;

import java.util.StringTokenizer;

/**
 * Created by 1 on 10.11.2015.
 */
public class StringTokenizerClass {
    public static void main(String[] args) {
        String str = " Example String Tokenizer";
        String s = " Example Tokenizer";

        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(" " + stringTokenizer.nextToken());
        }
        StringTokenizer stokenizer = new StringTokenizer(s);
        System.out.println("\nThe Stokenizer includes " + stokenizer.countTokens() + " tokens" );
        while (stokenizer.hasMoreElements()){
            String tok = (String)stokenizer.nextElement();
            System.out.println("- "+ tok.toString());
        }
    }
}
