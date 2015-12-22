package Reflection;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class RentCar {
    private int rate;
    private String type;
    private int price;

    public RentCar(int length) {
        if (length < 455) {
            type = "small";
            rate = 35;
        }else if ((length >=455) && (length < 495)){
            type = "mid-sized";
            rate = 45;
        }else if (length >=495){
            type = "large";
            rate = 55;
        }
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void computeRentalCost(int numDays){
        price = numDays * rate;
        System.out.println("The cost of your rental car is " + price + " euros");
    }
}
