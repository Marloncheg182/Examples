package Util.Collections.Vector;

import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/17/2015.
 */
public class VectorCopyExample {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.addElement("Hello");
        vector.addElement("to");
        vector.addElement("World!");

        String[]wordArray;
        synchronized (vector){
            int size = vector.size();
            wordArray = new String[size];
            for (int i = 0; i <wordArray.length; i++){
                wordArray[i]= (String)vector.elementAt(i);
            }
        }
        System.out.println("word.length" + wordArray.length);
        for (int i = 0; i < wordArray.length; i++){
            System.out.println("[" + i + "]=" + wordArray[i]);
        }
    }
}
