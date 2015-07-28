package GOF.Behavioral.State;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class TVTurnOffState implements State{
    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }
}
