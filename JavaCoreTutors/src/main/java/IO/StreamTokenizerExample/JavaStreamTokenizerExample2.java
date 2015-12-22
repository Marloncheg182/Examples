package IO.StreamTokenizerExample;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class JavaStreamTokenizerExample2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/DELL/test.txt");
        StreamTokenizer fileTokenizer = new StreamTokenizer(fileReader);
        while(fileTokenizer.nextToken()!=StreamTokenizer.TT_EOF){
            if (fileTokenizer.ttype== StreamTokenizer.TT_NUMBER){
                System.out.println(fileTokenizer.nval);
            }else if (fileTokenizer.ttype == StreamTokenizer.TT_WORD){
                System.out.println(fileTokenizer.sval);
            }
        }
    }

}
