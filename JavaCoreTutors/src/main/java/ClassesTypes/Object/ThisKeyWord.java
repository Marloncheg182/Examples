package ClassesTypes.Object;

/**
 * Created by O1e6 <NsN> on 12/22/2015.
 */
public class ThisKeyWord {
    int val = 0;
    ThisKeyWord increase(){
        val++;
        return this;
    }
    void value(){
        System.out.println("val= " + val);
    }

    public static void main(String[] args) {
        ThisKeyWord x = new ThisKeyWord();
        x.increase().increase().increase().value();
    }
}
