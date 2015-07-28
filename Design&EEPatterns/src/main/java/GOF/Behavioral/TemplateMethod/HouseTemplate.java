package GOF.Behavioral.TemplateMethod;

/**
 * Created by Dell on 7/28/2015.
 */
public abstract class HouseTemplate {
    // template method, final so subclasses can't override
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    // implemented in abstract class
    private void buildWindows(){
        System.out.println("Building Glass Windows");
    }
    // to be implemented in subclass
    public abstract void buildWalls();
    public abstract void buildPillars();
    public abstract void buildFoundation();
}
