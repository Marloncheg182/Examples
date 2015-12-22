package IO.RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by O1e6 <NsN> on 11/24/2015.
 */
public class RandomAccessFileExample {
    static final String FILEPATH = "C:/Users/input.txt";

    public static void main(String[] args) {
        try {
            System.out.println(new String(readFromFile(FILEPATH, 150, 23)));
            writeToFile(FILEPATH, "Simple input", 22);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static byte[] readFromFile(String filepath, int position, int size) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filepath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    private static void writeToFile(String filepath, String data, int position) throws IOException{

        RandomAccessFile file = new RandomAccessFile(filepath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }

}
