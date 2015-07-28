package GOF.Structural.Decorator;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class SniperSight implements Rifle{
    protected Rifle rifle;

    public SniperSight(Rifle r) {
        this.rifle = r;
    }

    @Override
    public void prepare() {
        this.rifle.prepare();
    }
}
