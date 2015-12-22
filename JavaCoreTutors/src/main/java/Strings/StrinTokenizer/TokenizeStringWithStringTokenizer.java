package Strings.StrinTokenizer;

import java.util.StringTokenizer;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class TokenizeStringWithStringTokenizer {
    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("Java Examples");

        // lop through tokens
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
