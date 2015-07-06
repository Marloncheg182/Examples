import org.apache.log4j.Logger;
/**
 * Created by Dell on 6/17/2015.
 */
public class OrderLogic {

    //Initialization of logger
    private static final Logger log = Logger.getLogger(OrderLogic.class);

    public void doOrder() {
        // logic
        System.out.println("Ordered up!");
        // logging the info
        log.info("This is an information message");
        addToCart();
    }

    private void addToCart(){
        // adding an item to basket
        System.out.println("Item added to basket");
        // logging an error
        log.error("This is an error message");
    }
}
