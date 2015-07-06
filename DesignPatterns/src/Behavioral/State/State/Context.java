package Behavioral.State.State;

/**
 * Created by Dell on 6/21/2015.
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }
    public void setState(State state){
        this.state = state;
    }
    public State getState(){
        return state;
    }
}
