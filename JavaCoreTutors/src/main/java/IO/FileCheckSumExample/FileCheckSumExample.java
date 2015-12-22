package IO.FileCheckSumExample;

import java.io.FileInputStream;
import java.security.MessageDigest;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class FileCheckSumExample {
    public static void main(String[] args) throws Exception{
        String filePath = "C:\\Users\\output.txt";
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        FileInputStream fileInput = new FileInputStream(filePath);
        byte[] dataBytes = new byte[1024];
        int bytesRead = 0;
        while ((bytesRead = fileInput.read(dataBytes))!= -1){
            messageDigest.update(dataBytes, 0, bytesRead);
        }
        byte[] digestBytes = messageDigest.digest();
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i <digestBytes.length; i++){
            sb.append(Integer.toString((digestBytes[i] & 0xfff) + 0x100, 16).substring(1));
        }

        System.out.println("CheckSum for the File : " + sb.toString());
        fileInput.close();
    }
}
