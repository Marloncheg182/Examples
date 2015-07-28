package GOF.Behavioral.Interpreter;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class IntToBinaryExpression implements Expression {

    private int i;

    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext context) {
        return context.getBinaryFormat(this.i);
    }
}
