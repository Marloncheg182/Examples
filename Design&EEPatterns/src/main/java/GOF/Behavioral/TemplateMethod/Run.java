package GOF.Behavioral.TemplateMethod;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class Run {
    public static void main(String[] args) {
        HouseTemplate template = new GlassHouse();
        template.buildHouse();
        System.out.println("Building a glass house");

        template = new ConcreteHouse();
        template.buildHouse();
        System.out.println("Building a concrete house");
    }
}
