package IO.StreamTokenizer;

import java.io.FileReader;
import java.io.StreamTokenizer;

/**
 * Created by O1e6 <NsN> on 11/26/2015.
 */
public class Tokenize {
    public static void main(String[] args)throws Exception{
        FileReader fileReader = new FileReader("C:/Users/Main.java");
        StreamTokenizer tokenizer = new StreamTokenizer(fileReader);
        tokenizer.parseNumbers();
        tokenizer.wordChars('_', '_');
        tokenizer.eolIsSignificant(true);
        tokenizer.ordinaryChars(0, ' ');
        tokenizer.slashSlashComments(true);
        tokenizer.slashStarComments(true);

        int tok = tokenizer.nextToken();
        while (tok != StreamTokenizer.TT_EOF){
            tok = tokenizer.nextToken();
            switch (tok){
                case StreamTokenizer.TT_NUMBER:
                    double n = tokenizer.nval;
                    System.out.println(n);
                    break;
                case StreamTokenizer.TT_WORD:
                    String word = tokenizer.sval;
                    System.out.println(word);
                    break;
                case '"':
                    String doublequote = tokenizer.sval;
                    System.out.println(doublequote);
                    break;
                case ' ' :
                    String singlequoute = tokenizer.sval;
                    System.out.println(singlequoute);
                    break;
                case StreamTokenizer.TT_EOL:
                    break;
                case StreamTokenizer.TT_EOF:
                    break;
                default:
                    char character = (char)tokenizer.ttype;
                    System.out.println(character);
                    break;
            }
        }
        fileReader.close();
    }
}
