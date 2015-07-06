import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Dell on 6/16/2015.
 */
public class WorkWithFile {
    private String path;

    //    ?????????? ?????? ???????
    private RandomAccessFile file;

    //  ?????????????? ???? ? ?????
    public WorkWithFile(String path) {
        this.path = path;
    }

    // ??????? ?? ???????? ??????
    public long goTo(int num) throws IOException {

        // File readable only , is situated at path.
        file = new RandomAccessFile(path, "r");

        // go to  num symbol
        file.seek(num);

        // get a current statement of cursor in file
        long pointer = file.getFilePointer();
        file.close();
        return pointer;
    }

    public String read() throws IOException {
        file = new RandomAccessFile(path, "r");
        String res = "";
        int b = file.read();
        // reading of symbols and summing them in string
        while (b != -1) {
            res = res + (char) b;
            b = file.read();
        }
        file.close();

        return res;
    }

    // Read the file from concrete symbols
    public String readFrom(int numberSymbol) throws IOException {
        // open the file for reading
        file = new RandomAccessFile(path, "r");
        String res = "";

        // input an index on needful symbol for us
        file.seek(numberSymbol);
        int b = file.read();

        // reading by bits, and adding of symbols to string
        while (b != -1) {
            res = res + (char) b;
            b = file.read();
        }
        file.close();
        return res;
    }

    // Writing in file
    public void write(String st) throws IOException {
        // open the file for writing
        file = new RandomAccessFile(path, "rw");


        // writing of string , interpreted in bits
        file.write(st.getBytes());

        // close the file, after this process, written data will reach the file
        file.close();
    }
}
