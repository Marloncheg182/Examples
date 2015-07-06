package Behavioral.Mediator;

/**
 * Created by Dell on 6/19/2015.
 */
public class MediatorLoader {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
