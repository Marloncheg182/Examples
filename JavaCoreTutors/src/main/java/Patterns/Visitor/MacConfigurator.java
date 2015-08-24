package Patterns.Visitor;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class MacConfigurator implements RouterVisitor {

    public void visit(DLinkRouter router) {
        System.out.println("DLinkRouter Configuration for Mac complete !!");
    }

    public void visit(TPLinkRouter router) {
        System.out.println("TPLinkRouter Configuration for Mac complete !!");
    }

    public void visit(LinkSysRouter router) {
        System.out.println("LinkSysRouter Configuration for Mac complete !!");
    }
}
