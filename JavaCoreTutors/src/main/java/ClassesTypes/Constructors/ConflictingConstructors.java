package ClassesTypes.Constructors;

/**
 * Created by O1e6 <NsN> on 12/19/2015.
 */
public class ConflictingConstructors {
    public ConflictingConstructors() {
        System.out.println("In the constructor");
    }
    public ConflictingConstructors(int value){
        if (value < 0){
            throw new IllegalArgumentException("Constructors: value < 0");
        }
    }
    public void Constructors(){
        System.out.println("In void Constructor()");
    }
    void method1(){
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ConflictingConstructors i = new ConflictingConstructors();
        i.method1();
        i.Constructors();
        new ConflictingConstructors(-1); // Expect Exception
    }
}
