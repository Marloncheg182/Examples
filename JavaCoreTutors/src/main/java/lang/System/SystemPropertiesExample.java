package lang.System;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class SystemPropertiesExample {
    public static void main(String[] args) {
        // Prints the version of Java.
        System.out.println("Java version: " + System.getProperty("java.version"));

        // Prints the version of the underlying operating system.
        System.out.println("OS version: " + System.getProperty("os.version"));

        // Prints the user's home directory.
        System.out.println("Home directory: " + System.getProperty("user.home"));
    }
}