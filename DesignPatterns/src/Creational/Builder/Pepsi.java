package Creational.Builder;

/**
 * Created by Dell on 6/20/2015.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
