package OOP.Polymorph;

/**
 * Created by Oleg Romanenchuk on 9/10/2015.
 */
public class Simple {
    int speed = 100;

}

class Simpple extends Simple{
    int speed = 150;

    public Simpple(int speed) {
        this.speed = speed;
    }

    public static void main(String[] args) {
        Simple simple = new Simpple(150);
        System.out.println(simple.speed);
    }
}
