package GOF.Creational.AbstractFactory;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}