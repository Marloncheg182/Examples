package IO.Scanner;

import java.util.Scanner;

/**
 * Created by Oleg Romanenchuk on 9/24/2015.
 */
public class JavaScanner {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter Item Code: ");
            String itemCode = scanner.next();

            System.out.println("Enter Price: ");
            double price = scanner.nextDouble();

            System.out.println("Enter Quantity: ");
            int quantity = scanner.nextInt();

            double total = price * quantity;
            System.out.println();
            System.out.printf("%d %s @ %f = %f", quantity, itemCode, price, total);

            System.out.printf("Enter three integer values: ");
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            int i3 = scanner.nextInt();

            int avg = (i1 + 12 + i3)/3;

            System.out.printf("Avarage: %d", avg);
        }catch (Exception e){
            e.printStackTrace(System.err);
        }
    }
}
