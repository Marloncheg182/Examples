package Cryptography.EncryptDecryptWithDESUsingPassPhrase;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BASE64DecoderStream;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BASE64EncoderStream;

import javax.crypto.*;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

/**
 * Created by O1e6 <NsN> on 11/25/2015.
 */
public class EncryptDecryptWithDESUsingPassPhrase {
    private static Cipher ecipher;
    private static Cipher dcipher;

    private static final int iterationCount = 10;

    private static byte[] salt = {
            (byte)0xB2, (byte)0x12, (byte)0xD5, (byte)0xB2,
            (byte)0x44, (byte)0x21, (byte)0xC3, (byte)0xC3
    };

    public static void main(String[] args) {
        try {
            String passPhrase = "My Secret Password";

            KeySpec keySpec = new PBEKeySpec(passPhrase.toCharArray(), salt, iterationCount);

            SecretKey key = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);

            AlgorithmParameterSpec parameterSpec = new PBEParameterSpec(salt, iterationCount);

            ecipher = Cipher.getInstance(key.getAlgorithm());
            dcipher = Cipher.getInstance(key.getAlgorithm());

            ecipher.init(Cipher.ENCRYPT_MODE, key, parameterSpec);
            dcipher.init(Cipher.DECRYPT_MODE, key, parameterSpec);
            String encrypted = encrypt("This is a classified message!");
            String decrypted = decrypt(encrypted);
            System.out.println("Decrypted: " + decrypted);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
    }

    public static String encrypt(String str) {
       try {
           byte[]utf8 = str.getBytes("UTF-8");
           byte[]enc = ecipher.doFinal(utf8);
           enc = BASE64EncoderStream.encode(enc);
           return new String(enc);
       } catch (UnsupportedEncodingException e) {
           e.printStackTrace();
       } catch (BadPaddingException e) {
           e.printStackTrace();
       } catch (IllegalBlockSizeException e) {
           e.printStackTrace();
       }
        return null;
    }

    public static String decrypt(String str) {
        try {
            byte[]dec = BASE64DecoderStream.decode(str.getBytes());
            byte[]utf8 = dcipher.doFinal(dec);
            return new String(utf8, "UTF-8");
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
