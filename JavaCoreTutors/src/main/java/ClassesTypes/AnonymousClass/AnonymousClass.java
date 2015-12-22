package ClassesTypes.AnonymousClass;

/**
 * Created by O1e6 <NsN> on 12/22/2015.
 */
public class AnonymousClass {
    public static void main(String[] args) {
        AnonClass b = new AnonClass() {
            @Override
            public void call() {
                System.out.println("You hit it!");
            }
        };
        b.call();
    }
    interface AnonClass {
        void call();
    }

}
