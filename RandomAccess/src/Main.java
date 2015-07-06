import java.io.IOException;

/**
 * Created by Dell on 6/16/2015.
 */
public class Main {
    private static WorkWithFile worker;
    // creating an object of class WorkWithFile


    public static void main(String[] args) throws IOException {
        // initialize the class, given the path to existing file
        // in this case our file is situated in root package, i simply index his name
        worker = new WorkWithFile("testfile.txt");
        // write inputted text to file
        worker.write("Give me a break from your take and your take, \n" +
                "Come on and five me a break, \n" +
                "what do you want from me?\n" +
                "Feeding the rich with that son of a bitch:) \n " +
                "Well that son of a bitch, \n" +
                "he looks just like me\n" +
                "Yeh, yeh");
        // going to indexed symbol in file
        System.out.println(worker.goTo(100));
        System.out.println("**************");

        // reading of the whole file
        System.out.println(worker.read());
        System.out.println("***********");

        // reading of out file from indexed symbol
        System.out.println(worker.readFrom(105));
    }
}
