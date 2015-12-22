package Util.Collections.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by 1 on 10.11.2015.
 */
public class MyCollectionsExample {
    public static void main(String[] args) {
        List<Double> temperatureList = new ArrayList<Double>();

        temperatureList.add(33.9);
        temperatureList.add(37.8);
        temperatureList.add(40.5);
        temperatureList.add(15.3);
        temperatureList.add(25.6);

        System.out.println(temperatureList);

        Double max = Collections.max(temperatureList);
        System.out.println("Maximum temperature is " + temperatureList);

        Double min = Collections.min(temperatureList);
        System.out.println("Minimum temperature is " + temperatureList);

        Collections.reverse(temperatureList);
        System.out.println("Reversed List : " + temperatureList);

        List<Double> newTemperatureList = new ArrayList<Double>(temperatureList.size());
        newTemperatureList.add(13.6);
        newTemperatureList.add(10.2);
        newTemperatureList.add(42.9);
        newTemperatureList.add(34.4);
        newTemperatureList.add(27.2);
        System.out.println("New temperature list : " + newTemperatureList);
        Collections.copy(newTemperatureList, temperatureList);
        System.out.println("List after copy : " + newTemperatureList);

        Collections.replaceAll(temperatureList, 45.0, 0.0);
        System.out.println(temperatureList);
    }
}
