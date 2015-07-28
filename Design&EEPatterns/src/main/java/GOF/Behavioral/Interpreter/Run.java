package GOF.Behavioral.Interpreter;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class Run {
    public InterpreterContext ic;

    public Run(InterpreterContext context) {
        this.ic = context;
    }

    public String interpret(String str){
        Expression expression = null;
        if (str.contains("Hexadecimal")){
            expression=new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else if (str.contains("Binary")){
            expression=new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));

        } else return str;

        return expression.interpret(ic);
    }

    public static void main(String[] args) {
        String str1 = "100 in Binary";
        String str2 = "100 in Hexadecimal";

        Run run = new Run(new InterpreterContext());
        System.out.println(str1 + run.interpret(str1));
        System.out.println(str2 + run.interpret(str2));

    }
}
