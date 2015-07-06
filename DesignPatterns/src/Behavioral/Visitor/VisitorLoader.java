package Behavioral.Visitor;

/**
 * Created by Dell on 6/19/2015.
 */
public class VisitorLoader {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
