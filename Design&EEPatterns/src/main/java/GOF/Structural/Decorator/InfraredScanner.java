package GOF.Structural.Decorator;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class InfraredScanner extends SniperSight {
    public InfraredScanner(Rifle r) {
        super(r);
    }

    @Override
    public void prepare() {
        rifle.prepare();
        System.out.println("Adding the rifle infrared scanner");
    }
}
