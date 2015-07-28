package GOF.Behavioral.Strategy;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class WebmoneyStrategy implements PaymentStrategy{
    private String email;
    private String password;

    public WebmoneyStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "paid with web money");
    }
}
