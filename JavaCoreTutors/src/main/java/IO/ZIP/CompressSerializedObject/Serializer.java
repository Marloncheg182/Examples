package IO.ZIP.CompressSerializedObject;

import IO.SerializationWrite.Address;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.zip.GZIPOutputStream;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class Serializer implements Serializable {
    public static void main(String[] args) {
        Serializer serializer = new Serializer();
        serializer.serializeAddress("wall street", "united state");
    }

    private void serializeAddress(String street, String country) {
        Address address = new Address();
        address.setStreet(street);
        address.setCountry(country);
        try {

            FileOutputStream fos = new FileOutputStream("c:\\address.gz");
            GZIPOutputStream gz = new GZIPOutputStream(fos);

            ObjectOutputStream oos = new ObjectOutputStream(gz);
            oos.writeObject(address);
            oos.close();

            System.out.println("Done");


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
