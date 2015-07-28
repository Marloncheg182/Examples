package GOF.Behavioral.Observer;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public interface Subject {

    public void register(Observer obj);
    public void delete(Observer obj);
    public void notifyObservers();
    public Object getUpdate(Observer obj);
}
