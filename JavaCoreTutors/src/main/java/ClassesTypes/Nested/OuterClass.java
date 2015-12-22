package ClassesTypes.Nested;

/**
 * Created by Oleg Romanenchuk on 9/24/2015.
 */
public class OuterClass {

    private String name;

    public OuterClass(String name) {
        this.name = name;
    }

    public void outerClassPrint(){
        System.out.println("A new outer class with name " + name);
    }

    public void createAndAccessInnerClass(){
        InnerClass inner = new InnerClass();
        inner.printOuterClassName();
    }


    public class InnerClass {
        public void printOuterClassName() {
            System.out.println("Accessing outer class with name ");
        }
    }
}
