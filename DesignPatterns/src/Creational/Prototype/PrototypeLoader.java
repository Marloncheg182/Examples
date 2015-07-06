package Creational.Prototype;

/**
 * Created by Dell on 6/20/2015.
 */
public class PrototypeLoader {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape =(Shape)ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 =(Shape)ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 =(Shape)ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
