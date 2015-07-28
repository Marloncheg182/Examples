package GOF.Behavioral.Visitor;

/**
 * Created by Dell on 7/28/2015.
 */
public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
