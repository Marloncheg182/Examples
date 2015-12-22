package Util.Collections.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by 1 on 10.11.2015.
 */
public class CollectionsExample {
    public static void main(String[] args) {
        List<Double> temperatureList = new ArrayList<Double>();
        temperatureList.add(40.5);
        temperatureList.add(33.9);
        temperatureList.add(37.8);
        temperatureList.add(15.3);
        temperatureList.add(25.6);

        System.out.println(temperatureList);

        Collections.sort(temperatureList);
        System.out.println("Sorted list " + temperatureList);

        int searchIndex = Collections.binarySearch(temperatureList,37.8);
        if (searchIndex >= 0){
            System.out.println("Temperature found");
        }else {
            System.out.println("Temperature not found");
        }

        Collections.shuffle(temperatureList);
        System.out.println("Shuffled list " + temperatureList);

        Collections.fill(temperatureList, 0.0);
        System.out.println("Filled list " + temperatureList);
    }
}
