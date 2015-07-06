package Behavioral.TemplateMethod;

/**
 * Created by Dell on 6/19/2015.
 */
public class Coffe extends CaffeineBeverage  {

    @Override
    void brew() {
        System.out.println("Dripping Coffee though filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }


}
