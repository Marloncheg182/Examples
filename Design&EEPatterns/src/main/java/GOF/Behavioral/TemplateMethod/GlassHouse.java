package GOF.Behavioral.TemplateMethod;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building iron Pillars");
    }

    @Override
    public void buildFoundation() {
        System.out.println("Building wooden Foundation");
    }
}
