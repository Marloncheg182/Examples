package OOP.Polymorph;

/**
 * Created by Oleg Romanenchuk on 8/5/2015.
 */
public class Main {
    public static void main(String[] args) {

        A a = new B("1", "2", "3", "4");
        a.m1();     // ��������� �� �
        a.m2();     // ��������� �� B
        //a.m3();   // �� ���������, ��� � �, ������������� �� �������������
        a.m4();    // ���� ��������� �����������, ��������� � �, ���� ������������� �� � � B, ��������� �� B

        Polymorphic p = new B("1", "3", "4","2");
        p.m4(); // ��������� �� ������ �, � ������� ��������������� ����� m4
    }
}
