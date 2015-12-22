package ClassesTypes.Constructors;

/**
 * Created by O1e6 <NsN> on 12/19/2015.
 */
public class InheritConstructor extends A {
    public static void main(String[] args) {
        new InheritConstructor().function();
    }
    public void function(){
        System.out.println("In InheritConstructor::function");
    }
}
class A{
    A(){
        System.out.println("In A::<init>");
    }
}