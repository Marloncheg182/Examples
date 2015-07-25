import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Oleg Romanenchuk
 */
public class ObjectWriteToFile {
    public static void main(String[] args) {
        ExampleObject object = new ExampleObject();
        object.setAge(25);
        object.setGender("Male");
        object.setName("Oleg");
        object.setRole("Developer");

        try {
            FileOutputStream fos = new FileOutputStream("Example.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
            System.out.println("Success");
            System.out.println(object.toString());
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
