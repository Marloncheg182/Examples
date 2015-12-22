package OOP.Polymorph.Polymorphism;

import java.util.Random;

/**
 * Created by O1e6 <NsN> on 12/22/2015.
 */
class Shape {
    void drawShape() {

    }

    void eraseShape() {

    }
}

class Circle extends Shape {
    @Override
    void drawShape() {
        System.out.println("Circle.draw()");
    }

    @Override
    void eraseShape() {
        System.out.println("Circle.erase()");
    }
}

class Square extends Shape{
    @Override
    void drawShape() {
        System.out.println("Square.draw()");
    }

    @Override
    void eraseShape() {
        System.out.println("Square.erase()");
    }
}

class Triangle extends Shape{
    @Override
    void drawShape() {
        System.out.println("Triangle.draw()");
    }

    @Override
    void eraseShape() {
        System.out.println("Triangle.erase()");
    }
}

class RandomShapeGenerator{
    private Random rand = new Random();
    public Shape next(){
        switch (rand.nextInt(3)){
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}
public class Polymorphism {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++){
            s[i] = gen.next();
        }

        for (int i = 0; i < s.length; i++){
            s[i].drawShape();
        }
    }
}
