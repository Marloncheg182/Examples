package IO.ZIP.DecompressSerializedObject;

import IO.SerializationWrite.Address;

import java.io.*;
import java.util.zip.GZIPInputStream;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class Deserializer implements Serializable {
    public static void main(String[] args) {
        Deserializer deserializer = new Deserializer();
        Address address = deserializer.deserializeAddress();
        System.out.println(address);

    }

    private Address deserializeAddress() {
        Address address;
        try {
            FileInputStream fin = new FileInputStream("c:\\address.gz");
            GZIPInputStream gis = new GZIPInputStream(fin);
            ObjectInputStream ois = new ObjectInputStream(gis);
            address = (Address)ois.readObject();
            ois.close();

            return address;

        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
