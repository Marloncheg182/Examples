package Creational.FactoryMethod.Factory;

/**
 * Created by Dell on 6/20/2015.
 */
public abstract class Factory {

    abstract Shape getShape(String shapeType);

    void show(){
        System.out.println("This is a factory, that contains a Factory method getShape()");
    }



}
