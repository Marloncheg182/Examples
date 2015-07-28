package GOF.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class MySubject implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MySubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if (!observers.contains(obj)) observers.add(obj);
        }

    }

    @Override
    public void delete(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
    List<Observer> observers = null;
        synchronized (MUTEX){
            if (!changed)
                return;
            observers = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message sent to observers" + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
