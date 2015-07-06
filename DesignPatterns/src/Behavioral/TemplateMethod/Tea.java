package Behavioral.TemplateMethod;

/**
 * Created by Dell on 6/19/2015.
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Stepping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }


}

