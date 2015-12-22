package ClassesTypes.Nested;

/**
 * Created by Oleg Romanenchuk on 9/24/2015.
 */
public class NestedClassExample {
    public static void createLocalInnerClas(){
        class LocalInnerClass{
            public void printLocalInnerClass(){
                System.out.println("A new local inner class!");
            }
        }

        LocalInnerClass local = new LocalInnerClass();
        local.printLocalInnerClass();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass("Outer class");
        outerClass.outerClassPrint();

        outerClass.createAndAccessInnerClass();

        OuterClass.InnerClass inner = outerClass.new InnerClass();
        inner.printOuterClassName();

        AnonymousClassInterface anonymous = new AnonymousClassInterface() {
            @Override
            public void printAnonymous() {
                System.out.println("A new Anonymous inner class");

            }
        };

        OuterWithStatic.InnerClass staticInner = new OuterWithStatic.InnerClass();
        staticInner.printStaticInnerClass();
    }
}
