package GOF.Creational.Singleton;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class DoubleCheckedSingleton {
    private static DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {
    }
    public static DoubleCheckedSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (DoubleCheckedSingleton.class) {
                if(instance == null){
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}
