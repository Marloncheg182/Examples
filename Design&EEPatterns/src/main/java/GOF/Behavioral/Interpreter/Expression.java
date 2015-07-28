package GOF.Behavioral.Interpreter;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public interface Expression {
    String interpret(InterpreterContext context);
}
