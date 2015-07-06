package Creational.Singleton;

/**
 * Created by Dell on 6/19/2015.
 */
public class Singleton {
    private static Singleton uniqueInstance;
    // other useful instance variables

    private Singleton() {
    }
    public static Singleton getUniqueInstance(){
        if(uniqueInstance == null)
        {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
}
    // other methods
}

