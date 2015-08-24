package Patterns.Visitor;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public interface RouterVisitor {
    public void visit(DLinkRouter router);
    public void visit(TPLinkRouter router);
    public void visit(LinkSysRouter router);
}
