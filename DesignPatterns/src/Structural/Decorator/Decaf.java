package Structural.Decorator;

/**
 * Created by Dell on 6/18/2015.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
