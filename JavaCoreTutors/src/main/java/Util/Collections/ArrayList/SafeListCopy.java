package Util.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by O1e6 <NsN> on 12/17/2015.
 */
public class SafeListCopy {
    public static void output(String[] word) {
        System.out.println("characters=" + word.length);
        for (int i = 0; i < word.length; i++) {
            System.out.println("args{" + i + "}=" + word[i]);
        }
    }

    public static void main(String[] args) {
        List wordList = Collections.synchronizedList(new ArrayList());
        wordList.add("Hello");
        wordList.add("to");
        wordList.add("World!");
        String[] aword = (String[])wordList.toArray(new String[0]);

        output(aword);

        String[] bword;
        synchronized (wordList) {
            int size = wordList.size();
            bword = new String[size];
            wordList.toArray(bword);
        }

        output(bword);
        String[]cword;
        synchronized (wordList){
            cword = (String[]) wordList.toArray(new String[wordList.size()]);
        }
        output(cword);
    }
}
