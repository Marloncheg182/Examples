package Behavioral.TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Dell on 6/19/2015.
 */
public class TeaWithHook extends TeaBeverageWithHook{
    @Override
    void brew() {
        System.out.println("Stepping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
    public boolean customerWantsCondiments(){
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }
        else
        {
            return false;
        }
    }
    private String getUserInput(){
        String answer = null;

        System.out.println("Would you like milk and sugar (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO error trying to read an answer");
        }
        if(answer ==null){
            return "no";
        }
        return answer;

    }
}