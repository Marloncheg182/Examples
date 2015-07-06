package Structural.Composite.Example2;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isVegetarian() {
        return this.vegetarian;
    }

    public Iterator createIterator() {
        return new NullIterator();
    }

    public void print() {
        System.out.print("  " + this.getName());
        if(this.isVegetarian()) {
            System.out.print("(v)");
        }

        System.out.println(", " + this.getPrice());
        System.out.println("     -- " + this.getDescription());
    }
}
