package Behavioral.Strategy.Strategy;

/**
 * Created by Dell on 6/21/2015.
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
