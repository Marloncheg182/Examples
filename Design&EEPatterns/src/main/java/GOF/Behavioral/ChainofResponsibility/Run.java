package GOF.Behavioral.ChainofResponsibility;

import java.util.Scanner;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class Run {

    private DispenseChain c1;

    public Run() {
        // initialize the chain
        this.c1 = new Uah200Dispenser();
        DispenseChain c2 = new Uah100Dispenser();
        DispenseChain c3 = new Uah50Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        Run run = new Run();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            run.c1.dispense(new Currency(amount));
        }

    }

}