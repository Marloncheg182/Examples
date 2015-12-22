package IO.JavaBufferedOutputStream;

import java.io.*;
import java.util.Date;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class Logger {
    private BufferedOutputStream stream;

    public Logger(String filename) throws FileNotFoundException {
        this.stream = new BufferedOutputStream(new FileOutputStream(filename));
    }

    public Logger(File f) throws FileNotFoundException {
        this.stream = new BufferedOutputStream(new FileOutputStream(f));
    }

    public void log(String s) throws IOException {
        String date = new Date().toString();
        String message = String.format("%s : %s", date, s);

        this.stream.write(message.getBytes());
        this.stream.write(System.lineSeparator().getBytes());
        this.stream.flush();
    }

    public void close() throws IOException {
        this.stream.close();
    }
}