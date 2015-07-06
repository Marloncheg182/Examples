package J2EE.FrontController;

/**
 * Created by Dell on 6/21/2015.
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }
    public void dispatch(String request){
        if (request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }
        else {
            homeView.show();
        }
    }
}
