package Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 6/21/2015.
 */
public class CarTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
