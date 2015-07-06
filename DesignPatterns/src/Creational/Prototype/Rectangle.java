package Creational.Prototype;

/**
 * Created by Dell on 6/20/2015.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle:: draw() method.");
    }
}
