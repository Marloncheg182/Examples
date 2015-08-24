package Patterns.Factory;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class LuxuryCar extends Car {
    LuxuryCar(){
        super(CarType.LUXURY);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("Building luxury car");
    }
}
