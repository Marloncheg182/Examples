package Patterns.Factory;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class SedanCar extends Car {
    public SedanCar() {
        super(CarType.SEDAN);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building sedan car");
    }
}
