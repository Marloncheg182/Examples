package IO.GetFileCreationDate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class GetFileCreationDateExample {
    public static void main(String[] args) {
        try {
            Process ps = Runtime.getRuntime().exec("cmd /c dir c:\\logfile.log /tc");

            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));

            String data = "";

            //it's quite stupid but work
            for (int i = 0; i < 6; i++){
                data = br.readLine();
            }
            System.out.println("Extracted value : " + data);

            // split by space
            StringTokenizer st = new StringTokenizer(data);
            String date = st.nextToken();//Get date
            String time = st.nextToken();//Get time

            System.out.println("Creation Date : " + date);
            System.out.println("Creation Time : " + time);


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
