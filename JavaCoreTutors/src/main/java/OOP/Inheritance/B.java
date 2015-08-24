package OOP.Inheritance;

/**
 * Created by Oleg Romanenchuk on 8/6/2015.
 */
public class B extends A{

    public String c = "name_first";
    public String d = "second_name";
    public int ages = 26;


    public B(String a, int age, String b, String c, String d, int ages) {
        super(a, age, b);
        this.c = c;
        this.d = d;
        this.ages = ages;
    }

    @Override
    public String concat(String a, String b) {
        return super.concat(a, b);
    }
}
