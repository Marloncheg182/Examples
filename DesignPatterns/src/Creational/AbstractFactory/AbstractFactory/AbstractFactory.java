package Creational.AbstractFactory.AbstractFactory;

/**
 * Created by Dell on 6/20/2015.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
