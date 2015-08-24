package Abstraction.Interface;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }
}
