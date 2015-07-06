package Structural.Decorator;

/**
 * Created by Dell on 6/18/2015.
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
