package Behavioral.Command.Command;

/**
 * Created by Dell on 6/20/2015.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();

    }
}
