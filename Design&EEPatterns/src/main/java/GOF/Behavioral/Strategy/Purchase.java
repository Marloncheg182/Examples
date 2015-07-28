package GOF.Behavioral.Strategy;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class Purchase {
    private String number;
    private int price;

    public Purchase(String number, int price) {
        this.number = number;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }
}
