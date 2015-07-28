package GOF.Structural.Bridge;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public abstract class Shape {
    //Composition - implementor
    protected Color color;

    //constructor with implementor as input argument
    public Shape(Color c){
        this.color=c;
    }

    abstract public void applyColor();
}
