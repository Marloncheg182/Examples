package IO.BufferedInputStream;

import java.io.*;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class BufferedInputStreamExample {
    public static void main(String[] args) {
        File file = new File("c:\\testing.txt");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);
            while (dis.available()!=0){
                System.out.println(dis.readLine());   // an old version of radLine in DataInputStream, deprecated
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fis.close();
                bis.close();
                dis.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
