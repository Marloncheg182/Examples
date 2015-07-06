package Structural.Facade.Facade;

/**
 * Created by Dell on 6/20/2015.
 */
public class FacadeLoader {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
