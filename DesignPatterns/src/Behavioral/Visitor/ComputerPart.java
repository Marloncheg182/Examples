package Behavioral.Visitor;

/**
 * Created by Dell on 6/21/2015.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
