package Static;

/**
 * Created by O1e6 <NsN> on 12/17/2015.
 */
public class StaticFieldsInheritance extends Aclass{
    public static void main(String[] args) {
        new StaticFieldsInheritance().start();
    }
    public void start(){
        System.out.println();
        System.out.println("In InheritStaticFields::start");

        System.out.println("Val is " + val);

        System.out.println("fun is " + fun());
    }
}
class Aclass{
    static int val = 24;
    Aclass(){
        System.out.println("in Aclass::<init>");
    }
    static int fun(){
        return 12;
    }
}