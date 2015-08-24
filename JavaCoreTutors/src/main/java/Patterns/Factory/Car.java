package Patterns.Factory;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public abstract class Car {
    public Car(CarType model){
        this.model = model;
        arrangeParts();
    }
    private void arrangeParts(){}

    protected abstract void construct();

    private CarType model = null;

    public CarType getModel(){
        return model;
    }

    public void setModel(CarType model){
        this.model = model;
    }
}
