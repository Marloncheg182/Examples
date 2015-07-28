package GOF.Behavioral.State;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class Run {
    public static void main(String[] args) {
    TVContext tvContext = new TVContext();
    State start = new TVTurnOnState();
    State stop = new TVTurnOffState();

        tvContext.setTv(start);
        tvContext.doAction();

        tvContext.setTv(stop);
        tvContext.doAction();
    }

}
