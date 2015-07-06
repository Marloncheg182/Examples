package Creational.Builder;

/**
 * Created by Dell on 6/20/2015.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
