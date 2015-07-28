package GOF.Behavioral.Interpreter;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class InterpreterContext {

    public String getBinaryFormat(int i){
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i){
        return Integer.toHexString(i);
    }
}
