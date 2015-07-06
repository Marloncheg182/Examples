package Behavioral.Observer.ObserverJava;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Dell on 6/18/2015.
 */
public class CurrentDisplay implements Observer, Display {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(observable instanceof Subject)
        {
            Subject subject = (Subject)observable;
            this.temperature = subject.getTemperature();
            this.humidity = subject.getHumidity();
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");

    }
}
