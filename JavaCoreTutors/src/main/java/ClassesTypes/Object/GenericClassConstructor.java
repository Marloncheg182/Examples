package ClassesTypes.Object;

/**
 * Created by O1e6 <NsN> on 12/22/2015.
 */
class GenericClass{
    private double val;
    <T extends Number> GenericClass(T arg){
        val = arg.doubleValue();
    }
    void values(){
        System.out.println("val: " + val);
    }
}
public class GenericClassConstructor {
    public static void main(String[] args) {
        GenericClass c1 = new GenericClass(100);
        GenericClass c2 = new GenericClass(123.5F);

        c1.values();
        c2.values();
    }
}
