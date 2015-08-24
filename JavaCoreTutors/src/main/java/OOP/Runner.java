package OOP;

/**
 * Created by Oleg Romanenchuk on 8/3/2015.
 */
public class Runner {
    public static void main(String[] args) {
        Classic cl1 = new AntiClassic("Hello", "World");
        cl1.doFirstAction("Hello");
        cl1.doSecondAction("Hello","World");
        ClassicInterface cl2= new AntiClassic("Hello", "World");
        cl2.doFirstAction("Hello", "World");
        cl2.doSecondAction("World");
    }
}
