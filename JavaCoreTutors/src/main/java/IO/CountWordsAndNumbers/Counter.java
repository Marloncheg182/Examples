package IO.CountWordsAndNumbers;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/**
 * Created by O1e6 <NsN> on 11/26/2015.
 */
public class Counter {
    public static void main(String[] args) throws IOException {
        int wordCount = 0, numberCount = 0;
        StreamTokenizer tokenizer = new StreamTokenizer(new FileReader("C:/Users/output.txt"));
        while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
            if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
                wordCount++;
            } else if (tokenizer.ttype == StreamTokenizer.TT_NUMBER) {
            numberCount++;
            }
        }
        System.out.println("Words in file : " + wordCount);
        System.out.println("Numbers in file : " + numberCount);
    }
}
