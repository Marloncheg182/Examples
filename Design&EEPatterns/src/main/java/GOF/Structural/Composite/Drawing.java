package GOF.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String color) {
        for (Shape shape : shapes) {
            shape.draw(color);
        }
    }
    public void add(Shape shape){
        this.shapes.add(shape);
    }

    public void remove(Shape shape){
        this.shapes.remove(shape);
    }

    public void clear(){
        this.shapes.clear();
    }
}
