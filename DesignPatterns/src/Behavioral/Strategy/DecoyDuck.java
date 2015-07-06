package Behavioral.Strategy;

/**
 * Created by Dell on 6/18/2015.
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck!");
    }
}
