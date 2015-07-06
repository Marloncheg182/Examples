package Behavioral.Interpreter;

/**
 * Created by Dell on 6/20/2015.
 */
public class TerminalExpression implements  Expression {
    private String data;

    public  TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)){
            return true;
        }
        return false;
    }
}
