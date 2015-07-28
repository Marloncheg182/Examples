package GOF.Structural.Decorator;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class HighZoom extends SniperSight {
    public HighZoom(Rifle r) {
        super(r);
    }

    @Override
    public void prepare() {
        rifle.prepare();
        System.out.println("Adding a high zoom on a sniper sight");
    }
}
