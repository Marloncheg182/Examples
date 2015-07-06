package Structural.Composite.Example2;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        this.allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = this.allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");

        while(iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();

            try {
                if(menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException var4) {
                ;
            }
        }

    }
}
