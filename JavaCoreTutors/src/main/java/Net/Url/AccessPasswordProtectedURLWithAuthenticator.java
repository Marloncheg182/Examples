package Net.Url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class AccessPasswordProtectedURLWithAuthenticator {
    public static void main(String[] args) {
        try {
            Authenticator.setDefault(new CustomAuthenticator());
            URL url = new URL("http://www.google.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = in.readLine())!= null){
                System.out.println(line);
            }
            in.close();
        }catch (MalformedURLException mURLe){
            System.out.println("Error while reading the URL. Invalid URl address " + mURLe.getMessage() );
        } catch (IOException ioe) {
            System.out.println("I/O error " + ioe.getMessage());
        }
    }

    private static class CustomAuthenticator extends Authenticator {
        protected PasswordAuthentication getPasswordAuthenticator(){
            String prompt = getRequestingPrompt();
            String hostname = getRequestingHost();
            InetAddress ipaddr = getRequestingSite();
            int port = getRequestingPort();

            String username = "username";
            String password = "password";

            return new PasswordAuthentication(username, password.toCharArray());
        }
    }
}
