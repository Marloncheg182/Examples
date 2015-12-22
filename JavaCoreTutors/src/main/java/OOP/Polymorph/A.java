package OOP.Polymorph;

/**
 * Created by Oleg Romanenchuk on 8/5/2015.
 */
public class A implements Polymorphic {
    private String field1 = "1";
    private String field2 = "2";

    public C c;

    public A(String number1, String number2) {
        this.field1 = number1;
        this.field2 = number2;
    }

    private String getField1() {
        return field1;
    }

    private void setField1(String field1) {
        this.field1 = field1;
    }

    private String getField2() {
        return field2;
    }

    private void setField2(String field2) {
        this.field2 = field2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a = (A) o;

        if (!field1.equals(a.field1)) return false;
        return field2.equals(a.field2);

    }

    @Override
    public int hashCode() {
        int result = field1.hashCode();
        result = 31 * result + field2.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "A{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                '}';
    }

    public void m1(){
        System.out.println("Hello method m1");
    }

    public void m2(){
        System.out.println("Hello method m2");
    }

    public void m4() {
        System.out.println("Hello method m4");
    }
}
