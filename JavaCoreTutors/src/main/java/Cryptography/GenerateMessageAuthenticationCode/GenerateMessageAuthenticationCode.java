package Cryptography.GenerateMessageAuthenticationCode;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by O1e6 <NsN> on 11/24/2015.
 */
public class GenerateMessageAuthenticationCode {
    public static void main(String[] args) {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("HmacMD5");

            SecretKey key = keyGen.generateKey();

            Mac mac = Mac.getInstance(key.getAlgorithm());
            mac.init(key);

            String message = "This is a confidential information";

            byte[] b = message.getBytes("UTF-8");

            byte[] diges = mac.doFinal(b);

        } catch (NoSuchAlgorithmException e) {
            System.out.println("No Such Algorithm: " + e.getMessage());
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            System.out.println("Unsupported Encoding: " + e.getMessage());
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            System.out.println("Invalid Key: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
