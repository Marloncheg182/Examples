package OOP.Incapsulation;

/**
 * Created by Oleg Romanenchuk on 8/6/2015.
 */
public final class Incapsulate {
    private String field1 = "1";
    private int field2 = 20;
    private long field3 = 30L;
    private byte field4 = 4;
    private char field5 = 'C';

    public Incapsulate() {
    }

    public Incapsulate(String f1, int f2, long f3, byte f4, char f5) {
        this.field1 = f1;
        this.field2 = f2;
        this.field3 = f3;
        this.field4 = f4;
        this.field5 = f5;
    }

    public String getField1() {
        return field1;
    }

    public int getField2() {
        return field2;
    }

    public long getField3() {
        return field3;
    }

    public byte getField4() {
        return field4;
    }

    public char getField5() {
        return field5;
    }

    private void setField1(String f1) {
        this.field1 = f1;
    }

    private void setField2(int f2) {
        this.field2 = f2;
    }

    private void setField3(long f3) {
        this.field3 = f3;
    }

    private void setField4(byte f4) {
        this.field4 = f4;
    }

    private void setField5(char f5) {
        this.field5 = f5;
    }

    @Override
    public String toString() {
        return "Incapsulate{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                ", field3=" + field3 +
                ", field4=" + field4 +
                ", field5=" + field5 +
                '}';
    }
}
