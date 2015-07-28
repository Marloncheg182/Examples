package GOF.Behavioral.TemplateMethod;

/**
 * Created by Dell on 7/28/2015.
 */
public class ConcreteHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building brick walls ");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building concrete Pillars");
    }

    @Override
    public void buildFoundation() {
        System.out.println("Building concrete foundation");

    }
}
