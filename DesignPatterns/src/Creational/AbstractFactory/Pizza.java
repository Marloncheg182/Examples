package Creational.AbstractFactory;

import java.util.ArrayList;

/**
 * Created by Dell on 6/18/2015.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;


    abstract void prepare(); {
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350 degrees");

    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slice");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + this.name + " ----\n");
        if(this.dough != null) {
            result.append(this.dough);
            result.append("\n");
        }

        if(this.sauce != null) {
            result.append(this.sauce);
            result.append("\n");
        }

        if(this.cheese != null) {
            result.append(this.cheese);
            result.append("\n");
        }

        if(this.veggies != null) {
            for(int i = 0; i < this.veggies.length; ++i) {
                result.append(this.veggies[i]);
                if(i < this.veggies.length - 1) {
                    result.append(", ");
                }
            }

            result.append("\n");
        }

        if(this.clam != null) {
            result.append(this.clam);
            result.append("\n");
        }

        if(this.pepperoni != null) {
            result.append(this.pepperoni);
            result.append("\n");
        }

        return result.toString();
    }
}
