package Cryptography.GetBytesOfGeneratedSymmetricKey;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

/**
 * Created by O1e6 <NsN> on 11/24/2015.
 */
public class GetBytesOfGeneratedSymmetricKey {
    public static void main(String[] args) {
        try {
             String algorithm = "DESede";

            //Key generator
            KeyGenerator keyGen = KeyGenerator.getInstance(algorithm);

            // Key generation
            SecretKey key = keyGen.generateKey();

            // get the raw key bytes
            byte[] keyBytes = key.getEncoded();

            System.out.println("Key Length : " + keyBytes.length);

        } catch (NoSuchAlgorithmException e) {
            System.out.println("No Such Algorithm : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
