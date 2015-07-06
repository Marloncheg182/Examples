package Behavioral.Observer;

/**
 * Created by Dell on 6/18/2015.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); // Creating of an object WeatherData

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData); // Creating of a current display
       //  StatisticDisplay  statisticDisplay = new StatisticDisplay(weatherData);   - statistic display
       //  ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);   - forecast display
        weatherData.setMeasurements(80, 65, 30.4F);
        weatherData.setMeasurements(82, 70, 29.2F);
        weatherData.setMeasurements(78, 90, 29.2F);
    }
}
