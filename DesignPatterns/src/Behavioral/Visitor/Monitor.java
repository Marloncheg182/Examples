package Behavioral.Visitor;

/**
 * Created by Dell on 6/21/2015.
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
