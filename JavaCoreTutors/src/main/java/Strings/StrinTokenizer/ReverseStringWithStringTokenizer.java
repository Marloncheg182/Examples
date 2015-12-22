package Strings.StrinTokenizer;

import java.util.StringTokenizer;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class ReverseStringWithStringTokenizer {
    public static void main(String[] args) {
        String s = "Java Example";
        StringTokenizer st = new StringTokenizer(s);

        String sReversed = "";

        while (st.hasMoreTokens()) {
            sReversed = st.nextToken() + " " + sReversed;
        }

        System.out.println("Original string is : " + s);
        System.out.println("Reversed string is : " + sReversed);
    }
}
