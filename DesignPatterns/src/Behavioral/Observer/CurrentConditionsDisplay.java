package Behavioral.Observer;

/**
 * Created by Dell on 6/18/2015.
 */
public class CurrentConditionsDisplay implements  Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float preassure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }
    public void display(){
        System.out.println("Current conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");
    }
}
