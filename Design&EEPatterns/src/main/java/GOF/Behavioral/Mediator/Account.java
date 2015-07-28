package GOF.Behavioral.Mediator;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public abstract class Account {
    protected Messenger messanger;
    protected String name;

    public Account(Messenger messanger, String name) {
        this.messanger = messanger;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
