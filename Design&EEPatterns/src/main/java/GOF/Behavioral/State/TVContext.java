package GOF.Behavioral.State;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class TVContext implements State {

    private State tv;

    public void setTv(State tv) {
        this.tv = tv;
    }

    public State getTv() {
        return tv;
    }

    @Override
    public void doAction() {
        this.tv.doAction();
    }
}
