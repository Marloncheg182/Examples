package GOF.Behavioral.Mediator;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class Run {
    public static void main(String[] args) {
        Messenger mediator = new MessengerImpl();
        Account account1 = new ExampleAccount(mediator , "Oleg");
        Account account2 = new ExampleAccount(mediator , "Vitali");
        mediator.addAccount(account1);
        mediator.addAccount(account2);

        account1.send("Hi!");
    }
}
