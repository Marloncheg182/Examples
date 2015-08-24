package OOP;

/**
 * Created by Oleg Romanenchuk on 8/3/2015.
 */
public class AntiClassic extends Classic implements ClassicInterface {

    private String field1;
    private String field2;

    public AntiClassic(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    @Override
    public boolean doFirstAction(String field1) {
        return field1.equals("Hello");
    }

    @Override
    public boolean doSecondAction(String field2, String field1) {
        return field2 == field1;
    }

    public String doFirstAction(String field1, String field2) {
        return field1 + field2;
    }

    public String doSecondAction(String field2) {
        return field2 + "alive";
    }
}
