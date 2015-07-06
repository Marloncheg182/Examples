package Behavioral.Observer;

import java.util.ArrayList;

/**
 * Created by Dell on 6/18/2015.
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);

        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }

    }
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure ) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

// This is a subject of Observer model, the class , which implements the
// Subject interface with all methods for registry, remove, notify observers.
// This class also contain set method, which realizes changing of statement/
// Class CurrentConditionsDisplay - is our observer, he implements the interface
// Observer and Display, which respond for methods: update and display.
// When measurements of subject changes, observers take the notifications
// and implement the update method of data, after these actions they display these changes

// We can also implement the nested Java model: class Observable, interface Observer
// But it will not be so flexible as interfaces model.