package OOP.Polymorph;

/**
 * Created by Oleg Romanenchuk on 8/5/2015.
 */
public class B extends A {

    private String field3 = "3";
    private String field4 = "3";


    public B(String number1, String number2, String number3, String number4) {
        super(number1, number2);
        this.field3 = number3;
        this.field4 = number4;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }


    @Override
    public void m2() {
        System.out.println("return method m2 from Class B");
    }

    public void m3(){
        System.out.println("return method m3");
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        B b = (B) o;

        if (!field3.equals(b.field3)) return false;
        return field4.equals(b.field4);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + field3.hashCode();
        result = 31 * result + field4.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "B{" +
                "field3='" + field3 + '\'' +
                ", field4='" + field4 + '\'' +
                '}';
    }
}
