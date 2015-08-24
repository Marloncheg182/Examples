package Strings;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class StringConcatenation {
    public static void main(String[] args) {
        String str = new String("Oleg");
        str += "Romanenchuk";

        StringBuffer stringBuffer = new StringBuffer("Oleg");
        stringBuffer.append("Romanenchuk");
    }
}
