package IO.AssignContentToVarible;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class Assign {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("c:\\logging.log"));

            byte[]datainBytes = new byte[dis.available()];
            dis.readFully(datainBytes);
            dis.close();

            String content = new String (datainBytes, 0, datainBytes.length);

            System.out.println(content);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
