package Creational.Singleton;

/**
 * Created by Dell on 6/19/2015.
 */
public class SynchronizedSingleton {
    public static SynchronizedSingleton instance;
    private SynchronizedSingleton(){}

    public static synchronized SynchronizedSingleton getInstance()
    {
        // Second thread will be waiting till the first thread
        // stop his action inside the synchronized block.
        // When the first thread return instance = new Object();
        // second thread will enter in synchronized block.
        // In case, that instance will not be null for second thread,
        // he will not create a new exemplar from Private constructor
        if(instance == null)
        {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
