package security.MessageDigest;

import java.security.MessageDigest;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class Main {
    public static void main(String[] args) throws Exception {


        String str1 = "google.com";

        String str2 = "google";

        byte[] fDigest = getDigest(str1);

        byte[] sDigest = getDigest(str2);


        if (MessageDigest.isEqual(fDigest, sDigest)) {


            System.out.println("str1 is equal to str2");

        } else {


            System.out.println("str1 is NOT equal to str2");

        }
    }

    public static byte[] getDigest(String str) throws Exception {

        MessageDigest hash = MessageDigest.getInstance("MD5");


        byte[] data = str.getBytes();



        hash.update(data);


        return hash.digest();
    }
}
