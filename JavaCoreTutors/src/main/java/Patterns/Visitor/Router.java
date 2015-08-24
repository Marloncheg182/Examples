package Patterns.Visitor;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public interface Router {
    public void sendData(char[]data);
    public void acceptData(char[]data);
    public void accept(RouterVisitor v);
}
