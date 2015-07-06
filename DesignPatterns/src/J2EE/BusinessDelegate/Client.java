package J2EE.BusinessDelegate;

/**
 * Created by Dell on 6/21/2015.
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
