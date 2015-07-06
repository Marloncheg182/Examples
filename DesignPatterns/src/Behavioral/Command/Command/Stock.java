package Behavioral.Command.Command;

/**
 * Created by Dell on 6/20/2015.
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: " + name+ ", Quantity: " + quantity +" ] sold");
    }
}
