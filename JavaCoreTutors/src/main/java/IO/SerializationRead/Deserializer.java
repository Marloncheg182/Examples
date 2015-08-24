package IO.SerializationRead;

import IO.SerializationWrite.Address;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class Deserializer {
    public static void main(String[] args) {
        Deserializer deserializer = new Deserializer();
        Address address = deserializer.deserializeAddress();
        System.out.println(address);
    }

    private Address deserializeAddress() {
        Address address;
        try {

            FileInputStream fin = new FileInputStream("c:\\address.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);
            address = (Address)ois.readObject();
            ois.close();

            return address;

        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
