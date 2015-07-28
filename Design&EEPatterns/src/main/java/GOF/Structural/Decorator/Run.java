package GOF.Structural.Decorator;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Run {
    public static void main(String[] args) {
        Rifle nighHunt = new SniperSight(new InfraredScanner(new AssaultRifle()));
        nighHunt.prepare();
        System.out.println("Prepared to night hunt");

        Rifle dayHunt = new SniperSight(new HighZoom(new AssaultRifle()));
        dayHunt.prepare();
        System.out.println("Prepared to day hunt");
    }
}
