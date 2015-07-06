package Behavioral.Memento;

/**
 * Created by Dell on 6/19/2015.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
