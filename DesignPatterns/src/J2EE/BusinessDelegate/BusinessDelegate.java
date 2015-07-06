package J2EE.BusinessDelegate;

/**
 * Created by Dell on 6/21/2015.
 */
public class BusinessDelegate {
    private BusinessLookUp lookUp = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookUp.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
