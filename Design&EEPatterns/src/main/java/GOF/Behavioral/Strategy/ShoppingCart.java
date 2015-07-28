package GOF.Behavioral.Strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class ShoppingCart {
    List<Purchase> purchases;

    public ShoppingCart() {
        this.purchases = new ArrayList<Purchase>();
    }

    public void addPurchase(Purchase purchase){
        this.purchases.add(purchase);
    }

    public void removePurchase(Purchase purchase){
        this.purchases.remove(purchase);
    }

    public int calculate(){
        int sum = 0;
        for (Purchase purchase : purchases) {
            sum+=purchase.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy strategy){
        int amount = calculate();
        strategy.pay(amount);
    }
}
