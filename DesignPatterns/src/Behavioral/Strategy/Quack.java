package Behavioral.Strategy;

/**
 * Created by Dell on 6/18/2015.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
