package Object.Equals;

/**
 * Created by Oleg Romanenchuk on 9/22/2015.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Vehicle("Focus", 2002, "Ford");
        Vehicle minivan = new Vehicle("Odyssey", 2014, "Honda");
        Vehicle focus = new Vehicle("Focus", 2002, "Ford");

        if (myCar.equals(minivan)){
            System.out.println("This isn't supposed to print!");
        }
        if (myCar.equals(focus)){
            System.out.println("The equals method is implemented OK");
        }
    }
}
