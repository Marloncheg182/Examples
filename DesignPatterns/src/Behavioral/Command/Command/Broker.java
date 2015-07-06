package Behavioral.Command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 6/20/2015.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
