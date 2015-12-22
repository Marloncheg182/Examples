package ClassesTypes.Constructors;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by O1e6 <NsN> on 12/19/2015.
 */
public class CopyConstructors{
    public static void main(String[] args) {
        Tomato tomato = new Tomato();
        ripenFunc(tomato); // OK

        sliceFunc(tomato); // OOPS!

        ripenFunc2(tomato); // OK

        sliceFunc2(tomato); // OK

        GreenZebra g = new GreenZebra();

        ripenFunc(g); // OOPS!

        sliceFunc(g); // OOPS!

        ripenFunc2(g); // OK

        sliceFunc2(g); // OK

        g.evaluate();

    }

    public static void ripenFunc(Tomato t) {

        // Use the "copy constructor":

        t = new Tomato(t);

        System.out.println("In ripen, t is a " + t.getClass().getName());
    }

    public static void sliceFunc(Fruit f) {

        f = new Fruit(f); // Hmmm... will this work?

        System.out.println("In slice, f is a " + f.getClass().getName());
    }

    public static void ripenFunc2(Tomato t) {

        try {


            Class c = t.getClass();


// Use the "copy constructor":


            Constructor ct = c.getConstructor(new Class[]{c});


            Object obj = ct.newInstance(new Object[]{t});


            System.out.println("In ripen2, t is a " + obj.getClass().getName());

        } catch (Exception e) {


            System.out.println(e);

        }
    }

    public static void sliceFunc2(Fruit f) {

        try {


            Class c = f.getClass();


            Constructor ct = c.getConstructor(new Class[]{c});


            Object obj = ct.newInstance(new Object[]{f});


            System.out.println("In slice2, f is a " + obj.getClass().getName());

        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {


            System.out.println(e);

        }
    }
}
class FruitQualities {
    private int w;
    private int c;
    private int firmval;
    private int ripen;
    private int sml;

    public FruitQualities(){

    }
    public FruitQualities(FruitQualities fc){
        w = fc.w;
        c = fc.c;

        firmval = fc.firmval;
        ripen = fc.ripen;
        sml = fc.sml;

    }
}
class Seed{
    public Seed(){

    }
    public Seed(Seed s){

    }
}
class Fruit {
    private FruitQualities fq;
    private int seedmnt;
    private Seed[] s;

    public Fruit(FruitQualities q, int seedCount) {
        fq = q;
        seedmnt = seedCount;
        s = new Seed[seedmnt];
        for (int i = 0; i < seedmnt; i++) {
            s[i] = new Seed();
        }

    }

    public Fruit(Fruit f) {
        fq = new FruitQualities(f.fq);
        seedmnt = f.seedmnt;
        s = new Seed[seedmnt];
        for (int i = 0; i < seedmnt; i++){
            s[i] = new Seed(f.s[i]);
        }
    }
    protected FruitQualities getQualities(){
        return fq;
    }
}
class Tomato extends Fruit{
    public Tomato() {
        super(new FruitQualities(), 100);
    }

    public Tomato(Tomato t) {
        super(t);
    }
}
class ZebraQualities extends FruitQualities{
    private int stripedness;
    public ZebraQualities(){
        super();
    }

    public ZebraQualities(ZebraQualities z) {
        super(z);
        stripedness =z.stripedness;
    }
}
class GreenZebra extends Tomato{
    public GreenZebra(){
    }
    public GreenZebra(GreenZebra g){
        super(g);
    }

    public void evaluate(){
        ZebraQualities zq = (ZebraQualities) getQualities();
    }
}
