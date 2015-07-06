package Behavioral.Mediator;

import java.util.Date;

/**
 * Created by Dell on 6/21/2015.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
