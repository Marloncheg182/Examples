package GOF.Behavioral.Visitor;

/**
 * Created by Dell on 7/28/2015.
 */
public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}
