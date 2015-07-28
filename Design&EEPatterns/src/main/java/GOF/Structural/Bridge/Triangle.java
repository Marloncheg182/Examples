package GOF.Structural.Bridge;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Triangle extends Shape{

    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }

}
