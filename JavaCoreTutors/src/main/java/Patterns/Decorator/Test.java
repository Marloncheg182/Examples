package Patterns.Decorator;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class Test {
    public static void main(String[] args) {
        SupportPopupDecorator supportPopupDecorator = new SupportPopupDecorator(new SupportLinkDecorator(new SupportReport()));
        System.out.println(supportPopupDecorator.getFirstColumnData());
    }
}
