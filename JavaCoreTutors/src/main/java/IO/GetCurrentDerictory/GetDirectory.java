package IO.GetCurrentDerictory;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class GetDirectory {
    public static void main(String[] args) {
        String workingDir = System.getProperty("user.dir");
        System.out.println("Curent working directory : " + workingDir);
    }
}
