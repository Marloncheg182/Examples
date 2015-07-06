package Structural.Adapter;

/**
 * Created by Dell on 6/19/2015.
 */
public class MallardDuck implements Duck {
    public MallardDuck() {
    }

    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I\'m flying");
    }
}

