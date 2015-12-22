package IO.SerializationWithTransient;

import java.io.*;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class SerializationExampleMain {
    public static void main(String[] args) throws ClassNotFoundException {
        Student student = new Student("Bill", 20, 8, "No comments from me!");
        System.out.println("Before serialization:\n\t" + student.toString());
        try {
            FileOutputStream file = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(student);

            out.close();
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileInputStream file = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(file);
            Student st = (Student)in.readObject();

            System.out.println("\nStudent serialized and saved.\n\n");

            in.close();
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
