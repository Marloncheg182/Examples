package GOF.Behavioral.ChainofResponsibility;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}
