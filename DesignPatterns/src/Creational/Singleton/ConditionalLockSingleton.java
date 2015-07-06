package Creational.Singleton;

/**
 * Created by Dell on 6/19/2015.
 */
public class ConditionalLockSingleton {
    private volatile static ConditionalLockSingleton instance;

    private ConditionalLockSingleton() {
    }
    public static ConditionalLockSingleton getInstance()
    {
        // At first thread catches this case
        // Second thread will catch this condition
        // It will be almost simultaneously
        // That's why it's necessary to check one more time
        // Cuz Thread1 , Thread2 will return true (null)
          if(instance == null)
        {
            // After that, thread entered in this block
            // Realizes new checking of instance
            // synchronization will be used only at once
            // In case of instance == null;
            // Thread added new object.
            synchronized (ConditionalLockSingleton.class){
                if(instance == null){
                    instance = new ConditionalLockSingleton();
                }
            }
        }
        return instance;
    }
}
