package Creational.Builder;

/**
 * Created by Dell on 6/20/2015.
 */
public abstract class Burger implements Item {


    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}

