package Structural.Facade.Facade;

/**
 * Created by Dell on 6/20/2015.
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        this.circle = circle;
        this.rectangle = rectangle;
        this.square = square;
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
