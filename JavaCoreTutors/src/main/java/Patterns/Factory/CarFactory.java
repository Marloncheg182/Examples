package Patterns.Factory;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class CarFactory {
    public static Car buildCar(CarType type){
        Car car = null;
        switch (type){
            case SMALL:
                car = new SmallCar();
                break;
            case SEDAN:
                car = new SedanCar();
                break;
            case LUXURY:
                car = new LuxuryCar();
                break;
        }
        return car;
    }
}
