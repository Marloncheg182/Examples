package Strings.StringWriter;

import java.io.StringWriter;

/**
 * Created by O1e6 <NsN> on 11/18/2015.
 */
public class StringWriterExample {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Lucky guys";

        // Using StringWriter
        StringWriter outputWriter = new StringWriter();
        outputWriter.write(str1,0,8);
        System.out.println(outputWriter.toString());


        //Using StringBuffer

        StringBuffer sbuf = outputWriter.getBuffer();
        sbuf.append(str2);
        System.out.println(outputWriter.toString());

    }
}
