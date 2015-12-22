package logs;

import java.util.logging.Level;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class LogLevelComparison {
    public static void main(String[] args) {
        Level info = Level.INFO;
        Level warning = Level.WARNING;
        Level finest = Level.FINEST;

        if (info.intValue()< warning.intValue()){
            System.out.println(info + "(" + info.intValue() + ") is less severe than" + warning + "(" + warning.intValue() + ")");
        }
        if (finest.intValue()< info.intValue()){
            System.out.println(finest + "(" + finest.intValue() + ") is less severe than " + info + "(" + info.intValue() + ")");
        }
    }
}
