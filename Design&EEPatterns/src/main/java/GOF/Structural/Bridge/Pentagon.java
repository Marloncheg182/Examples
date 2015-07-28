package GOF.Structural.Bridge;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Pentagon extends Shape{

    public Pentagon(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }

}
