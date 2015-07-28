package GOF.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class MessengerImpl implements Messenger {

    private List<Account> accounts;

    public MessengerImpl() {
        this.accounts = new ArrayList<>();
    }

    @Override
    public void addAccount(Account account) {
        this.accounts.add(account);
}

    @Override
    public void sendMessage(String msg) {
        for (Account acc : accounts) {
            if (acc != accounts){
                acc.receive(msg);
        }
    }
}
}
