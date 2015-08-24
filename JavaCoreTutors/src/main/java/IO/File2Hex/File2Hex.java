package IO.File2Hex;

import java.io.*;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class File2Hex {
    public static void convertToHex(PrintStream out, File file) throws IOException {
        InputStream is = new FileInputStream(file);

        int bytesCounter = 0;
        int value = 0;
        StringBuilder sbHext = new StringBuilder();
        StringBuilder sbText = new StringBuilder();
        StringBuilder sbResult = new StringBuilder();

        while ((value = is.read()) != -1) {
            //convert to hex value with "X" formatter
            sbHext.append(String.format("%02X", value));

            //if the character is not convertable, print a dot symbol "."
            if (!Character.isISOControl(value)) {
                sbText.append((char) value);
            } else {
                sbText.append(".");
            }

            //if 16 bytes are read, reset the counter, clear the StringBuilder for formatting purpose only.
            if (bytesCounter == 15) {
                sbResult.append(sbHext).append("       ").append(sbText).append("\n");
                sbHext.setLength(0);
                sbText.setLength(0);
                bytesCounter = 0;
            } else {
                bytesCounter++;
            }
        }

        //if still got content
        if (bytesCounter != 0) {
            //add spaces more formatting purpose only
            for (; bytesCounter < 16; bytesCounter++) {
                //1 character 3 spaces
                sbHext.append("     ");
            }
            sbResult.append(sbHext).append("       ").append(sbText).append("\n");
        }
        out.print(sbResult);
        is.close();
    }

    public static void main(String[] args) throws IOException {

        //display output to console
        convertToHex(System.out, new File("c:/file.txt"));

        //write the output into a file
        convertToHex(new PrintStream("c:/file.hex"), new File("c:/file.txt"));

    }
}

