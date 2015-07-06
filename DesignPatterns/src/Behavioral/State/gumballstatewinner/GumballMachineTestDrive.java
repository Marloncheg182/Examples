package Behavioral.State.gumballstatewinner;

/**
 * Created by Dell on 6/19/2015.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);  // input 5 balls

        System.out.println(gumballMachine);    // output the State

        gumballMachine.insertQuarter();        // insert one quarter
        gumballMachine.turnCrank();            // turn the crank

        System.out.println(gumballMachine);    // output the State

        gumballMachine.insertQuarter();        // insert another quarter
        gumballMachine.ejectQuarter();         // eject the quarter
        gumballMachine.turnCrank();            // turn the crank

        System.out.println(gumballMachine);    // output the State

        gumballMachine.insertQuarter();        // insert one quarter
        gumballMachine.turnCrank();            // turn the crank
        gumballMachine.insertQuarter();        // insert one quarter
        gumballMachine.turnCrank();            // turn the crank
        gumballMachine.ejectQuarter();         // eject the quarter

        System.out.println(gumballMachine);    // output the State

        gumballMachine.insertQuarter();        // insert one quarter
        gumballMachine.insertQuarter();        // insert one quarter
        gumballMachine.turnCrank();            // turn the crank
        gumballMachine.insertQuarter();        // insert one quarter
        gumballMachine.turnCrank();            // turn the crank
        gumballMachine.insertQuarter();        // insert one quarter
        gumballMachine.turnCrank();            // turn the crank

        System.out.println(gumballMachine);    // output the State
    }
}
