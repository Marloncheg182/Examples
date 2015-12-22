package Cryptography.EncryptDecryptFileStreamWithDES;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.io.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;

/**
 * Created by O1e6 <NsN> on 11/24/2015.
 */
public class EncryptDecryptFileStreamWithDES {
    private static Cipher ecipher;
    private static Cipher dcipher;


    private static byte[] iv = {
            (byte) 0xB2, (byte) 0x12, (byte) 0xD5, (byte) 0xB2,
            (byte) 0x44, (byte) 0x21, (byte) 0xC3, (byte) 0xC3};

    public static void main(String[] args) {
        try {
            SecretKey key = KeyGenerator.getInstance("DES").generateKey();
            AlgorithmParameterSpec parameterSpec = new IvParameterSpec(iv);
            ecipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            dcipher = Cipher.getInstance("DES/CBC/PKKS5Padding");
            ecipher.init(Cipher.ENCRYPT_MODE, key, parameterSpec);
            dcipher.init(Cipher.DECRYPT_MODE, key, parameterSpec);
            encrypt(new FileInputStream("cleartext.txt"), new FileOutputStream("encrypted.dat"));
            decrypt(new FileInputStream("encrypted.dat"), new FileOutputStream("cleartext-reversed.txt"));

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void encrypt(InputStream is, OutputStream os){
        try {
            byte[]buf = new byte[1024];
            os = new CipherOutputStream(os, ecipher);
            int numRead = 0;
            while ((numRead = is.read(buf))>=0){
                os.write(buf,0, numRead);
                os.close();
            }
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }

    private static void decrypt(InputStream is, OutputStream os){
        try {
            byte[]buf = new byte[1024];
            CipherInputStream cis = new CipherInputStream(is, dcipher);
            int numRead = 0;
            while ((numRead = cis.read(buf))>=0){
                os.write(buf, 0, numRead);
            }
            cis.close();
            is.close();
            os.close();
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
