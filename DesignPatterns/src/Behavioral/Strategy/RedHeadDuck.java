package Behavioral.Strategy;

/**
 * Created by Dell on 6/18/2015.
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Red Head Duck!");
    }
}
