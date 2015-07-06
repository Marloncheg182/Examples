package Behavioral.State.gumballstate;

public class GumballMachineTestDrive {
    public GumballMachineTestDrive() {
    }

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);   // input 5 gumballs
        System.out.println(gumballMachine);                      // output the State
        gumballMachine.insertQuarter();                          // insert a quarter
        gumballMachine.turnCrank();                              // turn the crank
        System.out.println(gumballMachine);                      // output the State
        gumballMachine.insertQuarter();                          // insert a quarter
        gumballMachine.turnCrank();                              // turn the crank
        gumballMachine.insertQuarter();                          // insert a quarter
        gumballMachine.turnCrank();                              // turn the crank
        System.out.println(gumballMachine);                      // output the State
    }
}
