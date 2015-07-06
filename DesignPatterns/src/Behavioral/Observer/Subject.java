package Behavioral.Observer;



/**
 * Created by Dell on 6/18/2015.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}


