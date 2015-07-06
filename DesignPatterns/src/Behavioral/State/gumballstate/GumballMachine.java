package Behavioral.State.gumballstate;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State state;
    int count;

    public GumballMachine(int numberGumballs) {
        this.state = this.soldOutState;
        this.count = 0;
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.count = numberGumballs;
        if(numberGumballs > 0) {
            this.state = this.noQuarterState;
        }

    }

    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if(this.count != 0) {
            --this.count;
        }

    }

    int getCount() {
        return this.count;
    }

    void refill(int count) {
        this.count = count;
        this.state = this.noQuarterState;
    }

    public State getState() {
        return this.state;
    }

    public State getSoldOutState() {
        return this.soldOutState;
    }

    public State getNoQuarterState() {
        return this.noQuarterState;
    }

    public State getHasQuarterState() {
        return this.hasQuarterState;
    }

    public State getSoldState() {
        return this.soldState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + this.count + " gumball");
        if(this.count != 1) {
            result.append("s");
        }

        result.append("\n");
        result.append("Machine is " + this.state + "\n");
        return result.toString();
    }
}
