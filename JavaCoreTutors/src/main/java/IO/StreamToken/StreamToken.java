package IO.StreamToken;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/**
 * Created by O1e6 <NsN> on 11/26/2015.
 */
public class StreamToken {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        fr = new FileReader("C:/Users/output.txt");
        StreamTokenizer st = new StreamTokenizer(fr);
        st.lowerCaseMode(true);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            switch (st.ttype) {
                case '"':
                    System.out.println("String = " + st.sval);
                    break;
                case StreamTokenizer.TT_EOL:
                    System.out.println("End-of-line");
                    break;
                case StreamTokenizer.TT_NUMBER:
                    System.out.println("Number = " + st.nval);
                    break;
                case StreamTokenizer.TT_WORD:
                    System.out.println("Word = " + st.sval);
                    break;
                default:
                    System.out.println("Other = " + (char) st.ttype);

            }
        }
    }
}
