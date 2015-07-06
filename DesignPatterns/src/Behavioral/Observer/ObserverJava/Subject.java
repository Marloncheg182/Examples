package Behavioral.Observer.ObserverJava;

import java.util.Observable;
import java.util.Observer;
/**
 * Created by Dell on 6/18/2015.
 */
public class Subject extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    public Subject() {
    }
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }
    public float getTemperature(){
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
