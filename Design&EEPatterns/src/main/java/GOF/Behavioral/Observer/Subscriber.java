package GOF.Behavioral.Observer;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class Subscriber implements Observer {

    private String name;
    private Subject subject;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String)subject.getUpdate(this);
        if (message == null){
            System.out.println(name + ":: No messages taken");
        }else
            System.out.println(name+ ":: Incoming new message" + message);
    }

    @Override
    public void setSubject(Subject subject) {
       this.subject = subject;
    }
}
