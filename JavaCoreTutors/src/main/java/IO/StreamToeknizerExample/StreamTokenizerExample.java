package IO.StreamToeknizerExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class StreamTokenizerExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);

        BufferedReader reader = new BufferedReader(fileReader);
        StreamTokenizer streamTokenizer = new StreamTokenizer(reader);
        streamTokenizer.ordinaryChar('.');
        streamTokenizer.wordChars(',', ',');

        while (streamTokenizer.nextToken() != streamTokenizer.TT_EOF){
            switch (streamTokenizer.ttype){
                case StreamTokenizer.TT_WORD:
                    System.out.println(streamTokenizer.lineno() + ")" + streamTokenizer.sval);
                    break;
                case StreamTokenizer.TT_NUMBER:
                    System.out.println(streamTokenizer.lineno() + ")" + streamTokenizer.nval);
                    break;
                default:
                    System.out.println(streamTokenizer.lineno() + ")" + (char)streamTokenizer.ttype);
            }
        }
        fileReader.close();
    }
}
