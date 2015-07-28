package GOF.Structural.Bridge;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Run {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }

}