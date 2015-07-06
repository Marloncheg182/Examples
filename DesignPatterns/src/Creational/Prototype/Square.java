package Creational.Prototype;

/**
 * Created by Dell on 6/20/2015.
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square:: draw() method.");
    }
}
