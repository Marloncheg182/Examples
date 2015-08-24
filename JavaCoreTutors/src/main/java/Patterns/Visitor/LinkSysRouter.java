package Patterns.Visitor;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class LinkSysRouter implements Router {
    public void sendData(char[] data) {

    }

    public void acceptData(char[] data) {

    }

    public void accept(RouterVisitor v) {
        v.visit(this);
    }
}
