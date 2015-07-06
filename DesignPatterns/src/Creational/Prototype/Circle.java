package Creational.Prototype;

/**
 * Created by Dell on 6/20/2015.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle:: draw() method.");
    }
}
