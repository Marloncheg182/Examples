package GOF.Behavioral.Strategy;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class Run {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Purchase purchase1 = new Purchase("2412", 100);
        Purchase purchase2 =  new Purchase("5223", 200);

        cart.addPurchase(purchase1);
        cart.addPurchase(purchase2);

        cart.pay(new WebmoneyStrategy("myemail@mail.ru", "mypass"));

        cart.pay(new CreditCardStrategy("Oleg Romanenchuk", "14112919212", "344", "11/18"));
    }
}
