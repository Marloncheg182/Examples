package Structural.Flyweight.Flyweight;

/**
 * Created by Dell on 6/20/2015.
 */
public class FlyweightLoader {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
        }
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX(){
        return (int)(Math.random()*100);
    }

    private static int getRandomY(){
        return (int)(Math.random()*100);
    }
}
