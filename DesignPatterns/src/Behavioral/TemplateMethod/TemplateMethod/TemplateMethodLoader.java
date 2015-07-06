package Behavioral.TemplateMethod.TemplateMethod;

/**
 * Created by Dell on 6/21/2015.
 */
public class TemplateMethodLoader {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}