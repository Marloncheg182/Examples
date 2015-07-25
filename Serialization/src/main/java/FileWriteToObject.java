import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;


/**
 * @author Oleg Romanenchuk
 */
public class FileWriteToObject {
    public static void main(String[] args) {
        try {
            FileInputStream is = new FileInputStream("Example.ser");
            ObjectInputStream ois = new ObjectInputStream(is);
            ExampleObject ex = (ExampleObject)ois.readObject();
            ois.close();
            is.close();
            System.out.println(ex.toString());
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
