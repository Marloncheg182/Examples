package J2EE.FrontController;

/**
 * Created by Dell on 6/21/2015.
 */
public class FrontControllerLoader {
    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
