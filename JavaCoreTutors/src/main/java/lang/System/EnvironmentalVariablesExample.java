package lang.System;

import java.util.Map;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class EnvironmentalVariablesExample {
    public static void main(String[] args) {
        Map vars = System.getenv();

        // Print all defined environmental variables.
        for(Object key: vars.keySet())
            System.out.println("Key: " + key + ", Value: " + vars.get(key));
    }
}