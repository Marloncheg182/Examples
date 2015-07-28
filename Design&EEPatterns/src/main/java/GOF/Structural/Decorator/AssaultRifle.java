package GOF.Structural.Decorator;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class AssaultRifle implements Rifle {
    @Override
    public void prepare() {
        System.out.println(" Prepared assault riffle");
    }
}
