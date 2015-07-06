package Structural.Bridge;

/**
 * Created by Dell on 6/20/2015.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected  Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
