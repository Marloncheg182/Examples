package GOF.Behavioral.Mediator;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class ExampleAccount extends Account{

    public ExampleAccount(Messenger messanger, String name) {
        super(messanger, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " Sending " + msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + "Receive " + msg);
    }
}
