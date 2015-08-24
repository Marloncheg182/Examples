package IO.SerializationWrite;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class Serializer {
    public static void main(String[] args) {

        Serializer serializer = new Serializer();
        serializer.serializeAddress("wall street", "united state");
    }

    private void serializeAddress(String street, String country) {

        Address address = new Address();
        address.setStreet(street);
        address.setCountry(country);

        try {
            FileOutputStream fout = new FileOutputStream("c:\\address.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(address);
            oos.close();
            System.out.println("Done");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
