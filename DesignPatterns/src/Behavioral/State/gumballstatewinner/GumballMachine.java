package Behavioral.State.gumballstatewinner;

/**
 * Created by Dell on 6/19/2015.
 */
public class GumballMachine {
    // Four statements
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;  // this variable will keep a current state
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter");
        } else if (state == NO_QUARTER) {
            System.out.println("You inserted a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't insert a quarter,the machine is sold out");
        } else if (state == SOLD) {
            System.out.println("Please wait, we`re already giving you a gumball");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("You haven't inserted a quarter");
        } else if (state == SOLD) {
            System.out.println("Sorry, you already turned the crank");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball!");
        } else if (state == NO_QUARTER) {
            System.out.println("You turned but there's no quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned, but there are no gumball");
        } else if (state == HAS_QUARTER) {
            System.out.println("Ypu turned...");
            state = SOLD;
            dispense();
        }
    }

    public void dispense(){
      if(state == SOLD) {
          System.out.println("A gumball comes tolling out of slot");
          count = count - 1;
          if (count == 0) {
              System.out.println("Oops, out of gumballs!");
              state = SOLD_OUT;
          } else {
              state = NO_QUARTER;
          }
      } else if (state == NO_QUARTER){
          System.out.println("You need to play first");
      } else if (state == SOLD_OUT){
          System.out.println("No gumball dispense");
      } else if (state == HAS_QUARTER) {
          System.out.println(" No gumball dispense");
      }

    }
}
